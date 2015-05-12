/**
 * A simulation of a guitar tuner.  Each tuner is associated with a string whose frequency is changed when the turner is turned.
 */
public class Tuner {

    /**
     * The GuitarString attached to and controlled by this tuner.
     */
    GuitarString string;

    /**
     * Contructor for a tuner associated with the given GuitarString.
     * @param string the GuitarString controlled by this tuner.
     */
    public Tuner(GuitarString string){
       this.string = string;
    }

    /**
     * Turns the tuner by the integral amount given by deltaNotes.
     * @param deltaNotes the integral amount by which to turn the tuner.  For example, a deltaNotes of 1 corresponds to turning the tuner
     * by an amount such that the frequency of the attached string will change by one midi note.
     */
    public void turn(int deltaNotes){
        string.changeFrequency(deltaNotes);
    }
}
