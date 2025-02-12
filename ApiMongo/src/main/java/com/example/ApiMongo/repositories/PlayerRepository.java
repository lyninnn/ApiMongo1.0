package com.example.ApiMongo.repositories;


import com.example.ApiMongo.models.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface PlayerRepository  extends MongoRepository<Player, String> {

    List<Player> findByNivelGreaterThanEqual(int nivel);
    List<Player> findByLogrosNombre(String nombreLogro);

    int countByNivelGreaterThanEqual(int nivel);

    Optional<Player> findByNombre(String nombre);
    Player save(Player player);
    void deletePlayerByNombre(String nombre);
    void deleteById(String id);
    Optional<Player> findById(String id);

}
