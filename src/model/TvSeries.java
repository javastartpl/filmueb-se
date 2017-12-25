package model;

public class TvSeries {
    private String title;
    private int seasons;
    private int episodes;
    private String producer;
    private String genre;
    private String description;
    private int rating;

    public TvSeries(String title, int seasons, int episodes, String producer, String genre, String description, int rating) {
        this.title = title;
        this.seasons = seasons;
        this.episodes = episodes;
        this.producer = producer;
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

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
        System.out.println("TvSeries{" +
                "title='" + title + '\'' +
                ", seasons=" + seasons +
                ", episodes=" + episodes +
                ", producer='" + producer + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}');
    }
}
