package com.example.ApiMongo.repositories;

import com.example.ApiMongo.models.Pokemon;

import java.util.List;

public interface CustomPokemonRepository {
    Pokemon findById(String id);
    List<Pokemon> findPokemonsByNivelGreaterThan(int nivel);

}
