import React from 'react';
import Chart from "chart.js";
import COLORS from './colors'
import $ from 'jquery';
import _ from 'lodash';



var timeAxes = {
    "0": "second",
    "1": "minute",
    "2": "hour",
    "3": "day",
};

function getDataset(data, label, colorIndex, lineOnly) {
    var dataset = {
        label: label,
        fill: !lineOnly,
        showLine: true,
        lineTension: 0.2,
        borderCapStyle: 'butt',
        borderDash: [],
        borderDashOffset: 0.0,
        borderWidth: lineOnly ? 2 : 1,
        borderJoinStyle: 'bevel',
        pointBackgroundColor: "#fff",
        pointBorderWidth: 1,
        pointHoverRadius: 3,
        pointHoverBorderWidth: 1,
        pointRadius: 0,
        pointHitRadius: 10,
        borderSkipped: 'bottom',
        data: data,
        spanGaps: false
    };
    return applyColor(dataset, colorIndex, lineOnly)
}

function applyColor(dataset, colorIndex, lineOnly) {
    let color = COLORS.getColor(colorIndex, 0.99);
    let lightColor = COLORS.getColor(colorIndex, 0.8);
    dataset.borderColor = color;
    dataset.pointBorderColor = color;
    dataset.pointHoverBackgroundColor = lightColor;
    dataset.pointHoverBorderColor = color;
    if (!lineOnly) {
        dataset.backgroundColor = lightColor;
    } else {
        dataset.backgroundColor = "rgba(1,1,1,0.01)";
    }
    return dataset;
}

class EventsChart extends React.Component {
    render() {
        return (
            <canvas id="chart" width="400" height="180" ref={(elem) => this.element = elem}/>
        );
    }
    componentDidMount() {
        var ctx = $(this.element);
        this.datasets = [];
        this.chart = new Chart(ctx, {
            type: 'line',
            data: {
                datasets: this.datasets
            },
            options: {
                legend: {
                    display: false
                },
                tooltips: {

                },
                hover: {
                    mode: 'nearest',
                    interset: true
                },
                scales: {
                    xAxes: [{
                        type: 'time',
                        time: {
                            displayFormats: {
                                minute: 'h:mm a'
                            },
                            minUnit: 'minute'
                        }
                    }],
                    yAxes: [{
                        ticks: {
                            suggestedMin: 0
                        },
                        stacked: true
                    }]
                }
            }
        });
        ctx.click(function (e) {
            let activePoints = this.chart.getElementAtEvent(e);
            if (activePoints && activePoints.length > 0) {
                let clickedPoint = activePoints[0];
                let datasetIndex = clickedPoint._datasetIndex;
                let dataset = this.datasets[datasetIndex];
                let index = clickedPoint._index;
                let point = dataset.data[index];
                let nextPoint = dataset.data[index + 1];
                let binStart = point.x;
                let binEnd = nextPoint.x;
                this.props.pointClicked(binStart, binEnd, datasetIndex);
            }
        }.bind(this));
    }
    updateChart(data) {
        var datasets = this.datasets;
        datasets.length = 0;
        var facets = data.facets;
        var metric = this.props.selectedYAxis !== '0';
        var stacked;
        if (facets) {
            stacked = !metric;
            $.each(facets, function (index) {
                var timeSeries = $.map(this.timeSeries.points, function (point) {
                    return {'x': point.epoch, 'y': metric ? point.average : point.count}
                });
                var text = this.id + " " + this.timeSeries.count;
                datasets.push(getDataset(timeSeries, text, index, !stacked));
            });
        } else if (data && data.points) {
            stacked = false;
            var timeSeries = $.map(data.points, function (point) {
                return {'x': point.epoch, 'y': metric ? point.average : point.count}
            });
            datasets.push(getDataset(timeSeries, "", datasets.length, !stacked));
        }
        this.chart.options.scales.yAxes[0].stacked = stacked;
        this.chart.options.scales.xAxes[0].time.minUnit = timeAxes[this.props.selectedTime];
        this.chart.update();
    }
    componentDidUpdate(prevProps, prevState) {
        var data = this.props.chartData;
        if (data && !_.isEqual(data, prevProps.chartData)) {
            this.updateChart(data);
        }
    }
}

export default EventsChart;