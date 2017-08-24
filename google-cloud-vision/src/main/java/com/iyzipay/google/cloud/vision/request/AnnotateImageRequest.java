package com.iyzipay.google.cloud.vision.request;

import com.iyzipay.google.cloud.vision.model.Feature;
import com.iyzipay.google.cloud.vision.model.Image;
import com.iyzipay.google.cloud.vision.model.ImageContext;

import java.util.List;

public class AnnotateImageRequest {

    private Image image;
    private List<Feature> features;
    private ImageContext imageContext;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public ImageContext getImageContext() {
        return imageContext;
    }

    public void setImageContext(ImageContext imageContext) {
        this.imageContext = imageContext;
    }
}
