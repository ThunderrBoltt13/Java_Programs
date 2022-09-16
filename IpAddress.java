import java.net.InetAddress;
import java.net.*;

public class IpAddress 
{
	public static void main(String[] args) throws Exception 
    {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("IP Address:  "+addr.getHostAddress());
		String hostname = addr.getHostName();
		System.out.println("Host name: "+hostname);
        // url  object
        URL url = null;
      
        try 
        {
            url = new URL("https://vtop2.vitap.ac.in/vtop/initialProcess");
            System.out.println("URL = " + url);
            String authority = url.getAuthority();
            System.out.println("Authority = " +authority);
            int _port = url.getPort();
            System.out.println("Port =" + _port);
            URLConnection connection = url.openConnection();
            connection.connect();
            String contentType = connection.getContentType();
            System.out.println("Content Type = " +contentType);
            System.out.println("Host name in given url is : "+url.getHost());

        }

        catch (Exception e) 
        {
            System.out.println(e);
        }
	}
}