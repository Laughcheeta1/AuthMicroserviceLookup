package com.Lookup.AuthenticationMicroservice.UserAuth.Entity;

import lombok.Getter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "User")
@Getter
public class UserAuth {
    @Field("_id")
    private ObjectId id;

    @Field("name")
    private String name;

    @Field("password")
    private String password;
}
