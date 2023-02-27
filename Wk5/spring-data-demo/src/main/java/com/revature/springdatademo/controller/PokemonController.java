package com.revature.springdatademo.controller;

import java.util.List;

import com.revature.springdatademo.model.Pokemon;
import com.revature.springdatademo.service.PokemonService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    
    private PokemonService pokeServ;

    public PokemonController(PokemonService pokeServ) {
        this.pokeServ = pokeServ;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public Pokemon addPokemon(@RequestBody Pokemon pokemon)
    {
        return pokeServ.addPokemon(pokemon);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Pokemon> getPokemonsByName(@RequestParam(name="name") String pokename)
    {
        return pokeServ.findPokemonByName(pokename);
    }
}
