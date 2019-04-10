package vista;

import java.awt.Graphics;
import java.awt.Image;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel {
	    Image image = new ImageIcon(url).getImage();

	    @Override
	    public void paint(Graphics g){
	        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	        g.setOpaque(False);
	        super.paint(g);
	    }
	public Fondo() {

	}

}
