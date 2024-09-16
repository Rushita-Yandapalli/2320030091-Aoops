package com.dp;

public class LibBorrowingProcess implements BorrowingProcess{

	@Override
	public void borrowBook(Member member, Book book) {
		// TODO Auto-generated method stub
		member.borrowBook(book);
		
	}

	@Override
	public void returnBook(Member member, Book book) {
		// TODO Auto-generated method stub
		member.returnBook(book);
		
	}

}
