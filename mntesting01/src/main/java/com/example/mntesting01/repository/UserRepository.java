package com.example.mntesting01.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mntesting01.model.Users;

public interface UserRepository extends MongoRepository<Users, UUID> {

}
