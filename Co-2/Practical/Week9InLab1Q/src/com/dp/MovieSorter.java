package com.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSorter {
	public static void main(String[] args) {
        // Creating a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Fight Club", 8.8, 1999));
        movies.add(new Movie("Pulp Fiction", 8.9, 1994));

        // Sorting the movies by year of release
        Collections.sort(movies);

        // Printing the sorted list
        System.out.println("Movies sorted by year of release:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}


