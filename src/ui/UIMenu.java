package ui;

import model.MusicGenre;
import model.Song;
import model.SongLibrary;

import java.util.Scanner;

public class UIMenu {

    public static void showMenu() {

        MusicGenre[] genres = MusicGenre.values();

        System.out.println("¡BIENVENIDOS!");
        System.out.println("::Selecciona tu genero preferido!");

        int response = 0;
        do {
            for (int i = 0; i < genres.length; i++) {
                System.out.println(i+1 + ". " + genres[i]);
            }
            System.out.println("4. All songs");
            System.out.println("0. Salir");
            System.out.println(" ");

            Scanner sc = new Scanner(System.in);
            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            switch (response) {

                case 1:
                    System.out.println("==> POP <==");
                    System.out.println("Metodo para filtrar por Genero");
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 2:
                    System.out.println("==> ROCK <==");
                    SongLibrary.createSongs();
                    SongLibrary.showSongs();
                    break;
                case 3:
                    System.out.println("==> HARDSTYLE <==");
                    SongLibrary.createSongs();
                    SongLibrary.showSongs();
                    break;
                case 4:
                    System.out.println("Canciones disponibles en la Bilioteca");
                    SongLibrary.createSongs();
                    SongLibrary.showSongs();
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }

        } while (response != 0);

    }

    public static void showOptionsPlayListMenu() {

        int response = 0;
        do {

            System.out.println(" ");
            System.out.println("::Menu de opciones");
            System.out.println("Seleccione una canción");
//            System.out.println("1. Agregar a un PlayList");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
//                    SongLibrary.createSongs();
//                    if(SongLibrary.songs[0].getID() == response){
//                        SongLibrary.showInfoSong();
//                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
            }

        } while (response != 0);

    }
}
