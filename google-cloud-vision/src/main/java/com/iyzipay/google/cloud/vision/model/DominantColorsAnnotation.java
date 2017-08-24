package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class DominantColorsAnnotation {

    private List<ColorInfo> colors;

    public List<ColorInfo> getColors() {
        return colors;
    }

    public void setColors(List<ColorInfo> colors) {
        this.colors = colors;
    }
}
