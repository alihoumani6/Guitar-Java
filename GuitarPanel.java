
import java.awt.Image;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GuitarPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Guitar guitar = new Guitar();
	private int pointCount = 0; // count number of points
	private Image img = new ImageIcon(getClass().getResource("guitar.jpg")).getImage();
	private int[] y = { 0, 258, 239, 221, 202, 186, 170 };
	private int currentY;
	private int previousY;
	private int currentX;
	// array of 10000 java.awt.Point references
	private Point[] points = new Point[10000];

	// set up GUI and register mouse event handler
	public GuitarPanel() {

		// handle frame mouse motion event
		addMouseMotionListener(

		new MouseMotionAdapter() // anonymous inner class
		{
			public void mouseMoved(MouseEvent event){
				previousY = event.getY();
			}
			// store drag coordinates and repaint
			public void mouseDragged(MouseEvent event) {
				

			
				currentY = event.getPoint().y;
				currentX = event.getPoint().x;
				if (previousY < y[6] && currentX > 100 && currentY >= y[6]
						|| previousY > y[6] && currentX > 100
						&& currentY <= y[6]) // if the mouse is dragged across
												// the 6th string, it plays the
												// 6th string
				{
					guitar.pluck(6);
				}

				if (previousY < y[5] && currentX > 100 && currentY >= y[5]
						|| previousY > y[5] && currentX > 100
						&& currentY <= y[5])// if the mouse is dragged across
											// the 5th string, it plays the 5th
											// string
				{
					guitar.pluck(5);
				}

				if (previousY < y[4] && currentX > 100 && currentY >= y[4]
						|| previousY > y[4] && currentX > 100
						&& currentY <= y[4])// if the mouse is dragged across
											// the 4h string, it plays the 4th
											// string
				{
					guitar.pluck(4);
				}

				if (previousY < y[3] && currentX > 100 && currentY >= y[3]
						|| previousY > y[3] && currentX > 100
						&& currentY <= y[3])// if the mouse is dragged across
											// the 3rd string, it plays the 3rd
											// string
				{
					guitar.pluck(3);
				}

				if (previousY < y[2] && currentX > 100 && currentY >= y[2]
						|| previousY > y[2] && currentX > 100
						&& currentY <= y[2])// if the mouse is dragged across
											// the 2nd string, it plays the 2nd
											// string
				{
					guitar.pluck(2);
				}

				if (previousY < y[1] && currentX > 100 && currentY >= y[1]
						|| previousY > y[1] && currentX > 100
						&& currentY <= y[1])// if the mouse is dragged across
											// the 1rst string, it plays the
											// 1rst string
					
				{
					guitar.pluck(1);
				}
				previousY = currentY;
			} // end method mouseDragged
		} // end anonymous inner class
		); // end call to addMouseMotionListener
	} // end PaintPanel constructor

	// draw ovals in a 4-by-4 bounding box at specified locations on window
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	} // end method paintComponent
} // end class PaintPanel
