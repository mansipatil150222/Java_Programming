/*Ayesha was assigned a task to store the records of an employee with information such
has employee id, name, age and salary in a table. Using the concept of JDBC, create a
table Employee which consists of the columns as mentioned and store the data collected
through user input within the table.*/
import java.sql.*;
import java.util.*;
public class Program1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	try {
			Connection conn;
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			System.out.println("Connected with database successfully...");
			
			
			DatabaseMetaData db = conn.getMetaData();
			
			ResultSet tables=db.getTables(null,null,"employeeData",null);
			if(tables.next()) {
				System.out.println("Table exist...");
			}
			else {
				Statement st = conn.createStatement();
				String str = "CREATE TABLE employeeData"+"(empId int, "+"empName varchar(200),"+"empAge int,"+ "empSalary int)";
				st.executeUpdate(str);
				System.out.println("Table created successfully...");
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of records you want to enter:");
			int n = sc.nextInt();
			while(n!=0) {
				System.out.println("Enter Employee Id:");
				int id = sc.nextInt();
				
				System.out.println("Enter Employee Name:");
				String name=sc.next();
				
				System.out.println("Enter Employee Age:");
				int age = sc.nextInt();
				
				System.out.println("Enter Employee Salary:");
				int sal = sc.nextInt();
				
				PreparedStatement pst = conn.prepareStatement("insert into employeeData(empId,empName,empAge,empSalary) values(?,?,?,?)");
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setInt(3, age);
				pst.setInt(4, sal);
				pst.executeUpdate();
				System.out.println("Data inserted successfully...");
				n--;
			}
			System.out.println("All Data inserted successfully...");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}
}
