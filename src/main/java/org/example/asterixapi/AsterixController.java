package org.example.asterixapi;

import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController @RequestMapping("/application")
public class AsterixController {

    private final AsterixRepo repository;

    public AsterixController(AsterixRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/asterix/characters")
    public List<Character> getCharacters() {
        return List.of(
                new Character("1", "Asterix", 35, "Krieger"),
                new Character("2", "Obelix", 35, "Lieferant"),
                new Character("3", "Miraculix", 60, "Druide"),
                new Character("4", "Majestix", 60, "Häuptling"),
                new Character("5", "Troubadix", 25, "Barden"),
                new Character("6", "Gutemine", 35, "Häuptlingsfrau"),
                new Character("7", "Idefix", 5, "Hund"),
                new Character("8", "Geriatrix", 70, "Rentner"),
                new Character("9", "Automatix", 35, "Schmied"),
                new Character("10", "Grockelix", 35, "Fischer")
        );



    }
    @PostMapping
    public void addCharacter(@RequestBody Character character){
        repository.save(character);
    }
}