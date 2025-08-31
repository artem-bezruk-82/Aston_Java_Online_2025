import java.io.*;
import java.util.ArrayList;

public class IOFileHandlerBinary<T> extends IOFileHandler<T>
{
    public IOFileHandlerBinary(String filePath)
    {
        super(filePath);
    }

    @Override
    public void write(ArrayList<T> objects) throws Exception
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath)))
        {
            oos.writeObject(objects);
        }
        catch (IOException exception)
        {
            throw new MyException(String.format("Writing to file %s failed", filePath), exception);
        }
    }


    @Override
    public ArrayList<T> read() throws Exception
    {
        ArrayList<T> books;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath)))
        {
            books = (ArrayList<T>)ois.readObject();
        }
        catch (IOException exception)
        {
            throw new MyException(String.format("Reading from file %s failed", filePath), exception);
        }
        return books;
    }
}
