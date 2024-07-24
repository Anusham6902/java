public class Book_Runner{
  public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 416, 45.00);

        // Using instance methods
        book.displayBookInfo();

        book.updateBookInfo("Clean Code", "Robert C. Martin", 464, 37.00);
        book.displayBookInfo();

        String summary = book.getBookSummary();
        System.out.println(summary);
        boolean expensive = book.isExpensive(464);
        System.out.println("Book is expensive" + expensive);
    }
}
