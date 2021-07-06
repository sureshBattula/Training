package arrayTasks;
import java.util.Arrays;
import java.util.Scanner;
public class RemovingDupInAray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int newar[]=removeDup(arr);
		System.out.println("new array:"+Arrays.toString(newar));
		

	}
	public static int[] removeDup(int arr[]) {
		int n[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			int isprsnt=0;
			
			for(int j=0;j<n.length;j++) {
				if(n[j]==x) {
					isprsnt=1;
				}
			}
			if(isprsnt==0) {
				n[i]=x;
				
			}
			
		}
		return n;
	}
	
}
