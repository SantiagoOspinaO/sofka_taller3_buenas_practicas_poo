package model;

import java.util.Comparator;
import java.util.Objects;

public class Song implements Comparable<Song>, Comparator<Song> {

    private int id = 0;
    private String title;
    private MusicGenre genre;
    private String date;
    private String duration;
    private String imageCover; //nombre del archivo
    private String description;


    public Song(String title, MusicGenre genre, String date, String duration, String imageCover, String description) {
        this.title = Objects.requireNonNull(title);
        this.genre = Objects.requireNonNull(genre);
        this.date = Objects.requireNonNull(date);
        this.duration = Objects.requireNonNull(duration);
        this.imageCover = Objects.requireNonNull(imageCover);
        this.description = Objects.requireNonNull(description);
    }

    public Song(String title, String duration, String date)  {
        this.title = title;
        this.duration = duration;
        this.date = date;
    }

    public Song(MusicGenre genre, String title) {
        this.genre = genre;
        this.title = title;
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

    //    public void setDate(Date date) throws ParseException {
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
////        Date dateFormat = format.parse(date);
////        String resultDate = dateFormat.toString();
////        this.date = resultDate;
//        String dateFormat = format.format(getDate());
//    }

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

