package com.revature.springdatademo.service;

import java.util.List;

import com.revature.springdatademo.model.Pokemon;
import com.revature.springdatademo.repository.PokemonRespository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PokemonService {
    
    private PokemonRespository pokeRepo;

    public PokemonService(PokemonRespository pokeRepo) {
        this.pokeRepo = pokeRepo;
    }
    
    public Pokemon addPokemon(Pokemon pokemon)
    {
        pokeRepo.findById(pokemon.getId());
        return pokeRepo.save(pokemon);
    }

    public List<Pokemon> findPokemonByName(String name)
    {
        return pokeRepo.findByName(name);
    }

}
