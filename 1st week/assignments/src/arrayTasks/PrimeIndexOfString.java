// * 			4)Find the characters of a string which are in prime index position and print them in uppercase(remove spaces) Eg ->helllo  ->11o->LLO

package arrayTasks;
import java.util.Scanner;
public class PrimeIndexOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(PrimeIndexUpperCase(str));
		
		

	}
	public static boolean isPrime(int no) {
		int count=0;
		for(int i=1;i<=Math.sqrt(no);i++) {
			if(no%i==0) {
				if(i==no/i) {
					count=count+1;
				}
				else {
					count=count+2;
				}
			}
		}
		return count==2;
	}
	public static String PrimeIndexUpperCase(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			if(isPrime(i)) {
				s+=str.charAt(i);
			}
		}
		return s.toUpperCase();
		
	}

}
