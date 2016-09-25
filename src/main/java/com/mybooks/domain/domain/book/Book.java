package com.mybooks.domain.domain.book;

import com.mybooks.domain.domain.isbn.ISBN;
import com.mybooks.mongo.document.universallyIdentifiable.UniversallyIdentifiableDocument;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.Locale;
import java.util.Objects;

// TODO Javadocs
@Document(collection = "books")
public class Book extends UniversallyIdentifiableDocument
{
    public Book()
    {

    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Date getYear()
    {
        return year;
    }

    public void setYear(Date year)
    {
        this.year = year;
    }

    public Locale getLang()
    {
        return lang;
    }

    public void setLang(Locale lang)
    {
        this.lang = lang;
    }

    public ISBN getISBN()
    {
        return isbn;
    }

    public void setISBN(ISBN isbn)
    {
        this.isbn = isbn;
    }

    //////////////////////////////////////////
    // Private fields
    //////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(year, book.year) &&
                Objects.equals(lang, book.lang) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, lang, isbn);
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "id=" + this.getId() +
                ", uuid=" + this.getUuid() +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", lang=" + lang +
                ", domain.exception.isbn=" + isbn +
                '}';
    }

    @Field
    private String title;
    @Field
    private String author;
    @Field
    private Date year;
    @Field
    private Locale lang;
    @Field
    private ISBN isbn;
}
