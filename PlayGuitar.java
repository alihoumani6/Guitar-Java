// Testing GuitarPanel.
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlayGuitar
{
   public static void main( String[] args )
   { 
      // create JFrame
      JFrame application = new JFrame( "A simple paint program" );

      GuitarPanel guitarPanel = new GuitarPanel(); // create guitar panel
      application.add( guitarPanel, BorderLayout.CENTER ); // in center
      
      // create a label and place it in SOUTH of BorderLayout
      application.add( new JLabel( "Drag the mouse to draw" ), 
         BorderLayout.SOUTH );

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.setSize( 640, 500 ); // set frame size
      application.setVisible( true ); // display frame
   } // end main
} // end class PLAYGUITAR	
