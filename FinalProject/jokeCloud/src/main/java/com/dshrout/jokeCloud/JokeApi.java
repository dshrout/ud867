/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.dshrout.jokeCloud;

import com.dshrout.fungi.JokeSmith;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

import java.util.Random;

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

    /** A simple endpoint method that returns a random answer to the eternal question: Why'd the chicken cross the road? */
    @ApiMethod(name = "jokePlease")
    public JokeData jokePlease() {
        JokeSmith jokeSmith = new JokeSmith();
        JokeData jokeData = new JokeData();
        jokeData.setData(jokeSmith.getJoke());
        return jokeData;
    }
}
