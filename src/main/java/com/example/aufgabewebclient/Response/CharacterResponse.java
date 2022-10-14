package com.example.aufgabewebclient.Response;


import com.example.aufgabewebclient.Models.Character;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterResponse {
    private List<Character> results;
}
