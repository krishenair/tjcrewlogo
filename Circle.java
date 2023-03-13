import javax.swing.*;
import java.awt.*;


public class Circle
{
   private int r;
   private int x;
   private int y;
   private Color c;
   
   public Circle()
   {
      r = 10;
      x = 200;
      y = 20;
      c = Color.BLACK;
   }
   
   public Circle(int rval, int xval, int yval, Color cval)
   {
      r = rval;
      x = xval;
      y = yval;
      c = cval;
   }
   
   public Circle(Square s)
   {
      r = s.getSide() / 2;
      x = s.getX() + r;
      y = s.getY() + r;
      c = s.getColor().darker();
   }
   
   public int getRadius()
   {
      return r;
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public Color getColor()
   {
      return c;
   }
   
   public void setRadius(int rval)
   {
      r = rval;
   }
   
   public void setX(int xval)
   {
      x = xval;
   }
   
   public void setY(int yval)
   {
      y = yval;
   }
   
   public void setColor(Color cval)
   {
      c = cval;
   }
   
   public void drawMe(Graphics g)
   {
      g.setColor(c);
      g.fillOval(x-r, y-r, r*2, 2*r);
   }
   
   public String toString()
   {
      return "Circle at center " + x + ", " + y + " with radius " + r + " and color set to " + c;
   }
}

//fields x
//constructors x
//accessors x
//modifiers x
//instance