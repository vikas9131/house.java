import java.awt.*;
import java.awt.event.*;
class Swing extends  Frame

{
Swing()
{
  setVisible(true);
setSize(400,400);
setBackground(Color.red);
setForeground(Color.yellow);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
);
}
public void paint(Graphics g)
{
g.drawLine(100,50,20,100);
g.drawLine(100,50,200,100);
g.drawLine(20,100,200,100);
g.drawLine(20,300,200,300);
g.drawLine(100,50,300,50);
g.drawLine(300,50,300,100);
g.drawLine(200,100,300,100);
g.drawRect(200,100,100,200);
g.drawLine(70,200,70,300);
g.drawLine(70,200,130,200);
g.drawLine(130,200,130,300);
g.drawRect(230,190,50,30);
g.drawLine(20,100,20,300);
g.drawLine(200,100,200,300);
}
public static void main(String []args)
{
Swing s=new Swing();
}
}

import java.awt.*;
import java.awt.event.*;
class Swing extends  Frame

{
Swing()
{
  setVisible(true);
setSize(400,400);
setBackground(Color.red);
setForeground(Color.yellow);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
);
}
public void paint(Graphics g)
{
g.drawLine(100,50,20,100);
g.drawLine(100,50,200,100);
g.drawLine(20,100,200,100);
g.drawLine(20,300,200,300);
g.drawLine(100,50,300,50);
g.drawLine(300,50,300,100);
g.drawLine(200,100,300,100);
g.drawRect(200,100,100,200);
g.drawLine(70,200,70,300);
g.drawLine(70,200,130,200);
g.drawLine(130,200,130,300);
g.drawRect(230,190,50,30);
g.drawLine(20,100,20,300);
g.drawLine(200,100,200,300);
}
public static void main(String []args)
{
Swing s=new Swing();
}
}

