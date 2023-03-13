import javax.swing.*;
import java.awt.*;

public class Star
{
   private int r;
   private Color c;
   private int x;
   private int y;
   
   public Star()
   {
      r = 10;
      c = Color.WHITE;
      x = 0;
      y = 0;
   }
   
   public Star(int radius, Color color, int xval, int yval)
   {
      r = radius;
      c = color;
      x = xval;
      y = yval;
   }
   
   public void drawMe(Graphics g)
   {
      int xstar[] = {r+x, ((r*13)/10)+x, (r*2)+x, ((r*14)/10)+x, ((r*17)/10)+x, r+x, ((r*3)/10)+x, ((r*6)/10)+x, x, ((r*7)/10)+x};
      int ystar[] = {y, ((r*7)/10)+y, ((r*7)/10)+y, ((r*12)/10)+y, ((r*20)/10)+y, (int)((r*15.5)/10)+y, ((r*20)/10)+y, ((r*12)/10)+y, ((r*7)/10)+y, ((r*7)/10)+y};
      
      g.setColor(c);
      g.fillPolygon(xstar, ystar, 10);
   }
}