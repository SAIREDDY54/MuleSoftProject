import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreationOfTable {

	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:product:db");
		String sql="create table movie(id int primary key,name text,actor text,actress text,year int, dname text) ";
		Statement s=con.createStatement();
		s.execute(sql);
		System.out.print("Table Created");

	}

}
