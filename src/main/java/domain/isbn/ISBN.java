package domain.isbn;

import exception.isbn.ISBNException;
import org.apache.commons.validator.routines.ISBNValidator;

import java.util.Objects;

public class ISBN
{
    public ISBN(String number)
    {
        this.number = validateISBN(number);
    }

    private String validateISBN(String number)
        throws ISBNException
    {
        if (ISBNValidator.getInstance().isValid(number))
        {
            return number.replace("-", "");
        }
        else
            throw new ISBNException(number);
    }

    @Override
    public String toString()
    {
        return number;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ISBN isbn = (ISBN) o;
        return Objects.equals(number, isbn.number);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(number);
    }

    //////////////////////////////////////////
    // Private fields
    //////////////////////////////////////////

    private String number;
}
