package com.ibm.openpages.support.util;

import java.util.List;

public class SumProduct {
    private double numerator = 0;
    private double denominator = 0;

    public SumProduct() {
    }

    protected SumProduct(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public SumProduct add(WeightedMetric metric) {
        numerator += metric.value();
        denominator += metric.weight();

        return this;
    }

    public static SumProduct sum(SumProduct p1, SumProduct p2) {
        return new SumProduct(
                p1.numerator + p2.numerator,
                p1.denominator + p2.denominator
        );
    }

    public Double value() {
        if (denominator == 0) {
            return Double.NaN;
        }

        return numerator / denominator;
    }

    public static Double sumProduct(List<WeightedMetric> metrics) {
        return metrics.stream()
                .reduce(new SumProduct(), SumProduct::add, SumProduct::sum)
                .value();
    }
}
