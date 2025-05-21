package br.com.surb.project_dslist.infrastruecture.presenters;

import br.com.surb.project_dslist.application.entities.Game;
import br.com.surb.project_dslist.infrastruecture.projections.GamePartialProjection;

import java.util.Objects;

public class GamePartialPresent {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GamePartialPresent() {}

    public GamePartialPresent(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GamePartialPresent(GamePartialProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
      
    }


    public Long getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GamePartialPresent that = (GamePartialPresent) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
