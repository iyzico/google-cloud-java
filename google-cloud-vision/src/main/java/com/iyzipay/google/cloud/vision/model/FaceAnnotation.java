package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class FaceAnnotation {

    private BoundingPoly boundingPoly;
    private BoundingPoly fdBoundingPoly;
    private List<Landmark> landmarks;
    private Double rollAngle;
    private Double panAngle;
    private Double tiltAngle;
    private Double detectionConfidence;
    private Double landmarkingConfidence;
    private Likelihood joyLikelihood;
    private Likelihood sorrowLikelihood;
    private Likelihood angerLikelihood;
    private Likelihood surpriseLikelihood;
    private Likelihood underExposedLikelihood;
    private Likelihood blurredLikelihood;
    private Likelihood headwearLikelihood;

    public BoundingPoly getBoundingPoly() {
        return boundingPoly;
    }

    public void setBoundingPoly(BoundingPoly boundingPoly) {
        this.boundingPoly = boundingPoly;
    }

    public BoundingPoly getFdBoundingPoly() {
        return fdBoundingPoly;
    }

    public void setFdBoundingPoly(BoundingPoly fdBoundingPoly) {
        this.fdBoundingPoly = fdBoundingPoly;
    }

    public List<Landmark> getLandmarks() {
        return landmarks;
    }

    public void setLandmarks(List<Landmark> landmarks) {
        this.landmarks = landmarks;
    }

    public Double getRollAngle() {
        return rollAngle;
    }

    public void setRollAngle(Double rollAngle) {
        this.rollAngle = rollAngle;
    }

    public Double getPanAngle() {
        return panAngle;
    }

    public void setPanAngle(Double panAngle) {
        this.panAngle = panAngle;
    }

    public Double getTiltAngle() {
        return tiltAngle;
    }

    public void setTiltAngle(Double tiltAngle) {
        this.tiltAngle = tiltAngle;
    }

    public Double getDetectionConfidence() {
        return detectionConfidence;
    }

    public void setDetectionConfidence(Double detectionConfidence) {
        this.detectionConfidence = detectionConfidence;
    }

    public Double getLandmarkingConfidence() {
        return landmarkingConfidence;
    }

    public void setLandmarkingConfidence(Double landmarkingConfidence) {
        this.landmarkingConfidence = landmarkingConfidence;
    }

    public Likelihood getJoyLikelihood() {
        return joyLikelihood;
    }

    public void setJoyLikelihood(Likelihood joyLikelihood) {
        this.joyLikelihood = joyLikelihood;
    }

    public Likelihood getSorrowLikelihood() {
        return sorrowLikelihood;
    }

    public void setSorrowLikelihood(Likelihood sorrowLikelihood) {
        this.sorrowLikelihood = sorrowLikelihood;
    }

    public Likelihood getAngerLikelihood() {
        return angerLikelihood;
    }

    public void setAngerLikelihood(Likelihood angerLikelihood) {
        this.angerLikelihood = angerLikelihood;
    }

    public Likelihood getSurpriseLikelihood() {
        return surpriseLikelihood;
    }

    public void setSurpriseLikelihood(Likelihood surpriseLikelihood) {
        this.surpriseLikelihood = surpriseLikelihood;
    }

    public Likelihood getUnderExposedLikelihood() {
        return underExposedLikelihood;
    }

    public void setUnderExposedLikelihood(Likelihood underExposedLikelihood) {
        this.underExposedLikelihood = underExposedLikelihood;
    }

    public Likelihood getBlurredLikelihood() {
        return blurredLikelihood;
    }

    public void setBlurredLikelihood(Likelihood blurredLikelihood) {
        this.blurredLikelihood = blurredLikelihood;
    }

    public Likelihood getHeadwearLikelihood() {
        return headwearLikelihood;
    }

    public void setHeadwearLikelihood(Likelihood headwearLikelihood) {
        this.headwearLikelihood = headwearLikelihood;
    }
}
