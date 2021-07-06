package arrayTasks;

import java.util.Scanner;
public class PrimeNosInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}

	}
	public static int factors(int num) {
		int count=0;
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				if(i==num/i) {
					count+=1;
				}
				else {
					count+=2;
				}
			}
		}
		return count;
	}
	public static boolean isPrime(int num) {
		return factors(num)==2;
	}

}
