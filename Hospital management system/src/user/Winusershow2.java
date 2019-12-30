package user;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import rootman.Selecttwo;

public class Winusershow2 {
	static String username;
	public static void getname(String s) {
		username=s;
	}

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Winusershow2 window = new Winusershow2();
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
	public Winusershow2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4E2A\u4EBA\u5DE5\u8D44\u67E5\u8BE2");
		frame.setBounds(100, 100, 800, 520);
		
		int windowWidth = frame.getWidth(); //��ô��ڿ�
		int windowHeight = frame.getHeight(); //��ô��ڸ�
		Toolkit kit = Toolkit.getDefaultToolkit(); //���幤�߰�
		Dimension screenSize = kit.getScreenSize(); //��ȡ��Ļ�ĳߴ�
		int screenWidth = screenSize.width; //��ȡ��Ļ�Ŀ�
		int screenHeight = screenSize.height; //��ȡ��Ļ�ĸ�
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
		
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(-1, 0, 789, 483);
		frame.getContentPane().add(scrollPane);
		
		String[] dataTitle =Selecttwo.getHead();
		table = new JTable();
		scrollPane.setViewportView(table);
		String[][] data=Selecttwo.getnumber(username);
		table = new JTable(data,dataTitle);
		table.setFont(new Font("����", Font.PLAIN, 18));
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		table.setEnabled(false);


	}

}