import java.util.Objects;

public class Book implements Comparable<Book>
{
    private String name;
    private int pages;
    private int year;

    public Book(String name, int pages, int year)
    {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getPages() {return pages;}

    public void setPages(int pages)
    {
        if (pages < 0)
            throw new IndexOutOfBoundsException();
        this.pages = pages;
    }

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    @Override
    public String toString() {return String.format("Name: %s, Pages: %d, Year: %d;", name, pages, year);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && year == book.year && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {return Objects.hash(name, pages, year);}


    @Override
    public int compareTo(Book o) {return this.pages - o.pages;}
}
