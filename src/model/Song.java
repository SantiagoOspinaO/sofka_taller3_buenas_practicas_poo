package model;

import java.util.Comparator;
import java.util.Objects;

/**
 * Se crea la clase Song que implementa las intefaces Comparable y Comparator, con el objetivo de definir el modelo de
 * una cancion.
 *
 *    Song song = new Song();
 *
 * @version 1.00.000 2022-02-14
 *
 * @authors Santiago Ospina Osorio - santiago.m200@outlook.es / Stiven Suárez Marín - ferbohi@outlook.com
 *
 * @since 1.00.000 2022-02-14
 */
public class Song implements Comparable<Song>, Comparator<Song> {

    private int id;
    private String title;
    private MusicGenre genre;
    private String date;
    private String duration;
    private String imageCover;
    private String description;


    /**
     * Instancia de una nueva cancion.
     *
     * @param title       the title
     * @param duration    the duration
     * @param imageCover  the image cover
     * @param genre       the genre
     * @param date        the date
     * @param description the description
     */
    public Song(String title, String duration, String imageCover, MusicGenre genre, String date, String description) {
        this.title = Objects.requireNonNull(title);
        this.genre = Objects.requireNonNull(genre);
        this.date = Objects.requireNonNull(date);
        this.duration = Objects.requireNonNull(duration);
        this.imageCover = Objects.requireNonNull(imageCover);
        this.description = Objects.requireNonNull(description);
    }

    /**
     * Se crea el constructor por defecto de la clase Song.
     */
    public Song() {
    }

    /**
     * Se sobre escribe el metodo compareTo de la interfaz Comparable.
     *
     * @param song
     */
    @Override
    public int compareTo(Song song) {
        return duration.compareTo(song.getDuration());
    }

    /**
     * Se sobre escribe el metodo compare de la interfaz Comparator.
     *
     * @param song1
     * @param song2
     */
    @Override
    public int compare(Song song1, Song song2) {
        return song1.getDate().compareTo(song2.getDate());
    }

    /**
     * Se crea el metodo Get del atributo title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Se crea el metodo Set del atributo title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Se crea el metodo Get del atributo id.
     *
     * @return the id
     */
    public int getID() {
        return id;
    }

    /**
     * Se crea el metodo Set del atributo id.
     *
     * @param ID the id
     */
    public void setID(int ID) {
        this.id = ID;
    }

    /**
     * Se crea el metodo Get del atributo date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Se crea el metodo Set del atributo date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Se crea el metodo Get del atributo duration.
     *
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Se crea el metodo Set del atributo duration.
     *
     * @param duration the duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Se crea el metodo Get del atributo image cover.
     *
     * @return the image cover
     */
    public String getImageCover() {
        return imageCover;
    }

    /**
     * Se crea el metodo Set del atributo image cover.
     *
     * @param imageCover the image cover
     */
    public void setImageCover(String imageCover) {
        this.imageCover = imageCover;
    }

    /**
     * Se crea el metodo Get del atributo description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Se crea el metodo Set del atributo description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Se crea el metodo Get del atributo genre.
     *
     * @return the genre
     */
    public MusicGenre getGenre() {
        return genre;
    }

    /**
     * Se sobre escribe el metodo toString para mostrar los atributos de la cancion.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", date: " + date + ", genero: " + genre
                + ", duration: " + duration + ", imageCover: " + imageCover + ", description: " + description;
    }

    /**
     * Se crea el metodo showData para mostrar el titulo de la cancion.
     *
     * @return the title de la cancion.
     */
    public String showData(){
        return "Title: " + getTitle();
    }
}

