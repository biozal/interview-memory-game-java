package org.couchbase;

public class GameData {
    private String[] board;
    private Guess[] guesses;

    public String[] getBoard() { return board; }
    public void setBoard(String[] value) { this.board = value; }

    public Guess[] getGuesses() { return guesses; }
    public void setGuesses(Guess[] value) { this.guesses = value; }
    
}