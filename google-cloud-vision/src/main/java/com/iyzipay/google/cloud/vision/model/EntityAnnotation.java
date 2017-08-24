package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class EntityAnnotation {

    private String mid;
    private String locale;
    private String description;
    private Double score;
    private Double confidence;
    private Double topicality;
    private BoundingPoly boundingPoly;
    private List<LocationInfo> locations;
    private List<Property> properties;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public Double getTopicality() {
        return topicality;
    }

    public void setTopicality(Double topicality) {
        this.topicality = topicality;
    }

    public BoundingPoly getBoundingPoly() {
        return boundingPoly;
    }

    public void setBoundingPoly(BoundingPoly boundingPoly) {
        this.boundingPoly = boundingPoly;
    }

    public List<LocationInfo> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationInfo> locations) {
        this.locations = locations;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
