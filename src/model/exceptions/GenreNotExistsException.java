package model.exceptions;

public class GenreNotExistsException extends RuntimeException {

    public GenreNotExistsException(String incorrectGenre) {
        super("Taki gatunek nie istnieje (" + incorrectGenre + ")");
    }
}
