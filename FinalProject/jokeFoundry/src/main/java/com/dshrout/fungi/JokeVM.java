package com.dshrout.fungi;

/**
 * Created by DShrout on 8/11/2016
 */
public class JokeVM {
    public String Joke;
    public String PunchLine;

    public JokeVM() {
        Joke = new String();
        PunchLine = new String();
    }

    public JokeVM(String joke, String punchLine) {
        Joke = joke;
        PunchLine = punchLine;
    }
}
