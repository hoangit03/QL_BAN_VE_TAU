package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.GaDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.VeDao;
import entity.ChiTietVe;
import entity.Ga;
import entity.HoaDon;
import entity.KhachHang;
import entity.KhuyenMai;
import entity.Ve;
import jakarta.persistence.EntityManagerFactory;
import swing.ScrollBar;

public class GD_DoiTra extends javax.swing.JPanel {
	private HoaDonDao hoaDonDao;
	private KhachHangDao khachHangDao;
	private EntityManagerFactory emf;
	private VeDao veDao;
	private GaDao gaDao;;

	public GD_DoiTra(EntityManagerFactory emf) {
		initComponents();
		formHoaDon.setBorder(new EmptyBorder(0, 0, 0, 0));
		formHoaDon.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
				"Bảng hóa đơn", 0, 0, new Font(Font.SANS_SERIF, Font.PLAIN, 14) {
				}, Color.WHITE));

		formVe.setBorder(new EmptyBorder(0, 0, 0, 0));
		formVe.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Bảng vé", 0, 0,
				new Font(Font.SANS_SERIF, Font.PLAIN, 14) {
				}, Color.WHITE));

		form1.setBorder(new EmptyBorder(0, 0, 0, 0));
		form1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
				"Thông tin hóa đơn", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.PLAIN, 16) {
				}, Color.WHITE));
		form2.setBorder(new EmptyBorder(0, 0, 0, 0));
		form2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin vé", 0,
				HEIGHT, new Font(Font.SANS_SERIF, Font.PLAIN, 16) {
				}, Color.WHITE));

		this.emf = emf;
		veDao = new VeDao(emf);
		tableHD.setShowGrid(false);
		tableHD.setShowHorizontalLines(false);
		tableHD.setShowVerticalLines(false);
		tableHD.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
		tableHD.getTableHeader().setPreferredSize(new Dimension(30, 30));
		((DefaultTableCellRenderer) tableHD.getTableHeader().getDefaultRenderer())
				.setHorizontalAlignment(JLabel.CENTER);

		tableVe.setShowGrid(false);
		tableVe.setShowHorizontalLines(false);
		tableVe.setShowVerticalLines(false);
		tableVe.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
		tableVe.getTableHeader().setPreferredSize(new Dimension(30, 30));
		scrollHD.setVerticalScrollBar(new ScrollBar());
		scrollVe.setVerticalScrollBar(new ScrollBar());
		((DefaultTableCellRenderer) tableVe.getTableHeader().getDefaultRenderer())
				.setHorizontalAlignment(JLabel.CENTER);

		renderHoaDon();

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		formHoaDon = new form.Form();
		scrollHD = new javax.swing.JScrollPane();
		tableHD = new javax.swing.JTable();
		formVe = new form.Form();
		scrollVe = new javax.swing.JScrollPane();
		tableVe = new javax.swing.JTable();
		form1 = new form.Form();
		lbMHD = new javax.swing.JLabel();
		jtMHD = new javax.swing.JTextField();
		lbMNV = new javax.swing.JLabel();
		jtMNV = new javax.swing.JTextField();
		lbCCCCHD = new javax.swing.JLabel();
		jtCCCDHD = new javax.swing.JTextField();
		lbTenHKHD = new javax.swing.JLabel();
		jtTenKHHD = new javax.swing.JTextField();
		lbSDT = new javax.swing.JLabel();
		jtSDT = new javax.swing.JTextField();
		form2 = new form.Form();
		lbMV = new javax.swing.JLabel();
		jtMV = new javax.swing.JTextField();
		lbCCCDV = new javax.swing.JLabel();
		jtCCCDV = new javax.swing.JTextField();
		lbGia = new javax.swing.JLabel();
		jtGia = new javax.swing.JTextField();
		btnXoaT = new javax.swing.JButton();
		btnTimHD = new javax.swing.JButton();
		btnTimV = new javax.swing.JButton();
		btnDoi = new javax.swing.JButton();
		btnTra = new javax.swing.JButton();
		btnInVe = new javax.swing.JButton();
		btnInHoaDon = new javax.swing.JButton();
		btnTraHD = new javax.swing.JButton();

		setPreferredSize(new java.awt.Dimension(1600, 950));

		tableHD.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		tableHD.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null } },
				new String[] { "Mã hóa đơn", "Mã nhân viên", "CCCD", "Tên khách hàng", "Số điện thoại", "Khuyến mãi",
						"Ngày lập hóa đơn", "Giời lập Hóa đơn", "Tổng tiền" }));
		tableHD.setAlignmentX(0.0F);
		tableHD.setAlignmentY(0.0F);
		tableHD.setGridColor(new java.awt.Color(255, 255, 255));
		tableHD.setRowHeight(30);
		tableHD.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tableHDMouseClicked(evt);
			}
		});
		scrollHD.setViewportView(tableHD);

		javax.swing.GroupLayout formHoaDonLayout = new javax.swing.GroupLayout(formHoaDon);
		formHoaDon.setLayout(formHoaDonLayout);
		formHoaDonLayout
				.setHorizontalGroup(formHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(scrollHD, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE));
		formHoaDonLayout
				.setVerticalGroup(formHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(scrollHD, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE));

		tableVe.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		tableVe.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null } },
				new String[] { "Mã vé", "CCCD", "Tên khách hàng", "Đối tượng", "Ga đi", "Ga đến", "Mã tàu", "Số toa",
						"Vị trí Chổ", "Giờ lên tàu", "Giá" }));
		tableVe.setAlignmentX(0.0F);
		tableVe.setAlignmentY(0.0F);
		tableVe.setGridColor(new java.awt.Color(255, 255, 255));
		tableVe.setRowHeight(30);
		tableVe.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tableVeMouseClicked(evt);
			}
		});
		scrollVe.setViewportView(tableVe);
		if (tableVe.getColumnModel().getColumnCount() > 0) {
			tableVe.getColumnModel().getColumn(0).setResizable(false);
			tableVe.getColumnModel().getColumn(1).setResizable(false);
			tableVe.getColumnModel().getColumn(2).setResizable(false);
			tableVe.getColumnModel().getColumn(3).setResizable(false);
			tableVe.getColumnModel().getColumn(4).setResizable(false);
			tableVe.getColumnModel().getColumn(5).setResizable(false);
			tableVe.getColumnModel().getColumn(6).setResizable(false);
			tableVe.getColumnModel().getColumn(7).setResizable(false);
			tableVe.getColumnModel().getColumn(8).setResizable(false);
			tableVe.getColumnModel().getColumn(9).setResizable(false);
			tableVe.getColumnModel().getColumn(10).setResizable(false);
		}

		javax.swing.GroupLayout formVeLayout = new javax.swing.GroupLayout(formVe);
		formVe.setLayout(formVeLayout);
		formVeLayout.setHorizontalGroup(
				formVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(scrollVe));
		formVeLayout.setVerticalGroup(formVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(formVeLayout.createSequentialGroup().addComponent(scrollVe,
						javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

		lbMHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbMHD.setForeground(new java.awt.Color(255, 255, 255));
		lbMHD.setText("Mã hóa đơn");

		jtMHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtMHD.setToolTipText("");
		jtMHD.setAlignmentX(1.0F);
		jtMHD.setAlignmentY(1.0F);
		jtMHD.setBorder(null);
		jtMHD.setMargin(new java.awt.Insets(2, 50, 2, 6));
		jtMHD.setPreferredSize(new java.awt.Dimension(310, 40));

		lbMNV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbMNV.setForeground(new java.awt.Color(255, 255, 255));
		lbMNV.setText("Mã nhân viên");

		jtMNV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtMNV.setToolTipText("");
		jtMNV.setBorder(null);
		jtMNV.setPreferredSize(new java.awt.Dimension(64, 40));

		lbCCCCHD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbCCCCHD.setForeground(new java.awt.Color(255, 255, 255));
		lbCCCCHD.setText("CCCD");

		jtCCCDHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtCCCDHD.setToolTipText("");
		jtCCCDHD.setBorder(null);
		jtCCCDHD.setPreferredSize(new java.awt.Dimension(64, 40));

		lbTenHKHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbTenHKHD.setForeground(new java.awt.Color(255, 255, 255));
		lbTenHKHD.setText("Tên khách hàng");

		jtTenKHHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtTenKHHD.setToolTipText("");
		jtTenKHHD.setBorder(null);
		jtTenKHHD.setPreferredSize(new java.awt.Dimension(64, 40));

		lbSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbSDT.setForeground(new java.awt.Color(255, 255, 255));
		lbSDT.setText("Số điện thoại");

		jtSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtSDT.setToolTipText("");
		jtSDT.setBorder(null);
		jtSDT.setPreferredSize(new java.awt.Dimension(64, 40));

		javax.swing.GroupLayout form1Layout = new javax.swing.GroupLayout(form1);
		form1.setLayout(form1Layout);
		form1Layout.setHorizontalGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(form1Layout.createSequentialGroup().addGroup(form1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(form1Layout.createSequentialGroup().addGap(40, 40, 40)
								.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lbMNV).addComponent(lbCCCCHD).addComponent(lbMHD)
										.addComponent(lbSDT))
								.addGap(23, 23, 23))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								form1Layout.createSequentialGroup().addContainerGap().addComponent(lbTenHKHD)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jtTenKHHD, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jtMHD, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jtCCCDHD, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jtMNV, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(36, Short.MAX_VALUE)));
		form1Layout.setVerticalGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(form1Layout.createSequentialGroup().addGap(8, 8, 8)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbMHD).addComponent(jtMHD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtMNV, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbMNV))
						.addGap(19, 19, 19)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtCCCDHD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbCCCCHD))
						.addGap(20, 20, 20)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtTenKHHD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbTenHKHD))
						.addGap(18, 18, 18)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtSDT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbSDT))
						.addContainerGap(32, Short.MAX_VALUE)));

		lbMV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbMV.setForeground(new java.awt.Color(255, 255, 255));
		lbMV.setText("Mã vé");

		jtMV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtMV.setToolTipText("");
		jtMV.setBorder(null);
		jtMV.setPreferredSize(new java.awt.Dimension(64, 40));

		lbCCCDV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbCCCDV.setForeground(new java.awt.Color(255, 255, 255));
		lbCCCDV.setText("CCCD");

		jtCCCDV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtCCCDV.setToolTipText("");
		jtCCCDV.setBorder(null);
		jtCCCDV.setPreferredSize(new java.awt.Dimension(64, 40));

		lbGia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbGia.setForeground(new java.awt.Color(255, 255, 255));
		lbGia.setText("Giá");

		jtGia.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtGia.setToolTipText("");
		jtGia.setBorder(null);
		jtGia.setPreferredSize(new java.awt.Dimension(64, 40));

		javax.swing.GroupLayout form2Layout = new javax.swing.GroupLayout(form2);
		form2.setLayout(form2Layout);
		form2Layout.setHorizontalGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(form2Layout.createSequentialGroup().addGap(40, 40, 40)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lbGia).addComponent(lbCCCDV))
								.addComponent(lbMV))
						.addGap(72, 72, 72)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(form2Layout.createSequentialGroup()
										.addGroup(form2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jtGia, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jtCCCDV, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(35, 35, 35))
								.addGroup(form2Layout.createSequentialGroup()
										.addComponent(jtMV, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(32, Short.MAX_VALUE)))));
		form2Layout.setVerticalGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(form2Layout.createSequentialGroup().addGap(8, 8, 8)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtMV, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbMV))
						.addGap(16, 16, 16)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbCCCDV).addComponent(jtCCCDV, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(24, 24, 24)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbGia).addComponent(jtGia, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(30, Short.MAX_VALUE)));

		btnXoaT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnXoaT.setText("Xóa trắng");
		btnXoaT.setBorder(null);
		btnXoaT.setBorderPainted(false);
		btnXoaT.setMaximumSize(new java.awt.Dimension(75, 60));
		btnXoaT.setPreferredSize(new java.awt.Dimension(75, 50));
		btnXoaT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoaTActionPerformed(evt);
			}
		});

		btnTimHD.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnTimHD.setText("Tìm hóa đơn");
		btnTimHD.setBorder(null);
		btnTimHD.setBorderPainted(false);
		btnTimHD.setMaximumSize(new java.awt.Dimension(75, 60));
		btnTimHD.setPreferredSize(new java.awt.Dimension(75, 50));
		btnTimHD.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnTimHDMouseClicked(evt);
			}
		});

		btnTimV.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnTimV.setText("Tìm vé");
		btnTimV.setBorder(null);
		btnTimV.setFocusPainted(false);
		btnTimV.setMaximumSize(new java.awt.Dimension(75, 60));
		btnTimV.setPreferredSize(new java.awt.Dimension(75, 50));
		btnTimV.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnTimVMouseClicked(evt);
			}
		});

		btnDoi.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnDoi.setText("Đổi vé");
		btnDoi.setBorder(null);
		btnDoi.setBorderPainted(false);
		btnDoi.setMaximumSize(new java.awt.Dimension(75, 60));
		btnDoi.setPreferredSize(new java.awt.Dimension(75, 50));
		btnDoi.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnDoiMouseClicked(evt);
			}
		});

		btnTra.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnTra.setText("Trả vé");
		btnTra.setBorder(null);
		btnTra.setBorderPainted(false);
		btnTra.setMaximumSize(new java.awt.Dimension(75, 60));
		btnTra.setPreferredSize(new java.awt.Dimension(75, 50));
		btnTra.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnTraMouseClicked(evt);
			}
		});

		btnInVe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnInVe.setText("In vé");
		btnInVe.setBorder(null);
		btnInVe.setBorderPainted(false);
		btnInVe.setMaximumSize(new java.awt.Dimension(75, 60));
		btnInVe.setPreferredSize(new java.awt.Dimension(75, 50));
		btnInVe.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnInVeMouseClicked(evt);
			}
		});

		btnInHoaDon.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnInHoaDon.setText("In Hóa đơn");
		btnInHoaDon.setBorder(null);
		btnInHoaDon.setBorderPainted(false);
		btnInHoaDon.setMaximumSize(new java.awt.Dimension(75, 60));
		btnInHoaDon.setPreferredSize(new java.awt.Dimension(75, 50));
		btnInHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnInHoaDonMouseClicked(evt);
			}
		});

		btnTraHD.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnTraHD.setText("Trả hóa đơn");
		btnTraHD.setBorder(null);
		btnTraHD.setBorderPainted(false);
		btnTraHD.setMaximumSize(new java.awt.Dimension(75, 60));
		btnTraHD.setPreferredSize(new java.awt.Dimension(75, 50));
		btnTraHD.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnTraHDMouseClicked(evt);
			}
		});
		btnTraHD.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnTraHDActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(formHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(formVe, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(form1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(form2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap())
								.addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnTimV, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(btnDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnTraHD, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(btnInVe, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 198,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(formHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(formVe, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(form1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(form2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(46, 46, 46)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTimHD, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTimV, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(6, 6, 6)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnInVe, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnDoi, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTraHD, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(54, Short.MAX_VALUE)));
	}// </editor-fold>//GEN-END:initComponents

	private void btnInVeMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnInVeMouseClicked
		
	}// GEN-LAST:event_btnInVeMouseClicked

	private void btnInHoaDonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnInHoaDonMouseClicked
		
	}// GEN-LAST:event_btnInHoaDonMouseClicked

	private void btnTraHDMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnTraHDMouseClicked
		
	}// GEN-LAST:event_btnTraHDMouseClicked

	private void btnTraHDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTraHDActionPerformed
		
	}// GEN-LAST:event_btnTraHDActionPerformed

	private void tableHDMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableHDMouseClicked
		int index = tableHD.getSelectedRow();
		if (index < 0)
			return;

		xoaTrangVe();
		String maHD = tableHD.getValueAt(tableHD.getSelectedRow(), 0).toString();
		HoaDon hd;
		hd = hoaDonDao.getHoaDonByMa(maHD);
		hienHoaDon(hd);
		hienBangVe(maHD, "");
		if (tableVe.getRowCount() > 0)
			tableVe.setRowSelectionInterval(0, 0);
		tableVe.clearSelection();

	}// GEN-LAST:event_tableHDMouseClicked

	private void tableVeMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableVeMouseClicked
		String maVe = tableVe.getValueAt(tableVe.getSelectedRow(), 0).toString();
		Ve ve;
		ve = veDao.getVeByMa(maVe);
		hienChiTietVe(ve);

	}// GEN-LAST:event_tableVeMouseClicked

	private void jcbSoToaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jcbSoToaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jcbSoToaActionPerformed

	private void btnXoaTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaTActionPerformed
		xoaTrangHoaDon();
		xoaTrangVe();

	}// GEN-LAST:event_btnXoaTActionPerformed

	private void btnTimHDMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnTimHDMouseClicked
		timHoaDon();
	}// GEN-LAST:event_btnTimHDMouseClicked

	private void btnTimVMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnTimVMouseClicked
		timVe();
	}// GEN-LAST:event_btnTimVMouseClicked

	private void btnDoiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnDoiMouseClicked
		// TODO add your handling code here:
	}// GEN-LAST:event_btnDoiMouseClicked

	private void btnTraMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnTraMouseClicked
		traVe();
	}// GEN-LAST:event_btnTraMouseClicked

	protected void paintChildren(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#085d81"), 0, getHeight(), Color.decode("#085d81"));
		g2.setPaint(g3);
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
		super.paintChildren(g);
	}

	private void xoaTrangHoaDon() {
		jtMHD.setText("");
		jtMNV.setText("");
		jtCCCDHD.setText("");
		jtTenKHHD.setText("");
		jtSDT.setText("");
		renderHoaDon();
	}

	private void xoaTrangVe() {
		jtMV.setText("");
		jtCCCDV.setText("");
		jtGia.setText("");
		DefaultTableModel model = (DefaultTableModel) tableVe.getModel();
		model.setRowCount(0);
		tableVe.setModel(model);
	}

	private void renderHoaDon() {
		khachHangDao = new KhachHangDao(emf);
		hoaDonDao = new HoaDonDao(emf);
		List<HoaDon> lhd = hoaDonDao.getAllHoaDon();
		DefaultTableModel model = (DefaultTableModel) tableHD.getModel();
		model.setRowCount(0);

		for (HoaDon hoaDon : lhd) {
			KhachHang kh = khachHangDao.getKhachHangByCCCD(hoaDon.getKhachHang().getCccd());
			List<Ve> listVe = hoaDon.getListVes();
			double tongTien = 0;
			for (Ve ve : listVe) {
				Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
				Ga gaChieuDi = null;
				Ga gaChieuDen = null;
				for (ChiTietVe ctv : listChiTietVes) {
					if (ctv.isChieu())
						gaChieuDi = ctv.getGa();
					else
						gaChieuDen = ctv.getGa();
				}
				tongTien += ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())
						* (ve.getKhuyenMai() == null ? 1 : ve.getKhuyenMai().getChietKhau());
			}
			Set<KhuyenMai> listKhuyenMai = hoaDon.getLisKhuyenMais();
			double km = 0;
			for (KhuyenMai khuyenMai : listKhuyenMai) {
				km += khuyenMai.getChietKhau();

			}
			Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNhanVien().getMaNhanVien(), kh.getCccd(), kh.getHoTen(),
					kh.getSdt(), km, hoaDon.getNgayTao(), hoaDon.getGioTao(),(int) tongTien };
			model.addRow(row);
		}
		model.fireTableDataChanged();
	}

	private void hienHoaDon(HoaDon hd) {
		jtMHD.setText(hd.getMaHoaDon());
		jtMNV.setText(hd.getNhanVien().getMaNhanVien());
		KhachHang kh = khachHangDao.getKhachHangByCCCD(hd.getKhachHang().getCccd());
		jtCCCDHD.setText(kh.getCccd());
		jtTenKHHD.setText(kh.getHoTen());
		jtSDT.setText(kh.getSdt());
	}

	private void hienChiTietVe(Ve ve) {
		jtMV.setText(ve.getMaVe());
		jtCCCDV.setText(ve.getKhachHang().getCccd());
		Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
		Ga gaChieuDi = null;
		Ga gaChieuDen = null;
		for (ChiTietVe ctv : listChiTietVes) {
			if (ctv.isChieu())
				gaChieuDi = ctv.getGa();
			else
				gaChieuDen = ctv.getGa();
		}
		jtGia.setText((int) (ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())
				* (ve.getKhuyenMai() == null ? 1 : 1 - ve.getKhuyenMai().getChietKhau())) + "");

	}

	private void timHoaDon() {
		String maHD = jtMHD.getText();
		if (maHD.equals("")) {
			JOptionPane.showMessageDialog(null, "Chưa nhập mã hoá đơn", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			HoaDon hoaDon = hoaDonDao.getHoaDonByMa(maHD);
			if (hoaDon != null) {
				DefaultTableModel model = (DefaultTableModel) tableHD.getModel();
				model.setRowCount(0);
				KhachHang kh = khachHangDao.getKhachHangByCCCD(hoaDon.getKhachHang().getCccd());
				List<Ve> listVe = hoaDon.getListVes();
				double tongTien = 0;
				for (Ve ve : listVe) {
					Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
					Ga gaChieuDi = null;
					Ga gaChieuDen = null;
					for (ChiTietVe ctv : listChiTietVes) {
						if (ctv.isChieu())
							gaChieuDi = ctv.getGa();
						else
							gaChieuDen = ctv.getGa();
					}
					tongTien += ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())
							* (ve.getKhuyenMai() == null ? 1 : ve.getKhuyenMai().getChietKhau());
				}
				Set<KhuyenMai> listKhuyenMai = hoaDon.getLisKhuyenMais();
				double km = 0;
				for (KhuyenMai khuyenMai : listKhuyenMai) {
					km += khuyenMai.getChietKhau();

				}
				Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNhanVien().getMaNhanVien(), kh.getCccd(),
						kh.getHoTen(), kh.getSdt(), (int) km, hoaDon.getNgayTao(), hoaDon.getGioTao(), (int) tongTien };
				model.addRow(row);
				model.fireTableDataChanged();
				hienBangVe(maHD, "");
			} else {
				JOptionPane.showMessageDialog(null, "Mã hóa đơn nhập không có trong hệ thống", "Thông báo",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	private void hienBangVe(String maHD, String maVe) {
		List<Ve> listVe = !maHD.equals("") ? veDao.getListVeByMaHD(maHD) : veDao.getListVeByMaVe(maVe);
		DefaultTableModel model = (DefaultTableModel) tableVe.getModel();
		model.setRowCount(0);
		for (Ve ve : listVe) {
			KhachHang kh = khachHangDao.getKhachHangByCCCD(ve.getKhachHang().getCccd());
			Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
			Ga gaChieuDi = null;
			Ga gaChieuDen = null;
			for (ChiTietVe ctv : listChiTietVes) {
				if (ctv.isChieu())
					gaChieuDi = ctv.getGa();
				else
					gaChieuDen = ctv.getGa();
			}
			Object[] row = { ve.getMaVe(), kh.getCccd(), kh.getHoTen(), kh.getDoiTuong(), gaChieuDi.getTenGa(),
					gaChieuDen.getTenGa(), ve.getChuyen().getTau().getMaTau(), ve.getChoNgoi().getToa().getViTri(),
					ve.getChoNgoi().getViTri(), ve.getThoiGianLenTau(),
					(int) (ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())
							* (ve.getKhuyenMai() == null ? 1 : 1 - ve.getKhuyenMai().getChietKhau()))};
			model.addRow(row);
		}
		model.fireTableDataChanged();
	}

	private void timVe() {
		String maVe = jtMV.getText();
		if (maVe.equals("")) {
			JOptionPane.showMessageDialog(null, "Chưa nhập mã vé", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			jtMV.requestFocus();
		} else {
			Ve ve = veDao.getVeByMa(maVe);
			if (ve != null) {
				hienBangVe("", maVe);
				tableVe.setRowSelectionInterval(0, 0);
				hienChiTietVe(ve);
			} else {
				JOptionPane.showMessageDialog(null, "Mã vé nhập không có trong hệ thống", "Thông báo",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	private void traVe() {
		if (tableVe.getRowCount() > 0) {
			String maVe = tableVe.getValueAt(tableVe.getSelectedRow(), 0).toString();
			Ve ve = veDao.getVeByMa(maVe);
			LocalDateTime ngayDi = ve.getThoiGianLenTau();
			LocalDate timeDate = ngayDi.toLocalDate();

			long tinhTime = ChronoUnit.DAYS.between(LocalDate.now(), ngayDi);

			if (timeDate.isBefore(LocalDate.now())) {
				JOptionPane.showMessageDialog(null, "Chuyến tàu này đã khởi hành , đổi vé không có hiệu lực",
						"Thông báo", JOptionPane.INFORMATION_MESSAGE);
			} else {

				if (tinhTime > 1) {
					Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
					Ga gaChieuDi = null;
					Ga gaChieuDen = null;
					for (ChiTietVe ctv : listChiTietVes) {
						if (ctv.isChieu())
							gaChieuDi = ctv.getGa();
						else
							gaChieuDen = ctv.getGa();
					}
//					chi dc tra 70%
					double soTienDuocTra = ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())
							* 0.8 * (ve.getKhuyenMai() == null ? 1 : 1 - ve.getKhuyenMai().getChietKhau());
					int chose = JOptionPane.showConfirmDialog(null, "Số tiền hoàn lại cho khách hàng là "+((int)soTienDuocTra/1000)*1000+ "VNĐ","Xác nhận",JOptionPane.YES_NO_OPTION);
					if(chose == JOptionPane.YES_OPTION) {
						boolean check = veDao.updateDoiVe(maVe, LocalDateTime.now());
						if(check) {
//							tableVe.remove(tableVe.getSelectedRow());
						}
					}
					

				} else {
					JOptionPane.showMessageDialog(null, "Vé không thể đổi trả do sắp đến giờ khởi hành", "Thông báo",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Bạn chưa nhập vé để đổi trả", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnDoi;
	private javax.swing.JButton btnInHoaDon;
	private javax.swing.JButton btnInVe;
	private javax.swing.JButton btnTimHD;
	private javax.swing.JButton btnTimV;
	private javax.swing.JButton btnTra;
	private javax.swing.JButton btnTraHD;
	private javax.swing.JButton btnXoaT;
	private form.Form form1;
	private form.Form form2;
	private form.Form formHoaDon;
	private form.Form formVe;
	private javax.swing.JTextField jtCCCDHD;
	private javax.swing.JTextField jtCCCDV;
	private javax.swing.JTextField jtGia;
	private javax.swing.JTextField jtMHD;
	private javax.swing.JTextField jtMNV;
	private javax.swing.JTextField jtMV;
	private javax.swing.JTextField jtSDT;
	private javax.swing.JTextField jtTenKHHD;
	private javax.swing.JLabel lbCCCCHD;
	private javax.swing.JLabel lbCCCDV;
	private javax.swing.JLabel lbGia;
	private javax.swing.JLabel lbMHD;
	private javax.swing.JLabel lbMNV;
	private javax.swing.JLabel lbMV;
	private javax.swing.JLabel lbSDT;
	private javax.swing.JLabel lbTenHKHD;
	private javax.swing.JScrollPane scrollHD;
	private javax.swing.JScrollPane scrollVe;
	private javax.swing.JTable tableHD;
	private javax.swing.JTable tableVe;
	// End of variables declaration//GEN-END:variables
}
