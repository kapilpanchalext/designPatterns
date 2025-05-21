package com.java.state.factory;

public class AudioPlayer {
	private State state;
	private boolean playing = false;

	public AudioPlayer() {
		this.state= new ReadyState(this);
	}

	public void changeState(State state) {
		this.state = state;
	}

	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	public void clickLock() {
		state.clickLock();
	}

	public void clickPlay() {
		state.clickPlay();
	}

	public void clickNext() {
		state.clickNext();
	}

	public void clickPrevious() {
		state.clickPrevious();
	}

	public void startPlayback() {
		System.out.println("Playback Started");
		setPlaying(true);
	}

	public void stopPlayback() {
		System.out.println("Playback Stopped");
		setPlaying(false);
	}

	public void nextSong() {
		System.out.println("Switched to Next Song");
	}

	public void previousSong() {
		System.out.println("Switched to Previous Song");
	}

	public void fastforward(int seconds) {
		System.out.println("Fast Forwarded: " + seconds + " seconds.");
	}

	public void rewind(int seconds) {
		System.out.println("Rewound: " + seconds + " seconds.");
	}

	@Override
	public String toString() {
		return "AudioPlayer [state=" + state + ", playing=" + playing + "]";
	}

}
