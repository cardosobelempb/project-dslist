package br.com.surb.project_dslist.application.services.game;


import br.com.surb.project_dslist.application.entities.Game;
import br.com.surb.project_dslist.infrastruecture.presenters.GamePartialPresent;
import br.com.surb.project_dslist.infrastruecture.presenters.GamePresent;
import br.com.surb.project_dslist.infrastruecture.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameFindIdService {
    private final GameRepository gameRepository;

    public GameFindIdService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public GamePresent execute(Long id) {
        Game game = gameRepository.findById(id).orElse(null);
        return new GamePresent(game);
    }
}