/**
 * 
 */
package proxy.imageloader;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * @author tianyi
 * 2007-11-3
 * ÉÏÎç12:21:16
 */
public class ImageIconProxy implements Icon{
	private ImageIcon realIcon=null;
	private String imageName;
	private int height;
	private int width;
	boolean isIconCreated=false;
	/**
	 * construtor method
	 * @param imageName
	 * @param width
	 * @param height
	 */
	public ImageIconProxy(String imageName,int width,int height) {
		this.height=height;
		this.width=width;
		this.imageName=imageName;
		// TODO Auto-generated constructor stub
	}

	public int getIconHeight() {
		// TODO Auto-generated method stub
		return realIcon.getIconHeight();
	}

	public int getIconWidth() {
		// TODO Auto-generated method stub
		return realIcon.getIconWidth();
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if(isIconCreated){
			realIcon.paintIcon(c, g, x, y);
			g.drawString("java and patters by cmh", x+20, y+20);
		}else{
			g.drawRect(x, y, width-1, height-1);
			g.drawString("Loading cmh's phont====", x+20, y+20);
		}
	}

}
