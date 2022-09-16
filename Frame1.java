import javax.swing.*;
import java.awt.*;

public class Frame1 extends JPanel {


   private Timer timer;
   private int x, y;

   public Frame1() 
   { 
      super();
      setBackground(Color.WHITE);
      loadImage();
      x = 25;
      y = 25;


   }
   private void loadImage() 
   {
      URL url = null;
      BufferedImage image = null;
        try
        {
            url = new URL("https://dlcdnrog.asus.com/rog/media/1629451246311.jpg");
        } 
        catch (MalformedURLException e1) 
        {
            e1.printStackTrace();
        }
         
        try
        {
            image = ImageIO.read(url);
             
            ImageIO.write(image, "jpg", new File("E:/dojo.jpg"));

        }    
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        ImageIcon ii = new ImageIcon("Dojo.jpg");
        dojo = ii.getImage();


   }

   public void paintComponent(Graphics g)
   { 

      super.paintComponent(g);
      g.drawImage(dojo, 0,0, this);
      //draws out dojo

      //draws out the fruits somewhere
   }
   public static void main(String[] args) { 

      Frame1 panel = new Frame1(); // window for drawing  
      JFrame f = new JFrame(); // the program itself
      f.setTitle("Frame1");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when the X button is clicked, the program quits
      f.setSize(1280,800);//size of the frame
      Container pane = f.getContentPane();//pane refers to the interior of the JFrame

      Frame1 p1 = new Frame1();

      pane.add(p1);//add the FacePanel object to the interior of the frame
      f.setVisible(true);

   }
}