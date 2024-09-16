package com.dp;

public interface Book {
	String getTitle();
    String getAuthor();
    boolean isAvailable();
    void borrowBook();
    void returnBook();

}
