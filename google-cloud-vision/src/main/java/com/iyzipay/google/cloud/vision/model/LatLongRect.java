package com.iyzipay.google.cloud.vision.model;

public class LatLongRect {

    private LatLng minLatLng;
    private LatLng maxLatLng;

    public LatLng getMinLatLng() {
        return minLatLng;
    }

    public void setMinLatLng(LatLng minLatLng) {
        this.minLatLng = minLatLng;
    }

    public LatLng getMaxLatLng() {
        return maxLatLng;
    }

    public void setMaxLatLng(LatLng maxLatLng) {
        this.maxLatLng = maxLatLng;
    }
}
