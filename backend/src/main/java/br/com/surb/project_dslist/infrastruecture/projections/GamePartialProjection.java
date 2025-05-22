package br.com.surb.project_dslist.infrastruecture.projections;

public interface GamePartialProjection {
     Long getId();
     String getTitle();
     Integer getGameYear();
     String getImgUrl();
     String getShortDescription();
     Integer getPosition();
}
