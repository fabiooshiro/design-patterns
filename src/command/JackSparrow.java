package command;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

/**
 * Receiver
 * @author fabiooshiro
 *
 */
public class JackSparrow extends Component{

	private static final long serialVersionUID = 1L;
	
	public int x = 0;
	public int y = 0;
	private Image img;
	
	public JackSparrow() {
		img = ImageIO.read(new File("jack.jpeg"));
	}

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, 800, 600);
		g.drawImage(img, x, y, null);
	}
}
