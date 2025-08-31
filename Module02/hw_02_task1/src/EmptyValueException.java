public class EmptyValueException extends IllegalArgumentException
{
    public EmptyValueException() {this("Empty value is not allowed");}

    public EmptyValueException(String message) {super(message);}
}
