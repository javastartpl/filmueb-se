package model;

import io.exceptions.IncorrectDataException;

import java.util.Objects;

public abstract class Item {
    private String title;
    private Genre genre;
    private String description;
    private int rating;

    public Item(String title, Genre genre, String description, int rating) {
        this.title = title;
        setGenre(genre);
        this.description = description;
        setRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        if(genre == null)
            throw new NullPointerException("Gatunek nie może być null");
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
        if(rating < 0 || rating > 10)
            throw new IncorrectDataException("Ocena musi być z przedziału 1-10 (" + rating + ")");
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", genre=" + genre +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return rating == item.rating &&
                Objects.equals(title, item.title) &&
                genre == item.genre &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, genre, description, rating);
    }
}
