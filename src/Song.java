import java.util.Date;

public class Song {

    private String title;
    private int ID;
    private Date date;
    private String duration; //12:05
    private String imageCover;
    private String description;
    enum Gender {
        POP, TECHNO, ROCK, HARDROCK, INDIE, ACOUSTICS, PUNK
    }

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
                ", ID=" + ID +
                ", date=" + date +
                ", duration='" + duration + '\'' +
                ", imageCover='" + imageCover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

