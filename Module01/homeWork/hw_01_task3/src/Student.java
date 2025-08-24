import java.util.ArrayList;
import java.util.List;

public class Student
{
    private static int counter = 0;
    private int id;
    private String firstName;
    private String lastName;

    private List<Book> books;

    public Student(String firstName, String lastName, List<Book> books)
    {
        id = ++counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public Student(String firstName, String lastName)
    {
        this(firstName, lastName, new ArrayList<>());
    }

    public int getId() {return id;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public List<Book> getBooks() {return books;}
    public boolean add(Book book) {return books.add(book);}
    public boolean remove(Book book) {return books.remove(book);}

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Id: %d, Name: %s %s, Books:\n", id, firstName, lastName));
        for (Book book: books)
            stringBuilder.append(String.format(" %s\n", book));

        return stringBuilder.toString();
    }

    public void print()
    {
        System.out.println(String.format("Id: %d, Name: %s %s, Books:", id, firstName, lastName));
        books.stream()
                .flatMap(books -> getBooks().stream())
                .sorted((p1, p2) -> Integer.compare(p1.getPages(), p2.getPages()))
                .filter(book -> book.getYear() > 2000)
                .peek(System.out::println)
                .distinct()
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска книги:" + year),
                        () -> System.out.println("Книга не найдена")
                )
        ;
    }
}
