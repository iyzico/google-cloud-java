package com.iyzipay.google.cloud.vision.model;

public class Image {

    private String content;
    private ImageSource source;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ImageSource getSource() {
        return source;
    }

    public void setSource(ImageSource source) {
        this.source = source;
    }
}
