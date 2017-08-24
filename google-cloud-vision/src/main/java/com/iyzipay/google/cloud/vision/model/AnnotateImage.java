package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class AnnotateImage {

    private List<FaceAnnotation> faceAnnotations;
    private List<EntityAnnotation> landmarkAnnotations;
    private List<EntityAnnotation> logoAnnotations;
    private List<EntityAnnotation> labelAnnotations;
    private List<EntityAnnotation> textAnnotations;
    private TextAnnotation fullTextAnnotation;
    private SafeSearchAnnotation safeSearchAnnotation;

}
