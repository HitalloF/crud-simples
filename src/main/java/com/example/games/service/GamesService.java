package com.example.games.service;

import com.example.games.entity.Games;
import com.example.games.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<Games> listGames(){
        Iterable<Games> gamesIterable = this.gamesRepository.findAll();
        return Streamable.of(gamesIterable).toList();
    }

    public Games saveGame(Games games){
        return this.gamesRepository.save(games);
    }

    public Optional<Games> getGameId(Long id){
        return this.gamesRepository.findById(id);
    }

    public void deleteGameId(Long id){
        this.gamesRepository.deleteById(id);
    }


    public Games replace(Games games){
        return this.gamesRepository.save(games);
    }

}
