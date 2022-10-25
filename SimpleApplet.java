import java.applet.*;
import java.awt.*;


public class SimpleApplet extends Applet 
{

  public void paint(Graphics g)
  {
    g.setColor(Color.RED);
    g.drawString("Welcome to java!", 50, 100);
  }
}
/*
<applet code="SimpleApplet.class" 
         height="250" width="250">
</applet>
*/