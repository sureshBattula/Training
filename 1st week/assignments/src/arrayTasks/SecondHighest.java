package arrayTasks;
import java.util.*;
public class SecondHighest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		int temp[] = new int[arr.length];
		
		int j=0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
		System.out.println("Second Highest Among All: "+temp[j-2]);

	}

}
