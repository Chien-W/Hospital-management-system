package Inpatient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Change2 extends Changeinpatient {
	
	public static void change(String Name, String Sex, String Time, String Department, String Condition, String Doctor, String Room, String Bed,String S) {
	String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";	
	String name = "sa";		//�û���
	String password = "wu123456";	//����
	Connection conn;
	PreparedStatement preparedStatement = null;
	
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		//��������
	conn = DriverManager.getConnection(sql_url, name, password);	//�������ݿ�
	preparedStatement = conn.prepareStatement("update ������Ϣ�� set �������� = '"+Name+"', �����Ա� ='"+Sex+"', ��Ժʱ��='"+Time+"',������������='"+Department+"',����״��='"+Condition+"',��������ҽ��='"+Doctor+"',���˷����='"+Room+"',���˴�λ��='"+Bed+"' where �������� = '"+S+"'");
	ResultSet result1 = preparedStatement.executeQuery();
	if(result1.wasNull())
		JOptionPane.showMessageDialog(null, "��������޼�¼");
	} catch (ClassNotFoundException e) {
	} catch (SQLException e) {
	}
	}
}