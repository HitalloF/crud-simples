package com.example.games.repository;

import com.example.games.entity.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games, Long> {

}
