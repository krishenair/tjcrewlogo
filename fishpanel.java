import javax.swing.*;
import java.awt.*;

public class fishpanel extends JPanel
{                                         
   public void paintComponent(Graphics g) 
   {
      //As you complete each part of this assignment, uncomment the appropriate
      //code and LEAVE IT UNCOMMENTED.  Your panel will slowly fill with a
      //variety of nifty shapes!
      
      
      //Fill in background.
      g.setColor(new Color(32, 72, 124));  	
      g.fillRect(0, 0, 400, 400);
      
      int x[] = {400, 400, 200};
      int y[] = {400, 200, 400};
      
      g.setColor(new Color(253, 2, 3));
      g.fillPolygon(x, y, 3);
      
      /*
      int starxstep = 0;
      int starystep = 0;
      
      int xstar[] = {0 ,7 ,10 ,13 ,20 ,14 ,17 ,10 ,3 ,6 };
      int ystar[] = {7 ,7 ,0 ,7 ,7 ,12 ,20 ,16 ,20 ,12 };
      
      g.setColor(Color.WHITE);
      g.fillPolygon(xstar, ystar, 10);
      */
      
      Star st = new Star(75, Color.WHITE, 210, 20);
      
      st.drawMe(g);
   }

}