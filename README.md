# google-cloud-java

[![Build Status](https://travis-ci.org/iyzico/google-cloud-java.svg?branch=master)](https://travis-ci.org/iyzico/google-cloud-java)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.iyzipay/google-cloud-java/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.iyzipay/google-cloud-java/)

Lightweight java client library for Google Cloud API

# Requirements

Java 1.6 or newer

# Usage

```java

Options options = new Options();
options.setApiKey("my api key");
options.setBaseUrl("https://vision.googleapis.com");

GoogleCloudRequest request = new AnnotateImageBuilder()
         .withImageUrl("https://www.google.com.tr/images/branding/googlelogo/2x/googlelogo_color_120x44dp.png")
         .withSafeSearchDetection()
         .withLabelDetection()
         .withLogoDetection()
         .withWebDetection()
         .buildRequest();

AnnotateImages annotateImages = AnnotateImages.create(request, options);

```
