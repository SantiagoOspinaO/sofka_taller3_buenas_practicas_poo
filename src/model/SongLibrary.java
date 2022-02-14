package model;

import java.util.Arrays;
import java.util.List;

/**
 * Se crea la clase abstracta SongLibrary con el objetivo de almacenar todas las canciones y que solo exista una biblioteca
 * pricipal.
 *
 * @version 1.00.000 2022-02-14
 * 
 * @authors Santiago Ospina Osorio - santiago.m200@outlook.es / Stiven Suárez Marín - ferbohi@outlook.com
 * 
 * @since 1.00.000 2022-02-14
 */
public abstract class SongLibrary {

    /**
     * Se instancia un array de canciones de tipo Song y se le define el tamaño.
     */
    public static Song songs[] = new Song[7];

    /**
     * Se crea el metodo createSongs con el objetivo de crear las canciones de la biblioteca principal.
     * 
     *    SongLibrary.createSongs();
     *    
     * @authors Santiago Ospina Osorio - santiago.m200@outlook.es / Stiven Suárez Marín - ferbohi@outlook.com
     * 
     * @since 1.00.000 2022-02-14
     */
    public static void createSongs() {
        
        songs[0] = new Song("Agua y Mezcal", "3:47", "guitarricadela.png", MusicGenre.ACOUSTIC, "2016/06/27", "Cancion hecha por Guitarrica de la Fuente.");
        songs[1] = new Song("Cerebros Destruidos", "2:39", "eskorbuto.png", MusicGenre.ROCK, "1986/05/30", "Canción hecha por Eskorbuto.");
        songs[2] = new Song("Believer", "3:37", "imaginedragon.png", MusicGenre.POP, "2017/03/07", "Canción hecha por Imagine Dragons.");
        songs[3] = new Song("Humo", "4:06", "rupatrupa.png", MusicGenre.ACOUSTIC, "2017/05/12", "Canción hecha por Rupatrupa.");
        songs[4] = new Song("Línea Recta", "3:38", "noisferatu.png", MusicGenre.RAP, "2018/10/19", "Canción hecha por Noiseferatu.");
        songs[5] = new Song("Can't Get You out of My Head", "4:04", "annenMayKantereit.png", MusicGenre.POP, "2019/12/20", "Canción en cover por AnnenMayKantereit x Parcels");
        songs[6] = new Song("Maldita Dulzura - Open Mic", "11:20", "vetusta.png", MusicGenre.HARDSTYLE, "2016/05/09", "Canción hecha por Vetusta Morla.");
    }

    /**
     * Se crea el metodo showSongs con el objetivo de mostrar el titulo de todas las canciones.
     * 
     *    SongLibrary.showSongs();
     *    
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     * 
     * @since 1.00.000 2022-02-14
     */
    public static void showSongs() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println(i + 1 + ". " + songs[i].showData());
        }
    }

    /**
     * Se crea el metodo showInfoSong con le objetivo de mostrar toda la información de cada cancion.
     * 
     *    SongLibrary.showInfoSong();
     *    
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     * 
     * @since 1.00.000 2022-02-14
     */
    public static void showInfoSong() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println(songs[i].toString());
        }
    }

    /**
     * Se crea el metodo orderByDurationAscending con el objetivo de ordenar las canciones de la biblioteca principal por
     * duracion de forma ascendente.
     * 
     *    SongLibrary.sortByDurationAscending();
     *    
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     * 
     * @since 1.00.000 2022-02-14
     */
    public static void sortByDurationAscending() {
        Arrays.sort(songs);
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    /**
     * Se crea el metodo sortByDurationDescending con el objetivo de ordenar las canciones de la biblioteca principal por
     * duracion de forma descendente.
     * 
     *    SongLibrary.sortByDurationDescending();
     *    
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     * 
     * @since 1.00.000 2022-02-14
     */
    public static void sortByDurationDescending() {
        Arrays.sort(songs);
        for (int i = songs.length - 1; i >= 0; i--) {
            System.out.println(songs[i]);
        }
    }

    /**
     * Se crea el metodo orderByDateAscending con el objetivo de ordenar las canciones de la biblioteca principal por fecha
     * de forma ascendente.
     * 
     *    SongLibrary.sortByDateAscending();
     *    
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     * 
     * @since 1.00.000 2022-02-14
     */
    public static void sortByDateAscending() {
        Arrays.sort(songs, new Song());
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    /**
     * Se crea el metodo sortByDateDescending con el objetivo de ordenar las canciones de la biblioteca principal por fecha
     * de forma descendente.
     * 
     *    SongLibrary.sortByDateDescending();
     *    
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     * 
     * @since 1.00.000 2022-02-14
     */
    public static void sortByDateDescending() {
        Arrays.sort(songs, new Song());
        for (int i = songs.length - 1; i >= 0; i--) {
            System.out.println(songs[i]);
        }
    }

    /**
     * Se crea el metodo filterByGenre con el objetivo de filtrar las canciones de la biblioteca principal por el tipo de
     * género.
     * 
     *    SongLibrary.filterByGenre(MusicGenre."GENERO");
     *    
     * @param genre se pide un genero del enum MusicGenre
     * 
     * @author Stiven Suárez Marín - ferbohi@outlook.com
     * 
     * @since 1.00.000 2022-02-14
     */
    public static void filterByGenre(MusicGenre genre) {

        List<Song> listMusicAsArray = Arrays.asList(songs[0], songs[1], songs[2], songs[3], songs[4], songs[5], songs[6]);
        listMusicAsArray.stream().filter(Song -> Song.getGenre().equals(genre)).forEach(System.out::println);
    }

    /**
     * Se crea el metodo filterByYear con el objetivo de filtrar las canciones por el año.
     * 
     *    SongLibrary.filterByDate(year);
     *
     * @param year se pide un año.
     *
     * @author Stiven Suárez Marín - ferbohi@outlook.com
     *
     * @since 1.00.000 2022-02-14
     */
    public static void filterByYear(String year) {

        List<Song> listMusicAsArray = Arrays.asList(songs[0], songs[1], songs[2], songs[3], songs[4], songs[5], songs[6]);
        listMusicAsArray.stream().filter(Song -> Song.getDate().contains(year)).forEach(System.out::println);
    }
}

