package app;

import io.ConsoleDataReader;
import model.Actor;
import model.Movie;
import model.TvSeries;

public class Filmueb {
    public static void main(String[] args) {
        final String appName = "app.Filmueb v0.2";
        ConsoleDataReader reader = new ConsoleDataReader();
        Movie movie = reader.createMovie();
        TvSeries tvSeries = reader.createTvSeries();
        Actor actor = reader.createActor();

        System.out.println(appName);
        movie.showInfo();
        tvSeries.showInfo();
        actor.showInfo();
    }
}
