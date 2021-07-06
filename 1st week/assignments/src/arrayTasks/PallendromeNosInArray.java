package arrayTasks;
import java.util.Scanner;

public class PallendromeNosInArray {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		if(isPallendrome(arr[i])) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
   }
   public static int reverse(int num) {
	   int rev=0;
	   while(num!=0) {
		   rev=rev*10+(num%10);
		   num=num/10;
	   }
	   return rev;
   }
   public static boolean isPallendrome(int no) {
	   return reverse(no)==no;
   }
   public static boolean isPallendrome(String s) {
	   StringBuilder sb=new StringBuilder(s);
	   sb.reverse();
	   return sb.toString().equals(s);
   }
}
