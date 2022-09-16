import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
public class Lab11 {
public static void main(String[] args) 
{
    String word = "";
    int count = 0, maxCount = 0;
    ArrayList<String> words = new ArrayList<String>();
    int countc = 0;
    try 
    {
        URL url = new URL("https://www.facebook.com/");
        BufferedReader br = new BufferedReader(new
        InputStreamReader(url.openStream()));
        String line;
        while((line = br.readLine()) != null) 
        {
            String string[] = line.toLowerCase().split("([,.\\s]+) ");
            for(String s : string)
            {
                words.add(s);
            }
            for(int i=0;i<words.size();i++)
            {
                for (int j=0 ; j<words.get(i).length(); j++)
                {
                    char ch = words.get(i).charAt(j);
                    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o'||ch == 'u'||ch == ' ')
                    {
                        countc ++;
                    }
                }
            }
        }
        for(int i = 0; i < words.size(); i++)
        {
            count = 1;
            for(int j = i+1; j < words.size(); j++)
            {
                if(words.get(i).equals(words.get(j)))
                {
                    count++;
                }
            }
            if(count > maxCount)
            { 
                maxCount = count; word = words.get(i);
            }
        }
        System.out.print("Most Occuring word in the given url is: ' " +word +" ' Repeated "+ maxCount+" Times");
        System.out.print("\n"+"Total number of vowels in the given url is: " +countc);
    }    
    catch (MalformedURLException e) 
    {
        System.out.println("Malformed URL: " + e.getMessage());
    }    
    catch (IOException e) 
    {
        System.out.println("I/O Error: " + e.getMessage());
    }
}
}