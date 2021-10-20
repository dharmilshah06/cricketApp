package com.cs.management.player;

public class PlayerServiceImpl implements PlayerService {
PlayerRepository playerRepo=new PlayerRepository();
	@Override
	public boolean addPlayers(PlayerVO player) {
		// TODO Auto-generated method stub
		
		return playerRepo.savePlayer(player);
	}

}
