package com.cs.management.player;

public class PlayerHandler {
	PlayerService playerService = new PlayerServiceImpl();

	void addPlayers(PlayerVO playerVO) {
		playerService.addPlayers(playerVO);
	}
}
