package com.udacity.gradle.builditbigger;

//import android.app.Application;
//import android.test.ApplicationTestCase;
//
///**
// * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
// */
//public class ApplicationTest extends ApplicationTestCase<Application> {
//    public ApplicationTest() {
//        super(Application.class);
//    }
//}


import junit.framework.TestCase;

import java.util.concurrent.CountDownLatch;

public class JokeTest extends TestCase implements EndpointListener {

    private String mReturnedJoke = null;
    private CountDownLatch

    @Override
    public void jokesReady(String joke) {

    }
}