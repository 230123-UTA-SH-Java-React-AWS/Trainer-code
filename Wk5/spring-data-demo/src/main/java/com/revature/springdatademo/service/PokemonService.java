package com.revature.springdatademo.service;

import java.util.List;

import com.revature.springdatademo.model.Pokemon;
import com.revature.springdatademo.repository.PokemonRespository;

import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    
    private PokemonRespository pokeRepo;

    public PokemonService(PokemonRespository pokeRepo) {
        this.pokeRepo = pokeRepo;
    }

    public Pokemon addPokemon(Pokemon pokemon)
    {
        return pokeRepo.save(pokemon);
    }

    public List<Pokemon> findPokemonByName(String name)
    {
        return pokeRepo.findByName(name);
    }

}
