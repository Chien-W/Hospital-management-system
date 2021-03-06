package Inpatient;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Selectinpatient {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selectinpatient window = new Selectinpatient();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Selectinpatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u75C5\u4EBA\u7BA1\u7406");
		frame.setBounds(100, 100, 800, 520);
		
		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
		
		JLabel label = new JLabel("\u4F60\u60F3\u67E5\u8BE2\uFF1A");
		label.setBounds(15, 39, 140, 37);
		label.setFont(new Font("宋体", Font.PLAIN, 25));
		
		textField = new JTextField();
		textField.setBounds(140, 41, 164, 27);
		textField.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(305, 41, 114, 27);
		comboBox.addItem("病人姓名");
		comboBox.addItem("病人性别");
		comboBox.addItem("病人所属科室");
		comboBox.addItem("病人主治医生");
		comboBox.addItem("病人房间号");
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(label);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(comboBox);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "查询成功!");
			}
		});
		
		button.setBounds(526, 33, 95, 35);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		button_1.setBounds(636, 32, 95, 35);
		frame.getContentPane().add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(-1, 81, 789, 402);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String content = textField.getText();
				String[] dataTitle =Select2.getHead();
				if(comboBox.getSelectedIndex() == 0)
				{
				//	System.out.println(content);
					String[][] data=Select2.getnumber(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
				else if(comboBox.getSelectedIndex() == 1)
				{
				//	System.out.println(content);
					String[][] data=Select2.getname(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
				else if(comboBox.getSelectedIndex() == 2)
				{
				//	System.out.println(content);
					String[][] data=Select2.getage(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
				else if(comboBox.getSelectedIndex() == 3)
				{
				//	System.out.println(content);
					String[][] data=Select2.getsex(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
				else if(comboBox.getSelectedIndex() == 4)
				{
				//	System.out.println(content);
					String[][] data=Select2.getdepartments(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
			}
		});

		
	}

}
