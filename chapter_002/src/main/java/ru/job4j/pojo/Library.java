package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book[] books = new Book[4];
        Book book;

        book = new Book();
        book.setName("Clean code");
        book.setPagesCount(564);
        books[0] = book;

        book = new Book();
        book.setName("About Java");
        book.setPagesCount(234);
        books[1] = book;

        book = new Book();
        book.setName("Design Patterns");
        book.setPagesCount(344);
        books[2] = book;

        book = new Book();
        book.setName("Catch-22");
        book.setPagesCount(345);
        books[3] = book;

        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getPagesCount());
        }

        book = books[3];
        books[3] = books[0];
        books[0] = book;

        System.out.println("Change 0 and 3.");
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getPagesCount());
        }

        System.out.println("Shown only Clean code");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName() + " - " + books[index].getPagesCount());
            }
        }

    }
}
