package com.iyzipay.google.cloud.vision;

import java.util.HashMap;
import java.util.Map;

public class GoogleCloudVisionResource {

    private static final String CLIENT_VERSION_HEADER_NAME = "x-iyzi-google-client-vision-version";
    private static final String CLIENT_VERSION = GoogleCloudVisionResource.class.getPackage().getImplementationVersion();
    private static final String CLIENT_TITLE = GoogleCloudVisionResource.class.getPackage().getImplementationTitle();

    public GoogleCloudVisionResource() {
    }

    protected static Map<String, String> getHttpHeaders() {
        Map<String, String> headers = new HashMap<String, String>();

        if (CLIENT_VERSION != null && !"".equals(CLIENT_VERSION) && CLIENT_TITLE != null && !"".equals(CLIENT_TITLE)) {
            headers.put(CLIENT_VERSION_HEADER_NAME, CLIENT_TITLE + "-" + CLIENT_VERSION);
        }
        return headers;
    }
}
