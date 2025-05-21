package br.com.surb.project_dslist.infrastruecture.controllers.game_list;

import br.com.surb.project_dslist.application.services.game_list.GameListFindAllService;
import br.com.surb.project_dslist.infrastruecture.presenters.GameListPresent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "list")
public class GameListFindAllController {
    private final GameListFindAllService gameListFindAllService;

    public GameListFindAllController(GameListFindAllService gameListFindAllService) {
        this.gameListFindAllService = gameListFindAllService;

    }

    @GetMapping
    public ResponseEntity<List<GameListPresent>> handle(){
        List<GameListPresent> games = this.gameListFindAllService.execute();
        return ResponseEntity.ok(games);
    }
}