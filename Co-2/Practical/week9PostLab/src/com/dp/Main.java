package com.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Matrix", 8.7));
        movies.add(new Movie("Inception", 8.8));
        movies.add(new Movie("Interstellar", 8.6));
        movies.add(new Movie("The Dark Knight", 9.0));

        // Display original list of movies
        System.out.println("Original list of movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Instantiate the RatingComparator
        RatingComparator ratingComparator = new RatingComparator();

        // Sort the list of movies by rating using the comparator
        Collections.sort(movies, ratingComparator);

        // Display sorted list of movies
        System.out.println("\nSorted list of movies by rating (ascending):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

	}


