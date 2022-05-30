        public class Tester {
        /*public static void doNothing () {
        System.out.println("Chilling!");
        }*/
        public static void main(String[] args) {
        /*Tester t = new Tester();
        t.doNothing();
        */
        /*doNothing();*/
        Book myBook=null;
        myBook.setPublisher("qwe");
        //double x = myBook.getPrice();
        Book.setPublisher("abc");
        /*Book book1, book2;
        book1 = new Book();
        book1.isbn = "123456";
        book1.price = 9.99;
        book2 = book1;
        book1 = null;
        System.out.println(book1.isbn + "  " + book2.price );
         */
        /*Book b1 = new Book();
        Book [] list;
        list = new Book[5000];
        list[2] = new Book();
        list[2].setIsbn("123456");
        */
        //b1.setPrice(82);
        //b1.setIsbn("123456");
        //System.out.println(b1.getIsbn() + "  "+ b1.getPrice());
        Book b1 = new Book("123456", 12.99);
        b1.setPublisher("rty");
        Book b2 = new Book("654321", 99.12);
        b2.setPublisher("xyz");
        System.out.println( b1.toString() + "    " + 
        b2.toString());
        }}
