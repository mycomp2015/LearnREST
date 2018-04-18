package com.api.gitesh.commonservices.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Game {
	private int playerId;
	private String gameStartedTime;
	public String getGameStartedTime() {
		return gameStartedTime;
	}
	public void setGameStartedTime(String gameStartedTime) {
		this.gameStartedTime = gameStartedTime;
	}
	private String playerName;
	private String playGameName;
	private int betAmount;
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayGameName() {
		return playGameName;
	}
	public void setPlayGameName(String playGameName) {
		this.playGameName = playGameName;
	}
	public int getBetAmount() {
		return betAmount;
	}
	public void setBetAmount(int betAmount) {
		this.betAmount = betAmount;
	}
	
	@Override
	public String toString() {
		return "Game [playerId=" + playerId + ", gameStartedTime=" + gameStartedTime + ", playerName=" + playerName
				+ ", playGameName=" + playGameName + ", betAmount=" + betAmount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + betAmount;
		result = prime * result + ((gameStartedTime == null) ? 0 : gameStartedTime.hashCode());
		result = prime * result + ((playGameName == null) ? 0 : playGameName.hashCode());
		result = prime * result + playerId;
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (betAmount != other.betAmount)
			return false;
		if (gameStartedTime == null) {
			if (other.gameStartedTime != null)
				return false;
		} else if (!gameStartedTime.equals(other.gameStartedTime))
			return false;
		if (playGameName == null) {
			if (other.playGameName != null)
				return false;
		} else if (!playGameName.equals(other.playGameName))
			return false;
		if (playerId != other.playerId)
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		return true;
	}
	
	

}
