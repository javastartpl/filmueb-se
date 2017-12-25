package model;

import java.util.Objects;

public abstract class Item {
    private String title;
    private Genre genre;
    private String description;
    private int rating;

    public Item(String title, Genre genre, String description, int rating) {
        this.title = title;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
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
