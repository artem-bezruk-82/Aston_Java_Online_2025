public class ValueLessThanAllowedException extends IllegalArgumentException
{
    public ValueLessThanAllowedException() {this("Value is less than allowed");}

    public ValueLessThanAllowedException(String message) {super(message);}

}
