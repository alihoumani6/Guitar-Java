/**
 * A simulation of a guitar string.  A string has a frequency represented by an integer midi note value, which can be changed
 * by an integral amount.  When a string vibrates, it causes its associated Soundboard object to sound the note corresponding
 * to the string's frequency.
 */
public class GuitarString {

    /**
     *  The current frequency of the GuitarString represented by an integer midi note value.
     */
    int midiNote;
    int fretNum = 0;

    /**
     * The guitar's soundboard, to which the string is attached.
     */
    GuitarSound sound;

    /**
     * Contructor initializes the soundboard and default frequency.
     * @param midiNote the default frequency of the GuitarString represented by an integer midi note value.
     * @param sound2 the guitar's soundboard to which the string is attached.
     */
    public GuitarString (GuitarSound sound2, int midiNote){
        this.midiNote = midiNote;
        this.sound = sound2;
    }

    /**
     * Changes the frequency of the string by the given number of midi notes.
     * @param deltaNotes the number of midi notes by which to change the string's frequency.
     */
    public void changeFrequency(int deltaNotes){
        midiNote += deltaNotes;
    }
    
    /**
     *  Frets the string at the fret corresponding to fretNum.
     *  @param fretNum the number of the fret at which to fret the string.
     */
    public void fret(int fretNum){
    	this.fretNum = fretNum;
    }
    /**
     * Vibrates the string which causes the soundboard to sound a note at the string's current frequency.
     */
    public void vibrate() {
        sound.soundNote(midiNote+fretNum);
    }
}
