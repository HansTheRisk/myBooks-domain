package com.mybooks.domain.repository;

import com.mybooks.domain.domain.book.Book;
import com.mybooks.mongo.repository.MongoUniversallyIdentifiableRepository;

public interface BookRepository extends MongoUniversallyIdentifiableRepository<Book>
{
}
