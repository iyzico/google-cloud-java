package com.iyzipay.google.cloud.vision.model;

public class Image {

    private String content;
    private ImageSource imageSource;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ImageSource getImageSource() {
        return imageSource;
    }

    public void setImageSource(ImageSource imageSource) {
        this.imageSource = imageSource;
    }
}
