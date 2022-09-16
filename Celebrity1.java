import java.io.*;
import java.util.*;

public class Celebrity1{
    public static void main(String [] args){
        Scanner mp = new Scanner(System.in);
        int n = mp.nextInt();
        int M[][] = new int [n][n]; 
        for(int i =0 ; i < n ; i++){
            for(int j = 0 ; j<n ; j++){
                M[i][j] = mp.nextInt();
            }
        }
            int celebIdx = celebrity(M , n);
            if(celebIdx == -1){
                System.out.println("No Celebrity");
            }
            else {
                System.out.println(celebIdx);
            }
    }
    public static int celebrity(int M[][] ,int n){
        int i=0 , j=n-1; 
        while(i<j){
            if (M[j][i] == 1){
                j--;
            }
            else {
                i++;
            }
        }
        int candidate = i; 
        for(i =0 ; i<n; i++){
            if(i != candidate){
                if (M[i][candidate] == 0 || M[candidate][i] == 1){
                    return -1;
                }
            }
        }
        return candidate;
    }
}