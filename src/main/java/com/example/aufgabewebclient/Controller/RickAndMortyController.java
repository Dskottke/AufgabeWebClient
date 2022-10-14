package com.example.aufgabewebclient.Controller;

import com.example.aufgabewebclient.Models.Character;
import com.example.aufgabewebclient.Service.RickAndMortyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class RickAndMortyController {

    private final RickAndMortyService rickAndMortyService;

    public RickAndMortyController(RickAndMortyService rickAndMortyService) {
        this.rickAndMortyService = rickAndMortyService;
    }

    @GetMapping()
    public List<Character> getAllCharacter() {
        return rickAndMortyService.getAllCharacter();
    }

    @GetMapping("characters/")
    public List<Character> getAllCharacterStatusAlive(@RequestParam String status) {

        return rickAndMortyService.getAllCharacterStatusAlive(status);
    }
}

