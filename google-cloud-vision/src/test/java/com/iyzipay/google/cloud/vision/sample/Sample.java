package com.iyzipay.google.cloud.vision.sample;

import com.iyzipay.google.cloud.vision.Options;
import org.junit.Before;

public abstract class Sample {

    Options options;

    @Before
    public void setUp() {
        options = new Options();
        options.setApiKey("my api key");
        options.setBaseUrl("https://vision.googleapis.com");
    }
}
