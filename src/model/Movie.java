package model;

import java.util.Objects;

public class Movie extends Item {
    private int year;
    private String director;

    public Movie(String title, Genre genre, String description, int rating, int year, String director) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Movie movie = (Movie) o;
        return year == movie.year &&
                Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), year, director);
    }

    @Override
    public String toString() {
        return "Movie{" +
                super.toString() +
                "year=" + year +
                ", director='" + director + '\'' +
                '}';
    }
}
