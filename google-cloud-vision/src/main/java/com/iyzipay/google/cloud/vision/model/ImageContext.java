package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class ImageContext {

    private LatLongRect latLongRect;
    private List<String> languageHints;
    private CropHintsParams cropHintsParams;

    public LatLongRect getLatLongRect() {
        return latLongRect;
    }

    public void setLatLongRect(LatLongRect latLongRect) {
        this.latLongRect = latLongRect;
    }

    public List<String> getLanguageHints() {
        return languageHints;
    }

    public void setLanguageHints(List<String> languageHints) {
        this.languageHints = languageHints;
    }

    public CropHintsParams getCropHintsParams() {
        return cropHintsParams;
    }

    public void setCropHintsParams(CropHintsParams cropHintsParams) {
        this.cropHintsParams = cropHintsParams;
    }
}
