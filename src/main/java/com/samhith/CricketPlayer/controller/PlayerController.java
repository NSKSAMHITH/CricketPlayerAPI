package com.samhith.CricketPlayer.controller;


import com.samhith.CricketPlayer.model.PlayerModel;
import com.samhith.CricketPlayer.repo.PlayerRepo;
import com.samhith.CricketPlayer.service.PlayerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cricket")
//@CrossOrigin
public class PlayerController {

    @Autowired
    PlayerRepo playerRepo;

    @Autowired
    PlayerInterface playerInterface;

    //POST
    @PostMapping("/")
    public String savePlayerDetails(@RequestBody PlayerModel playerModel){
        return playerInterface.savePlayerDetails(playerModel);
    }

    //PUT
    @PutMapping("/")
    public String updatePlayerDetails(@RequestBody PlayerModel playerModel){
        return playerInterface.updatePlayerDetails(playerModel);
    }

    //GET
    @GetMapping("/{playerId}")
    public String getPlayerDetails(@PathVariable("playerId") Integer playerId){
        return playerInterface.getPlayerDetails(playerId);
    }

    //DELETE
    @DeleteMapping("/{playerId}")
    public String deletePlayerDetailsById(@PathVariable("playerId") Integer playerId){
        return playerInterface.deletePlayerDetailsById(playerId);
    }

    @GetMapping("/")
    public List<PlayerModel> getAllPlayerDetails(){
        return playerInterface.getAllPlayerDetails();
    }
}
