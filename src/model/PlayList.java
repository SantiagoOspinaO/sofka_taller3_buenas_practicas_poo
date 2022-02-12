package model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlayList extends SongLibrary{

    private static ArrayList<Song> playList = new ArrayList<>();


    public void createPlaylist(int indexMusic){
        SongLibrary.createSongs();
        playList.add(SongLibrary.songs[indexMusic]);
        System.out.println(playList.toArray().length);
        for (int i = 0; i < playList.toArray().length ; i++) {
            System.out.println(playList.toArray()[i]);
        }

    }
}
