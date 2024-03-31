package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;




public class FormNhanVien extends javax.swing.JPanel {

    public FormNhanVien() {
        initComponents();
        formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
        formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin nhân viên", 0, 0, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.WHITE));
        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.getTableHeader().setPreferredSize(new Dimension(30,30));
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        formThongTin = new form.FormThongTin();
        lbMaNV = new javax.swing.JLabel();
        jtMaNV = new javax.swing.JTextField();
        lbCCCD = new javax.swing.JLabel();
        jtCCCD = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        jtTen = new javax.swing.JTextField();
        lbNgaySinh = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        lbDiaChi = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbSdt = new javax.swing.JLabel();
        lbTrangThai = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnXoaTrang = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTaoTaiKhoan = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 968));

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "CCCD", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Email", "Số điện thoại", "Trạng thái"
            }
        ));
        table.setRowHeight(30);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(8).setResizable(false);
        }

        lbMaNV.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbMaNV.setForeground(new java.awt.Color(255, 255, 255));
        lbMaNV.setText("Mã nhân viên");

        jtMaNV.setEditable(false);
        jtMaNV.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtMaNV.setBorder(null);
        jtMaNV.setPreferredSize(new java.awt.Dimension(300, 30));

        lbCCCD.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbCCCD.setForeground(new java.awt.Color(255, 255, 255));
        lbCCCD.setText("CCCD");

        jtCCCD.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtCCCD.setBorder(null);
        jtCCCD.setPreferredSize(new java.awt.Dimension(64, 30));

        lbTen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbTen.setForeground(new java.awt.Color(255, 255, 255));
        lbTen.setText("Họ tên");

        jtTen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtTen.setBorder(null);
        jtTen.setMinimumSize(new java.awt.Dimension(64, 30));
        jtTen.setPreferredSize(new java.awt.Dimension(64, 30));

        lbNgaySinh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        lbNgaySinh.setText("Ngày sinh");

        lbGioiTinh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbGioiTinh.setForeground(new java.awt.Color(255, 255, 255));
        lbGioiTinh.setText("Giới tính");

        lbDiaChi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbDiaChi.setForeground(new java.awt.Color(255, 255, 255));
        lbDiaChi.setText("Địa chỉ");

        lbEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("Email");

        lbSdt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbSdt.setForeground(new java.awt.Color(255, 255, 255));
        lbSdt.setText("Số điện thoại");

        lbTrangThai.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbTrangThai.setForeground(new java.awt.Color(255, 255, 255));
        lbTrangThai.setText("Trạng Thái");

        jTextField9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField9.setBorder(null);
        jTextField9.setPreferredSize(new java.awt.Dimension(64, 30));

        jTextField10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField10.setBorder(null);
        jTextField10.setPreferredSize(new java.awt.Dimension(64, 30));

        jTextField11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField11.setBorder(null);
        jTextField11.setPreferredSize(new java.awt.Dimension(64, 30));

        jDateChooser1.setAlignmentX(0.0F);
        jDateChooser1.setAlignmentY(0.0F);
        jDateChooser1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jDateChooser1.setPreferredSize(new java.awt.Dimension(88, 30));

        groupRadio.add(rdNam);
        rdNam.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdNam.setForeground(new java.awt.Color(255, 255, 255));
        rdNam.setText("Nam");
        rdNam.setAlignmentY(0.0F);
        rdNam.setBorder(null);
        rdNam.setContentAreaFilled(false);
        rdNam.setFocusPainted(false);

        groupRadio.add(rdNu);
        rdNu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdNu.setForeground(new java.awt.Color(255, 255, 255));
        rdNu.setText("Nữ");
        rdNu.setAlignmentY(0.0F);
        rdNu.setBorder(null);
        rdNu.setContentAreaFilled(false);
        rdNu.setFocusPainted(false);

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang làm", "Nghỉ làm" }));
        jComboBox1.setBorder(null);
        jComboBox1.setMinimumSize(new java.awt.Dimension(75, 35));
        jComboBox1.setPreferredSize(new java.awt.Dimension(95, 35));

        javax.swing.GroupLayout formThongTinLayout = new javax.swing.GroupLayout(formThongTin);
        formThongTin.setLayout(formThongTinLayout);
        formThongTinLayout.setHorizontalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formThongTinLayout.createSequentialGroup()
                        .addComponent(rdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTrangThai)
                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSdt)
                    .addComponent(lbEmail)
                    .addComponent(lbNgaySinh)
                    .addComponent(lbTen)
                    .addComponent(lbCCCD)
                    .addComponent(lbMaNV)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDiaChi)
                    .addComponent(lbGioiTinh)
                    .addComponent(jtTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        formThongTinLayout.setVerticalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbCCCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTen)
                .addGap(2, 2, 2)
                .addComponent(jtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbNgaySinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbGioiTinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdNam)
                    .addComponent(rdNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDiaChi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSdt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTrangThai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnXoaTrang.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnXoaTrang.setText("Xóa Trắng");
        btnXoaTrang.setBorder(null);
        btnXoaTrang.setBorderPainted(false);
        btnXoaTrang.setFocusPainted(false);
        btnXoaTrang.setPreferredSize(new java.awt.Dimension(103, 55));

        btnThem.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);
        btnThem.setFocusPainted(false);
        btnThem.setPreferredSize(new java.awt.Dimension(105, 55));

        btnCapNhat.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setBorder(null);
        btnCapNhat.setBorderPainted(false);
        btnCapNhat.setFocusable(false);
        btnCapNhat.setPreferredSize(new java.awt.Dimension(100, 55));

        btnTaoTaiKhoan.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnTaoTaiKhoan.setText("Tạo tài khoản");
        btnTaoTaiKhoan.setBorder(null);
        btnTaoTaiKhoan.setBorderPainted(false);
        btnTaoTaiKhoan.setFocusPainted(false);
        btnTaoTaiKhoan.setFocusable(false);

        btnExcel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnExcel.setText("Xuất Excel");
        btnExcel.setBorder(null);
        btnExcel.setBorderPainted(false);
        btnExcel.setFocusPainted(false);
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTaoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnTaoTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoaTrang;
    private form.FormThongTin formThongTin;
    private javax.swing.ButtonGroup groupRadio;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jtCCCD;
    private javax.swing.JTextField jtMaNV;
    private javax.swing.JTextField jtTen;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSdt;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lbTrangThai;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
