package org.example.collections;

import org.example.examples.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<Book>();

        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("Enter book id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Book name: ");
            String name = sc.nextLine();

            library.add(new Book(id,name));

        } while (false);

        System.out.println(library);
    }
}
