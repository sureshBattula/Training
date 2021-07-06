package arrayTasks;
import java.util.Scanner;
public class AreAllVowelsInOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(removeDup(s));
		if(areVowelsInSeq(s)) {
			System.out.println("vowels are in order");
		}
		else {
			System.out.println("Not in order");
		}
		

	}
	public static String removeDup(String gs) {
		String str=gs.toLowerCase();
		String s="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!s.contains(c+"")) {
				s=s+c;
			}
		}
		return s;
		
	}
	public static boolean isVowel(char c) {
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
		
	}
	public static boolean areVowelsInSeq(String st) {
		String s="";
		String str=removeDup(st);
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(isVowel(c)) {
				s+=c;
			}
		}
		String res= s.replace(" ", "");
		
		return res.equals("aeiou");
	}

}
