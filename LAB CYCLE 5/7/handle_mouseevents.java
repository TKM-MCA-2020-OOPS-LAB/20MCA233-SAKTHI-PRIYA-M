import java.awt.*;
import java.applet.*;
import java.awt.event.*; 
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
/*<applet code="handle_mouseevents" width=300 height=300>
</applet>*/
public class handle_mouseevents extends Applet implements MouseListener,MouseMotionListener
{
	int x=0;
	int y=0;
	String msg="";

	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this); 
	}
	public void mouseClicked(MouseEvent me)
	{
		x=20;
		y=40;
		msg="Mouse Clicked";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		x=30;
		y=60;
		msg="Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x=30;
		y=60;
		msg="Mouse Released";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		x=40;
		y=80;
		msg="Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		x=40;
		y=80;
		msg="Mouse Exited";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		showStatus("Currently mouse dragged"+x+" "+y);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		showStatus("Currently mouse is at"+x+" "+y);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("HANDLING MOUSE EVENTS",30,20);
		g.drawString(msg,60,40);
	}  
}