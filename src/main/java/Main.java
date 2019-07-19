package main.java;


import java.time.LocalDate;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Message.start();
        Library library = new Library();
        Map<LocalDate, String> books = library.putBook();
        library.findBook(books);
        Message.end();
    }

}



