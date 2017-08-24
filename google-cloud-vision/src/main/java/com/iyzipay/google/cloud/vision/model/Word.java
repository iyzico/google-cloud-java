package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class Word {

    private TextProperty property;
    private BoundingPoly boundingBox;
    private List<Symbol> symbols;

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

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }
}
