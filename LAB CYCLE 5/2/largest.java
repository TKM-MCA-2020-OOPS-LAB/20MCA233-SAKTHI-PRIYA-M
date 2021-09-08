import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class largest extends Applet implements ActionListener
{
        TextField t1,t2,t3,t4;
        Button b1;
        Label l1,l2,l3,l4,title;
        
    public void init()
    {
        setLayout(null);
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        l1 = new Label("Enter number 1: ");
        l2 = new Label("Enter number 2: ");
        l3 = new Label("Enter number 3: ");
        title = new Label("***LARGEST OF THREE NUMBERS***");
        l4 = new Label("Maximum No: ");
        b1 = new Button("RESULT");
        title.setBounds(10,10,250,10);
        l1.setBounds(35,30,100,20);
        t1.setBounds(135,30,100,20);
        l2.setBounds(35,70,250,20);
        t2.setBounds(135,70,100,20);
        l3.setBounds(35,110,350,20);
        t3.setBounds(135,110,100,20);
        l4.setBounds(35,175,350,20);
        t4.setBounds(135,195,100,20);
        b1.setBounds(135,230,90,30);
        add(t1);
        add(t2);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(l1);
        add(l2);
        add(l3);
        add(title);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int n1,n2,n3;
        String str;
        str = t1.getText();
        n1 = Integer.parseInt(str);
        str = t2.getText();
        n2 = Integer.parseInt(str);
        str = t3.getText();
        n3 = Integer.parseInt(str);
        if(n1>n2 && n1>n3)
            t4.setText(n1+"");
        else if(n2>n1 && n2>n3)
            t4.setText(n2+"");
        else
            t4.setText(n3+"");

    }
}