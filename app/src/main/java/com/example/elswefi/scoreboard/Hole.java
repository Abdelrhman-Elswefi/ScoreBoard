package com.example.elswefi.scoreboard;

/**
 * Created by elswe on 04-Apr-18 At 4:07 PM.
 */

public class Hole {
    private int strokeCount;
    private String holeNumber;

    public Hole(int strokeCount, String holeNumber) {
        this.strokeCount = strokeCount;
        this.holeNumber = holeNumber;
    }

    public int getStrokeCount() {
        return strokeCount;
    }

    public void setStrokeCount(int strokeCount) {
        this.strokeCount = strokeCount;
    }

    public String getHoleNumber() {
        return holeNumber;
    }

    public void setHoleNumber(String holeNumber) {
        this.holeNumber = holeNumber;
    }

}
