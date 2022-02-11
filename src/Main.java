import model.SongLibrary;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

//        UIMenu.showMenu();
        SongLibrary.createSongs();
        SongLibrary.orderByDateAscending();
        System.out.println();
        SongLibrary.orderByDateDescending();
//        SongLibrary.showSongs();
//        System.out.println("");
//        SongLibrary.showInfoSong();
//        SongLibrary.orderByDurationAscending();
//        System.out.println("");
//        SongLibrary.orderByDurationDescending();
//        PlayList.createAPlayList();
    }
}
