package Service;

import Users.User;
import Util.Tuple;

public abstract class Service
{
    public abstract Tuple<Boolean, String> work(User user);
}
