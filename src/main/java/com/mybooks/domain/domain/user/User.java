package com.mybooks.domain.domain.user;

import com.mybooks.mongo.document.universallyIdentifiable.UniversallyIdentifiableDocument;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "User")
public class User extends UniversallyIdentifiableDocument
{
    public User()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Book{" +
            "id=" + this.getId() +
            ", uuid=" + this.getUuid() +
            ", name='" + name +
            '}';
    }

    //////////////////////////////////////////
    // Private fields
    //////////////////////////////////////////

    @Field
    private String name;
}
