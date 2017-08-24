package com.iyzipay.google.cloud.vision.model;

public class ImageSource {

    private String gcsImageUri;
    private String imageUri;

    public String getGcsImageUri() {
        return gcsImageUri;
    }

    public void setGcsImageUri(String gcsImageUri) {
        this.gcsImageUri = gcsImageUri;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
