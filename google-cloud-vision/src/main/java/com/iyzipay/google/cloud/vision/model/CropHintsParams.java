package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class CropHintsParams {

    private List<Double> aspectRatios;

    public List<Double> getAspectRatios() {
        return aspectRatios;
    }

    public void setAspectRatios(List<Double> aspectRatios) {
        this.aspectRatios = aspectRatios;
    }
}
