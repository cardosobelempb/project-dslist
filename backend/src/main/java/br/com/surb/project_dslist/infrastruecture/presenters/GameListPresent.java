package br.com.surb.project_dslist.infrastruecture.presenters;

import br.com.surb.project_dslist.application.entities.GameList;

public class GameListPresent {
    private Long id;
    private String name;

    public GameListPresent() {
    }

    public GameListPresent(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
