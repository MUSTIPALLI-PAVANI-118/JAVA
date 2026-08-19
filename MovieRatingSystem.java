import java.util.ArrayList;

class Movie {
    String name;
    String genre;
    double rating;

    Movie(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    void display() {
        System.out.printf(
                "%-20s %-15s %.1f%n",
                name, genre, rating
        );
    }
}

public class MovieRatingSystem {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", "Sci-Fi", 8.8));
        movies.add(new Movie("Interstellar", "Sci-Fi", 8.7));
        movies.add(new Movie("The Dark Knight", "Action", 9.0));
        movies.add(new Movie("Forrest Gump", "Drama", 8.8));

        System.out.println("===== MOVIES =====");

        for (Movie movie : movies) {
            movie.display();
        }

        Movie highestRated = movies.get(0);
        double totalRating = 0;

        for (Movie movie : movies) {

            totalRating += movie.rating;

            if (movie.rating > highestRated.rating) {
                highestRated = movie;
            }
        }

        double average =
                totalRating / movies.size();

        System.out.println("\nHighest Rated Movie:");
        highestRated.display();

        System.out.printf(
                "\nAverage Rating: %.2f%n",
                average
        );
    }
}
