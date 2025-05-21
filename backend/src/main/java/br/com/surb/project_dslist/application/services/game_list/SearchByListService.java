package br.com.surb.project_dslist.application.services.game_list;


import br.com.surb.project_dslist.infrastruecture.presenters.GamePartialPresent;
import br.com.surb.project_dslist.infrastruecture.projections.GamePartialProjection;
import br.com.surb.project_dslist.infrastruecture.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchByListService {
    private final GameRepository gameRepository;

    public SearchByListService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GamePartialPresent> execute(Long id) {
        List<GamePartialProjection> games = this.gameRepository.searchByList(id);
        return games.stream().map(game -> new GamePartialPresent(game)).collect(Collectors.toList());
    }
}