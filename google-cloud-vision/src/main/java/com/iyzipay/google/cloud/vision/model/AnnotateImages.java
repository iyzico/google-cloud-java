package com.iyzipay.google.cloud.vision.model;

import com.iyzipay.google.cloud.vision.GoogleCloudVisionResource;
import com.iyzipay.google.cloud.vision.HttpClient;
import com.iyzipay.google.cloud.vision.Options;
import com.iyzipay.google.cloud.vision.request.GoogleCloudRequest;

import java.util.List;

public class AnnotateImages extends GoogleCloudVisionResource {

    private List<AnnotateImage> responses;

    public static AnnotateImages create(GoogleCloudRequest request, Options options) {
        return HttpClient.create()
                .post(options.getBaseUrl() + "/v1/images:annotate?key=" + options.getApiKey(),
                        getHttpHeaders(),
                        request,
                        AnnotateImages.class);
    }

    public List<AnnotateImage> getResponses() {
        return responses;
    }

    public void setResponses(List<AnnotateImage> responses) {
        this.responses = responses;
    }
}
