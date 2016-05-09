package de.myschnitzel.highscore;

/**
 * Created by Jusch on 07.05.2016.
 */
public class highscoreBean {
    private int highscore;

    public highscoreBean(){
        this.highscore = 100;
    }

    public int getHighscore() {
        //TODO: Crazy Backend-Call
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }
}
