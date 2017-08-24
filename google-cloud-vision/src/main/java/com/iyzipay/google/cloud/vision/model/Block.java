package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class Block {

    private TextProperty property;
    private BoundingPoly boundingBox;
    private List<Paragraph> paragraphs;
    private BlockType blockType;

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

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public BlockType getBlockType() {
        return blockType;
    }

    public void setBlockType(BlockType blockType) {
        this.blockType = blockType;
    }
}
