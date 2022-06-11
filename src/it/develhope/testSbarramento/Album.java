package it.develhope.testSbarramento;

import java.util.List;

/*
* Define a class Album, having:
 * a public variable "albumTitle" of type String;
 * a public variable "artist" of type String;
 * a public List of Songs called "trackList";
 * a constructor taking a String albumTitle and a String artist as parameters and assigning them to the corresponding variables;
 * another constructor taking a String albumTitle, a String artist and a List of Songs as parameters, and assigning them to the corresponding variables;
 * a method printAlbumInfo() that prints on separate lines the album title, the artist name, and the track list,
 * each one of them preceded by the track number, LIKE IN THE EXAMPLE.
 */
public class Album {

    public String albumTitle;
    public String artist;
    public List<Song> trackList;

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
    }

    public Album(String albumTitle, String artist, List<Song> trackList) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.trackList = trackList;
    }

    public void printAlbumInfo(){
        System.out.println("Album title: " + albumTitle);
        System.out.println("Artist: " + artist);
        for(int i = 0; i < trackList.size(); i++){
            System.out.printf("%d  %s \n", i + 1, trackList.get(i).getSongTitle());
        }
    }
}
