package com.iyzipay.google.cloud.vision.request;

import java.util.List;

public class GoogleCloudRequest {

    private List<AnnotateImageRequest> requests;

    public List<AnnotateImageRequest> getRequests() {
        return requests;
    }

    public void setRequests(List<AnnotateImageRequest> requests) {
        this.requests = requests;
    }
}
