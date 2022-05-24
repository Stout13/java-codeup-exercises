package movies;

import java.util.Objects;

public class Movie {
    private String name;
    private String category;


    public static void main(String[] args) {
        Movie[] shows = MoviesArray.findAll();
    }

    public Movie(String title, String cat) {
        name = title;
        category = cat;
    }


    public String getCategory(Movie[] shows, String title) {
        for (Movie show : shows) {
            if (Objects.equals(title, show.name)) {
                return show.category;
            }
        }
        return null;
    }
}

