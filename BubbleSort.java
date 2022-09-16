import java.util.*;
public class BubbleSort{
    static void bubblesort(int[] arr,int n){
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i= 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubblesort(arr,n);
        for(int i= 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Hello World");
    }
}