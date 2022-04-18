/*Write a java program which read numbers from number.txt file and store even number to
even.txt and odd number into odd.txt file*/
import java.io.*;
public class Program1 {
	public static void main(String[] args) {
		try {
			FileReader f1 = new FileReader("C:\\Users\\150222\\Desktop\\numbers.txt");	
			FileWriter fie= new FileWriter("C:\\Users\\150222\\Desktop\\even.txt");
			FileWriter fio= new FileWriter("C:\\Users\\150222\\Desktop\\odd.txt");
			
			int i=0;
			while((i=f1.read())!=-1) {
				if(i%2==0) {
					fie.write(i);
				}
				else {
					fio.write(i);
				}
			}
			fie.close();
			fio.close();
			System.out.println("Odd and Even numbers are printerd in a File...");
		}
		catch(Exception e) {
			
		}
	}
}
