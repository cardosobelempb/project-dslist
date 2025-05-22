package br.com.surb.project_dslist.infrastruecture.controllers.game_list;

import br.com.surb.project_dslist.application.services.game.SearchByListService;
import br.com.surb.project_dslist.infrastruecture.presenters.GamePartialPresent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "list")
public class SearchByListController {
    private final SearchByListService searchByListService;

    public SearchByListController(SearchByListService searchByListService) {
        this.searchByListService = searchByListService;

    }

    @GetMapping(value = "/{id}/games")
    public ResponseEntity<List<GamePartialPresent>> handle(@PathVariable Long id) {
        List<GamePartialPresent> games = this.searchByListService.execute(id);
        return ResponseEntity.ok(games);
    }
}