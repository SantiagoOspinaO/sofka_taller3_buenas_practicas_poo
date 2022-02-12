package model;

import java.util.Comparator;
import java.util.Objects;

public class Song implements Comparable<Song>, Comparator<Song> {

    private int id = 0;
    private String title;
    private MusicGenre genre;
    private String date;
    private String duration;
    private String imageCover;
    private String description;


    public Song(String title, String duration, String imageCover, MusicGenre genre, String date, String description) {
        this.title = Objects.requireNonNull(title);
        this.genre = Objects.requireNonNull(genre);
        this.date = Objects.requireNonNull(date);
        this.duration = Objects.requireNonNull(duration);
        this.imageCover = Objects.requireNonNull(imageCover);
        this.description = Objects.requireNonNull(description);
    }

    public Song() {
    }

    @Override
    public int compareTo(Song song) {
        return duration.compareTo(song.getDuration());
    }

    @Override
    public int compare(Song song1, Song song2) {
        return song1.getDate().compareTo(song2.getDate());
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getImageCover() {
        return imageCover;
    }

    public void setImageCover(String imageCover) {
        this.imageCover = imageCover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MusicGenre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", date: " + date + ", genero: " + genre
                + ", duration: " + duration + ", imageCover: " + imageCover + ", description: " + description;
    }

//    public String showData(){
//        return "Title: " + title + ", date: " + date + ", duration: " + duration;
//    }

    public String showData(){
        return "Title: " + getTitle();
    }

}

