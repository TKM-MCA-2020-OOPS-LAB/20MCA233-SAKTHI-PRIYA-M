import java.applet.Applet;
import java.awt.Graphics;
/*<applet code = "draw.class" width = "500" height = "700"></applet>*/
public class draw extends Applet{
public void paint(Graphics g){		
	g.drawLine(100,10,250,10);
	g.drawRect(120, 50, 100, 100);
	g.drawOval(120, 200, 100, 100);
}
}