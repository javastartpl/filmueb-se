public class Filmueb {
    public static void main(String[] args) {
        final String appName = "Filmueb v0.1";
        Movie movie = new Movie("Gwiezdne wojny", 2017, "Rian Johnson", "Sci-Fi", "Film o kosmitach", 7);
        TvSeries tvSeries = new TvSeries("Kompania Braci", 1, 12, "HBO", "Wojenny", "Serial wojenny o 2 wojnie światowej", 10);
        Actor actor = new Actor("Tom", "Hanks", "USA");

        System.out.println(appName);
        movie.showInfo();
        tvSeries.showInfo();
        actor.showInfo();
    }
}
