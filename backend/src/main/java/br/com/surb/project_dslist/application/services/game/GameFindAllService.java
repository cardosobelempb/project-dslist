package br.com.surb.project_dslist.application.services.game;


import br.com.surb.project_dslist.application.entities.Game;
import br.com.surb.project_dslist.infrastruecture.presenters.GamePresent;
import br.com.surb.project_dslist.infrastruecture.repositories.GameRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameFindAllService {
    private final GameRepository gameRepository;

    public GameFindAllService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GamePresent> execute() {
        List<Game> games = this.gameRepository.findAll();
        return games.stream().map(game -> new GamePresent(game)).collect(Collectors.toList());
    }
}