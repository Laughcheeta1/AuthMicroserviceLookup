package com.Lookup.AuthenticationMicroservice.UserAuth;

import com.Lookup.AuthenticationMicroservice.UserAuth.Entity.UserAuth;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserAuthDAO extends MongoRepository<UserAuth, ObjectId> {
    Optional<UserAuth> findByNameAndPassword(String name, String password);
}
