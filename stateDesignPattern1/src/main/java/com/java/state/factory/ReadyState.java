package com.java.state.factory;

public class ReadyState implements State {
	private final AudioPlayer player;
	
	public ReadyState(AudioPlayer player) {
		this.player = player;
	}

	@Override
	public void clickLock() {
		player.changeState(new LockedState(player));
		System.out.println("Player Locked");
	}

	@Override
	public void clickPlay() {
		player.startPlayback();
		System.out.println(new PlayingState(player));
	}

	@Override
	public void clickNext() {
		player.nextSong();
	}

	@Override
	public void clickPrevious() {
		player.previousSong();
	}

}
