package controller;

import db.ApplicationDatabase;
import io.ConsoleDataReader;
import model.Actor;
import model.Movie;
import model.TvSeries;

public class ApplicationController {

    private ConsoleDataReader reader = new ConsoleDataReader();
    private ApplicationDatabase database = new ApplicationDatabase();

    public void mainLoop() {
        Option userOption = null;
        do {
            printOptions();
            System.out.println("Wybierz opcję:");
            userOption = Option.convert(reader.readInt());
            chooseOption(userOption);
        } while (userOption == null || userOption != Option.EXIT);
    }

    private void printOptions() {
        for (Option option : Option.values()) {
            System.out.println(option);
        }
    }

    private void chooseOption(Option option) {
        if(option == null)
            System.out.println("Nie ma takiej opcji");
        else
            switch (option) {
                case ADD_MOVIE:
                    Movie movie = reader.createMovie();
                    if (movie != null) {
                        database.addMovie(movie);
                    }
                    break;
                case ADD_TV:
                    TvSeries tvSeries = reader.createTvSeries();
                    if (tvSeries != null) {
                        database.addTvSeries(tvSeries);
                    }
                    break;
                case ADD_ACTOR:
                    Actor actor = reader.createActor();
                    database.addActor(actor);
                    break;
                case PRINT_ALL:
                    printAll();
                    break;
                case EXIT:
                    System.out.println("Koniec programu");
                    break;
            }
    }

    private void printAll() {
        System.out.println("Filmy:");
        for (Movie movie : database.getMovies()) {
            System.out.println(movie);
        }
        System.out.println("Seriale:");
        for (TvSeries tvSeries : database.getTvSeries()) {
            System.out.println(tvSeries);
        }
        System.out.println("Aktorzy:");
        for (Actor actor : database.getActors()) {
            System.out.println(actor);
        }
    }

}
