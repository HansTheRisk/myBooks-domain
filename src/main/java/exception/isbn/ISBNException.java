package exception.isbn;

public class ISBNException extends RuntimeException
{
    public ISBNException(String isbn)
    {
        super("'" + isbn + "'" + " is not a valid ISBN number.");
    }
}
