package permissions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Insertpermission extends Wininsertpermission {
	public static void insert(String Num, String Name, String root) {
		String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";
		String name = "sa"; // 用户名
		String password = "wu123456"; // 密码
		Connection conn;
		PreparedStatement preparedStatement = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // 连接驱动
			conn = DriverManager.getConnection(sql_url, name, password); // 连接数据库
			preparedStatement = conn.prepareStatement("insert into 系统的用户口令表 (用户名,口令,权限) values ('" + Num + "','"
					+ Name + "','" + root +"')");
			ResultSet result1 = preparedStatement.executeQuery();
			if (result1.wasNull())
				JOptionPane.showMessageDialog(null, "结果集中无记录");
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
	}
}
