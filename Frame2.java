import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;//imports JPanel class
import java.awt.*;//imports the Graphics class

public class Frame2 extends JPanel 
{

   private Image dojo;
   private Image apple;
   private Image orange;
   private Image pineapple;
   private Image strawberry;
   private Image banana;

   private Timer timer;
   private int x, y;

   public Frame2() 
   { // a constructor to set up graphics windo
      
      super();
      setBackground(Color.WHITE);
      loadImage();
      x = 25;
      y = 25;


   }



   private void loadImage() 
   {

      ImageIcon ii = new ImageIcon("E:/output1.jpg");
      dojo = ii.getImage();
    //  ImageIcon oo = new ImageIcon("E:/output2.jpg");
     // orange = oo.getImage();
      //ImageIcon ss = new ImageIcon("E:/output3.jpg");
      //strawberry = ss.getImage();
      //ImageIcon bb = new ImageIcon("E:/output4.jpg");
      //banana = bb.getImage();

     // ImageIcon pp = new ImageIcon("Pineapple.png");
     // pineapple = pp.getImage();

     // ImageIcon aa = new ImageIcon("Apple.png");
     // apple = aa.getImage();


   }

   public void paintComponent(Graphics g)
   { // draw graphics in the panel
   

      super.paintComponent(g);// to make panel display correctly
      g.drawImage(dojo, 0,0, this);
      //draws out dojo


     // super.paintComponent(g);// to make panel display correctly
      //g.drawImage(apple, 0,0, this);

      //super.paintComponent(g);// to make panel display correctly
     // g.drawImage(orange, 0,0, this);

     //super.paintComponent(g);// to make panel display correctly
     // g.drawImage(pineapple, 0,0, this);

     // super.paintComponent(g);// to make panel display correctly
      //g.drawImage(banana, 0,0, this);

      //super.paintComponent(g);// to make panel display correctly
      //g.drawImage(strawberry, 0,0, this);

      //draws out the fruits somewhere
   }

   public static void main(String[] args) 
   { 

      Frame2 panel = new Frame2(); // window for drawing  
      JFrame f = new JFrame(); // the program itself
      f.setTitle("19BCN7076");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when the X button is clicked, the program quits
      f.setSize(1280,800);//size of the frame
      Container pane = f.getContentPane();//pane refers to the interior of the JFrame

      Frame2 p1 = new Frame2();

      pane.add(p1);//add the FacePanel object to the interior of the frame
      f.setVisible(true);

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
            ImageIO.write(image, "jpg" , new File("E:/output1.jpg"));
        }    
        catch (IOException e) 
        {
            e.printStackTrace();
        }

   }
}