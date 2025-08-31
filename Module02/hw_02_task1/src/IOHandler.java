import java.util.ArrayList;

public abstract class IOHandler<T>
{
    public abstract void write(ArrayList<T> objects) throws Exception;
    public abstract ArrayList<T> read () throws Exception;
}
