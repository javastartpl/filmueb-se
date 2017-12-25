package io;

import model.Actor;
import model.Movie;
import model.TvSeries;

import java.util.Scanner;

public class ConsoleDataReader {
    private Scanner scanner = new Scanner(System.in);

    public Movie createMovie() {
        System.out.println("Tworzenie nowego filmu");
        System.out.println("Podaj tytuł");
        String title = scanner.nextLine();
        System.out.println("Podaj rok produkcji");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj reżysera");
        String director = scanner.nextLine();
        System.out.println("Podaj gatunek");
        String genre = scanner.nextLine();
        System.out.println("Podaj opis");
        String description = scanner.nextLine();
        System.out.println("Podaj ocenę (1-10)");
        int rating = scanner.nextInt();
        scanner.nextLine();

        if(year < 0 || rating <= 0 || rating > 10) {
            System.out.println("Podane dane są nieprawidłowe, nie udało się utworzyć filmu");
            return null;
        } else {
            return new Movie(title, year, director, genre, description, rating);
        }
    }

    public TvSeries createTvSeries() {
        System.out.println("Tworzenie nowego serialu");
        System.out.println("Podaj tytuł");
        String title = scanner.nextLine();
        System.out.println("Podaj ilość sezonów");
        int seasons = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj ilość odcinków");
        int episodes = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj producenta");
        String producer = scanner.nextLine();
        System.out.println("Podaj gatunek");
        String genre = scanner.nextLine();
        System.out.println("Podaj opis");
        String description = scanner.nextLine();
        System.out.println("Podaj ocenę (1-10)");
        int rating = scanner.nextInt();
        scanner.nextLine();

        if(seasons < 0 || episodes < 0 || rating <= 0 || rating > 10) {
            System.out.println("Podane dane są nieprawidłowe, nie udało się utworzyć serialu");
            return null;
        } else {
            return new TvSeries(title, seasons, episodes, producer, genre, description, 10);
        }
    }

    public Actor createActor() {
        System.out.println("Tworzenie nowego aktora");
        System.out.println("Podaj imię");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj kraj pochodzenia");
        String country = scanner.nextLine();
        return new Actor(firstName, lastName, country);
    }
}
