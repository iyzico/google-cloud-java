package com.iyzipay.google.cloud.vision.model;

public class Symbol {

    private TextProperty property;
    private BoundingPoly boundingBox;
    private String text;

    public TextProperty getProperty() {
        return property;
    }

    public void setProperty(TextProperty property) {
        this.property = property;
    }

    public BoundingPoly getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingPoly boundingBox) {
        this.boundingBox = boundingBox;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
