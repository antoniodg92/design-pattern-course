package it.tasgroup.creational.prototype;

public class PrototypeMainRegistry {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie"); // per farmi un istanza non devo fare la new
        movie.setTitle("Creational Pattern in Java");
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie"); //avro un istanza diversa rispetto a movie
        anotherMovie.setTitle("Ganng of Four");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle()); //questa viene sovrascritta
        System.out.println(anotherMovie.getUrl());

    }
}
