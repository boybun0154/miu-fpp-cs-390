package HW11.Prob3;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> books = new HashMap<>();

    public Library() {
    }

    public void addBook(String ISBN, String title, String author) {
        Book book = new Book(ISBN, title, author);
        books.put(ISBN, book);
    }

    public void borrowBook(String ISBN) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            if (!book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("Book Borrowed");
            } else System.out.println("Book already Borrowed");
        } else System.out.println("Invalid Book");
    }
    public void returnBook(String ISBN) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            if (book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println("Book Returned");
            } else System.out.println("Book is Borrowed");
        } else System.out.println("Invalid Book");
    }

    public boolean isBookBorrowed(String ISBN) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            return book.isBorrowed();
        } else return false;
    }

    Book getBookDetails(String ISBN) {
        return null;
    }

    public void listAllBooks() {

    }

    public void listBorrowedBooks() {

    }
}
