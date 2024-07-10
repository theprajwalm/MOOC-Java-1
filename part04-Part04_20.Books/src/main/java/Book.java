public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    //constructor
    public Book(String title, int page, int publishedYear){
        this.title = title;
        this.pages = page;
        this.publicationYear = publishedYear;
    }
    public String name(){
        return this.title;
    }
    public String toString(){
        return this.title+", "+this.pages+" pages, "+this.publicationYear;
    }
}