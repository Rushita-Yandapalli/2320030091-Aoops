package com.dp;

public class LibraryMember implements Member{
	private String name;

    public LibraryMember(String name) {
        this.name = name;
    }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void borrowBook(Book book) {
		// TODO Auto-generated method stub
		if (book.isAvailable()) {
            book.borrowBook();
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available for borrowing.");
        }
		
	}

	@Override
	public void returnBook(Book book) {
		// TODO Auto-generated method stub
		book.returnBook();
		
	}

}
