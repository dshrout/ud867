package com.udacity.gradle.builditbigger;

import junit.framework.TestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class JokeTest extends TestCase implements EndpointListener {

    private String mReturnedJoke = null;
    private CountDownLatch countDownLatch;

    public void testJoke() {
        countDownLatch = new CountDownLatch(1);
        new EndpointsAsyncTask(this).execute();
        try {
            countDownLatch.await(30, TimeUnit.SECONDS);
            assertTrue(mReturnedJoke != null);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Override
    public void jokesReady(String joke) {
        mReturnedJoke = joke;
        countDownLatch.countDown();
    }
}