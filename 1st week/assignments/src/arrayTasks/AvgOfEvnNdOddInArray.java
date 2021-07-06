package arrayTasks;
import java.util.Scanner;
public class AvgOfEvnNdOddInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int oddc=0,evnc=0;
		int evnsum=0,oddsum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evnc+=1;
				evnsum+=arr[i];
			}
			else {
				oddc+=1;
				oddsum+=arr[i];
			}
		}
		System.out.println("Average of Even Numbers in Array:"+ (double)(evnsum/evnc));
		
		System.out.println("\nAverage of Odd Numbers in Array:"+ (double)(oddsum/oddc));

	}

}
