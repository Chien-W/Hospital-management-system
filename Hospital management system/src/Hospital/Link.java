package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Link extends Login {
	Connection connection = null;
	public Link() throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
		// ��������DriverManager��ͼ����ע���JDBC����������ѡ��һ���ʵ�����������
		// sqlserver ���ݿ� url
		String urlSqlServer = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";
		// sqlserver ���ݿ�
		@SuppressWarnings("unused")
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(urlSqlServer, "sa", "wu123456");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("sqlserver ���ݿ��������سɹ�");
	}
	
	public static int identify(String username,String userpsd) {
		String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";	//���ݿ�·����һ�㶼������д����test�����ݿ�����
		String name = "sa";		//�û���
		String password = "wu123456";	//����
		PreparedStatement preparedStatement = null;	
		Connection conn;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn = DriverManager.getConnection(sql_url, name, password);
		preparedStatement = conn.prepareStatement("select * from ϵͳ���û������");
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				String username1=rs.getString(1).trim();
				String userpsd1=rs.getString(2).trim();
				String root=rs.getString(3).trim();
				if(username.equals(username1)&&userpsd.equals(userpsd1)&&root.equals("root")) {
					return 1;
				}
				if(username.equals(username1)&&userpsd.equals(userpsd1)&&root.equals("user")) {
					return 2;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("δ�ɹ�����������");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("δ�ɹ������ݿ⡣");
			e.printStackTrace();
		}
		return 0;
	}

}