package com.java.state.factory;

public class LockedState implements State {
	private final AudioPlayer player;

	public LockedState(AudioPlayer player) {
		this.player = player;
	}

	@Override
	public void clickLock() {
		if(player.isPlaying()) {
			player.changeState(new PlayingState(player));
		} else {
			player.changeState(new ReadyState(player));
		}
		System.out.println("Player Unlocked");
	}

	@Override
	public void clickPlay() {
		System.out.println("Locked: Play button ignored");
	}

	@Override
	public void clickNext() {
		System.out.println("Locked: Next button ignored");
	}

	@Override
	public void clickPrevious() {
		System.out.println("Locked: Previous button ignored");
	}

}
