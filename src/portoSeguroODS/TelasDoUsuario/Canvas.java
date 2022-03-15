package portoSeguroODS.TelasDoUsuario;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {

	BufferedImage imagemFundo;

	/**
	 * Create the panel.
	 */

	public Canvas() {

		try {
			imagemFundo = ImageIO.read(new File("C:\\workspace-eclipse\\workspace\\ProejtoQuiz\\img\\logo.png"));
		} catch (IOException ex) {
			Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imagemFundo.getScaledInstance(450, 260, 0), 0, 0, null);
	}

}
