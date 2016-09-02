package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import com.dshrout.jokecloud.myApi.MyApi;

import java.io.IOException;

class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {
    private static MyApi myApiService = null;
    private EndpointListener mListener;

    public EndpointsAsyncTask(EndpointListener listener) {
        mListener = listener;
    }

    @Override
    protected String doInBackground(Void... params) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                                             .setRootUrl("https://jokeengine-122668.appspot.com/_ah/api/");
            myApiService = builder.build();
        }

        try {
            return myApiService.jokePlease().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        mListener.jokesReady(result);
    }
}
