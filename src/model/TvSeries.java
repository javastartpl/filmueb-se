package model;

public class TvSeries extends Item{
    private int seasons;
    private int episodes;
    private String producer;

    public TvSeries(String title, String genre, String description, int rating, int seasons, int episodes, String producer) {
        super(title, genre, description, rating);
        this.seasons = seasons;
        this.episodes = episodes;
        this.producer = producer;
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

    public void showInfo() {
        System.out.println("TvSeries{" +
                "title='" + getTitle() + '\'' +
                ", seasons=" + seasons +
                ", episodes=" + episodes +
                ", producer='" + producer + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", rating=" + getRating() +
                '}');
    }
}
