   import javax.swing.JFrame;
   import javax.swing.JPanel;
    public class fishdriver
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("G-Green-01 tj crew logo");
         frame.setSize(400, 425);      //In Windows, the menu bar at the top is 25 pixels tall...
         frame.setLocation(100, 50);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new fishpanel());    //...so we would expect the content pane to be 400x400.
         frame.setVisible(true);
      }
   }