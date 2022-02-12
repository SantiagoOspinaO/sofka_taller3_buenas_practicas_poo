package ui;

import model.MusicGenre;
import model.SongLibrary;

import java.util.Scanner;

public class UIMenu {

    public static void showMenu() {

        MusicGenre[] genres = MusicGenre.values();

        System.out.println("-----------------------------------------------------------");
        System.out.println("|                      ¡BIENVENIDOS!                      |");
        System.out.println("-----------------------------------------------------------");

        int response = 0;
        do {
            System.out.println("::Selecciona tu genero preferido::");
            for (int i = 0; i < genres.length; i++) {
                System.out.println(i+1 + ". " + genres[i]);
            }
            System.out.println("::Opciones::");
            System.out.println("4. Listar todas las canciones");
            System.out.println("5. Crear una play list");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                       GENERO POP                        |");
                    System.out.println("-----------------------------------------------------------");
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                       GENERO ROCK                       |");
                    System.out.println("-----------------------------------------------------------");
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                    GENERO HARDSTYLE                     |");
                    System.out.println("-----------------------------------------------------------");
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|         Canciones disponibles en la Bilioteca           |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.createSongs();
                    SongLibrary.showInfoSong();
                    UIMenu.showOptionsPlayListMenu();
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                   Crear una Play List                   |");
                    System.out.println("-----------------------------------------------------------");
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

            Scanner sc = new Scanner(System.in);
            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("");
                    break;
            }

        } while (response != 0);

    }
}
