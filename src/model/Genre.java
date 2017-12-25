package model;

public enum Genre {
    SCI_FI("Sci Fi"),
    COMEDY("Komedia"),
    ACTION("Akcja"),
    THRILLER("Thriller");

    private final String desription;

    Genre(String desription) {
        this.desription = desription;
    }

    public String getDesription() {
        return desription;
    }

    public static Genre convert(String genre) {
        if(genre == null)
            return null;
        Genre found = null;
        Genre[] genres = Genre.values();
        for (int i = 0; i < genres.length && found == null; i++) {
            if(genre.equals(genres[i].getDesription())) {
                found = genres[i];
            }
        }
        return found;
    }

    @Override
    public String toString() {
        return desription;
    }
}
