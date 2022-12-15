package net.judah.songs;



import net.judah.JudahZone;
import net.judah.api.SmashHit;
import net.judah.seq.MidiTrack;
import net.judah.util.RTLogger;

public class StolenMoments extends SmashHit {

	@Override
	public void startup() {
		super.startup();
		frame.sheetMusic("StolenMoments.jpg");
//		drum1.setFile("StolenMoments");
		drum1.setActive(true);
//		drum1.getCycle().setCustom(this);
		clock.setLength(16);
		clock.writeTempo(110);
		looper.clear();
		looper.getLoopA().setOnMute(false);
		guitar.setPreset(JudahZone.getPresets().byName("Dist"));
		guitar.setPresetActive(false);
		guitar.getLatchEfx().latch(looper.getLoopA());
		RTLogger.log(this, "outro trigger");
	}

	@Override
	public void cycle(MidiTrack track) {
//		if (Cycle2.isTrigger()) {
//			Pattern outro = track.get(track.size() - 1);
//			if (track.getCurrent().equals(outro)) {
//				clock.end();
//				JudahZone.nextSong();
//			}
//			else { // start outro
//				drum2.setActive(false); // stop hihats
//				track.setCurrent(outro);
//			}
//			return;
//		}
//		int i = track.indexOf(track.getCurrent()) + 1;
//		if (i >= track.size() - 1)
//			i = 1;
//		track.setCurrent(track.get(i));
	}
	
	
	@Override
	public void teardown() {
//		drum1.getCycle().setCustom(null);
//		Cycle2.setTrigger(false);
	}
	
	
}
