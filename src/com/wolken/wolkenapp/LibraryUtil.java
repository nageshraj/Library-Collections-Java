package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dto.BookDTO;

import com.wolken.wolkenapp.dao.*;



public class LibraryUtil {
	public static void main(String[] args) {
		
		BookDTO book = new BookDTO(01,"Raj","Chronicles",100);
		LibraryDAO impl = new LibraryDAOImpl();
		
		impl.save(book);
		impl.getAllBooks();
		
		
	}

}
