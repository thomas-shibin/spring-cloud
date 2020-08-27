package com.spring.cloud.limitsservice.model;

/**
 * Created by shibthom on 8/26/2020.
 */
public class LimitConfiguration {

    private int maximum;
    private int minimum;

    public LimitConfiguration() {
    }

    public LimitConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
