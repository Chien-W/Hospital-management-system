package jobs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Changejobs {
	public static void change(String S,String Num, String Name) {
	String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";	
	String name = "sa";		//�û���
	String password = "wu123456";	//����
	Connection conn;
	PreparedStatement preparedStatement = null;
	
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		//��������
	conn = DriverManager.getConnection(sql_url, name, password);	//�������ݿ�
	preparedStatement = conn.prepareStatement("update ������λ����� set ������λ���� = '"+Num+"', ������λ���� ='"+Name+"' where ������λ���� = '"+S+"'");
	ResultSet result1 = preparedStatement.executeQuery();
	if(result1.wasNull())
		JOptionPane.showMessageDialog(null, "��������޼�¼");
	} catch (ClassNotFoundException e) {
	} catch (SQLException e) {
	}
	}
}