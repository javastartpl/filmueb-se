package controller;

import controller.exceptions.OptionNotExistsException;
import db.ApplicationDatabase;
import db.exceptions.DuplicateException;
import io.ApplicationIO;
import io.exceptions.IncorrectDataException;
import model.Actor;
import model.Movie;
import model.TvSeries;

public class ApplicationController {

    private ApplicationIO io = new ApplicationIO();
    private ApplicationDatabase database = new ApplicationDatabase();

    public void mainLoop() {
        Option userOption = null;
        do {
            printOptions();
            try {
                userOption = Option.convert(io.readInt("Podaj opcję"));
            } catch (OptionNotExistsException e) {
                io.printlnError(e.getMessage());
                continue;
            }
            chooseOption(userOption);
        } while (userOption != Option.EXIT);
    }

    private void printOptions() {
        io.println("----------------");
        for (Option option : Option.values()) {
            io.println(option.toString());
        }
        io.println("----------------");
    }

    private void chooseOption(Option option) {
        switch (option) {
            case ADD_MOVIE:
                addMovie();
                break;
            case ADD_TV:
                addTvSeries();
                break;
            case ADD_ACTOR:
                addActor();
                break;
            case PRINT_ALL:
                printAll();
                break;
            case EXIT:
                io.println("Koniec programu");
                break;
        }
    }

    private void addActor() {
        Actor actor = io.createActor();
        try {
            database.addActor(actor);
        } catch (DuplicateException e) {
            io.printlnError(e.getMessage());
        }
    }

    private void addTvSeries() {
        try {
            TvSeries tvSeries = io.createTvSeries();
            database.addTvSeries(tvSeries);
        } catch (DuplicateException | IncorrectDataException e) {
            io.printlnError(e.getMessage());
        }
    }

    private void addMovie() {
        try {
            Movie movie = io.createMovie();
            database.addMovie(movie);
        } catch (DuplicateException | IncorrectDataException e) {
            io.printlnError(e.getMessage());
        }
    }

    private void printAll() {
        io.println("Filmy: ");
        for (Movie movie : database.getMovies()) {
            io.println(movie.toString());
        }
        io.println("Seriale:");
        for (TvSeries tvSeries : database.getTvSeries()) {
            io.println(tvSeries.toString());
        }
        io.println("Aktorzy:");
        for (Actor actor : database.getActors()) {
            io.println(actor.toString());
        }
    }

}
