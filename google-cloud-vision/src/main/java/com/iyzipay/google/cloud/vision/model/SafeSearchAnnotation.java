package com.iyzipay.google.cloud.vision.model;

public class SafeSearchAnnotation {

    private Likelihood adult;
    private Likelihood spoof;
    private Likelihood medical;
    private Likelihood violence;

    public Likelihood getAdult() {
        return adult;
    }

    public void setAdult(Likelihood adult) {
        this.adult = adult;
    }

    public Likelihood getSpoof() {
        return spoof;
    }

    public void setSpoof(Likelihood spoof) {
        this.spoof = spoof;
    }

    public Likelihood getMedical() {
        return medical;
    }

    public void setMedical(Likelihood medical) {
        this.medical = medical;
    }

    public Likelihood getViolence() {
        return violence;
    }

    public void setViolence(Likelihood violence) {
        this.violence = violence;
    }
}
