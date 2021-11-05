import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BasedOnActorName {

	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:product:db");
		String sql="select * from movie where actor=?";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Actor Name");
		String nn=sc.next();
		ps.setString(1, nn);
		ResultSet rs=ps.executeQuery();
		System.out.print("Nd the Movie Name is : ");
		while(rs.next())
		{
			System.out.print(rs.getString(2));
		}
		sc.close();

	}

}
