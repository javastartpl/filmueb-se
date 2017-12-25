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
        } while (userOption != 4);
    }

    private void printOptions() {
        System.out.println("0 - Dodanie filmu");
        System.out.println("1 - Dodanie serialu");
        System.out.println("2 - Dodanie aktora");
        System.out.println("3 - Wyświetl wszystko");
        System.out.println("4 - Koniec programu");
    }

    private void chooseOption(int option) {
        switch (option) {
            case 0:
                Movie movie = reader.createMovie();
                if(movie != null) {
                    database.addMovie(movie);
                }
                break;
            case 1:
                TvSeries tvSeries = reader.createTvSeries();
                if(tvSeries != null) {
                    database.addTvSeries(tvSeries);
                }
                break;
            case 2:
                Actor actor = reader.createActor();
                database.addActor(actor);
                break;
            case 3:
                printAll();
                break;
            case 4:
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
