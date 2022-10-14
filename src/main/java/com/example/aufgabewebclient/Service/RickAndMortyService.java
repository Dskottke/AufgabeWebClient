package com.example.aufgabewebclient.Service;

import com.example.aufgabewebclient.Models.Character;
import com.example.aufgabewebclient.Response.CharacterResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service

public class RickAndMortyService {


    @Value("${character.url}")
    private String url;


    public List<Character> getAllCharacter() {
        WebClient client = WebClient.create(url);
        CharacterResponse response =
                client.get().uri(url + "/character")
                        .retrieve()
                        .toEntity(CharacterResponse.class)
                        .block()
                        .getBody();
        return response.getResults();


    }

    public List<Character> getAllCharacterStatusAlive(String status) {
        WebClient client = WebClient.create(url);
        CharacterResponse response =
                client.get().uri(url + "/character/?status=" + status)
                        .retrieve()
                        .toEntity(CharacterResponse.class)
                        .block()
                        .getBody();
        return response.getResults();
    }
}
