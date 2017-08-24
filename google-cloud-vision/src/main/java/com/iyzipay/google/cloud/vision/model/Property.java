package com.iyzipay.google.cloud.vision.model;

/**
 * A Property consists of a user-supplied name/value pair.
 * */
public class Property {

    private String name;
    private String value;
    private String uint64Value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUint64Value() {
        return uint64Value;
    }

    public void setUint64Value(String uint64Value) {
        this.uint64Value = uint64Value;
    }
}
