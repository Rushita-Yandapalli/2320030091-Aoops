package com.dp;

public interface BorrowingProcess {
	void borrowBook(Member member, Book book);
    void returnBook(Member member, Book book);
}
