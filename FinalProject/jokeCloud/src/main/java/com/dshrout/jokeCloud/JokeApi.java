/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.dshrout.jokeCloud;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "jokeCloud.dshrout.com",
    ownerName = "jokeCloud.dshrout.com",
    packagePath=""
  )
)
public class JokeApi {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public JokeData sayHi(@Named("name") String name) {
        JokeData response = new JokeData();
        response.setData("Hi, " + name);

        return response;
    }

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "jokePlease")
    public JokeData jokePlease() {
        JokeData response = new JokeData();
        response.setData("What do you call a smart blond?|A Golden Retriever!");

        return response;
    }
}
