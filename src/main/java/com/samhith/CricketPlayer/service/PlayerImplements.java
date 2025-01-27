package com.samhith.CricketPlayer.service;

import com.samhith.CricketPlayer.model.PlayerModel;
import com.samhith.CricketPlayer.repo.PlayerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerImplements implements PlayerInterface {

    private final PlayerRepo playerRepo;

    public PlayerImplements(PlayerRepo playerRepo){
        this.playerRepo = playerRepo;
    }

    @Override
    public String savePlayerDetails(PlayerModel playerModel) {
        playerRepo.save(playerModel);
        return "Player details saved successfully";
    }

    @Override
    public String updatePlayerDetails(PlayerModel playerModel) {
        playerRepo.save(playerModel);
        return "Player details updated successfully";
    }

    @Override
    public String getPlayerDetails(Integer playerId) {
        Optional<PlayerModel> player = playerRepo.findById(playerId);
        if (player.isPresent()) {
            return player.get().toString(); // or return a more specific response
        } else {
            return "Player not found";
        }
    }

    @Override
    public String deletePlayerDetailsById(Integer playerId) {
        playerRepo.deleteById(playerId);
        return "Player details deleted successfully";
    }

    @Override
    public List<PlayerModel> getAllPlayerDetails() {
        return playerRepo.findAll();
    }
}
