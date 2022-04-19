/*Create table Result which stores marks of students.
Result (rollno,name,Sub1,Sub2,Sub3,Percentage)
Write JDBC Program which take rollno from user and print marksheet of student.*/
import java.sql.*;
import java.util.*;
public class Program2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		try {
			Connection conn;
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			System.out.println("Connected with database successfully...");
			int n;
			Scanner sc = new Scanner(System.in);
			DatabaseMetaData dbm = conn.getMetaData();
			ResultSet tables = dbm.getTables(null, null, "resultData", null);
			if (tables.next()) 
			{
				System.out.println("Table aready exist");
			}
			else
			{
				Statement st1 = conn.createStatement();
				String str = "CREATE TABLE resultData"+"(RollNo int, " +"Name varchar(255)," +"sub1 int,"+"sub2 int,"+"sub3 int,"+"Percentage double )"; 
					
				st1.executeUpdate(str);
				System.out.println("Result table is created");
			}
			
			System.out.print("Enter the number students you want to add marks: ");
			n = sc.nextInt();
			while(n != 0){
				System.out.print("Enter the roll no: ");
				int roll = sc.nextInt();
					
				System.out.print("Enter the name: ");
				String name = sc.next();
					
				System.out.print("Enter the marks of sub1: ");
				int sub1 = sc.nextInt();
					
				System.out.print("Enter the marks of sub2: ");
				int sub2 = sc.nextInt();
					
				System.out.print("Enter the marks of sub3: ");
				int sub3 = sc.nextInt();
				
				double percentage = (double)(sub1 + sub2 + sub3)/3;
				
				PreparedStatement st2 = conn.prepareStatement("insert into resultData(RollNo, Name, sub1, sub2, sub3, Percentage) values(?, ?, ?, ?, ?, ?)");
				st2.setInt(1, roll);
				st2.setString(2, name);
				st2.setInt(3, sub1);
				st2.setInt(4, sub2);
				st2.setInt(5, sub3);
				st2.setDouble(6, percentage);
				st2.executeUpdate();
				System.out.println("Successfully inserted");
				System.out.println();
				n--;
			}		
			System.out.print("Enter the rollno for getting marksheet: ");
			int roll = sc.nextInt();
			sc.close();
			
			PreparedStatement st3 = conn.prepareStatement("select * from resultData where RollNo = ?");
			st3.setInt(1, roll);
			ResultSet marksheet = st3.executeQuery();
			
			while(marksheet.next())
			{
				System.out.println("Roll no: " + marksheet.getInt("RollNo"));
				System.out.println("Name: " + marksheet.getString("Name"));
				System.out.println("sub1 marks: " + marksheet.getInt("sub1"));
				System.out.println("sub2 marks: " + marksheet.getInt("sub2"));
				System.out.println("sub3 marks: " + marksheet.getInt("sub3"));
				System.out.println("Percentage: " + marksheet.getDouble("Percentage"));
			}
			conn.close();
		}
		catch(Exception e) {}
		
	}
}
