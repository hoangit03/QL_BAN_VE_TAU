package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.BoxLayout;

public class GD_DangNhap extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user;
	private JTextField pass;
	private JButton btndn;
	private JTextField inputUser;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_DangNhap frame = new GD_DangNhap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GD_DangNhap() {
		super("ỨNG DỤNG BÁN VÉ TÀU TẠI ĐẠI LÝ APLUS");
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("D:\\Nam3Ky2\\PTUD\\QL_BAN_VE_TAU\\AppBanVe\\image\\logo.png");
		setIconImage(icon.getImage());
		
		setBounds(100, 100, 724, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(169, 175, 192,200));
		panel.setBounds(46, 69, 307, 354);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(0, 18, 307, 45);
		panel.add(panel_1);
		
		JLabel textDN = new JLabel("ĐĂNG NHẬP");
		textDN.setFont(new Font("Dialog", Font.BOLD, 22));
		panel_1.add(textDN);
		
		JLabel textUser = new JLabel("User");
		textUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textUser.setBounds(50, 93, 33, 16);
		panel.add(textUser);
		
		inputUser = new JTextField();
		inputUser.setBounds(50, 110, 209, 36);
		panel.add(inputUser);
		inputUser.setColumns(10);
		
		JLabel textPass = new JLabel("Password");
		textPass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPass.setBounds(50, 159, 69, 16);
		panel.add(textPass);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(50, 175, 209, 36);
		panel.add(textField);
		
		JButton btnDN = new JButton("Đăng nhập");
		btnDN.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDN.setForeground(new Color(255, 255, 255));
		btnDN.setBackground(new Color(0, 255, 128));
		btnDN.setBounds(94, 283, 124, 45);
		btnDN.setBorder(null);
		panel.add(btnDN);
		
		JButton btnSetPass = new JButton("Quên mật khẩu");
		btnSetPass.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnSetPass.setBounds(162, 213, 97, 22);
		panel.add(btnSetPass);
		btnSetPass.setBackground(new Color(0,0,0,0));
		btnSetPass.setBorder(null);
		btnSetPass.setOpaque(false);
//		Box boxdn = Box.createVerticalBox();
		
//		
//		JLabel textDN = new JLabel("ĐĂNG NHẬP");
//		textDN.setFont(new Font("Dialog", Font.BOLD, 22));
//		textDN.setForeground(new Color(255, 255, 255));
//		textDN.setLabelFor(this);
//		panel.add(boxdn);
//		boxdn.add(textDN);
//		boxdn.add(Box.createVerticalStrut(50));
//		
//		JPanel panelup = new JPanel();
//		panelup.setOpaque(false);
//		boxdn.add(panelup);
//		
//		Box up = Box.createVerticalBox();
//		panelup.add(up);
//		
////		box User
//		Box u = Box.createVerticalBox();
//		up.add(u);
//		u.add(new JLabel("User"));
//		u.add(user = new JTextField(20));
//		
//		up.add(Box.createVerticalStrut(40));
//		
////		box pass
//		Box p = Box.createVerticalBox();
//		up.add(p);
//		p.add(new JLabel("Password"));
//		p.add(pass = new JTextField(20));
//		
//		JPanel jbtndn = new JPanel();
//		jbtndn.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//		jbtndn.setOpaque(false);
//		jbtndn.add(btndn = new JButton("Đăng nhập"));
//		btndn.setBackground(new Color(5, 114, 243));
////		btndn.setBackground(new Color(5, 114, 243));
//		btndn.setForeground(new Color(18, 243, 59));
//		btndn.setBorder(null);
//		boxdn.add(Box.createVerticalStrut(50));
//		boxdn.add(jbtndn);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-93, -81, 1000, 600);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("D:\\Nam3Ky2\\PTUD\\QL_BAN_VE_TAU\\AppBanVe\\image\\kk.jpg"));
		
		
	}
}
