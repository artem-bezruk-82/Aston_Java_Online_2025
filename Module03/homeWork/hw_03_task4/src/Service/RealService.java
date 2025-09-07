package Service;

import Users.User;
import Util.Tuple;

class RealService extends Service
{
    @Override
    public Tuple<Boolean, String> work(User user)
    {
        if (user != null)
            return new Tuple<>(true, String.format("I'm doing very important work for %s!%n", user.getName()));
        else
            return new Tuple<>(false, "Sorry, you did not specify user.");
    }
}
