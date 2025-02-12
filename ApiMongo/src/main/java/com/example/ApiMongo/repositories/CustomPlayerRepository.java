package com.example.ApiMongo.repositories;

import com.example.ApiMongo.models.Player;

public interface CustomPlayerRepository {
    public abstract Player findById(String id);
}
