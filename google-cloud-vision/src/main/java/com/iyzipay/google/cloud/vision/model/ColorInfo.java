package com.iyzipay.google.cloud.vision.model;

public class ColorInfo {

    private Color color;
    private Double score;
    private Double pixelFraction;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getPixelFraction() {
        return pixelFraction;
    }

    public void setPixelFraction(Double pixelFraction) {
        this.pixelFraction = pixelFraction;
    }
}
