package model;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayList {

    private String namePlayList;
    private ArrayList<PlayList> playLists = new ArrayList<>();

    public PlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    public PlayList() {
    }

    public static void createAPlayList(){
        Scanner response = new Scanner(System.in);
        PlayList playList = new PlayList();
        System.out.print("Ingrese el nombre de la play list: ");
        playList.setNamePlayList(response.nextLine());
        playList.showInfo();
    }

    public void addSongsToPlaylist(){

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
