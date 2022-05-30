public class Book {
    private String isbn;
    private double price;
    private static String publisher;
    public  String getPublisher() {
    return publisher;
    }
    public static void setPublisher(String publisher) {
    Book.publisher = publisher;
    }
    public String getIsbn() {
    return isbn;
    }
    public void setIsbn(String isbn) {
    this.isbn = isbn;
    }
    public double getPrice() {
    return price;
    }
    public void setPrice(double price) {
    this.price = price;
    }
    public String toString () {
    return "[ " + publisher + "|ISBN:" + isbn + "/PRICE: $" + 
    price +"]";
    }
    public Book() {
    price = -1;
    isbn = "000000";
    }
    public Book(String isbn) {
    this.isbn = isbn;
    }
    public Book(double price) {
    this.price = price;
    }
    public Book(String isbn, double price) {
    this.isbn = isbn;
    this.price = price;
    }
    }