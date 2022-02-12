package model;

import java.util.Arrays;
import java.util.List;

public class SongLibrary {

    public static Song songs[] = new Song[3];

    public static void createSongs(){

        songs[0] = new Song("Name1", "2:15", "2018/05/30", MusicGenre.ROCK);
        songs[1] = new Song("Name2", "2:00", "2018/05/15", MusicGenre.ROCK);
        songs[2] = new Song("Name3", "3:02", "2020/03/25", MusicGenre.POP);

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
    public static void sortByDurationAscending() {
        Arrays.sort(songs);
        for (Song song : songs){
            System.out.println(song);
        }
    }

    /**
     * Se crea el metodo orderByDurationDescending para ordenar por duration de forma descendente
     */
    public static void sortByDurationDescending() {
        Arrays.sort(songs);
        for (int i = songs.length-1; i >= 0; i--) {
            System.out.println(songs[i]);
        }
    }

    /**
     * Se crea el metodo orderByDateAscending() para oordenar por fecha de forma ascendente
     */
    public static void sortByDateAscending() {
        Arrays.sort(songs, new Song());
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    /**
     * Se crea el metodo orderByDateDescending para ordenar por fecha de forma descendente
     */
    public static void sortByDateDescending() {
        Arrays.sort(songs, new Song());
        for (int i = songs.length-1; i >= 0; i--) {
            System.out.println(songs[i]);
        }
    }

    public static void filterByGenre(MusicGenre genre){

        Song song1 = new Song("Name1", "2:15", "2018/05/30", MusicGenre.ROCK);
        Song song4 = new Song("Name4", "2:15", "2018/05/30", MusicGenre.ROCK);
        Song song5 = new Song("Name5", "2:15", "2018/05/30", MusicGenre.ROCK);
        Song song2 = new Song("Name2", "2:15", "2018/05/30", MusicGenre.HARDSTYLE);
        Song song3 = new Song("Name3", "2:15", "2018/05/30", MusicGenre.POP);

        List<Song> listMusicAsArray = Arrays.asList(song1, song3, song2, song4,song5);

        listMusicAsArray.stream().filter(Song -> Song.getGenre().equals(genre)).forEach(System.out::println);

    }


    public static void filterByDate(String date){

        Song song1 = new Song("Name1", "2:15", "2017/05/30", MusicGenre.ROCK);
        Song song4 = new Song("Name4", "2:15", "2012/05/30", MusicGenre.ROCK);
        Song song5 = new Song("Name5", "2:15", "2016/05/30", MusicGenre.ROCK);
        Song song2 = new Song("Name2", "2:15", "2018/05/30", MusicGenre.HARDSTYLE);
        Song song3 = new Song("Name3", "2:15", "2012/05/30", MusicGenre.POP);
        Song song6 = new Song("Name6", "2:15", "2016/05/30", MusicGenre.POP);

        List<Song> listMusicAsArray = Arrays.asList(song1, song3, song2, song4,song5);

        listMusicAsArray.stream().filter(Song -> Song.getDate().contains(date)).forEach(System.out::println);

    }
}

