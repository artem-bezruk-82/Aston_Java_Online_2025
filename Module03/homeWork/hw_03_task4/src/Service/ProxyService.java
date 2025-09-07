package Service;

import Users.User;
import Util.Tuple;

import java.util.ArrayList;

public class ProxyService extends Service
{
    Service service;
    ArrayList<User> users;

    public ProxyService()
    {
        this(new ArrayList<>());
    }

    public ProxyService(ArrayList<User> users)
    {
        service = new RealService();
        this.users = users;
    }

    public Tuple<Boolean, String> add(User user)
    {
        if (users.contains(user))
            return new Tuple<>(false, String.format( "User %s has already been registered", user.getName()));
        else
        {
            users.add(user);
        }
        return new Tuple<>(true, String.format("User %s has been registered successfully", user.getName()));
    }

    @Override
    public Tuple<Boolean, String> work(User user)
    {
        if (users.contains(user))
            return service.work(user);
        else
            return new Tuple<>(false, String.format("User %s is not registered", user.getName()));
    }
}
