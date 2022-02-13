package model;

/**
 * Imports para la utilidad del código.
 */
import java.util.Arrays;
import java.util.List;

/**
 * Se crea la clase SongLibrary
 * @authors Stiven Suárez Marín - Santiago Ospina
 */
public class SongLibrary {

    /**
     * Declaración de la Array List, se establece un tamaño específico porque se conocen cuántas canciones se encuentran en la lista.
     */
    public static Song songs[] = new Song[7];

    public static void createSongs() {
        /**
         * En este apartado se encuentran todas las canciones agregadas en la Biblioteca como predeterminadas.
         */
        songs[0] = new Song("Agua y Mezcal", "3:47", "guitarricadela.png", MusicGenre.ACOUSTIC, "2016/06/27", "Cancion hecha por Guitarrica de la Fuente.");
        songs[1] = new Song("Cerebros Destruidos", "2:39", "eskorbuto.png", MusicGenre.ROCK, "1986/05/30", "Canción hecha por Eskorbuto.");
        songs[2] = new Song("Believer", "3:37", "imaginedragon.png", MusicGenre.POP, "2017/03/07", "Canción hecha por Imagine Dragons.");
        songs[3] = new Song("Humo", "4:06", "rupatrupa.png", MusicGenre.ACOUSTIC, "2017/05/12", "Canción hecha por Rupatrupa.");
        songs[4] = new Song("Línea Recta", "3:38", "noisferatu.png", MusicGenre.RAP, "2018/10/19", "Canción hecha por Noiseferatu.");
        songs[5] = new Song("Can't Get You out of My Head", "4:04", "annenMayKantereit.png", MusicGenre.POP, "2019/12/20", "Canción en cover por AnnenMayKantereit x Parcels");
        songs[6] = new Song("Maldita Dulzura - Open Mic", "11:20", "vetusta.png", MusicGenre.HARDSTYLE, "2016/05/09", "Canción hecha por Vetusta Morla.");
    }

    /**
     * Se crea el metodo showSongs para mostrar los nombres de las canciones.
     */
    public static void showSongs() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println(i + 1 + ". " + songs[i].showData());
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
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    /**
     * Se crea el metodo orderByDurationDescending para ordenar por duration de forma descendente
     */
    public static void sortByDurationDescending() {
        Arrays.sort(songs);
        for (int i = songs.length - 1; i >= 0; i--) {
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
        for (int i = songs.length - 1; i >= 0; i--) {
            System.out.println(songs[i]);
        }
    }


    /**
     * Método para filtrar por el tipo de género las canciónes que se encuentran en la biblioteca principal.
     * Recibe como parámetro el género por el cual se quiere filtrar.
     * @param genre
     */
    public static void filterByGenre(MusicGenre genre) {

        List<Song> listMusicAsArray = Arrays.asList(songs[0], songs[1], songs[2], songs[3], songs[4], songs[5], songs[6]);
        listMusicAsArray.stream().filter(Song -> Song.getGenre().equals(genre)).forEach(System.out::println);

    }


    /**
     * Método para filtrar por la fecha de las canciones.
     * Recibe como parámetro un String que corresponde a cualquier tipo, es decir, Día, Mes y Año, se
     * buscará por lo que contenga la canción en la fecha de lo ingresado en el Date.
     * @param date
     */
    public static void filterByDate(String date) {
        List<Song> listMusicAsArray = Arrays.asList(songs[0], songs[1], songs[2], songs[3], songs[4], songs[5], songs[6]);
        listMusicAsArray.stream().filter(Song -> Song.getDate().contains(date)).forEach(System.out::println);

    }
}

