package com.example.games.controller;


import com.example.games.entity.Games;
import com.example.games.repository.GamesRepository;
import com.example.games.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GamesController {

    @Autowired
    private GamesService gamesService;



    @GetMapping("games")
    public List<Games> getListGames(){
        System.out.printf("listou");
        return this.gamesService.listGames();
    }

    @PostMapping("games")
    public Games gameAdd(@RequestBody Games games){
        System.out.printf("Salvou");
        return this.gamesService.saveGame(games);
    }


    @GetMapping(path = "games/{id}")
    public Optional<Games> getGamesId(@PathVariable("id") Long id){
        System.out.printf("unico");
        return this.gamesService.getGameId(id);
    }

    @DeleteMapping(path = "games/delete/{id}")
    public void deleteGameId(Long id){
        System.out.printf("deletou");
        this.gamesService.deleteGameId(id);
    }

    @PutMapping(path = "games/change/{id}")
    public Games changeGames(@PathVariable("id")Long id, @RequestBody Games games){
        Games novo = this.gamesService.replace(games);
        return novo;
     }
}
