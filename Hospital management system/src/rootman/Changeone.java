package rootman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Changeone extends Winchangeone {
	
	public static void change(String S,String a0, String a1, String a2, String a3, String a4, String a5
			, String a6, String a7, String a8, String a9, String a10, String a11, String a12
			, String a13, String a14, String a15, String a16, String a17, String a18) {
	String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";	
	String name = "sa";		//�û���
	String password = "wu123456";	//����
	Connection conn;
	PreparedStatement preparedStatement = null;
	
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		//��������
	conn = DriverManager.getConnection(sql_url, name, password);	//�������ݿ�
	preparedStatement = conn.prepareStatement("update Ա������״���� set Ա���� = '"+a0+"', Ա������ ='"+a1+"', ���ڵĲ��ź�='"+a2+"',"
			+ "ְ��='"+a3+"',ѧ��='"+a4+"', �Ա� ='"+a5+"', ���� ='"+a6+"', ���� ='"+a7+"', ���� ='"+a8+"', ���� ='"+a9+"'"
					+ ", ���֤�� ='"+a10+"', ����״�� ='"+a11+"', ����״�� ='"+a12+"', �μӹ���ʱ�� ='"+a13+"', Ա��״̬ ='"+a14+"'"
							+ ", ��ͥסַ ='"+a15+"', ��ϵ�绰 ='"+a16+"', ��ϵEmail��ַ ='"+a17+"', ������λ���� ='"+a18+"' where Ա���� = '"+S+"'");
	ResultSet result1 = preparedStatement.executeQuery();
	if(result1.wasNull())
		JOptionPane.showMessageDialog(null, "��������޼�¼");
	} catch (ClassNotFoundException e) {
	} catch (SQLException e) {
	}
	}
}