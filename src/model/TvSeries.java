package model;

import io.exceptions.IncorrectDataException;

import java.util.Objects;

public class TvSeries extends Item{
    private int seasons;
    private int episodes;
    private String producer;

    public TvSeries(String title, Genre genre, String description, int rating, int seasons, int episodes, String producer) {
        super(title, genre, description, rating);
        setSeasons(seasons);
        setEpisodes(episodes);
        this.producer = producer;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        if(seasons < 0)
            throw new IncorrectDataException("Ilość sezonów musi być >= 0 (" + seasons + ")");
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        if(episodes < 0)
            throw new IncorrectDataException("Ilość odcinków musi być >= 0 (" + episodes + ")");
        this.episodes = episodes;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TvSeries tvSeries = (TvSeries) o;
        return seasons == tvSeries.seasons &&
                episodes == tvSeries.episodes &&
                Objects.equals(producer, tvSeries.producer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), seasons, episodes, producer);
    }

    @Override
    public String toString() {
        return "TvSeries{" +
                super.toString() +
                "seasons=" + seasons +
                ", episodes=" + episodes +
                ", producer='" + producer + '\'' +
                '}';
    }
}
