import java.util.ArrayList;

public class SongLibrary {

    ArrayList<Object> songs = new ArrayList<Object>();





    public void createSongs(){
        Song song1 = new Song("Hola, awe");
        songs.add(song1);
        System.out.println(songs);
    }




}
