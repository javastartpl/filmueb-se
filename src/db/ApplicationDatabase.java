package db;

import db.exceptions.DuplicateException;
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
        if(contains(movie)) {
            throw new DuplicateException("Rekord już istnieje w bazie " + movie.toString());
        } else {
            movies[numberOfMovies] = movie;
            numberOfMovies++;
        }
    }

    public void addTvSeries(TvSeries tv) {
        if(contains(tv)) {
            throw new DuplicateException("Rekord już istnieje w bazie " + tv.toString());
        } else {
            tvSeries[numberOfTvSeries] = tv;
            numberOfTvSeries++;
        }
    }

    public void addActor(Actor actor) {
        if(contains(actor)) {
            throw new DuplicateException("Rekord już istnieje w bazie " + actor.toString());
        } else {
            actors[numberOfActors] = actor;
            numberOfActors++;
        }
    }

    ///poniższe metody zwracają tablice bez nulli
    public Movie[] getMovies() {
        Movie[] withoutNulls = new Movie[numberOfMovies];
        for (int i = 0; i < numberOfMovies; i++) {
            withoutNulls[i] = movies[i];
        }
        return withoutNulls;
    }

    private boolean contains(Movie movie) {
        boolean result = false;
        for (int i = 0; i < numberOfMovies && !result; i++) {
            result = movies[i].equals(movie);
        }
        return result;
    }

    public TvSeries[] getTvSeries() {
        TvSeries[] withoutNulls = new TvSeries[numberOfTvSeries];
        for (int i = 0; i < numberOfTvSeries; i++) {
            withoutNulls[i] = tvSeries[i];
        }
        return withoutNulls;
    }

    private boolean contains(TvSeries tv) {
        boolean result = false;
        for (int i = 0; i < numberOfTvSeries && !result; i++) {
            result = tvSeries[i].equals(tv);
        }
        return result;
    }

    public Actor[] getActors() {
        Actor[] withoutNulls = new Actor[numberOfActors];
        for (int i = 0; i < numberOfActors; i++) {
            withoutNulls[i] = actors[i];
        }
        return withoutNulls;
    }

    private boolean contains(Actor actor) {
        boolean result = false;
        for (int i = 0; i < numberOfActors && !result; i++) {
            result = actors[i].equals(actor);
        }
        return result;
    }
}
