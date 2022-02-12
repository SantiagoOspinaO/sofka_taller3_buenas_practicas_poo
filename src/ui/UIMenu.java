package ui;

import model.MusicGenre;
import model.PlayList;
import model.SongLibrary;

import java.util.Scanner;

public class UIMenu {

    static  Scanner sc = new Scanner(System.in);

    public static void showMenu() {

        MusicGenre[] genres = MusicGenre.values();
        SongLibrary.createSongs();

        System.out.println("-----------------------------------------------------------");
        System.out.println("|                      ¡BIENVENIDOS!                      |");
        System.out.println("-----------------------------------------------------------");

        int response = 0;
        do {
            System.out.println("::Selecciona tu genero preferido::");
            for (int i = 0; i < genres.length; i++) {
                System.out.println(i + 1 + ". " + genres[i]);
            }
            System.out.println("::Opciones::");
            System.out.println("4. Listar todas las canciones");
            System.out.println("5. Crear una play list");
            System.out.println("0. Salir");

            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                       GENERO POP                        |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.filterByGenre(MusicGenre.POP);
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                       GENERO ROCK                       |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.filterByGenre(MusicGenre.ROCK);
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                    GENERO HARDSTYLE                     |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.filterByGenre(MusicGenre.HARDSTYLE);
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|         Canciones disponibles en la Bilioteca           |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.showInfoSong();
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                    Creando Playlist                     |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.showSongs();
                    showCreatePlayList();
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 0:
                    System.out.println("¡¡ Vuelve pronto !!");
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
            System.out.println("::Selecciona una opcion::");
            System.out.println("1. Crear una play list");
            System.out.println("2. Ordenar [duracion ascendente]");
            System.out.println("3. Ordenar [duracion descendente]");
            System.out.println("4. Filtrar [año]");
            System.out.println("0. Salir");

            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showCreatePlayList();
                    break;
                case 2:
                    SongLibrary.sortByDurationAscending();
                    break;
                case 3:
                    SongLibrary.sortByDurationDescending();
                    break;
                case 4:
                    System.out.println("Ingresa el año que quieres filtrar");
                    String year = sc.nextLine();
                    SongLibrary.filterByDate(year);
                    break;
                case 0:
                    System.out.println("");
                    break;
            }

        } while (response != 0);

    }

    public static void showCreatePlayList() {

        int response = 0;
        PlayList playList = new PlayList();
        do {
            System.out.println("::Selecciona que canción quieres agregar a la PlayList::");
            System.out.println("0. Salir");

            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            if (response == 0) {
                break;
            } else if (response == 1) {
                System.out.println("Canción agregada con éxito.");
                playList.createPlaylist(1);
            } else if (response == 2) {
                System.out.println("Canción agregada con éxito.");
                playList.createPlaylist(2);
            }

        } while (response != 0);

    }

}
