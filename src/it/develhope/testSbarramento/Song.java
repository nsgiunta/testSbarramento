package it.develhope.testSbarramento;
/*
* Define a class Song, having:
 * a private variable "songTitle" of type String;
 * a constructor taking a songTitle as a parameter and assigning it to the corresponding variable;
 * getters and setters for the songTitle attribute - don't use Lombok!*/
public class Song {

    private String songTitle;

    public Song(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

}
