package controller.exceptions;

public class OptionNotExistsException extends RuntimeException {
    public OptionNotExistsException(int incorrectOption) {
        super("Podana opcja nie istnieje (" + incorrectOption + ")");
    }
}
