class Guitar {

   // the sixth string is called E6, sounds an E2 note, which is midi 40
   public final static int MIDI_E2 = 40;
   // the fifth string is called A, sounds an A2 note, which is midi 45
   public final static int MIDI_A2 = 45;
   // the fourth string is called D, sounds an D3 note, which is midi 50
   public final static int MIDI_D3 = 50;
   // the third string is called G, sounds an G3 note, which is midi 55
   public final static int MIDI_G3 = 55;
   // the third string is called B, sounds an B3 note, which is midi 59
   public final static int MIDI_B3 = 59;
   // the third string is called E1, sounds an E4 note, which is midi 64
   public final static int MIDI_E4 = 64;

   private GuitarString string1;
   private GuitarString string2;
   private GuitarString string3;
   private GuitarString string4;
   private GuitarString string5;
   private GuitarString string6;
   private Tuner tuner1;
   private Tuner tuner2;
   private Tuner tuner3;
   private Tuner tuner4;
   private Tuner tuner5;
   private Tuner tuner6;

   private GuitarSound sound = new GuitarSound();
   
   public Guitar (){
       string1 = new GuitarString(sound,MIDI_E4);
       tuner1 = new Tuner(string1);
       string2 = new GuitarString(sound,MIDI_B3);
       tuner2 = new Tuner(string2);
       string3 = new GuitarString(sound,MIDI_G3);
       tuner3 = new Tuner(string3);
       string4 = new GuitarString(sound,MIDI_D3);
       tuner4 = new Tuner(string4);
       string5 = new GuitarString(sound,MIDI_A2);
       tuner5 = new Tuner(string5);
       string6 = new GuitarString(sound,MIDI_E2);
       tuner6 = new Tuner(string6);
   }

   public void pluck(int stringNum) {
       GuitarString string;

       switch(stringNum){
       case 1:
           string = string1;
           break;
       case 2:
           string = string2;
           break;
       case 3:
           string = string3;
           break;
       case 4:
           string = string4;
           break;
       case 5:
           string = string5;
           break;
       case 6:
           string = string6;
           break;
       default:
           string = string1;
           break;
       }
       string.vibrate();
   }
   public void turn(int tunerNum, int deltaNotes){
       Tuner tuner;

       switch(tunerNum){
       case 1:
           tuner = tuner1;
           break;
       case 2:
           tuner = tuner2;
           break;
       case 3:
           tuner = tuner3;
           break;
       case 4:
           tuner = tuner4;
           break;
       case 5:
           tuner = tuner5;
           break;
       case 6:
           tuner = tuner6;
           break;
       default:
           tuner = tuner6;
           break;
       }
       tuner.turn(deltaNotes);
   }
}
