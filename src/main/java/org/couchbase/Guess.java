package org.couchbase;

public class Guess {
    private String[] guess;
    private long score;

    public String[] getGuess() { return guess; }
    public void setGuess(String[] value) { this.guess = value; }

    public long getScore() { return score; }
    public void setScore(long value) { this.score = value; }
}

