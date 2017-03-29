
import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class Mines extends JPanel {
	//private static final JFrame JFrame = null;
	private Random generator = new Random();
	public int row;
	public int column;
	public boolean bombs[][];{
		JFrame myFrame = new JFrame();
		MyPanel myPanel = (MyPanel) myFrame.getContentPane().getComponent(0);
	 
			row=generator.nextInt(10);
			column=generator.nextInt(10);
			Color newColor = Color.BLACK;
			//return true;
			MyPanel.colorArray[row][column] = newColor;

			myPanel.repaint();

		}
}
