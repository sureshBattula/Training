package operators;
import java.util.Scanner;
public class simpleCalculator {
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1+"+"+num2+" = "+add(num1,num2));
		System.out.println(num1+"-"+num2+" = "+diff(num1,num2));
		System.out.println(num1+"*"+num2+" = "+product(num1,num2));
		System.out.println(num1+"/"+num2+" = "+div(num1,num2));
		sc.close();

	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int diff(int a,int b) {
		return a-b;
	}
	public static int product(int a,int b) {
		return a*b;
	}
	public static double div(int a,int b) {
		return (double)a/b;
	}
}
