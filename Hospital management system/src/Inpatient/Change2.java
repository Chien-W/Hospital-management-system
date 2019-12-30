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
	String name = "sa";		//用户名
	String password = "wu123456";	//密码
	Connection conn;
	PreparedStatement preparedStatement = null;
	
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		//连接驱动
	conn = DriverManager.getConnection(sql_url, name, password);	//连接数据库
	preparedStatement = conn.prepareStatement("update 病人信息表 set 病人姓名 = '"+Name+"', 病人性别 ='"+Sex+"', 入院时间='"+Time+"',病人所属科室='"+Department+"',病人状况='"+Condition+"',病人主治医生='"+Doctor+"',病人房间号='"+Room+"',病人床位号='"+Bed+"' where 病人姓名 = '"+S+"'");
	ResultSet result1 = preparedStatement.executeQuery();
	if(result1.wasNull())
		JOptionPane.showMessageDialog(null, "结果集中无记录");
	} catch (ClassNotFoundException e) {
	} catch (SQLException e) {
	}
	}
}
