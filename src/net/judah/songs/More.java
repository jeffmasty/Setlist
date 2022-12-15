package net.judah.songs;


import net.judah.api.SmashHit;

public class More extends SmashHit {
	
	@Override
	public void startup() {
		super.startup();
		frame.sheetMusic("More.png");
	}

}
