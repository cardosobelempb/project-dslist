package br.com.surb.project_dslist.infrastruecture.controllers;


import br.com.surb.project_dslist.application.services.game.GameFindAllService;
import br.com.surb.project_dslist.application.services.game.GameFindIdService;
import br.com.surb.project_dslist.infrastruecture.presenters.GamePartialPresent;
import br.com.surb.project_dslist.infrastruecture.presenters.GamePresent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "games")
public class GameFindByController {
    private final GameFindIdService gameFindAllService;

    public GameFindByController(GameFindIdService gameFindAllService) {
        this.gameFindAllService = gameFindAllService;

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GamePresent> handle(@PathVariable Long id){
        GamePresent game = this.gameFindAllService.execute(id);
        return ResponseEntity.ok(game);
    }
}