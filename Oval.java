import javax.swing.*;
import java.awt.*;

public class Oval
{
   private int x;
   private int y;
   private int width;
   private int height;
   private Color color;
   
   public Oval()
   {
      x = 100;
      y = 100;
      width = 100;
      height = 50;
      color = Color.WHITE;
   }
   
   public Oval(int xval, int yval, int wval, int hval, Color cval)
   {
      x = xval;
      y = yval;
      width = wval;
      height = hval;
      color = cval;
   }
   
   public void drawMe(Graphics g)
   {
      g.setColor(color);
      g.fillOval(x-(width/2), y-(height/2), width, height);
   }
}