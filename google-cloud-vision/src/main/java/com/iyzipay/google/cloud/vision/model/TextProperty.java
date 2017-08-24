package com.iyzipay.google.cloud.vision.model;

import java.util.List;

public class TextProperty {

    private List<DetectedLanguage> detectedLanguages;
    private DetectedBreak detectedBreak;

    public List<DetectedLanguage> getDetectedLanguages() {
        return detectedLanguages;
    }

    public void setDetectedLanguages(List<DetectedLanguage> detectedLanguages) {
        this.detectedLanguages = detectedLanguages;
    }

    public DetectedBreak getDetectedBreak() {
        return detectedBreak;
    }

    public void setDetectedBreak(DetectedBreak detectedBreak) {
        this.detectedBreak = detectedBreak;
    }
}
