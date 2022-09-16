import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
 
class Main{

    static boolean checkStackPermutation(int ip[], int op[], int n)
    {
        Queue<Integer> input = new LinkedList<>();
        for (int i = 0; i < n; i++)
        {
            input.add(ip[i]);
        }
        Queue<Integer> output = new LinkedList<>();
        for (int i = 0; i < n; i++)
        {
            output.add(op[i]);
        }
        Stack<Integer> tempStack = new Stack<>();
        while (!input.isEmpty())
        {
            int ele = input.poll();
 
            if (ele == output.peek())
            {
                output.poll();
                while (!tempStack.isEmpty())
                {
                    if (tempStack.peek() == output.peek())
                    {
                        tempStack.pop();
                        output.poll();
                    }
                    else
                        break;
                }
            }
            else
            {
                tempStack.push(ele);
            }
        }
        return (input.isEmpty() && tempStack.isEmpty());
    }
 
    // Driver code
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int input[] = new int [n];
        for (int i=0; i<n ;i++){
            input[i]=scan.nextInt();
        }
        int output[] = new int[n];
        for (int i=0; i<n ;i++){
            output[i]=scan.nextInt();
        }
 
        if (checkStackPermutation(input, output, n))
            System.out.println("Yes");
        else
            System.out.println("Not Possible");
    }
}