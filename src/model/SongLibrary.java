package model;

import java.util.Arrays;

public class SongLibrary {

    public static Song songs[] = new Song[3];

    public static void createSongs(){

        songs[0] = new Song("Name1", "2:15", "2018/05/30");
        songs[1] = new Song("Name2", "2:00", "2018/05/15");
        songs[2] = new Song("Name3", "3:02", "2020/03/25");

//        songs.add(new Song(Song.Genre.ROCK, "Title"));
    }

    /**
     * Se crea el metodo showSongs para mostrar los nombres de las canciones.
     */
    public static void showSongs() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println(i+1 + ". " + songs[i].showData());
        }
    }

    /**
     * Se crea el metodo showInfoSong para mostrar toda la información de cada cancion.
     */
    public static void showInfoSong() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println(songs[i].toString());
        }
    }

    /**
     * Se crea el metodo orderByDurationAscending para ordenar por duration de forma ascendente
     */
    public static void orderByDurationAscending() {
        Arrays.sort(songs);
        for (Song song : songs){
            System.out.println(song);
        }
    }

    /**
     * Se crea el metodo orderByDurationDescending para ordenar por duration de forma descendente
     */
    public static void orderByDurationDescending() {
        Arrays.sort(songs);
        for (int i = songs.length-1; i >= 0; i--) {
            System.out.println(songs[i]);
        }
    }

    /**
     * Se crea el metodo orderByDateAscending() para ordenar por fecha de forma ascendente
     */
    public static void orderByDateAscending() {
        Arrays.sort(songs, new Song());
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    /**
     * Se crea el metodo orderByDateDescending para ordenar por fecha de forma descendente
     */
    public static void orderByDateDescending() {
        Arrays.sort(songs, new Song());
        for (int i = songs.length-1; i >= 0; i--) {
            System.out.println(songs[i]);
        }
    }
}

