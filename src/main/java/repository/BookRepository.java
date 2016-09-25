package repository;

import domain.book.Book;
import mongo.repository.MongoUniversallyIdentifiableRepository;

public interface BookRepository extends MongoUniversallyIdentifiableRepository<Book>
{
}
