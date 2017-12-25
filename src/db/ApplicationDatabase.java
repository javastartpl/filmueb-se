package db;

import model.Actor;
import model.Movie;
import model.TvSeries;

public class ApplicationDatabase {

    private final int maxSize = 10;
    private Movie[] movies = new Movie[maxSize];
    private int numberOfMovies = 0;
    private TvSeries[] tvSeries = new TvSeries[maxSize];
    private int numberOfTvSeries = 0;
    private Actor[] actors = new Actor[maxSize];
    private int numberOfActors = 0;

    public void addMovie(Movie movie) {
        movies[numberOfMovies] = movie;
        numberOfMovies++;
    }

    public void addTvSeries(TvSeries tv) {
        tvSeries[numberOfTvSeries] = tv;
        numberOfTvSeries++;
    }

    public void addActor(Actor actor) {
        actors[numberOfActors] = actor;
        numberOfActors++;
    }

    ///poniższe metody zwracają tablice bez nulli
    public Movie[] getMovies() {
        Movie[] withoutNulls = new Movie[numberOfMovies];
        for (int i = 0; i < numberOfMovies; i++) {
            withoutNulls[i] = movies[i];
        }
        return withoutNulls;
    }

    public TvSeries[] getTvSeries() {
        TvSeries[] withoutNulls = new TvSeries[numberOfTvSeries];
        for (int i = 0; i < numberOfTvSeries; i++) {
            withoutNulls[i] = tvSeries[i];
        }
        return withoutNulls;
    }

    public Actor[] getActors() {
        Actor[] withoutNulls = new Actor[numberOfActors];
        for (int i = 0; i < numberOfActors; i++) {
            withoutNulls[i] = actors[i];
        }
        return withoutNulls;
    }
}
