package com.example.games.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "games")
@Table(name = "games")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    public Games(String name) {
        this.name = name;
    }
}
