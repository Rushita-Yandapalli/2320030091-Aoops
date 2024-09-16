package com.dp;

public class LibManagementSys {

	public static void main(String[] args) {
		
		 Book book1 = new LibraryBook("The Silent Patient", "J.D. Salinger");
	        Book book2 = new LibraryBook("That Night", "George Orwell");

	        // Creating members
	        Member member1 = new LibraryMember("Alice");
	        Member member2 = new LibraryMember("Bob");

	        
	        BorrowingProcess borrowingProcess = new LibBorrowingProcess();

	        
	        borrowingProcess.borrowBook(member1, book1);
	        borrowingProcess.borrowBook(member2, book2); 
	        borrowingProcess.returnBook(member1, book2);
	        borrowingProcess.borrowBook(member2, book1);

	}

}
