

import javax.sound.midi.*;

/*
 * adapted from code written by Brian Lichtenwalter  
 */
public class GuitarSound {
    public final static int STEEL_STRING_GUITAR = 25;
 
    Synthesizer synthesizer;
    Instrument instruments[];
    MidiChannel channel;

    public GuitarSound(){
        try {
            if (synthesizer == null) {
                if ((synthesizer = MidiSystem.getSynthesizer()) == null) {
                    System.out.println("getSynthesizer() failed!");
                    return;
                }
            } 
            synthesizer.open();
        } catch (Exception ex) { ex.printStackTrace(); return; }

        Soundbank sb = synthesizer.getDefaultSoundbank();
	if (sb != null) {
            instruments = synthesizer.getDefaultSoundbank().getInstruments();
            synthesizer.loadInstrument(instruments[STEEL_STRING_GUITAR]);
        }
          channel = (synthesizer.getChannels())[0];
          channel.programChange(STEEL_STRING_GUITAR);
    }

    public void close() {
        if (synthesizer != null) {
            synthesizer.close();
        }
        synthesizer = null;
        instruments = null;
    }

    public void soundNote(int note){
        channel.noteOn(note,64);
    }
} 
