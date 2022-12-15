package net.judah.songs;


import net.judah.api.SmashHit;

public class AllBlues extends SmashHit {

		
	@Override
	public void startup() {
		super.startup();
		clock.writeTempo(80);
		clock.setLength(12);
	}
	
}
