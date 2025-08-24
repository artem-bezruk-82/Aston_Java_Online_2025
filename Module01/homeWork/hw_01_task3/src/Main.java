import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Aston Java online
// Module #1
// Homework
// Task #3
// Создать класс Student, обязательное поле класса Student - List<Book> (минимум по 5 книг у каждого)
// Заполнить коллекцию студентами
// При помощи одного (не допускается объявления никаких промежуточных переменных, совсем никаких) стрима:
//  Вывести в консоль каждого студента (переопределите toString)
//  Получить для каждого студента список книг
//  Получить книги
//  Отсортировать книги по количеству страниц (Не забывайте про условия для сравнения объектов)
//  Оставить только уникальные книги
//  Отфильтровать книги, оставив только те, которые были выпущены после 2000 года
//  Ограничить стрим на 3 элементах
//  Получить из книг годы выпуска
//  При помощи методов короткого замыкания (почитайте самостоятельно что это такое) вернуть Optional от книги
//  При помощи методов получения значения из Optional вывести в консоль год выпуска найденной книги, либо запись о том, что такая книга отсутствует
public class Main
{
    public static void main(String[] args)
    {
        List<Student> students =
                Arrays.asList(
                    new Student("Ivan","Petrov",
                        Arrays.asList(
                            new Book("Book 01", 123, 1985),
                            new Book("Book 02", 321, 1995),
                            new Book("Book 03", 935, 2000),
                            new Book("Book 04", 493, 2005),
                            new Book("Book 05", 644, 2015),
                            new Book("Book 06", 705, 2025)
                        )
                    ),
                    new Student("Petr","Ivanov",
                        Arrays.asList(
                            new Book("Book 07", 234, 1985),
                            new Book("Book 08", 567, 1995),
                            new Book("Book 09", 789, 2005),
                            new Book("Book 10", 321, 2000),
                            new Book("Book 11", 432, 2015),
                            new Book("Book 12", 543, 2025)
                        )
                    ),
                    new Student("Vasily","Sidorov",
                        Arrays.asList(
                            new Book("Book 13", 890, 1985),
                            new Book("Book 14", 987, 1995),
                            new Book("Book 15", 876, 2000),
                            new Book("Book 16", 768, 2005),
                            new Book("Book 17", 135, 2015),
                            new Book("Book 18", 378, 2025)
                        )
                    )
                );

        for (Student student : students)
        {
            student.print();
        }

    }
}