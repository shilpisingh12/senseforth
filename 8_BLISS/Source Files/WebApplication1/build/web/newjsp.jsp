import java.sql.*;
import java.util.*;
class newjsp
{
public void get_data()
{
try
{
System.out.println("OK");
Class.forName("com.mysql.jdbc.Driver");    

	 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp1");
while(rs.next())
{
System.out.println(rs.getString(1)+"\t"+rs.getString(2));
}
conn.close();
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
public static void main(String args[])
{

newjsp e=new newjsp();
 e.get_data();
}

}