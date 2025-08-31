import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable
{
    private String title;
    private int pages;
    private final int PAGES_MIN;
    private int year;

    {
        PAGES_MIN = 0;
    }

    public Book(String title, int pages, int year)
    {
        setTitle(title);
        setPages(pages);
        this.year = year;
    }

    public String getTitle() {return title;}

    public void setTitle(String title)
    {
        if (title.isEmpty() || title.isBlank())
            throw new EmptyValueException("Title is empty");
        this.title = title;
    }

    public int getPages() {return pages;}

    public void setPages(int pages)
    {
        if (pages < PAGES_MIN)
            throw new ValueLessThanAllowedException(
                    String.format("Pages value assignment failed. %d is less than %d", pages, PAGES_MIN));
        this.pages = pages;
    }

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    @Override
    public String toString() {return String.format("Title: %s, Pages: %d, Year: %d;", title, pages, year);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && year == book.year && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {return Objects.hash(title, pages, year);}

}
