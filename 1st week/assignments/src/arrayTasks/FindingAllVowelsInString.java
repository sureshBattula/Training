package arrayTasks;
import java.util.Scanner;
public class FindingAllVowelsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		System.out.println(removeDupChar(str));
		if(areAllVowelsInString(str)) {
			System.out.println("All the vowels are present in given string");
		}else {
			System.out.println("The given String contains only "+countOfVowels(str)+" vowels");
		}
		

	}
	public static String removeDupChar(String s) {
		String s2="";
		String s1=s.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(!s2.contains(c+"")) {
				s2+=c;
			}
		}
		return s2;
	}
	public static boolean isVowel(char c) {
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}
	public static int countOfVowels(String s1) {
		String s2=removeDupChar(s1);
	
		int count=0;
	    for(int i=0;i<s2.length();i++) {
	    	char c=s2.charAt(i);
	    	if(isVowel(c)) {
	    		count+=1;
	    	}
	    }
	    return count;
	}
	public static boolean areAllVowelsInString(String s1) {
		return countOfVowels(s1)==5;
	}

}
