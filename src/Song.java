import java.util.Date;

public class Song implements Comparable<Song> {

    private String title;
    private int id;
    private Date date;
    private String duration; //12:05
    private String imageCover;
    private String description;
    public static final String[] GENRE = {"POP", "TECHNO", "ROCK"};


    public Song(String title, Date date, String duration, String imageCover, String description) {
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.imageCover = imageCover;
        this.description = description;
    }

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song() {
    }


    @Override
    public int compareTo(Song song) {
        return duration.compareTo(song.getDuration());
    }

    public  int compareToo(Song s) {
        return date.compareTo(s.getDate());
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", ID=" + id +
                ", date=" + date +
                ", duration='" + duration + '\'' +
                ", imageCover='" + imageCover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

