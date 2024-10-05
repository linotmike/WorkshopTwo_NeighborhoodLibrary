package com.ps;

import java.util.Scanner;

public class Main {
    static Books[] books = new Books[20];
    static Scanner scanner = new Scanner(System.in);

    //        static int count;
    public static void main(String[] args) {
        int mainMenuCommand;


        books[0] = new Books(1, "1476746583", "All the life we expected", false, null);
        books[1] = new Books(2, "978-0-06-231609-7", "To Kill a Mockingbird", false, null);
        books[2] = new Books(3, "978-1-4028-9462-6", "1984", false, null);
        books[3] = new Books(4, "978-0-7432-7356-5", "The Da Vinci Code", true, "John Doe");
        books[4] = new Books(5, "978-0-525-47563-6", "The Catcher in the Rye", false, null);
        books[5] = new Books(6, "978-1-5011-7184-5", "The Silent Patient", true, "Jane Doe");
        books[6] = new Books(7, "978-1-5387-3630-0", "Becoming", false, null);
        books[7] = new Books(8, "978-0-316-76948-4", "Where the Crawdads Sing", true, "Emily Smith");
        books[8] = new Books(9, "978-0-7432-7356-4", "Angels & Demons", false, null);
        books[9] = new Books(10, "978-0-525-47563-5", "Pride and Prejudice", false, null);
        books[10] = new Books(11, "978-0-553-21311-7", "The Great Gatsby", true, "Michael Johnson");
        books[11] = new Books(12, "978-0-525-47563-7", "The Hobbit", false, null);
        books[12] = new Books(13, "978-0-7432-7356-3", "The Girl with the Dragon Tattoo", false, null);
        books[13] = new Books(14, "978-0-553-21311-9", "The Book Thief", true, "Sarah Brown");
        books[14] = new Books(15, "978-0-06-231609-8", "The Road", false, null);
        books[15] = new Books(16, "978-0-316-76948-5", "Atonement", true, "David White");
        books[16] = new Books(17, "978-1-5387-3630-2", "The Goldfinch", false, null);
        books[17] = new Books(18, "978-0-06-231609-9", "The Kite Runner", true, "Alex Green");
        books[18] = new Books(19, "978-1-4028-9462-7", "The Help", false, null);
        books[19] = new Books(20, "978-0-7432-7356-2", "The Shining", false, null);


        do {
            System.out.println("Welcome to the Neighborhood Library");
            System.out.println("What would you like to do?");
            System.out.println("1) Show available books");
            System.out.println("2) Show Checked out books");
            System.out.println("3) Exit");
            mainMenuCommand = scanner.nextInt();

            switch (mainMenuCommand) {
                case 1:
                    showAvailableBooks();
                    break;
                case 2:
                    showCheckedOutBooks();
                    break;
                case 3:
                    System.out.println("You choose to Exit");
                default:
                    System.out.println("error");
            }


        } while (mainMenuCommand != 3);


    }

    public static void showAvailableBooks() {
        System.out.println("/n Available books: ");
        for (Books book : books) {
            if (!book.isCheckedout()) {
                System.out.print("Id: " + book.getId() + "\n Isbn: " + book.getIsbn() + " Title: " + book.getTitle() + "\n");
            }

        }
        System.out.print("\n Do you want to checkout a book 1) Yes 2) Exit \n");
        int response = scanner.nextInt();
        if (response == 1) {
            checkout();
        }

    }

    public static void checkout() {
        System.out.println("Enter the Id of the book you want to checkout");
        int response = scanner.nextInt();
        for (Books book : books) {
            if (response == book.getId() && !book.isCheckedout()) {
                System.out.println("Enter your name");
                scanner.nextLine();
                String name = scanner.nextLine();
                book.setCheckedOutTo(name);
                book.SetIsCheckedout(true);
                System.out.println(name + " You have successfully checked out: " + book.getTitle());
                System.out.println("What would you like to do next? 1)check out another book 2) quit");
                int next = scanner.nextInt();
                if (next == 1) {
                    checkout();
                }
                return;
            }
        }
        System.out.println("This book has already been checked out or book is not available to be checked out");


    }

    public static void checkIn() {
    }

    public static void showCheckedOutBooks() {
        for (Books book : books) {
            if (book.isCheckedout()) {
                System.out.println("Checked out books :" + "\n ID: " + book.getId() + " Isbn " + book.getIsbn() + " Title " + book.getTitle());
            }

        }
        System.out.println("What would you like to do? C) check in a book X) Exit");
        scanner.nextLine();
        String response = scanner.nextLine().toUpperCase();
        if (response.startsWith("C")) {
//            checkIn();

        }


    }

}
