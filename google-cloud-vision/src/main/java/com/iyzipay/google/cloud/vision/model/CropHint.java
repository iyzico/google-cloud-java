package com.iyzipay.google.cloud.vision.model;

public class CropHint {

    private BoundingPoly boundingPoly;
    private Double confidence;
    private Double importanceFraction;

    public BoundingPoly getBoundingPoly() {
        return boundingPoly;
    }

    public void setBoundingPoly(BoundingPoly boundingPoly) {
        this.boundingPoly = boundingPoly;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public Double getImportanceFraction() {
        return importanceFraction;
    }

    public void setImportanceFraction(Double importanceFraction) {
        this.importanceFraction = importanceFraction;
    }
}
