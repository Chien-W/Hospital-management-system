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
	String name = "sa";		//用户名
	String password = "wu123456";	//密码
	Connection conn;
	PreparedStatement preparedStatement = null;
	
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		//连接驱动
	conn = DriverManager.getConnection(sql_url, name, password);	//连接数据库
	preparedStatement = conn.prepareStatement("update 员工基本状况表 set 员工号 = '"+a0+"', 员工姓名 ='"+a1+"', 所在的部门号='"+a2+"',"
			+ "职务='"+a3+"',学历='"+a4+"', 性别 ='"+a5+"', 生日 ='"+a6+"', 籍贯 ='"+a7+"', 国籍 ='"+a8+"', 民族 ='"+a9+"'"
					+ ", 身份证号 ='"+a10+"', 婚姻状况 ='"+a11+"', 健康状况 ='"+a12+"', 参加工作时间 ='"+a13+"', 员工状态 ='"+a14+"'"
							+ ", 家庭住址 ='"+a15+"', 联系电话 ='"+a16+"', 联系Email地址 ='"+a17+"', 工作岗位代号 ='"+a18+"' where 员工号 = '"+S+"'");
	ResultSet result1 = preparedStatement.executeQuery();
	if(result1.wasNull())
		JOptionPane.showMessageDialog(null, "结果集中无记录");
	} catch (ClassNotFoundException e) {
	} catch (SQLException e) {
	}
	}
}