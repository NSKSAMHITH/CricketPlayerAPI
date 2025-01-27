package com.samhith.CricketPlayer.service;

import com.samhith.CricketPlayer.model.PlayerModel;

import java.util.List;

public interface PlayerInterface {

    public String savePlayerDetails(PlayerModel playerModel);

    public String updatePlayerDetails(PlayerModel playerModel);

    public String getPlayerDetails(Integer playerId);

    public List<PlayerModel> getAllPlayerDetails();

    String deletePlayerDetailsById(Integer playerId);
}
