package rootman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Insertone extends Wininsertone {
	public static void insert(String a0, String a1, String a2, String a3, String a4, String a5
			, String a6, String a7, String a8, String a9, String a10, String a11, String a12
			, String a13, String a14, String a15, String a16, String a17, String a18) {
		String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";
		String name = "sa"; // �û���
		String password = "wu123456"; // ����
		Connection conn;
		PreparedStatement preparedStatement = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // ��������
			conn = DriverManager.getConnection(sql_url, name, password); // �������ݿ�
			preparedStatement = conn.prepareStatement("insert into Ա������״���� (Ա����,Ա������,���ڵĲ��ź�,ְ��,ѧ��,"
					+ "�Ա�,����,����,����,����,����֤��,����״��,����״��,�μӹ���ʱ��,Ա��״̬,��ͥסַ,��ϵ�绰,��ϵEmail��ַ,������λ����)"
					+ " values ('" + a0 + "','"+ a1 + "','" + a2 + "','" + a3 + "','" + a4 + "','"+ a5 + "','" + a6 + "','"
					+ a7 + "','"+ a8 + "','" + a9 + "','"+ a10 + "','" + a11 + "','" + a12 + "','" + a13 + "','"+ a14 + "','" 
					+ a15 + "','"+ a16 + "','"+ a17 + "','"   + a18 + "')");
			ResultSet result1 = preparedStatement.executeQuery();
			if (result1.wasNull())
				JOptionPane.showMessageDialog(null, "��������޼�¼");
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
	}
}