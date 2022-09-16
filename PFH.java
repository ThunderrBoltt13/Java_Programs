import java.util.*;
import java.io.*;

class PFH{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);  
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){    
    long startTime = System.nanoTime();
    int count=10;    
  System.out.print(n1+" "+n2);    
  printFibonacci(count-2);
  long endTime = System.nanoTime();
  long timeElapsed  = endTime - startTime;
  System.out.println("Execution Time in milliseconds : " +timeElapsed/1000000 + " ms");
  System.out.println("\n NAME : M.Purna Siva Sai \n REG.NO : 19BCN7076");
 }  
} 