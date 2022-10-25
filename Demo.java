import java.awt.*;
import java.applet.*;
public class Demo extends Applet
{
	public void Paint(Graphics g)
	{
		g.setColor(Color.RED);
	   g.drawString("WELCOME",400,400);
	}
}
/*
<applet code="Demo.class" 
height="1500" width="1500">
</applet>
*/