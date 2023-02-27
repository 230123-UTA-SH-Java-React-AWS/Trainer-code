package com.revature.springdatademo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

//@Entity to indicate that this specific model should be a table in the database
@Entity
public @Data class Pokemon {

    @Id //Specify that this field should be a primary key when you make this table
    @GeneratedValue(strategy = GenerationType.AUTO) //Specify that this table will autogenerate the id
    @Column(name = "pokeid")
    private int id;
    private String name;
    private int level;
    private int health;

    @ManyToMany()
    private List<PokemonBox> pokemonBoxes;
}
