import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class SortQueue {
private static void sortQueue(Queue <Integer> queue) {
int n = queue.size();
for (int i = 0; i < n; i++) {
int minIndex = -1;
int minValue = Integer.MAX_VALUE;
for (int j = 0; j < n; j++) {
int currValue = queue.poll();
if (currValue < minValue && j < (n - i)) {
minValue = currValue;
minIndex = j;
}
queue.add(currValue);
}
for (int j = 0; j < n; j++) {
int currValue = queue.poll();
if (j != minIndex) {
queue.add(currValue);
}}
queue.add(minValue);
}
for (Integer i: queue) {
System.out.print(i + " ");
}
System.out.println();
}
public static void main(String[] args) {
Queue <Integer> q1 = new LinkedList<>();
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
int x = sc.nextInt();
q1.add(x);
}
sortQueue(q1);
}}