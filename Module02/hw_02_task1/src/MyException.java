import java.io.IOException;

public class MyException extends IOException
{
    public MyException(String msg, Throwable ex) {super(msg, ex);}
}
