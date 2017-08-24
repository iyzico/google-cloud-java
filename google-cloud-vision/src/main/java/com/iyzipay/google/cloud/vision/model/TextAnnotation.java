package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class TextAnnotation {

    private List<Page> pages;
    private String text;

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
