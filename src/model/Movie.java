package model;

public class Movie extends Item {
    private int year;
    private String director;

    public Movie(String title, String genre, String description, int rating, int year, String director) {
        super(title, genre, description, rating);
        this.year = year;
        this.director = director;
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

    public void showInfo() {
        System.out.println("Movie{" +
                "title='" + getTitle() + '\'' +
                ", year=" + year +
                ", director='" + director + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", rating=" + getRating() +
                '}');
    }
}
