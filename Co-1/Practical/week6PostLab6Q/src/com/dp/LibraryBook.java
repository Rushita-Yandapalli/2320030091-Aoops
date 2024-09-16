package com.dp;

public class LibraryBook implements Book{
	private String title;
    private String author;
    private boolean isAvailable;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Book is available when created
    }

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return isAvailable;
	}

	@Override
	public void borrowBook() {
		// TODO Auto-generated method stub
		 if (isAvailable) {
	            isAvailable = false;
	            System.out.println(title + " has been borrowed.");
	        } else {
	            System.out.println(title + " is not available.");
	        }
		
	}

	@Override
	public void returnBook() {
		// TODO Auto-generated method stub
		isAvailable = true;
        System.out.println(title + " has been returned.");
    }
		
	}


