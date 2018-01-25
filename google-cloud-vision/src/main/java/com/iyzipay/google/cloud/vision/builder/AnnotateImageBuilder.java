package com.iyzipay.google.cloud.vision.builder;

import com.iyzipay.google.cloud.vision.model.*;
import com.iyzipay.google.cloud.vision.request.AnnotateImageRequest;
import com.iyzipay.google.cloud.vision.request.GoogleCloudRequest;

import java.util.ArrayList;
import java.util.List;

public class AnnotateImageBuilder {

    private List<Feature> features;
    private String imageUri;

    public AnnotateImageBuilder() {
        features = new ArrayList<Feature>();
    }

    public AnnotateImageBuilder withLabelDetection() {
        Feature feature = new Feature();
        feature.setType(FeatureType.LABEL_DETECTION);
        this.features.add(feature);
        return this;
    }

    public AnnotateImageBuilder withSafeSearchDetection() {
        Feature feature = new Feature();
        feature.setType(FeatureType.SAFE_SEARCH_DETECTION);
        this.features.add(feature);
        return this;
    }

    public AnnotateImageBuilder withLogoDetection() {
        Feature feature = new Feature();
        feature.setType(FeatureType.LOGO_DETECTION);
        this.features.add(feature);
        return this;
    }

    public AnnotateImageBuilder withWebDetection() {
        Feature feature = new Feature();
        feature.setType(FeatureType.WEB_DETECTION);
        this.features.add(feature);
        return this;
    }

    public AnnotateImageBuilder withFaceDetection() {
        Feature feature = new Feature();
        feature.setType(FeatureType.FACE_DETECTION);
        this.features.add(feature);
        return this;
    }

    public AnnotateImageBuilder withTextDetection() {
        Feature feature = new Feature();
        feature.setType(FeatureType.TEXT_DETECTION);
        this.features.add(feature);
        return this;

    }

    public AnnotateImageBuilder withImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    public GoogleCloudRequest buildRequest() {
        GoogleCloudRequest request = new GoogleCloudRequest();
        List<AnnotateImageRequest> requests = new ArrayList<AnnotateImageRequest>();

        Image image = new Image();
        ImageSource imageSource = new ImageSource();
        imageSource.setImageUri(imageUri);
        image.setSource(imageSource);

        AnnotateImageRequest annotateImageRequest = new AnnotateImageRequest();
        annotateImageRequest.setFeatures(features);
        annotateImageRequest.setImage(image);

        requests.add(annotateImageRequest);
        request.setRequests(requests);
        return request;
    }
}
