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
        int userOption = 0;
        do {
            printOptions();
            System.out.println("Wybierz opcję:");
            userOption = reader.readInt();
            chooseOption(userOption);
        } while (userOption != Option.EXIT);
    }

    private void printOptions() {
        System.out.println(Option.ADD_MOVIE + " - Dodanie filmu");
        System.out.println(Option.ADD_TV + " - Dodanie serialu");
        System.out.println(Option.ADD_ACTOR + " - Dodanie aktora");
        System.out.println(Option.PRINT_ALL + " - Wyświetl wszystko");
        System.out.println(Option.EXIT + " - Koniec programu");
    }

    private void chooseOption(int option) {
        switch (option) {
            case Option.ADD_MOVIE:
                Movie movie = reader.createMovie();
                if(movie != null) {
                    database.addMovie(movie);
                }
                break;
            case Option.ADD_TV:
                TvSeries tvSeries = reader.createTvSeries();
                if(tvSeries != null) {
                    database.addTvSeries(tvSeries);
                }
                break;
            case Option.ADD_ACTOR:
                Actor actor = reader.createActor();
                database.addActor(actor);
                break;
            case Option.PRINT_ALL:
                printAll();
                break;
            case Option.EXIT:
                System.out.println("Koniec programu");
                break;
            default:
                System.out.println("Nie ma takiej opcji");
        }
    }

    private void printAll() {
        System.out.println("Filmy");
        for (Movie movie : database.getMovies()) {
            movie.showInfo();
        }
        System.out.println("Seriale");
        for (TvSeries tvSeries : database.getTvSeries()) {
            tvSeries.showInfo();
        }
        System.out.println("Aktorzy");
        for (Actor actor : database.getActors()) {
            actor.showInfo();
        }
    }

}
