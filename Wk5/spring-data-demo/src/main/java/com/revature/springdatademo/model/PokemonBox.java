package com.revature.springdatademo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Entity
public @Data class PokemonBox {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Value("Normal")
    private String environemnt;

    @ManyToMany(mappedBy = "pokemonBoxes")
    private List<Pokemon> pokemons;

    public PokemonBox() {
        this.pokemons = new ArrayList<>();
    }
}
