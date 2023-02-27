package com.revature.springdatademo.repository;

import java.util.List;

import com.revature.springdatademo.model.Pokemon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRespository extends JpaRepository<Pokemon, Integer>{
    /*
        Once you have made a repository and have it inherit JpaRespository with the right generics type. You can do CRUD operations
        Spring data will look into the Pokemon Entity and determine from there the right SQL statements to execute
        It uses Reflection API
        Main point, we have complete abstraction over Repository layer
        .save(),
        .delete(),
        .update(),
        etc.
    */

    //Spring data will automatically implment this abstract method for you as long as you follow their keywords
    public List<Pokemon> findByName(String name);
}
