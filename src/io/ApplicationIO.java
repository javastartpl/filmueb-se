package io;

import io.exceptions.IncorrectDataException;
import model.Actor;
import model.Genre;
import model.Movie;
import model.TvSeries;
import model.exceptions.GenreNotExistsException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationIO {
    private Scanner scanner = new Scanner(System.in);

    public Movie createMovie() {
        println("Tworzenie nowego filmu");
        println("Podaj tytuł");
        String title = scanner.nextLine();
        int year = readInt("Podaj rok produkcji");
        println("Podaj reżysera");
        String director = scanner.nextLine();
        println("Podaj gatunek " + Arrays.toString(Genre.values()));
        Genre genre = null;
        try {
            genre = Genre.convert(scanner.nextLine());
        } catch (GenreNotExistsException e) {
            throw new IncorrectDataException(e.getMessage());
        }
        println("Podaj opis");
        String description = scanner.nextLine();
        int rating = readInt("Podaj ocenę (1-10)");
        return new Movie(title, genre, description, rating, year, director);
    }

    public TvSeries createTvSeries() {
        println("Tworzenie nowego serialu");
        println("Podaj tytuł");
        String title = scanner.nextLine();
        int seasons = readInt("Podaj ilość sezonów");
        int episodes = readInt("Podaj ilość odcinków");
        println("Podaj producenta");
        String producer = scanner.nextLine();
        println("Podaj gatunek " + Arrays.toString(Genre.values()));
        Genre genre = null;
        try {
            genre = Genre.convert(scanner.nextLine());
        } catch (GenreNotExistsException e) {
            throw new IncorrectDataException(e.getMessage());
        }
        println("Podaj opis");
        String description = scanner.nextLine();
        int rating = readInt("Podaj ocenę (1-10)");
        return new TvSeries(title, genre, description, rating, seasons, episodes, producer);
    }

    public Actor createActor() {
        println("Tworzenie nowego aktora");
        println("Podaj imię");
        String firstName = scanner.nextLine();
        println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        println("Podaj kraj pochodzenia");
        String country = scanner.nextLine();
        return new Actor(firstName, lastName, country);
    }

    public int readInt(String inputMessage) {
        int number = 0;
        boolean complete = false;
        while (!complete) {
            if (inputMessage != null)
                println(inputMessage);
            try {
                number = scanner.nextInt();
                complete = true;
            } catch (InputMismatchException e) {
                printlnError("Dane w nieprawidłowym formacie");
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }

    public void println(String message) {
        System.out.println("> "+message);
    }

    public void printlnError(String error) {
        System.err.println("> "+error);
    }

}
