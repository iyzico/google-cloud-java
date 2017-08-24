package com.iyzipay.google.cloud.vision.model;

public class DetectedBreak {

    private BreakType type;
    private Boolean isPrefix;

    public BreakType getType() {
        return type;
    }

    public void setType(BreakType type) {
        this.type = type;
    }

    public Boolean getPrefix() {
        return isPrefix;
    }

    public void setPrefix(Boolean prefix) {
        isPrefix = prefix;
    }
}
