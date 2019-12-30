package rootman;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wininserttwo {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wininserttwo window = new Wininserttwo();
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
	public Wininserttwo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5458\u5DE5\u7BA1\u7406");
		frame.setBounds(100, 100, 870, 520);
		
		int windowWidth = frame.getWidth(); //��ô��ڿ�
		int windowHeight = frame.getHeight(); //��ô��ڸ�
		Toolkit kit = Toolkit.getDefaultToolkit(); //���幤�߰�
		Dimension screenSize = kit.getScreenSize(); //��ȡ��Ļ�ĳߴ�
		int screenWidth = screenSize.width; //��ȡ��Ļ�Ŀ�
		int screenHeight = screenSize.height; //��ȡ��Ļ�ĸ�
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
		
		JLabel label = new JLabel("\u4F60\u9700\u8981\u589E\u52A0\u7684\u5458\u5DE5\u5DE5\u8D44\u4FE1\u606F\uFF1A");
		label.setBounds(10, 10, 506, 115);
		label.setFont(new Font("����", Font.PLAIN, 30));
		
		JLabel label_1 = new JLabel("\u5458\u5DE5\u53F7\uFF1A");
		label_1.setBounds(13, 147, 130, 75);
		label_1.setFont(new Font("����", Font.PLAIN, 28));
		
		JLabel label_2 = new JLabel("\u5DE5\u8D44\uFF1A");
		label_2.setBounds(18, 268, 89, 75);
		label_2.setFont(new Font("����", Font.PLAIN, 28));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(label);
		frame.getContentPane().add(label_1);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBounds(139, 169, 185, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 296, 185, 28);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num = textField.getText();
				String Money = textField_1.getText();
				Inserttwo.insert(Num, Money);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(548, 385, 116, 70);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u91CD\u7F6E");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		button.setBounds(700, 385, 116, 70);
		frame.getContentPane().add(button);
	}

}