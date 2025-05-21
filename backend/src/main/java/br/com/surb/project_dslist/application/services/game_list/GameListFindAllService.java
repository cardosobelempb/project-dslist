package br.com.surb.project_dslist.application.services.game_list;


import br.com.surb.project_dslist.application.entities.Game;
import br.com.surb.project_dslist.application.entities.GameList;
import br.com.surb.project_dslist.infrastruecture.presenters.GameListPresent;
import br.com.surb.project_dslist.infrastruecture.presenters.GamePartialPresent;
import br.com.surb.project_dslist.infrastruecture.repositories.GameListRepository;
import br.com.surb.project_dslist.infrastruecture.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListFindAllService {
    private final GameListRepository gameListRepository;

    public GameListFindAllService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    @Transactional(readOnly = true)
    public List<GameListPresent> execute() {
        List<GameList> games = this.gameListRepository.findAll();
        return games.stream().map(game -> new GameListPresent(game)).collect(Collectors.toList());
    }
}