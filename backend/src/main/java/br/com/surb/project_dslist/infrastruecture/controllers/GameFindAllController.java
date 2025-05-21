package br.com.surb.project_dslist.infrastruecture.controllers;


import br.com.surb.project_dslist.application.services.game.GameFindAllService;
import br.com.surb.project_dslist.infrastruecture.presenters.GamePartialPresent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "games")
public class GameFindAllController {
    private final GameFindAllService gameFindAllService;

    public GameFindAllController(GameFindAllService gameFindAllService) {
        this.gameFindAllService = gameFindAllService;

    }

    @GetMapping
    public ResponseEntity<List<GamePartialPresent>> handle(){
        List<GamePartialPresent> games = this.gameFindAllService.execute();
        return ResponseEntity.ok(games);
    }
}