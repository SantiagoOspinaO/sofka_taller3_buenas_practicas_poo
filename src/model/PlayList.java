package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayList {

    private String namePlayList;
    private static ArrayList<Song> playList;
    static PlayList mainLibrary = new PlayList("", playList);

    public PlayList(String namePlayList, ArrayList<Song> playList) {
        this.namePlayList = namePlayList;
        this.playList = playList;
    }

    public PlayList() {
    }

    public static void createAPlayList() {
        Scanner response = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la play list: ");
        mainLibrary.setNamePlayList(response.nextLine());
        mainLibrary.playList.add(new Song());
        for (Song song : playList) {
            System.out.println(song);
        }
        mainLibrary.showInfo();
    }

    public static void addSongsToPlaylist() {
        mainLibrary.playList.add(new Song());
        for (Song song : playList) {
            System.out.println(song);
        }
    }

    public void showInfo() {
        System.out.println("Name PlayList: " + getNamePlayList());
    }

    public String getNamePlayList() {
        return namePlayList;
    }

    public void setNamePlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }
}
