package Book;

public class Book implements Comparable<Book> {
    //Kitapları sıralayabilmek için Comparable sınıfını implemente ediyoruz.

    //Book sınıfının değişkenlerini tanımlıyoruz.
    private String name;
    private int pageNumber;
    private String author;
    private String dateTime;
    public Book(){

    }

    public Book(String name, int pageNumber, String author, String dateTime) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    @Override
    public int compareTo(Book o1) {
        return this.getName().compareTo(o1.getName());
    }
}
