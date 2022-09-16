import java.io.*;
import java.util.*;

public class Celebrity{
  public static void main(String [] args){
    Scanner sd = new Scanner(System.in);
    int n  = sd.nextInt();
    int M[][] = new int [n][n];
    for(int i=0 ; i<n ; i++){
      for(int j = 0 ; j<n ; j++){
        M[i][j] = sd.nextInt();
       }
    }
    int celebIdx = celebrity(M , n);
    if()
  }
}
