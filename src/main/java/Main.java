package main.java;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        Message.start();

        Map<LocalDate, String> books = new TreeMap<>();
        books.put(LocalDate.of(2019, 06, 02), "Head First Java");
        books.put(LocalDate.of(2019, 05, 22), "ProGit");
        books.put(LocalDate.of(2018, 02, 10), "Deadly Embrace - Jackie Colins");
        books.put(LocalDate.of(2017, 05, 23), "AfterEffects - all and more");

        System.out.println("You already took the next books:\n" + books.entrySet().toString().replace(",", "\n").replace("[", " ").replace("]", ""));

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("\n Also, you can find the book for a concretical date, please - ");
            System.out.println("-Enter Year:");
            int year = sc.nextInt();
            System.out.println("-Enter Month:");
            int month = sc.nextInt();
            System.out.println("-Enter Day:");
            int day = sc.nextInt();
            System.out.print("Your book is: ");
            System.out.println(books.getOrDefault(LocalDate.of(year, month, day), "In this date, you didn't take any books yet"));

        } catch (InputMismatchException e) {
            System.out.println("Incorrect date!");
        } catch (DateTimeException e) {
            System.out.println("Incorrect date format! You should enter: Year-xxxx/ Month-xx/ Date-xx");
        }
        sc.close();
        Message.end();
    }

}



