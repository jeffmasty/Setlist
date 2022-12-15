package net.judah.setlist;
import java.util.ArrayList;

import net.judah.JudahZone;
import net.judah.api.SmashHit;
import net.judah.songs.*;
import net.judah.util.RTLogger;

@SuppressWarnings("serial")
public class Start extends ArrayList<Class<? extends SmashHit>> {

	private Start() {
		add(OpenMic.class);
		add(Sleepwalk.class);
		//add(LoopStory.class);
		add(AllBlues.class);
		//add(QuandoQuando.class);
		add(AutumnLeaves.class);
		add(Mood4Luv.class);
		//add(AirOnG.class);
		add(StolenMoments.class);
		add(AllMyLovin.class);
		add(JudysBlues.class);
		add(Estate.class);
		add(More.class);
		//add(Perfidia.class);
		add(BlueInGreen.class);
		//add(FeelLuv.class);
		add(Four.class);
		add(TinyDancer.class);
		//add(TimeAfterTime.class);
		add(DayB4UCame.class);

		try {
            new JudahZone(this);
            RTLogger.monitor();
        } catch (Exception e) {
        	e.printStackTrace();
        }
		
	}
	
    public static void main(String[] args) {
    	new Start();
    }

}
