package Inpatient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Insert2 extends Insertinpatient {
	public static void insert(String Name, String Sex, String Time, String Department, String Condition, String Doctor, String Room, String Bed) {
		String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";
		String name = "sa"; // �û���
		String password = "wu123456"; // ����
		Connection conn;
		PreparedStatement preparedStatement = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // ��������
			conn = DriverManager.getConnection(sql_url, name, password); // �������ݿ�
			preparedStatement = conn.prepareStatement("insert into ������Ϣ�� (��������,�����Ա�,��Ժʱ��,������������,����״��,��������ҽ��,���˷����,���˴�λ��) values ('" + Name + "','"
					+ Sex + "','" + Time + "','" + Department + "','" + Condition +"','"+ Doctor +"','"+ Room +"','"+ Bed + "')");
			ResultSet result1 = preparedStatement.executeQuery();
			if (result1.wasNull())
				JOptionPane.showMessageDialog(null, "��������޼�¼");
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
	
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		//��������
			conn = DriverManager.getConnection(sql_url, name, password);	//�������ݿ�
			preparedStatement = conn.prepareStatement("update ��λ��Ϣ�� set ��λ�� = '"+Bed+"', ��λ״̬ ='����' where ��λ�� = '"+Bed+"'");
			ResultSet result1 = preparedStatement.executeQuery();
			if(result1.wasNull())
				JOptionPane.showMessageDialog(null, "��������޼�¼");
			} catch (ClassNotFoundException e) {
			} catch (SQLException e) {
			}
	}
}