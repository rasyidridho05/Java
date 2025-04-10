package Movie;

public class Movie {

    private String title;
    private String director;
    private String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    public String toString() {
        return "judul : " + title + ", Director : " + director + ", Genre : " + genre;
    }
}
