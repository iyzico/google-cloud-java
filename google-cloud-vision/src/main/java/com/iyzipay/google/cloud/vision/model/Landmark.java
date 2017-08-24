package com.iyzipay.google.cloud.vision.model;

public class Landmark {

    private FaceLandmarkFeatureType type;
    private Position position;

    public FaceLandmarkFeatureType getType() {
        return type;
    }

    public void setType(FaceLandmarkFeatureType type) {
        this.type = type;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
