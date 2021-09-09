import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class choice extends Applet implements ItemListener {

    Choice ch;
    int c; 
    Label title;
    public void init()
    {
    	title = new Label("SELECT A SHAPE FROM GIVEN CHOICES:  ");
        ch = new Choice();
        ch.addItem("...SHAPES....");
        ch.addItem("RECTANGLE");
        ch.addItem("TRIANGLE");
        ch.addItem("SQUARE");
        ch.addItem("CIRCLE");
        add(title);
        add(ch);
        ch.addItemListener(this);
    }

 public void itemStateChanged (ItemEvent e)
    {
         c= ch.getSelectedIndex();
         repaint();
    }

 public void paint(Graphics g)
	{
         super.paint(g);

         if (c == 1)
         {  
            g.drawString(ch.getItem(1),220,235);
            g.drawRect(150,70,200,150);
         }
         if (c == 2)
         {
        	 g.drawString(ch.getItem(2),45,205);
             int[] x={80,160,5};
             int[] y={70,170,170};
             g.drawPolygon(x,y,3);
         }
         if (c == 3)
         {
        	 g.drawString(ch.getItem(3),200,265);
        	 g.drawRect(200,200,50,50);
             
         }
         if (c ==4)
         {
        	 g.drawString(ch.getItem(4),190,290);
             g.drawOval(170,170,90,90);
         }
	}
}
/*
<applet code="choice.class" width="500" height="700" border="2">
</applet>
*/