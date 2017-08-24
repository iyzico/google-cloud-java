package com.iyzipay.google.cloud.vision.model;

public class Feature {

    private FeatureType type;
    private Double maxResults;

    public FeatureType getType() {
        return type;
    }

    public void setType(FeatureType type) {
        this.type = type;
    }

    public Double getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Double maxResults) {
        this.maxResults = maxResults;
    }
}
