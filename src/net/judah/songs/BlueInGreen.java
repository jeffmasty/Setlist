package net.judah.songs;


import static net.judah.JudahZone.*;

import net.judah.api.Notification.Property;
import net.judah.api.SmashHit;
import net.judah.api.Status;
import net.judah.api.TimeListener;
import net.judah.controllers.Jamstik;
import net.judah.seq.Cue;
import net.judah.util.RTLogger;

public class BlueInGreen extends SmashHit {

	final int OCTAVE = 12;
	int count;
	Jamstik jamstik = getJamstik();
	// Transpose transpose = getNotes().getTranspose();

	@Override
	public void startup() {
		super.startup();
		frame.sheetMusic("BlueInGreen.png");
		clock.setLength(10);
		
//		drum1.setFile("Bossa1");
//		hats.setFile("HiHats");
//		fills.setFile("AllMyLovin");
//		
//		Track harp = chords;
//		harp.setFile("BlueInGreen");
		
		looper.getLoopA().addListener(new TimeListener() {
			@Override public void update(Property prop, Object value) {
				if (Status.TERMINATED == value)
					jamstik.setActive(true);
			}
		});
		looper.onDeck(looper.getLoopB());
		getGuitar().setPreset(getPresets().byName("Freeverb"));
		getGuitar().setPresetActive(true);
		getGuitar().getLatchEfx().latch(looper.getLoopA());
		
//		bass.setFile("str8eight");

		getFluid().setMuteRecord(true);
		getCrave().setMuteRecord(true);

		bass.setActive(false);
//		bass.getCycle().setCustom(this);
		bass.setCue(Cue.Loop);
//		bass.setLatch(true);
//		transpose.setAmount(Bb.ordinal() - OCTAVE);
//		Transpose.setActive(true);
		bass.setActive(true);
		
//		harp.setCurrent(harp.get(harp.size() - 2));
//		harp.setCue(Cue.Bar);
//		harp.setActive(true);
//		hats.setCurrent(hats.get(4)); 
		drum1.setActive(true);
		// drum2.setActive(true);
		hats.setActive(true);
		fills.setActive(true);
		getMidi().setKeyboardSynth(synth1.getMidiPort());
		synth1.getSynthPresets().load("FeelGoodInc");
		
		count = -1;
		RTLogger.log(this, "2 bar intro, JAMSTIK ON!!");
	}

//	// set bass root transpose note
//	@Override public void cycle(Track t) {
//		count++;
//		switch (count) {
//		case 0: transpose.setAmount(Bb.ordinal() - 2 * OCTAVE); break; // Bbmaj7 
//		case 1: transpose.setAmount(A.ordinal() - 2 * OCTAVE); break; // A7b9
//		case 2: transpose.setAmount(D.ordinal() - OCTAVE); break; // D-7, Db7#11 
//		case 3: transpose.setAmount(C.ordinal() - OCTAVE); break; // C-7, F7b9 
//		case 4: transpose.setAmount(Bb.ordinal() - 2 * OCTAVE); break; // Bbmaj7
//		case 5: transpose.setAmount(A.ordinal() - 2 * OCTAVE); break; // A7b9
//		case 6: transpose.setAmount(D.ordinal() - OCTAVE); break; // D-7
//		case 7: transpose.setAmount(E.ordinal() - OCTAVE); break; // E7alt
//		case 8: transpose.setAmount(A.ordinal() - OCTAVE); break; // A-7
//		case 9: transpose.setAmount(D.ordinal() - OCTAVE); break; // D-6
//		default:
//			count = -1;
//		}
//	}
	
	@Override
	public void teardown() {
//		Transpose.setActive(false);
//		transpose.setAmount(0);
//		bass.setLatch(false);
//		bass.getCycle().setCustom(null);
//		lead1.setActive(false);
//		jamstik.setActive(false);
//		looper.onDeck(looper.getLoopB());
	}
	
}