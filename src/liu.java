
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class liu {
	public void lianjie(String userName, String password) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/yonghudb","root","admin");
			System.out.print("��ӳɹ�");
			Statement sta = (Statement) con.createStatement();
			

			System.out.print(userName);
			int n = ((java.sql.Statement) sta)
					.executeUpdate("insert into values ( '" + userName + "', '"+ password + "') ");
			System.out.print(userName);
			if (n > 0) {
				System.out.print("��ӳɹ�");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.print("û�ҵ�");
		} catch (SQLException sqle) {
			System.out.print("����ʧ��");

		}
	}
}