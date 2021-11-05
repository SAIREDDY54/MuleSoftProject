import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:product:db");
		String sql="select * from movie";
		Statement ss=con.createStatement();
		ResultSet rs=ss.executeQuery(sql);
		System.out.println("Id		MovieName		LeadActor		Actress			Year			Director");
		System.out.println("--		---------		---------		-------			-----			---------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"		"+rs.getString(2)+"			"+rs.getString(3)+"			"+rs.getString(4)+"			"+
		rs.getInt(5)+"			"+rs.getString(6));
		}
	}

}
