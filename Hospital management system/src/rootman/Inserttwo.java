package rootman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Inserttwo extends Wininserttwo {
	public static void insert(String Num, String Money) {
		String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";
		String name = "sa"; // 用户名
		String password = "wu123456"; // 密码
		Connection conn;
		PreparedStatement preparedStatement = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // 连接驱动
			conn = DriverManager.getConnection(sql_url, name, password); // 连接数据库
			preparedStatement = conn.prepareStatement("insert into 员工工资信息表 (员工号,工资) values ('" + Num + "','"
					+ Money + "')");
			ResultSet result1 = preparedStatement.executeQuery();
			if (result1.wasNull())
				JOptionPane.showMessageDialog(null, "结果集中无记录");
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
	}
}
