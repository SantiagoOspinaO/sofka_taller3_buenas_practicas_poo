import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SongLibrary {

    public static List<Song> songs = new ArrayList<>();

    public static void createSongs(){
        songs.add(new Song("Nombre cancion 1", "3:02"));
        songs.add(new Song("Nombre cancion 2", "2:50"));
        songs.add(new Song("Nombre cancion 3", "4:02"));
    }

    public static void orderByDuration(){
        Collections.sort(songs);
        for (Song song: songs){
            System.out.println(song);
        }
    }

//    public static void orderByDate(){
//        Song song = new Song();
//        song.compareToo((Song) songs);
//        for (Song s: songs){
//            System.out.println(s);
//        }
//    }

}
