package org.example.asterixapi;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AsterixRepo extends MongoRepository<Character, String> {
public List <Character> findAllByName(String name);
}
