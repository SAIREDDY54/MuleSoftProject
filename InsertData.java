import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:product:db");
		Scanner sc=new Scanner(System.in);
		String sql="insert into movie values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.print("Enter your ID");
		int id=sc.nextInt();
		System.out.print("Enter Movie name ");
		String mname=sc.next();
		System.out.print("Lead Actor is");
		String lac=sc.next();
		System.out.print("Actress");
		String act=sc.next();
		System.out.print("Year of Direction");
		int yr=sc.nextInt();
		System.out.print("Director Name");
		String dname=sc.next();
		ps.setInt(1, id);
		ps.setString(2, mname);
		ps.setString(3, lac);
		ps.setString(4, act);
		ps.setInt(5, yr);
		ps.setString(6, dname);
		ps.executeUpdate();
		System.out.print("Data Inserted");
		sc.close();

	}

}
