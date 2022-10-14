package com.example.aufgabewebclient.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    private String id;
    private String name;
    private String status;
    private String gender;

}
