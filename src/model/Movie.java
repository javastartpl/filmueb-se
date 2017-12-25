package model;

public class Movie {
    private String title;
    private int year;
    private String director;
    private String genre;
    private String description;
    private int rating;

    public Movie(String title, int year, String director, String genre, String description, int rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
        this.description = description;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void showInfo() {
        System.out.println("Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}');
    }
}
