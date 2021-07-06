package stringTask;

public class ConvertingLastChrOfWordToUpper {
    public static void main(String[] args) {
    	
    	String s="hello hi good evening everyone hope you are enjoying progamming with java";
    	String res=convertingLastCharOfEveryWordUpper(s);
    	System.out.println(res);
    }
    
    public static String convertingLastCharOfEveryWordUpper(String s) {
		StringBuilder sb=new StringBuilder();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			
			int len=str[i].length();
			char c=str[i].charAt(len-1);
			sb.append(str[i].substring(0,len-1)).append(Character.toUpperCase(c)).append(" ");
			
			
		}
		return sb.toString().trim();
	}
}
