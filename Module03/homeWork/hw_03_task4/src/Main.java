// Aston
// Java
// Online
// Module: 3
// Homework
// Task: 4
// Реализовать паттерн "Заместитель"

import Service.ProxyService;
import Users.User;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Ivan Petrov"));
        users.add(new User("Petr Ivanov"));
        users.add(new User("Vasily Sidorov"));

        ProxyService serviceImage = new ProxyService(users);

        for (User user : users)
            System.out.println(serviceImage.work(user).getSecond());

        User alyosha = new User("Alyosha Prostujyonny");
        System.out.println(serviceImage.work(alyosha).getSecond());
        System.out.println(serviceImage.add(alyosha).getSecond());
        System.out.println(serviceImage.work(alyosha).getSecond());
    }
}