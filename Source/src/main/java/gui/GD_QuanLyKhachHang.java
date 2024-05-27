/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.KhachHangDao;
import entity.KhachHang;
import jakarta.persistence.EntityManagerFactory;
import swing.ScrollBar;

/**
 *
 * @author HOANG
 */
public class GD_QuanLyKhachHang extends javax.swing.JPanel {

	/**
	 * Creates new form GD_QuanLyKhachHang
	 */
	private EntityManagerFactory emf;
	private KhachHangDao khachHangDao;

	public GD_QuanLyKhachHang(EntityManagerFactory emf) {
		this.emf = emf;
		initComponents();

		table.setShowGrid(false);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
		table.getTableHeader().setPreferredSize(new Dimension(30, 30));
		scroll.setVerticalScrollBar(new ScrollBar());
		jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
				"Thông tin khách hàng", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.BOLD, 20) {
				}, Color.WHITE));
		((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

		khachHangDao = new KhachHangDao(emf);
		List<KhachHang> list = khachHangDao.getAllKhachHang();
		addDataTable(list);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbCCCD = new javax.swing.JLabel();
        lbTen = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        lbDT = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        cbBoxDT = new javax.swing.JComboBox<>();
        btnCN = new javax.swing.JButton();
        btnXuatEX = new javax.swing.JButton();
        btnXT = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(44, 83, 100));

        jLabel1.setBackground(new java.awt.Color(44, 83, 100));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        lbCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbCCCD.setForeground(new java.awt.Color(255, 255, 255));
        lbCCCD.setText("CCCD:");

        lbTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTen.setForeground(new java.awt.Color(255, 255, 255));
        lbTen.setText("Họ và tên: ");

        lbEmail.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("Email: ");

        lbSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbSDT.setForeground(new java.awt.Color(255, 255, 255));
        lbSDT.setText("Số điện thoại: ");

        lbDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbDT.setForeground(new java.awt.Color(255, 255, 255));
        lbDT.setText("Đối tượng: ");

        txtCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        txtTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        txtSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        cbBoxDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        cbBoxDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Trẻ em", "Người lớn", "Sinh viên", "Người cao tuỏi" }));

        btnCN.setBackground(new java.awt.Color(0, 199, 255));
        btnCN.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        btnCN.setText("Cập nhật");
        btnCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCNActionPerformed(evt);
            }
        });

        btnXuatEX.setBackground(new java.awt.Color(0, 199, 255));
        btnXuatEX.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnXuatEX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excel.png"))); // NOI18N
        btnXuatEX.setText("Xuất Excel");
        btnXuatEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatEXActionPerformed(evt);
            }
        });

        btnXT.setBackground(new java.awt.Color(0, 199, 255));
        btnXT.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/xoaTrang.png"))); // NOI18N
        btnXT.setText("Xóa Trắng");
        btnXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXTActionPerformed(evt);
            }
        });

        btnTim.setBackground(new java.awt.Color(0, 199, 255));
        btnTim.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search2.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSDT)
                            .addComponent(lbDT)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT)
                            .addComponent(cbBoxDT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen)
                            .addComponent(txtEmail)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnXuatEX, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCN, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnXT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBoxDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuatEX, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CCCD", "Họ tên", "Email", "Số điện thoại", "Đối tượng"
            }
        ));
        table.setRowHeight(30);
        table.setShowGrid(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scroll.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll))
                .addGap(0, 112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
    	String tieuChi = "";
		if (!txtSDT.getText().trim().equalsIgnoreCase("")) {
			tieuChi = txtSDT.getText();
			List<KhachHang> list = new ArrayList<KhachHang>();
			KhachHang khachHang = khachHangDao.getKhachHangByPhoneNumber(tieuChi);
			list.add(khachHang);
			addDataTable(list);
		} else if (tieuChi.isEmpty()) {
			JOptionPane.showMessageDialog(btnTim, "Chưa nhập tiêu chí tìm kiếm SĐT", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(btnCN, "Không tìm thấy khách hàng", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		}
    }//GEN-LAST:event_btnTimMouseClicked

	private void tableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableMouseClicked
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int index = table.getSelectedRow();
		if (index < 0) {
			return;
		}

		txtCCCD.setText(model.getValueAt(index, 0).toString());
		txtTen.setText(model.getValueAt(index, 1).toString());
		txtEmail.setText(model.getValueAt(index, 2) == null ? "" : model.getValueAt(index, 2).toString());
		txtSDT.setText(model.getValueAt(index, 3) == null ? "" : model.getValueAt(index, 3).toString());
		cbBoxDT.setSelectedItem(model.getValueAt(index, 4));
	}// GEN-LAST:event_tableMouseClicked

	private int checkData(KhachHang khachHang) {
		if (!khachHang.getCccd().trim().matches("\\d{12}")) {
			return 1;
		}
		if (!khachHang.getHoTen().trim().matches("^[^!@#$%^&*()\\d]+$")) {
			return 2;
		}
		if (!khachHang.getSdt().trim().matches("^0\\d{9,10}$")) {
			return 3;
		}
		if (!khachHang.getEmail().trim().matches("^[a-zA-Z0-9._%+-]+@(gmail|email)\\.com$")) {
			return 4;
		}
		return 0;
	}

	// show messager
	private void showMessageValue(int check) {
		switch (check) {
		case 1:
			JOptionPane.showMessageDialog(btnCN, "CCCD là 12 ký số", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(btnCN, "Họ tên không chứa số và ký tự đặc biệt", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			JOptionPane.showMessageDialog(btnCN, "Email không đúng(example@gmail.com)", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:

			JOptionPane.showMessageDialog(btnCN, "Số điện thoại không chính xác", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}

	private void updateKhachHangTable(KhachHang khachHang) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < table.getRowCount(); i++) {
			int index = table.getRowCount();
			if (index == i) {
				model.setValueAt(khachHang.getCccd(), i, 0);
				model.setValueAt(khachHang.getHoTen(), i, 1);
				model.setValueAt(khachHang.getEmail(), i, 2);
				model.setValueAt(khachHang.getSdt(), i, 3);
				model.setValueAt(khachHang.getDoiTuong(), i, 4);
			}
		}
	}

	// Cập nhật KhachHang
	private void btnCNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCNActionPerformed
		String CCCD = txtCCCD.getText();
		String hoTen = txtTen.getText();
		String email = txtEmail.getText();
		String sdt = txtSDT.getText();
		String doiTuong = cbBoxDT.getSelectedItem().toString();

		KhachHang khachHang = new KhachHang(CCCD, hoTen, email, sdt, doiTuong);

		int check = checkData(khachHang);
		if (check > 0) {
			showMessageValue(check);
		} else {
			khachHangDao.updateKhachHang(khachHang);
			updateKhachHangTable(khachHang);
			xoaTrang();
		}

	}// GEN-LAST:event_btnCNActionPerformed


	private void xoaTrang() {
		txtCCCD.setText("");
		txtEmail.setText("");
		txtSDT.setText("");
		txtTen.setText("");
		cbBoxDT.setSelectedIndex(0);
		table.clearSelection();
		List<KhachHang> list = khachHangDao.getAllKhachHang();
		addDataTable(list);
	}

	private void btnXTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXTActionPerformed
		xoaTrang();
	}// GEN-LAST:event_btnXTActionPerformed

	private void addDataTable(List<KhachHang> list) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for (KhachHang khachHang : list) {
			Object[] row = { khachHang.getCccd(), khachHang.getHoTen(), khachHang.getEmail(), khachHang.getSdt(),
					khachHang.getDoiTuong() };
			model.addRow(row);
		}
		model.fireTableDataChanged();
	}

	private void btnXuatEXActionPerformed(java.awt.event.ActionEvent evt) {
		// Mở dialog cho phép người dùng chọn đường dẫn
		JFileChooser fileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel files", "xls", "xlsx");
		fileChooser.setFileFilter(filter);
		int returnValue = fileChooser.showSaveDialog(null);

		// Xử lý kết quả trả về từ dialog
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			// Lấy đường dẫn được chọn
			String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();

			// Gọi hàm writeToExcel với đường dẫn đã chọn
			khachHangDao.writeToExcel(selectedFilePath + ".xls");
			JOptionPane.showMessageDialog(null, "Lưu thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("File Excel đã được lưu thành công.");
		} else if (returnValue == JFileChooser.CANCEL_OPTION) {
			System.out.println("Người dùng đã hủy lựa chọn.");
		}
	}

	@Override
	protected void paintChildren(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#085d81"), 0, getHeight(), Color.decode("#085d81"));
		g2.setPaint(g3);
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
		super.paintChildren(g);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCN;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXT;
    private javax.swing.JButton btnXuatEX;
    private javax.swing.JComboBox<String> cbBoxDT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbDT;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTen;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
