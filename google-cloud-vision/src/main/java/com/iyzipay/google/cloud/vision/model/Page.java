package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class Page {

    private TextProperty property;
    private Double width;
    private Double height;
    private List<Block> blocks;

    public TextProperty getProperty() {
        return property;
    }

    public void setProperty(TextProperty property) {
        this.property = property;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }
}
