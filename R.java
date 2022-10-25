import java.applet.*;
import java.awt.*;
import java.util.Random;

public class R extends Applet
{
     int cloudX,cloudY;
     int xSunPosition,ySunPosition;
     public void init()
	{
 		cloudX=850;
		cloudY=100;
   		xSunPosition=550;
 		ySunPosition=600;

	}
	public void paint(Graphics g2)
	{
     
		//sky
       		 g2.setColor(Color.cyan);
       		 g2.fillRect(0,0,1500,500 );

		//sun, yellow
       		 g2.setColor(Color.yellow);
       		 g2.fillOval(xSunPosition,ySunPosition, 110, 110);

      		 //cloud,blue
      		 g2.setColor(Color.white);
      		 g2.fillOval(cloudX,cloudY, 50, 60);
    	         g2.fillOval(cloudX+15, cloudY-25, 70, 80);
      		 g2.fillOval(cloudX+30, cloudY+30, 70, 50);
      		 g2.fillOval(cloudX+60, cloudY, 80, 60);
     	         g2.fillOval(cloudX+50, cloudY-30, 60, 40);
       		 g2.fillOval(cloudX+80, cloudY-20, 70, 60);
      		 g2.fillOval(cloudX+80, cloudY+20, 70, 60);
     	         g2.fillOval(cloudX+100, cloudY, 70, 60);
	

     		 // grass, green
            	 g2.setColor(Color.green);
      		 g2.fillRect(0,501,1500,501);

		
		 //house, purple
       		 g2.setColor(Color.purple);
       		 g2.fillRect(300, 300, 200, 200);

       		 //door, brown
       		 g2.setColor(Color.brown);
       		 g2.fillRect(410, 380, 60, 120);

       		 //roof, dark brown
       		 g2.setColor(Color.brown);
       		 int xRoof[] = {280, 400, 520};
       	}
}
/* 
<applet code="R.class" height=1500 width=1500>
</applet>
*/ 