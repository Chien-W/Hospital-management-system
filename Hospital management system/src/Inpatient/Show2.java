package Inpatient;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

public class Show2 extends Showinpatient {

	static int max=500;
	public static String[][] getRows(){
		String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";	//���ݿ�·����һ�㶼������д����test�����ݿ�����
		String name = "sa";		//�û���
		String password = "wu123456";	//����
		Connection conn;
		PreparedStatement preparedStatement = null;
 
		String[][] rows = null;
		
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		//��������
			conn = DriverManager.getConnection(sql_url, name, password);	//�������ݿ�
			preparedStatement = conn.prepareStatement("select * from ������Ϣ��");
			ResultSet result1 = preparedStatement.executeQuery();
			
			if(result1.wasNull())
				JOptionPane.showMessageDialog(null, "��������޼�¼");
			
			rows = new String[max][8];
			String[] s = null;
			s = new String[8];
			ResultSetMetaData rsmd = result1.getMetaData();
			int i=0;
			while(result1.next()){
				s=getNextRow(result1,rsmd);
				for(int p=0;p<8;p++)
				{
					rows[i][p]=s[p].trim();
				}
				i++;
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
		return rows;
	}
	
	// �õ����ݿ��ͷ
	public static String[] getHead(){
		String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital table";	//���ݿ�·����һ�㶼������д����test�����ݿ�����
		String name = "sa";		//�û���
		String password = "wu123456";	//����
		Connection conn;
		PreparedStatement preparedStatement = null;
 
		String[] columnHeads = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		//��������
			conn = DriverManager.getConnection(sql_url, name, password);	//�������ݿ�
//			if(!conn.isClosed())
//				System.out.println("�ɹ��������ݿ�");
			preparedStatement = conn.prepareStatement("select * from ������Ϣ��");
			ResultSet result1 = preparedStatement.executeQuery();
			
			boolean moreRecords = result1.next();
			if(!moreRecords)
				JOptionPane.showMessageDialog(null, "��������޼�¼");
			
			columnHeads = new String[8];
			ResultSetMetaData rsmd = result1.getMetaData();
			for(int i = 1; i <= rsmd.getColumnCount(); i++)
				columnHeads[i-1]=rsmd.getColumnName(i).trim();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("δ�ɹ�����������");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("δ�ɹ������ݿ⡣");
			e.printStackTrace();
		}
		return columnHeads;
	}
	
	// �õ����ݿ�����һ������
	private static String[] getNextRow(ResultSet rs,ResultSetMetaData rsmd) throws SQLException{
		String[] currentRow = null;
		currentRow = new String[8];
		for(int i = 1; i <= rsmd.getColumnCount(); i++){
			{
				currentRow[i-1]=rs.getString(i).trim();
				//System.out.println(currentRow[i-1]+" "+(i-1));
			}
		}
		return currentRow;
	}
	

}
