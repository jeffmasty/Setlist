package net.judah.songs;


import net.judah.api.SmashHit;

public class Perfidia extends SmashHit {

	@Override
	public void startup() {
		super.startup();
		frame.sheetMusic("Perfidia.png");
		clock.setLength(8);
		bass.setFile("Perfidia");
	}
	
}
