package it.develhope.testSbarramento;

import java.util.ArrayList;
import java.util.List;

/*Define a Main class, with the main() method, where you create one album (you can use the example if you like),
containing at least 5 songs.

Invoke the printAlbumInfo method for the album object.

Print the number of songs in the album and the album title, using a single printf (formatted print):
"The album <album_title> has <num_of_songs> songs."
*/
public class Start {

    public static void main(String[] args) {

        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Shine On You Crazy Diamond parts I-V)"));
        songs.add(new Song("Welcome to the Machine"));
        songs.add(new Song("Have a Cigar"));
        songs.add(new Song("Wish You Were Here"));
        songs.add(new Song("Shine On You Crazy Diamond (parts VI-IX)"));

        Album album = new Album("Wish You Were Here", "The Pink Floyd", songs);
        album.printAlbumInfo();

        System.out.printf("The album %n ", album.albumTitle, " has %d " , album.trackList.size());


    }
}
