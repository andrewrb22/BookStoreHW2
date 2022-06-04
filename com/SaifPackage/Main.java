package com.SaifPackage;


import java.util.Scanner;



class BookstoreBook {
    //private data members
    private String author;
    private String title;
    private String isbn;
    private double price;
    private boolean onSale;
    private double discount;

    // to keep track of number of books
    private static int numOfBooks = 0;

    // constructor with 6 parameters

    public BookstoreBook(String author, String title, String isbn, double price, boolean onSale, double discount) {
        // set all the data members
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.onSale = onSale;
        this.discount = discount;

    }

    // constructor with 4 parameters where on sale is false and discount is 0
    public BookstoreBook(String author, String title, String isbn, double price) {
   
        this(author, title, isbn, price, false, 0);
    }

    // constructor with 3 parameters where only author title and isbn  are passed
    public BookstoreBook(String author, String title, String isbn) {

        this(author, title, isbn, 0);
    }


    // getter function to get the author
    public String getAuthor() {
        return author;
    }

    // setter function to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter function to get the title
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    // getter function to get the isbn
    public String getIsbn() {
        return isbn;
    }

    // setter function to set the isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // getter function to get the price
    public double getPrice() {
        return price;
    }

    // setter function to set the price
    public void setPrice(double price) {
        this.price = price;
    }

    // getter function to get the onSale
    public boolean isOnSale() {
        return onSale;
    }

    // setter function to set the onSale
    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    // getter function to get the discount
    public double getDiscount() {
        return discount;
    }

    // setter function to set the discount
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // get price after discount
    public double getPriceAfterDiscount() {
        return price - (price * discount / 100);
    }

    // toString method to display the book information
    public String toString(){
        // we return in this pattern
        // [458792132-JAVA MADE EASY by ERICKA JONES, $14.99 listed for $12.74]
        return "[" + isbn + "-" + title + " by " + author + ", $" + price + " listed for $" + getPriceAfterDiscount() + "]";
    }

}

class LibraryBook {
    // private data members
    private String author;
    private String title;
    private String isbn;
    private String callNumber;
    private static int numOfBooks;

  
    private int floorNumber;

    // constructor with 3 parameters
    public LibraryBook(String author, String title, String isbn) {
        // set all the data members
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        // generate the floor number and set the floor number
        floorNumber = (int) (Math.random() * 99 + 1);

        this.callNumber = generateCallNumber();
        numOfBooks++;
    }

    // constructor with 2 parameters where the isbn is not passed
    public LibraryBook(String author, String title) {
        // call the constructor with 3 parameters
        // we need to set isbn to the string notavailable
        this(author, title, "notavailable");
    }

    // constructor with no parameters (default constructor)
    public LibraryBook() {
 
        this("notavailable", "notavailable", "notavailable");
    }




   // function to generate the call number
    private String generateCallNumber() {

        if (floorNumber < 10) {
            return "0" + floorNumber + "-" + author.substring(0, 3) + "-" + isbn.charAt(isbn.length() - 1);
        } else {
            return floorNumber + "-" + author.substring(0, 3) + "-" + isbn.charAt(isbn.length() - 1);
        }
    }





    // getters and setters

    // getter function to get the author
    public String getAuthor() {
        return author;
    }

    // setter function to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter function to get the title
    public String getTitle() {
        return title;
    }

    // setter function to set the title
    public void setTitle(String title) {
        this.title = title;
    }

    // getter function to get the isbn
    public String getIsbn() {
        return isbn;
    }

    // setter function to set the isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // getter function to get the callNumber
    public String getCallNumber() {
        return callNumber;
    }

    // setter function to set the callNumber
    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    // getter function to get the numOfBooks
    public static int getNumOfBooks() {
        return numOfBooks;
    }

    // setter function to set the numOfBooks
    public static void setNumOfBooks(int numOfBooks) {
        LibraryBook.numOfBooks = numOfBooks;
    }



    // toString method to display the book information
    public String toString(){
        // we return in this pattern
        // [458792132-JAVA MADE EASY by ERICKA JONES, CALL NUMBER: A1]
        return "[" + isbn + "-" + title + " by " + author + " - " + callNumber + "]";
    }
}

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        // we need to be able to store 100 BookstoreBook objects and 200 LibraryBook objects
        // we use arrays to store the objects
        BookstoreBook[] bookstoreBooks = new BookstoreBook[100];
        LibraryBook[] libraryBooks = new LibraryBook[200];

        // to keep count of the number of books in the bookstoreBooks array
        int bookstoreBooksCount = 0;
        // to keep count of the number of books in the libraryBooks array
        int libraryBooksCount = 0;

        System.out.println("Welcome to the Bookstore!");

        // we need to keep running the program until the user enters no
        String ans;
       
        do{
            // ask the user if they want to add a book
            System.out.println("Would you like to create a book object? (yes/no)");
            // get the answer
            ans = sc.nextLine();
            // if the answer is no we break out of the loop
            // if(ans.equals("yes") || ans.equals("YES") ){
            // continue;
            // }
            if(ans.equals("no") || ans.equals("NO")  ){
                System.out.println("Sure! \n Here are all your books... \n");

                for(int i = 0; i < bookstoreBooksCount; i++){
                    System.out.println("Bookstore  Books \n" + bookstoreBooks[i].toString() +"\n-------------\n");
                }
        
                // display the library book information
                // traverse the libraryBooks array and display the information of each book
                for(int i = 0; i<libraryBooksCount; i++) {
                    System.out.println("Library Books \n" + libraryBooks[i].toString() +"\n-------------\n" );
                }

                System.out.println(" \n-------------\n GoodBye!!");

                break;
            }
            // if( !ans.equals("YES")  || !ans.equals("yes")|| !ans.equals("no") || !ans.equals("NO")){
            //     System.out.println("\nNot a valid entry, GoodBye");
            //     break;
            // }

            // if yes we ask the question related to the books
            System.out.println("Please enter the author, title and the isbn of the book separated by / :");
            // get the answer
            String bookInfo = sc.nextLine();

            // split the answer into 3 parts
            String[] bookInfoArray = bookInfo.split("/");

            // the first part is the author
            String author = bookInfoArray[0];
            // the second part is the title
            String title = bookInfoArray[1];
            // the third part is the isbn
            String isbn = bookInfoArray[2];

            System.out.println("Got it!");

            // now ask the book type
            System.out.println("Now, tell me if the book is a bookstore book or a library book (BB/LB) (enter BB for bookstore book and LB for library book)");
            String bookType = sc.nextLine();

           // keep asking for the book type until the answer is either BB  or bb or LB or lb
            while(!bookType.equals("BB") && !bookType.equals("LB") && !bookType.equals("bb") && !bookType.equals("lb")){
                System.out.println("Oops! That's not a valid entry. Please try again: ");
                bookType = sc.nextLine();
            }

            System.out.println("Got it!");

            // if the book type is BB we ask for price, sale and discount information
            if(bookType.equals("BB") || bookType.equals("bb")){
                System.out.println("Please enter the list price of " + title + " by " + author + ":") ;
                double listPrice = sc.nextDouble();
                sc.nextLine();
                // ask for the sale info
                System.out.println("Is it on sale? (y/n)");
                String sale = sc.nextLine();
                // if the answer is yes we ask for the sale price
                boolean onSale = false;
                double discount = 0;
                if(sale.equals("y") || sale.equals("Y")){
                    System.out.println("Deduction percentage: ") ;
                    discount = sc.nextDouble();
                    sc.nextLine();
                    onSale = true;
                }

                System.out.println("Got it!");


                // create a new bookstore book object
                bookstoreBooks[bookstoreBooksCount] = new BookstoreBook(author, title, isbn, listPrice, onSale, discount);



                // display the book information
                System.out.println("Here is your bookstore book information: \n");
                System.out.println(bookstoreBooks[bookstoreBooksCount].toString() + "\n");

                // increment the count of the number of books in the bookstoreBooks array
                bookstoreBooksCount++;

            } else {
                // create a new library book object
                libraryBooks[libraryBooksCount] = new LibraryBook(author, title, isbn);

                // display the library book information
                System.out.println("Here is your library book information: \n");
                System.out.println(libraryBooks[libraryBooksCount].toString() + "\n");

                // increment the count of the number of books in the libraryBooks array
                // libraryBooksCount++;
            }


        }while(ans.equals("yes")|| ans.equals("YES") || ans.equals("yEs"));


        // display all the book information of the books entered by the user

        // display the bookstore book information
        // traverse the bookstoreBooks array and display the information of each book
        for(int i = 0; i < bookstoreBooksCount; i++){
            System.out.println("Bookstore  Books \n" + bookstoreBooks[i].toString() +"\n");
        }

        // display the library book information
        // traverse the libraryBooks array and display the information of each book
        for(int i = 0; i<libraryBooksCount; i++) {
            System.out.println("Library Books \n" +libraryBooks[i].toString() +"\n");
        }

        sc.close();
    }





}