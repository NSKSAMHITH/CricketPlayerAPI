package com.samhith.CricketPlayer.repo;

import com.samhith.CricketPlayer.model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<PlayerModel, Integer> {
}
