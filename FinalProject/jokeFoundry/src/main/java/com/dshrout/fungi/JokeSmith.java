package com.dshrout.fungi;

import java.util.Random;

public class JokeSmith {
    private String[] mAnswers;
    private Random mRandom;

    public JokeSmith() {
        mAnswers = new String[8];
        mAnswers[0] = "42\n-Deep Thought";
        mAnswers[1] = "Aliens\n-Giorgio A. Tsoukalos";
        mAnswers[2] = "Because you didn't cook it!\n-Gordon Ramsay";
        mAnswers[3] = "Nobody cares\n-Grumpy Cat";
        mAnswers[4] = "There is no chicken\n-Spoon Boy";
        mAnswers[5] = "Never send a chicken to do a machine's job\n-Agent Smith";
        mAnswers[6] = "To join the collective\n-Borg";
        mAnswers[7] = "PC LOAD LETTER";
        mRandom = new Random();
    }

    public String getJoke() {
        return mAnswers[mRandom.nextInt(mAnswers.length)];
    }
}
