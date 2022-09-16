import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
 
public class Frame
{   
    public static void main(String[] args)
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
            ImageIO.write(image, "jpg", new File("E:/output.jpg"));
        }    
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        System.out.println("done");
    }
}