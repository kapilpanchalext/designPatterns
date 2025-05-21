package com.java.state.factory;

public class PlayingState implements State {
	private final AudioPlayer player;
	
	public PlayingState(AudioPlayer player) {
		this.player = player;
	}

	@Override
	public void clickLock() {
		player.changeState(new LockedState(player));
		System.out.println("Player Locked during playback");
	}

	@Override
	public void clickPlay() {
		player.stopPlayback();
		player.changeState(new ReadyState(player));
	}

	@Override
	public void clickNext() {
		boolean doubleClick = Math.random() > 0.5;
		if(doubleClick){
			player.nextSong();
		} else {
			player.fastforward(5);
		}
	}

	@Override
	public void clickPrevious() {
		boolean doubleClick = Math.random() > 0.5;
		if(doubleClick){
			player.previousSong();
		} else {
			player.rewind(5);
		}
	}

}
