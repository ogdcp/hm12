public class Book {
    private String titleBook;
    private int publicationYear;
    Author Author;
    public Book(String titleBook, int publicationYear, Author Author){
        this.titleBook = titleBook;
        this.publicationYear= publicationYear;
        this.Author= Author;
    }
    public String getTitleBook(){
        return this.titleBook;

    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear= publicationYear;
    }
}
