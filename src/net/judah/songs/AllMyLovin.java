package net.judah.songs;


import net.judah.JudahZone;
import net.judah.api.SmashHit;
import net.judah.looper.Loop;
import net.judah.seq.MidiTrack;

public class AllMyLovin extends SmashHit {

	private Loop a;
	
	@Override
	public void startup() {
		super.startup();
		a = looper.getLoopA();
//		drum1.setFile("AllMyLovin");
		drum1.setActive(false);
		drum2.setActive(false);
		fills.setActive(false);
		frame.sheetMusic("AllMyLovin.png");
		
		clock.writeTempo(93);
		clock.setLength(10);
		guitar.setPreset(JudahZone.getPresets().byName("Freeverb"));
		guitar.setPresetActive(false);
		guitar.getLatchEfx().latch(looper.getLoopA());
//		drum1.getScheduler().getCycle().setCustom(this);
		
		// marimba thing
		
	}

	
	@Override
	public void cycle(MidiTrack t) {
		if (JudahZone.isTrigger()) {
			t.setCurrent(1);
			a.setOnMute(true);
		}
		else {
			if (JudahZone.isTrigger()) {
				JudahZone.setTrigger(false);
				a.setTapeCounter(0);
				a.setOnMute(false);
			}
			t.setCurrent(0);
			
		}
	}
	
	@Override
	public void teardown() {
		drum1.getScheduler().setCustom(null);
	}
}
