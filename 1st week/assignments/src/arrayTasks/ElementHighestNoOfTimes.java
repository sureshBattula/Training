package arrayTasks;
import java.util.*;
public class ElementHighestNoOfTimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int element = 0, max_count=1, count=1;
		for(int i=1; i<arr.length; i++){
	           
            if(arr[i] == arr[i-1])
                count++;
            else{
         
                if(count>max_count){
             
                    max_count = count;
                    element = arr[i-1];
                } 
        
                count =1;
            }
        }
        
       
        System.out.println(element+": "+max_count);    
    }

	}


