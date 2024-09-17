package com.dp;
import java.util.*;

public class Movie {
	private String title;
    private double rating;

    // Constructor
    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{Title='" + title + "', Rating=" + rating + "}";
    }
}

// Comparator class to compare movies by their rating
class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m1.getRating(), m2.getRating());  // Sorting in ascending order by rating
    }
}

