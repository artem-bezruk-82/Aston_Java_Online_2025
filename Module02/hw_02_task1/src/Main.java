import java.util.ArrayList;

// Aston Java Online
// Module: 2
// Homework
// Task
// Написать программу, которая будет записывать данные в файл и вычитывать данные из него.
// Создать собственное исключение и оборачивать в него ошибки при чтении/записи из файла.

public class Main
{
    public static void main(String[] args)
    {
        String filePathBinary = "test.dat";
        IOFileHandlerBinary<Book> fileHandlerBinary = new IOFileHandlerBinary<>(filePathBinary);

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> newBooksFromBinaryFile = new ArrayList<>();

        try
        {
            books.add(new Book("Book 1", 5, 2025));
            books.add(new Book("Book 2", 50, 2005));
        }
        catch (ValueLessThanAllowedException | EmptyValueException exception)
        {
            System.out.println(exception.getMessage());
        }

        try
        {
            fileHandlerBinary.write(books);
            newBooksFromBinaryFile = fileHandlerBinary.read();
        }
        catch (MyException exception)
        {
            System.out.printf(String.format("%s %s", exception.getMessage(), exception.getCause().getMessage()));
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }

        System.out.println("Books uploaded from binary fail:");
        for(Book book : books)
            System.out.println(book);
    }
}


