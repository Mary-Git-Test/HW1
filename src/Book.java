
interface Displayable {
    void display();
}

//
public class Book implements Displayable {
    private String title;
    private String author;
    private int year;


    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 1949);
        book.display();
    }
}

