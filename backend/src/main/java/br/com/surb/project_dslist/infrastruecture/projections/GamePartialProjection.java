package br.com.surb.project_dslist.infrastruecture.projections;

public interface GamePartialProjection {
     Long getId();
     String getTitle();
     Integer getYear();
     String getImgUrl();
     String getShortDescription();
     Integer getPosition();
}
