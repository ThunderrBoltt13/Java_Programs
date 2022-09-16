import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String [] args){
        
            Scanner sd = new Scanner(System.in);
            int month = sd.nextInt();
            int day = sd.nextInt();
            int year = sd.nextInt();
            
            short D = (short)(year%100);
            short C = (short)(year/100);
            if (month >= 3 )
            {
                month = month-2;
            }
            else if (month == 1)
            {
                month = 11;
            }
            else if (month == 2)
            {
                month = 12;
            }
            short M = (short)(((13*month)-1)/5);
            
            short D4 = (short)(D/4);
            
            short C4 = (short)(C/4);
            System.out.println(C);
            int R = (day + M + D + D4 + C4 - (2*C));
            System.out.println(R);
            if (R<0)
            {
                R = R % 7;
                R = R + 7;
            }
            else if (R > 6){
                
                R=R%7;
    
            }
            System.out.println(R);
                  
   
    }
}