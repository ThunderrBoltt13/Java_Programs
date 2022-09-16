import java.io.*;
import java.util.*;

public class StackPermutation1{
    public static boolean stackPermutation(int ip[] , int op[] , int n){
        Queue<Integer> input = new LinkedList<>();
        for(int i=0 ; i<n ; i++){
            input.add(ip[i]);
        }
        Queue<Integer> output = new LinkedList<>();
        for(int i=0 ; i<n ; i++){
            output.add(op[i]);
        }
        Stack<Integer> tempStack = new Stack<>();
        while(!input.isEmpty()){
            int ele = input.poll();
            if(ele == output.peek()){
                output.poll();
                while(!tempStack.isEmpty()){
                    if(tempStack.peek() == output.peek()){
                        tempStack.pop();
                        output.poll();

                    }
                    else{
                        break;
                    }
                }
            }
            else {
                tempStack.push(ele);
            }
        }
        return (input.isEmpty() && tempStack.isEmpty());
    }

    public static void main(String [] args){
        Scanner mo = new Scanner(System.in);
        int n = mo.nextInt();
        int input[] = new int[n];
        int output[] = new int[n];
        for(int i=0 ; i<n ; i++){
            input[i] = mo.nextInt();

        }
        for (int i=0 ;i<n ; i++){
            output[i] = mo.nextInt();
        }
        if(stackPermutation(input , output , n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("Not Possible");
        }
    }
}