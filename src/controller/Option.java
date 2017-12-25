package controller;

import controller.exceptions.OptionNotExistsException;

public enum Option {
    ADD_MOVIE(0, "Dodaj film"),
    ADD_TV(1, "Dodaj Serial"),
    ADD_ACTOR(2, "Dodaj aktora"),
    PRINT_ALL(3, "Wyświetl wszystkie filmy, seriale i aktorów"),
    EXIT(4, "Koniec programu");

    private final int number;
    private final String description;

    Option(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public static Option convert(int optionNumber) {
        if(optionNumber < 0 || optionNumber >= Option.values().length)
            throw new OptionNotExistsException(optionNumber);
        else
            return Option.values()[optionNumber];
    }

    @Override
    public String toString() {
        return number + " - " + description;
    }
}
