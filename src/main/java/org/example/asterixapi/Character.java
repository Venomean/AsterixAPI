package org.example.asterixapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Character")
public record Character(@Id String id, String name, int age, String profession) {
}