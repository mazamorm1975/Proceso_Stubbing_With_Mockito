package com.pruebas.test;

import com.pruebas.stubbing.Book;
import com.pruebas.stubbing.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class BookService {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private com.pruebas.stubbing.BookService bookService;


    @Test
    public void CalcularTest(){

        List<String> bookIds = new ArrayList<>();
        bookIds.add("1231");
        bookIds.add("1235");

        Book book1 = new Book("1231","El monje que vendio su ferrari", LocalDate.now(), 500);
        Book book2 = new Book("1235","Padre pobre, padre rico", LocalDate.now(), 400);

        when(bookRepository.findBookByBookId("1231")).thenReturn(book1);
        when(bookRepository.findBookByBookId("1235")).thenReturn(book2);

        int gastoTotal = bookService.CalculateTotalCost(bookIds);

        assertEquals(900, gastoTotal);

    }


}
