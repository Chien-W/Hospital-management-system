package Hospital;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import permissions.Winpermissions;
import rootman.Winthree;
import rootman.winone;
import rootman.wintwo;

public class rootman {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rootman window = new rootman();
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
	public rootman() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5458\u5DE5\u7BA1\u7406");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示
		
		JButton btnNewButton = new JButton("\u4E2A\u4EBA\u4FE1\u606F\u7BA1\u7406");
		btnNewButton.setBounds(0, 0, 115, 261);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				winone.start();
				frame.dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("\u5DE5\u8D44\u7BA1\u7406");
		btnNewButton_1.setBounds(110, 0, 105, 261);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wintwo.start();
				frame.dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("\u5C97\u4F4D/\u90E8\u95E8\u7BA1\u7406");
		btnNewButton_2.setBounds(213, 0, 120, 261);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Winthree.start();
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u6743\u9650\u7BA1\u7406");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Winpermissions.start();
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(331, 0, 105, 261);
		frame.getContentPane().add(btnNewButton_3);
	}

}
