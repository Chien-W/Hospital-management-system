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
		String name = "sa"; // �û���
		String password = "wu123456"; // ����
		Connection conn;
		PreparedStatement preparedStatement = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // ��������
			conn = DriverManager.getConnection(sql_url, name, password); // �������ݿ�
			preparedStatement = conn.prepareStatement("insert into ϵͳ���û������ (�û���,����,Ȩ��) values ('" + Num + "','"
					+ Name + "','" + root +"')");
			ResultSet result1 = preparedStatement.executeQuery();
			if (result1.wasNull())
				JOptionPane.showMessageDialog(null, "��������޼�¼");
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
	}
}