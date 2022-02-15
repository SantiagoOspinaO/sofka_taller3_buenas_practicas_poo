package ui;

import model.MusicGenre;
import model.PlayList;
import model.SongLibrary;

import java.util.Scanner;

/**
 * Se crea la clase UIMenu con el objetivo de crear una interfaz para el usuario.
 *
 * @version 1.00.000 2022-02-14
 *
 * @authors Santiago Ospina Osorio - santiago.m200@outlook.es / Stiven Suárez Marín - ferbohi@outlook.com
 *
 * @since 1.00.000 2022-02-14
 */
public class UIMenu {

    /**
     * Se instancia un sc de tipo Scanner estatico para acceder a este sin tener que volverlo a instanciar.
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * Se crea el  metodo showMenu con el objetivo de mostrar al usuario el menu inicial.
     *
     *    showInitialMenu();
     *
     * @authors Santiago Ospina Osorio - santiago.m200@outlook.es / Stiven Suárez Marín - ferbohi@outlook.com
     *
     * @since 1.00.000 2022-02-14
     */
    public static void showInitialMenu() {

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
            System.out.println("6. Listar todas las canciones");
            System.out.println("7. Crear una play list");
            System.out.println("0. Salir");

            System.out.print("--> ");
            try {
                response = Integer.valueOf(sc.nextLine());
                if(response >= 8){
                    System.out.println("Ups, parece que ingresaste una opción que no se encuentra en la lista.\n" +
                            "Por favor intenta ingresar un número de la lista.\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("Ups, ingresaste un número y/o, letra inválida, ¡por favor verifícala!");
            }

            switch (response) {
                case 1:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                       GENERO POP                        |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.filterByGenre(MusicGenre.POP);
                    showOptionsWithinAGenre();
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                       GENERO ROCK                       |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.filterByGenre(MusicGenre.ROCK);
                    showOptionsWithinAGenre();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                    GENERO HARDSTYLE                     |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.filterByGenre(MusicGenre.HARDSTYLE);
                    showOptionsWithinAGenre();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                    GENERO ACUSTICO                      |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.filterByGenre(MusicGenre.ACOUSTIC);
                    showOptionsWithinAGenre();
                case 5:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                        GENERO RAP                       |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.filterByGenre(MusicGenre.RAP);
                    showOptionsWithinAGenre();
                    break;
                case 6:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|         Canciones disponibles en la Bilioteca           |");
                    System.out.println("-----------------------------------------------------------");
                    SongLibrary.showInfoSong();
                    showOptionsForAllSongsMenu();
                    break;
                case 7:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                    Creando Playlist                     |");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println(" ");
                    SongLibrary.showSongs();
                    System.out.println(" ");
                    showCreatePlayList();
                    showOptionsWithinAGenre();
                    break;
                case 0:
                    System.out.println("¡¡ Vuelve pronto !!");
                    break;
            }

        } while (response != 0);

    }

    /**
     * Se crea el  metodo showOptionsForAllSongsMenu con el objetivo de mostrar al usuario las opciones que tiene al listar
     * todas las canciones.
     *
     *    showOptionsForAllSongsMenu();
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-02-14
     */
    public static void showOptionsForAllSongsMenu() {

        int response = 0;
        do {
            System.out.println(" ");
            System.out.println("::Selecciona una opcion::");
            System.out.println("1. Crear una play list");
            System.out.println("2. Ordenar [duracion ascendente]");
            System.out.println("3. Ordenar [duracion descendente]");
            System.out.println("4. Ordenar [fecha ascendente]");
            System.out.println("5. Ordenar [fecha descendente]");
            System.out.println("6. Filtrar [año]");
            System.out.println("0. Salir");

            System.out.print("--> ");

            try {
                response = Integer.valueOf(sc.nextLine());

                if(response >= 8){
                    System.out.println("Ups, parece que ingresaste una opción que no se encuentra en la lista.\n" +
                            "Por favor intenta ingresar un número de la lista.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Ups, ingresaste un número y/o, letra inválida, ¡por favor verifícala!");
            }

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
                    SongLibrary.sortByDateAscending();
                    break;
                case 5:
                    SongLibrary.sortByDateDescending();
                    break;
                case 6:
                    System.out.println("Ingresa el año que quieres filtrar");
                    System.out.print("--> ");
                    String year = sc.nextLine();
                    SongLibrary.filterByYear(year);
                    break;
                case 0:
                    System.out.println("");
                    break;
            }

        } while (response != 0);

    }

    /**
     * Se crea el  metodo showOptionsWithinAGenre con el objetivo de mostrar al usuario las opciones que tiene al seleccionar
     * un genero.
     *
     *    showOptionsWithinAGenre();
     *
     * @authors Santiago Ospina Osorio - santiago.m200@outlook.es / Stiven Suárez Marín - ferbohi@outlook.com}
     *
     * @since 1.00.000 2022-02-14
     */
    public static void showOptionsWithinAGenre() {

        int response = 0;
        do {
            System.out.println(" ");
            System.out.println("::Selecciona una opcion::");
            System.out.println("1. Crear una play list");
            System.out.println("2. Filtrar [año]");
            System.out.println("0. Salir");

            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showCreatePlayList();
                    break;
                case 2:
                    System.out.println("Ingresa el año que quieres filtrar");
                    System.out.print("--> ");
                    String year = sc.nextLine();
                    SongLibrary.filterByYear(year);
                    break;
                case 0:
                    System.out.println("");
                    break;
            }

        } while (response != 0);

    }

    /**
     * Se crea el  metodo showCreatePlayList con el objetivo de mostrar al usuario como agregar una cancion a un play list.
     *
     *    showCreatePlayList();
     *
     * @authors Santiago Ospina Osorio - santiago.m200@outlook.es / Stiven Suárez Marín - ferbohi@outlook.com
     *
     * @since 1.00.000 2022-02-14
     */
    public static void showCreatePlayList() {
        int response = 0;
        PlayList playList = new PlayList();
        do {
            System.out.println("::Selecciona que canción quieres agregar a la PlayList::");
            System.out.println("0. Salir");

            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            if (response != 0) {
                System.out.println("Canción agregada con éxito.");
                playList.addSongToPlayList(response);
            }
            System.out.println(" ");
        } while (response != 0);

    }

}
