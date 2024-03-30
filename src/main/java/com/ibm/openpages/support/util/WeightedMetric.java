package com.ibm.openpages.support.util;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class WeightedMetric {
    private Double metric;
    private Double weight;

    public WeightedMetric() {
        this(0.0, 0.0);
    }

    public WeightedMetric(Double metric, Double weight) {
        this.metric = metric;
        this.weight = weight;
    }

    public Double getMetric() {
        return metric;
    }

    public void setMetric(Double metric) {
        this.metric = metric;
    }

    public WeightedMetric withMetric(Optional<Double> metric) {
        this.setWeight(metric.orElse(null));

        return this;
    }
    public WeightedMetric withMetric(Double metric) {
        this.setMetric(metric);

        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public WeightedMetric withWeight(Optional<Double> weight) {
        this.setWeight(weight.orElse(null));

        return this;
    }

    public WeightedMetric withWeight(Double weight) {
        this.setWeight(weight);

        return this;
    }

    public Double metric() {
        return metric;
    }

    public Double weight() {
        return weight;
    }

    public Double value() {
        if (!isValid()) {
            return null;
        }

        return weight * metric;
    }

    public boolean isValid() {
        return Objects.nonNull(metric) && Objects.nonNull(weight);
    }

    public String toString() {
        return "WeightedMetric(weight=" + weight + ", metric=" + metric + ")";
    }

    public static Double metricSum(List<WeightedMetric> metrics) {
        return metrics.stream().filter(WeightedMetric::isValid).mapToDouble(WeightedMetric::metric).sum();
    }

    public static Double weightedSum(List<WeightedMetric> metrics) {
        return metrics.stream().filter(WeightedMetric::isValid).mapToDouble(WeightedMetric::value).sum();
    }

    public static Double sum(List<WeightedMetric> metrics) {
        return metrics.stream().filter(WeightedMetric::isValid).mapToDouble(WeightedMetric::weight).sum();
    }

}
