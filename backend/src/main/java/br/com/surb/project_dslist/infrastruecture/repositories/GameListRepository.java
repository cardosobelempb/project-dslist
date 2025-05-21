package br.com.surb.project_dslist.infrastruecture.repositories;

import br.com.surb.project_dslist.application.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {


}
