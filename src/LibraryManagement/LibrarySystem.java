package LibraryManagement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LibrarySystem {
    public static void main(String[] args) {
        HashMap<String,String> books = new HashMap<>();  // key:book name, value:author name (2 string ifade)
        Set<String> borrow = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice; // kullanıcı gerçekleştirmek istediği işlem için menüden seçim yapabilsin, (choice değişkeni ile)

        do {
            System.out.println("\n Welcome to the Library Management System! ");
            System.out.println("Please select an option: " );
            System.out.println("Add a new book");
            System.out.println("Display all books");
            System.out.println("Search for a book by title");
            System.out.println("Check out a book");
            System.out.println("Return a book");
            System.out.println("Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Yapılan seçimi scanner ile al
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Book name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Author name: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    books.put(bookName,authorName); // Kitaplar kütüphanesine kitap ismi ve yazar ismini ekle
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    if (books.isEmpty()) { //Henüz hiçbir kitap eklenmediyse "burada hiç kitap yok "yazsın.
                        System.out.println("There is no book ");
                    }
                    else {
                        System.out.println("\n All books");
                        for(String book: books.keySet()) { //Tüm ekli kitapları görsün
                            System.out.println("Book: " +book); //kitapları getirsin
                            System.out.println("Author: " +books.get(book)); //Yazarları getirsin.
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter book title to search: " );
                    String bookSearch = scanner.nextLine();
                    if (books.containsKey(bookSearch)){ // Aranan kitap var mı yok mu onu incelesin
                        System.out.println("Found book: " +bookSearch);
                        System.out.println("Author: " +books.get(bookSearch));
                    } else {
                        System.out.println("Book is not founded. ");
                    }
                    break;

                case 4:
                    System.out.print("Enter the ISBN of the book you want to check out: ");
                    String borrowIsbn = scanner.nextLine();
                    if (books.containsKey(borrowIsbn)) {
                        System.out.println("❌ Book not found or already checked out.");
                    } else if (borrow.contains(borrowIsbn)) {
                        System.out.println("⚠️ Book is not here-borrow.");
                    } else {
                        borrow.add(borrowIsbn);
                        System.out.println("✅ Kitap checked out successfully.");
                    }
                    break;


                case 5:
                    System.out.print("Returned Book: " );
                    String returnedBook = scanner.nextLine();
                    if (books.containsKey(returnedBook)) {
                        books.remove(returnedBook);
                        System.out.println("Book is returned");
                    }else{
                        System.out.println("Book is not founded.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the library Management System! ");
                    break;
                default:
                    System.out.println("Not acceptable please check again");

            }
        } while (choice !=6 );
        scanner.close();
    }
}
