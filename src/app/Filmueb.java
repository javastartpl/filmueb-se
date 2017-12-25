package app;

import io.ConsoleDataReader;
import model.Actor;
import model.Movie;
import model.TvSeries;

public class Filmueb {

    private Movie[] movies = new Movie[5];
    private int numberOfMovies = 0;
    private TvSeries[] tvSeries = new TvSeries[5];
    private int numberOfTvSeries = 0;
    private Actor[] actors = new Actor[5];
    private int numberOfActors = 0;
    private ConsoleDataReader reader = new ConsoleDataReader();

    public static void main(String[] args) {
        final String appName = "app.Filmueb v0.3";
        System.out.println(appName);
        Filmueb filmueb = new Filmueb();

        int userOption = 0;
        do {
            filmueb.printOptions();
            System.out.println("Wybierz opcję:");
            userOption = filmueb.reader.readInt();
            filmueb.chooseOption(userOption);
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
                    movies[numberOfMovies] = movie;
                    numberOfMovies++;
                }
                break;
            case 1:
                TvSeries tvSeries = reader.createTvSeries();
                if(tvSeries != null) {
                    this.tvSeries[numberOfTvSeries] = tvSeries;
                    numberOfTvSeries++;
                }
                break;
            case 2:
                actors[numberOfActors] = reader.createActor();
                numberOfActors++;
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
        for (int i = 0; i < numberOfMovies; i++) {
            movies[i].showInfo();
        }
        System.out.println("Seriale");
        for (int i = 0; i < numberOfTvSeries; i++) {
            tvSeries[i].showInfo();
        }
        System.out.println("Aktorzy");
        for (int i = 0; i < numberOfActors; i++) {
            actors[i].showInfo();
        }
    }
}
