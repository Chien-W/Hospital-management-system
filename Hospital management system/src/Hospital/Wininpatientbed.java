package Hospital;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Inpatient.Changeinpatientbed;
import Inpatient.Deleteinpatientbed;
import Inpatient.Insertpatientbed;
import Inpatient.Selectinpatientbed;
import Inpatient.Showinpatientbed;

public class Wininpatientbed {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wininpatientbed window = new Wininpatientbed();
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
	public Wininpatientbed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5E8A\u4F4D\u7BA1\u7406");
		frame.setBounds(100, 100, 800, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int windowWidth = frame.getWidth(); //��ô��ڿ�
		int windowHeight = frame.getHeight(); //��ô��ڸ�
		Toolkit kit = Toolkit.getDefaultToolkit(); //���幤�߰�
		Dimension screenSize = kit.getScreenSize(); //��ȡ��Ļ�ĳߴ�
		int screenWidth = screenSize.width; //��ȡ��Ļ�Ŀ�
		int screenHeight = screenSize.height; //��ȡ��Ļ�ĸ�
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//���ô��ھ�����ʾ
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 69, 784, 424);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
		textArea.append("���봲λ����ϵͳ\n");
		
		JButton btnNewButton = new JButton("\u589E\u52A0\u5E8A\u4F4D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Insertpatientbed.start();
				textArea.append("���Ӵ�λ��Ϣ�ɹ�\n");
			}
		});
		btnNewButton.setBounds(0, 0, 131, 70);
		
		JButton button = new JButton("\u5220\u9664\u5E8A\u4F4D");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deleteinpatientbed.start();
				textArea.append("ɾ����λ��Ϣ�ɹ�\n");
			}
		});
		button.setBounds(129, 0, 131, 70);
		
		JButton button_1 = new JButton("\u4FEE\u6539\u5E8A\u4F4D\u4FE1\u606F");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeinpatientbed.start();
				textArea.append("�޸Ĵ�λ��Ϣ�ɹ�\n");
			}
		});
		button_1.setBounds(259, 0, 131, 70);
		
		JButton button_2 = new JButton("\u67E5\u8BE2\u5E8A\u4F4D\u4FE1\u606F");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selectinpatientbed.start();
				textArea.append("��ѯ��λ��Ϣ�ɹ�\n");
			}
		});
		button_2.setBounds(389, 0, 131, 70);
		
		JButton button_3 = new JButton("\u663E\u793A\u5E8A\u4F4D\u4FE1\u606F");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Showinpatientbed.start();
				textArea.append("��ʾ��λ��Ϣ�ɹ�\n");
			}
		});
		button_3.setBounds(519, 0, 131, 70);
		
		JButton button_4 = new JButton("\u8FD4\u56DE\u4E3B\u83DC\u5355");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				index.start();
			}
		});
		button_4.setBounds(649, 0, 131, 70);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(button);
		frame.getContentPane().add(button_1);
		frame.getContentPane().add(button_2);
		frame.getContentPane().add(button_3);
		frame.getContentPane().add(button_4);
		
	}
}