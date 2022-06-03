public class Tester {
    public static void main(String[] args) {
        Book myBook = null;
        myBook.setPublisher("qwe");
        Book.setPublisher("abc");
        Book b1 = new Book("123456", 12.99);
        b1.setPublisher("rty");
        Book b2 = new Book("654321", 99.12);
        b2.setPublisher("xyz");
        System.out.println(b1.toString() + "    " + b2.toString());
    }

}

