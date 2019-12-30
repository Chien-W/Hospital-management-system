package Instrument;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Change1 extends Changeinstrument {
	
	public static void change(String S,String Num, String Name, String Price, String Quantity, String Note) {
	String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";	
	String name = "sa";		//用户名
	String password = "wu123456";	//密码
	Connection conn;
	PreparedStatement preparedStatement = null;
	
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		//连接驱动
	conn = DriverManager.getConnection(sql_url, name, password);	//连接数据库
	preparedStatement = conn.prepareStatement("update 医疗仪器信息表 set 仪器代号 = '"+Num+"', 仪器名称 ='"+Name+"', 仪器价格='"+Price+"',仪器数量='"+Quantity+"',备注='"+Note+"' where 仪器代号 = '"+S+"'");
	ResultSet result1 = preparedStatement.executeQuery();
	if(result1.wasNull())
		JOptionPane.showMessageDialog(null, "结果集中无记录");
	} catch (ClassNotFoundException e) {
	} catch (SQLException e) {
	}
	}
}
