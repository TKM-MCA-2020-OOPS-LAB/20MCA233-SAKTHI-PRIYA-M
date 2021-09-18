import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class smiley extends Applet implements ActionListener {
    TextField t1,t2,t3,t4,t5,t6;
    Button b1;
    Label l1,l2,l3,l4,l5,l6;
    public void init(){
    	setLayout(null);
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField();
        t6 = new TextField();
        l1 = new Label("Enter mark 1: ");
        l2 = new Label("Enter mark 2: ");
        l3 = new Label("Enter mark 3: ");
        l4 = new Label("Enter mark 4: ");
        l5 = new Label("Enter mark 5: ");
        l6 = new Label("PERCENTAGE : ");
        b1 = new Button("RESULT");
        l1.setBounds(435,30,100,20);
        t1.setBounds(535,30,100,20);
        l2.setBounds(435,70,250,20);
        t2.setBounds(535,70,100,20);
        l3.setBounds(435,110,350,20);
        t3.setBounds(535,110,100,20);
        l4.setBounds(435,150,350,20);
        t4.setBounds(535,150,100,20);
        l5.setBounds(435,190,100,20);
        t5.setBounds(535,190,100, 20);
        l6.setBounds(435,260, 100, 20);
        t6.setBounds(535,260,100,20);
        b1.setBounds(435,300,100,20);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(b1);
      b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent evt){

        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        float percent=0;
        a= Integer.parseInt(t1.getText());
        b= Integer.parseInt(t2.getText());
        c= Integer.parseInt(t3.getText());
        d= Integer.parseInt(t4.getText());
        e= Integer.parseInt(t5.getText());
        if(evt.getSource()==b1)
        {
            percent=(float) ((a+b+c+d+e)*0.2);
            t6.setText(String.valueOf(percent));
        }
    }
    @Override
    public void paint(Graphics g)
    {
    	int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        float percent=0;
        a= Integer.parseInt(t1.getText());
        b= Integer.parseInt(t2.getText());
        c= Integer.parseInt(t3.getText());
        d= Integer.parseInt(t4.getText());
        e= Integer.parseInt(t5.getText());
        percent=(float) ((a+b+c+d+e)*0.2);

        if(percent> 50)
        {
            g.setColor(Color.YELLOW);
            g.fillOval(80,70, 150, 150);
            g.setColor(Color.BLACK);
            g.fillOval(120,120,15,15);
            g.fillOval(170,120,15,15);
            g.drawArc(130,170,50,20,180,180);
        }
       else
       {
            g.setColor(Color.YELLOW);
            g.fillOval(80,70, 150, 150);
            g.setColor(Color.BLACK);
            g.fillOval(120,120,15,15);
            g.fillOval(170,120,15,15);
            g.drawArc(130,180,50,20,180,-180);
       }
    }}