import java.net.*;
import java.io.*;

public class RDS {

  public static void main (String[] args) {

    if  (args.length > 0) {
      try {
        
        URL u = new URL(args[0]);
        URLConnection uc = u.openConnection(  );
        InputStream raw = uc.getInputStream(  );
        InputStream buffer = new BufferedInputStream(raw);       
        Reader r = new InputStreamReader(buffer);
        int c;
        while ((c = r.read(  )) != -1) {
          System.out.print((char) c);
        } 
      }
      catch (MalformedURLException e) {
        System.err.println(args[0] + " is not a parseable URL");
      }
      catch (IOException e) {
        System.err.println(e);
      }

    } 

  } 

}