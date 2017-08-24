package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class CropHintsAnnotation {

    private List<CropHint> cropHints;

    public List<CropHint> getCropHints() {
        return cropHints;
    }

    public void setCropHints(List<CropHint> cropHints) {
        this.cropHints = cropHints;
    }
}
