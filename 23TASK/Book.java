public class Book {
    // Properties
    private String title;
    private String author;
    private int pages;
    private double price;

    // No-argument constructor
    public Book() {
     
    }

    // All-argument constructor
    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

  

    // Instance methods using 4 different ways

    // with no parameters and no return value
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);
    }

    // with parameters and no return value
    public void updateBookInfo(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    // with no parameters and a return value
    public String getBookSummary() {
        return "it is a true value";
    }

    // with parameters and a return value
    public boolean isExpensive(int pages) {
        if(pages==464){
			return true;
    }else{
		return false;
	}
	}

  
}