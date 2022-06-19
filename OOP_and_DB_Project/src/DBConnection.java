	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

public class DBConnection {

		static Connection conn=null;
		
		static Connection getConnection() {
			
			
			try {
				Class.forName("org.h2.Driver");
				//conn=DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
				conn=DriverManager.getConnection("jdbc:h2:D:\\TestDB;MODE=LEGACY","sa","1234"); //jdbc:h2:./test
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return conn;
		}
	}


