package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class GD_Chinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel taskBar;
	private JPanel taskHandle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GD_Chinh frame = new GD_Chinh();
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
	public GD_Chinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		getContentPane().setLayout(null);
		JPanel jpGD = new JPanel();
		jpGD.setBounds(0, 0, 434, 261);
		getContentPane().add(jpGD);
		jpGD.setPreferredSize(new Dimension(2147483647, 2147483647));
		
//		TaskBar gồm quản lý vé, quản lý khách hàng, tra cưu, quản lý nhân viên, quản lý khuyến mãi, thống kê
		taskBar = new JPanel();
		jpGD.add(taskBar);
		taskBar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		Box boxTaskBar = Box.createVerticalBox();
		taskBar.add(boxTaskBar);
		
		
		
		
		
		
		
		
		taskHandle = new JPanel();
		jpGD.add(taskHandle);
		
		
		
		
		
		
		
	}
}
