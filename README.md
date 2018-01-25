# google-cloud-java

[![Build Status](https://travis-ci.org/iyzico/google-cloud-java.svg?branch=master)](https://travis-ci.org/iyzico/google-cloud-java)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.iyzipay/google-cloud-java/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.iyzipay/google-cloud-java/)

Lightweight java client library for Google Cloud API.

# Requirements

Java 1.6 or newer

# Installation

### Maven users

Add this dependency to your project's POM for example google-cloud-vision:

```xml
<dependency>
  <groupId>com.iyzipay</groupId>
  <artifactId>google-cloud-vision</artifactId>
  <version>1.0.12</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.iyzipay:google-cloud-vision:1.0.12"
```

### Others

You'll need to manually install the following JARs:

* The google-cloud-vision JAR from http://mvnrepository.com/artifact/com.iyzipay/google-cloud-vision/latest
* Gson 2.8 from http://mvnrepository.com/artifact/com.google.code.gson/gson/2.8

If you want to run samples you'll need to manually install Junit JAR:

* JUnit 4.12 from http://mvnrepository.com/artifact/junit/junit/4.12

### Build

If you don't have Maven installed in your local environment, you can use Maven Wrapper script:

    ./mvnw clean install

# Usage

```java

Options options = new Options();
options.setApiKey("my api key");
options.setBaseUrl("https://vision.googleapis.com");

GoogleCloudRequest request = new AnnotateImageBuilder()
         .withImageUri("https://www.google.com.tr/images/branding/googlelogo/2x/googlelogo_color_1.0.124dp.png")
         .withSafeSearchDetection()
         .withLabelDetection()
         .withLogoDetection()
         .withWebDetection()
         .withTextDetection()
         .buildRequest();

AnnotateImages annotateImages = AnnotateImages.create(request, options);

```
