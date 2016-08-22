/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.dshrout.jokeCloud;

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
    private String[] answers;
    private Random mRandom = null;

    private void InitJokeApi() {
        answers = new String[8];
        answers[0] = "42\n-Deep Thought";
        answers[1] = "Aliens\n-Giorgio A. Tsoukalos";
        answers[2] = "Because you didn't cook it!\n-Gordon Ramsay";
        answers[3] = "Nobody cares\n-Grumpy Cat";
        answers[4] = "There is no road\n-Spoon Boy";
        answers[5] = "Never send a chicken to do a machine's job\n-Agent Smith";
        answers[6] = "To join the collective\n-Borg";
        answers[7] = "PC LOAD LETTER";
        mRandom = new Random();
    }

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public JokeData sayHi(@Named("name") String name) {
        if (mRandom == null) {
            InitJokeApi();
        }

        JokeData response = new JokeData();
        response.setData("Hi, " + name);

        return response;
    }

    /** A simple endpoint method that returns a random answer to the eternal question: Why'd the chicken cross the road? */
    @ApiMethod(name = "jokePlease")
    public JokeData jokePlease() {
        if (mRandom == null) {
            InitJokeApi();
        }
        JokeData jokeData = new JokeData();
        jokeData.setData(answers[mRandom.nextInt(answers.length)]);
        return jokeData;
    }
}
