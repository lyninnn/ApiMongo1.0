package com.example.ApiMongo.repositories;

import com.example.ApiMongo.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoAction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerRepositoryCustom implements CustomPlayerRepository{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Player findById(String id){
        Query query = new Query(Criteria.where("_id").is(id));

        return mongoTemplate.findOne(query, Player.class);
    }
}
