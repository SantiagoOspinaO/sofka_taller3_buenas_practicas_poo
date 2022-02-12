import model.MusicGenre;
import model.PlayList;
import model.Song;
import model.SongLibrary;
import ui.UIMenu;

import java.text.ParseException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        //UIMenu.showMenu();
        //SongLibrary.createSongs();
        //SongLibrary.showSongs();
//        SongLibrary.orderByDateAscending();
//        System.out.println();
//        SongLibrary.orderByDateDescending();
//        SongLibrary.showSongs();
//        System.out.println("");
//        SongLibrary.showInfoSong();
//        SongLibrary.orderByDurationAscending();
//        System.out.println("");
//        SongLibrary.orderByDurationDescending();
//        PlayList.createAPlayList();

//        PlayList.createAPlayList();
//        SongLibrary.createSongs();
//        UIMenu.showOptionsPlayListMenu();


        //SongLibrary.filterByDate("2017");

        //PlayList playList = new PlayList();

        //playList.createPlaylist(2);


        UIMenu.showCreatePlayList();
    }
}
