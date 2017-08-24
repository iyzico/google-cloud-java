package com.iyzipay.google.cloud.vision.sample;

import com.iyzipay.google.cloud.vision.builder.AnnotateImageBuilder;
import com.iyzipay.google.cloud.vision.model.AnnotateImages;
import com.iyzipay.google.cloud.vision.request.GoogleCloudRequest;
import org.junit.Test;

public class AnnotateImageSample extends Sample {

    @Test
    public void should_annotate_image_uri() {

        GoogleCloudRequest request = new AnnotateImageBuilder()
                .withImageUrl("https://img.iyzi.link/iyziLinkImages/C-w.jpg")
                .withSafeSearchDetection()
                .withLabelDetection()
                .withLogoDetection()
                .withWebDetection()
                .buildRequest();

        AnnotateImages annotateImages = AnnotateImages.create(request, options);

        System.out.println(annotateImages.getError().getMessage());
    }
}
