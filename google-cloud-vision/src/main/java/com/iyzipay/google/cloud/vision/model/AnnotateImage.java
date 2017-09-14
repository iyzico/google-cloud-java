package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class AnnotateImage {

    private List<FaceAnnotation> faceAnnotations;
    private List<EntityAnnotation> landmarkAnnotations;
    private List<EntityAnnotation> logoAnnotations;
    private List<EntityAnnotation> labelAnnotations;
    private List<EntityAnnotation> textAnnotations;
    private TextAnnotation fullTextAnnotation;
    private SafeSearchAnnotation safeSearchAnnotation;
    private ImageProperties imagePropertiesAnnotation;
    private CropHintsAnnotation cropHintsAnnotation;
    private WebDetection webDetection;
    private Status error;

    public List<FaceAnnotation> getFaceAnnotations() {
        return faceAnnotations;
    }

    public void setFaceAnnotations(List<FaceAnnotation> faceAnnotations) {
        this.faceAnnotations = faceAnnotations;
    }

    public List<EntityAnnotation> getLandmarkAnnotations() {
        return landmarkAnnotations;
    }

    public void setLandmarkAnnotations(List<EntityAnnotation> landmarkAnnotations) {
        this.landmarkAnnotations = landmarkAnnotations;
    }

    public List<EntityAnnotation> getLogoAnnotations() {
        return logoAnnotations;
    }

    public void setLogoAnnotations(List<EntityAnnotation> logoAnnotations) {
        this.logoAnnotations = logoAnnotations;
    }

    public List<EntityAnnotation> getLabelAnnotations() {
        return labelAnnotations;
    }

    public void setLabelAnnotations(List<EntityAnnotation> labelAnnotations) {
        this.labelAnnotations = labelAnnotations;
    }

    public List<EntityAnnotation> getTextAnnotations() {
        return textAnnotations;
    }

    public void setTextAnnotations(List<EntityAnnotation> textAnnotations) {
        this.textAnnotations = textAnnotations;
    }

    public TextAnnotation getFullTextAnnotation() {
        return fullTextAnnotation;
    }

    public void setFullTextAnnotation(TextAnnotation fullTextAnnotation) {
        this.fullTextAnnotation = fullTextAnnotation;
    }

    public SafeSearchAnnotation getSafeSearchAnnotation() {
        return safeSearchAnnotation;
    }

    public void setSafeSearchAnnotation(SafeSearchAnnotation safeSearchAnnotation) {
        this.safeSearchAnnotation = safeSearchAnnotation;
    }

    public ImageProperties getImagePropertiesAnnotation() {
        return imagePropertiesAnnotation;
    }

    public void setImagePropertiesAnnotation(ImageProperties imagePropertiesAnnotation) {
        this.imagePropertiesAnnotation = imagePropertiesAnnotation;
    }

    public CropHintsAnnotation getCropHintsAnnotation() {
        return cropHintsAnnotation;
    }

    public void setCropHintsAnnotation(CropHintsAnnotation cropHintsAnnotation) {
        this.cropHintsAnnotation = cropHintsAnnotation;
    }

    public WebDetection getWebDetection() {
        return webDetection;
    }

    public void setWebDetection(WebDetection webDetection) {
        this.webDetection = webDetection;
    }

    public Status getError() {
        return error;
    }

    public void setError(Status error) {
        this.error = error;
    }
}
