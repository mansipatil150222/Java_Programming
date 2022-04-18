/*Write a java program which read numbers from number.txt file and store even number to
even.txt and odd number into odd.txt file*/
import java.util.*;
import java.io.*;
public class Program2 {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			int counter=0;
			FileReader f1 = new FileReader("C:\\Users\\150222\\Desktop\\data.txt");
			
			System.out.println("Enter word you want to relace:");
			String word1 =sc.nextLine();
			
			System.out.println("Enter word you want with relace:");
			String word2 =sc.nextLine();
			
			String msg="";
			Scanner b1 = new Scanner(f1);
		    while(b1.hasNext()){
	            msg += b1.next()+" ";
	        }
		    System.out.println("File Before Replace word:"+msg);
		    Scanner b2 = new Scanner(msg);
		    String msg1;
		    while(b2.hasNext()){
	            msg1 = b2.next();
	            if(msg1.equals(word1)) {
	            	counter++;
	            }
	        }
		    msg = msg.replace(word1,word2);
		    f1.close();
		    System.out.println("Total Replaced word:"+counter);
		    System.out.println("File After Replace word:"+msg);
		    sc.close();
		    b1.close();
		    b2.close();
		}
		catch(Exception e) {
			
		}
	}
}
