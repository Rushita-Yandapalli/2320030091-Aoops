package com.dp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie implements Comparable<Movie>{
	private double rating;
    private String name;
    private int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

	@Override
	public int compareTo(Movie other) {
		// TODO Auto-generated method stub
		return this.year - other.year;
	}
	public String toString() {
        return "Movie: " + name + ", Rating: " + rating + ", Year: " + year;
    }
	

}
