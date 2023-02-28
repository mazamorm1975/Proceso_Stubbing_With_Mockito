package com.pruebas.stubbing;

import java.util.List;

public class BookService {

   private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

        public int CalculateTotalCost(List<String> bookIds){
        int total = 0;
        for(String bookId : bookIds){
            Book book = bookRepository.findBookByBookId(bookId);
            total = total + book.getPrice();
        }
        return total;
    }
}
