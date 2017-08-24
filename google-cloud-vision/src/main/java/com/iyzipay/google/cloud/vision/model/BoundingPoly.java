package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class BoundingPoly {

    private List<Vertex> vertices;

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }
}
