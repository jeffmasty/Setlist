package net.judah.songs;


import net.judah.api.SmashHit;

public class Estate extends SmashHit {

	@Override
	public void startup() {
		clock.setLength(7);
		frame.sheetMusic("Estate.png");
	}
}
