package com.iyzipay.google.cloud.vision.model;

public class Feature {

    private FeatureType type;
    private Double number;

    public FeatureType getType() {
        return type;
    }

    public void setType(FeatureType type) {
        this.type = type;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
}
