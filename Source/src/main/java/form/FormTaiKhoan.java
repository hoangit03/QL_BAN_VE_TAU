
package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class FormTaiKhoan extends javax.swing.JPanel {

    public FormTaiKhoan() {
        initComponents();
        fNhap.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin tài khoản", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.WHITE));
        fHienThi.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin nhân viên", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.WHITE));
        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
        table.getTableHeader().setPreferredSize(new Dimension(30,30));
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        fNhap = new form.Form();
        lbMa1 = new javax.swing.JLabel();
        jtMa = new javax.swing.JTextField();
        lbTen1 = new javax.swing.JLabel();
        jtTen = new javax.swing.JTextField();
        lbTK = new javax.swing.JLabel();
        jbTK = new javax.swing.JTextField();
        lbMK = new javax.swing.JLabel();
        jtMK = new javax.swing.JTextField();
        fHienThi = new form.Form();
        lbMa2 = new javax.swing.JLabel();
        lbtMa = new javax.swing.JLabel();
        lbCCCD = new javax.swing.JLabel();
        lbtCCCD = new javax.swing.JLabel();
        lbTen2 = new javax.swing.JLabel();
        lbtTen = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        lbtNgaySinh = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        lbtGioiTinh = new javax.swing.JLabel();
        lbDiaChi = new javax.swing.JLabel();
        lbtDiaChi = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbtEmail = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        lbtSDT = new javax.swing.JLabel();
        lbTrangThai = new javax.swing.JLabel();
        lbtTrangThai = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoaT = new javax.swing.JButton();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1600, 950));

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Tên tài khoản", "Mật khẩu"
            }
        ));
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setPreferredSize(new java.awt.Dimension(675, 90));
        table.setRowHeight(30);
        sp.setViewportView(table);

        fNhap.setPreferredSize(new java.awt.Dimension(380, 405));

        lbMa1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMa1.setForeground(new java.awt.Color(255, 255, 255));
        lbMa1.setText("Mã nhân viên");

        jtMa.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMa.setBorder(null);
        jtMa.setPreferredSize(new java.awt.Dimension(300, 40));

        lbTen1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTen1.setForeground(new java.awt.Color(255, 255, 255));
        lbTen1.setText("Họ tên");

        jtTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtTen.setBorder(null);
        jtTen.setPreferredSize(new java.awt.Dimension(300, 40));

        lbTK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTK.setForeground(new java.awt.Color(255, 255, 255));
        lbTK.setText("Tên tài khoản");

        jbTK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jbTK.setBorder(null);
        jbTK.setPreferredSize(new java.awt.Dimension(300, 40));

        lbMK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMK.setForeground(new java.awt.Color(255, 255, 255));
        lbMK.setText("Mật Khẩu");

        jtMK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtMK.setBorder(null);
        jtMK.setPreferredSize(new java.awt.Dimension(300, 40));

        javax.swing.GroupLayout fNhapLayout = new javax.swing.GroupLayout(fNhap);
        fNhap.setLayout(fNhapLayout);
        fNhapLayout.setHorizontalGroup(
            fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fNhapLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fNhapLayout.createSequentialGroup()
                        .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTK)
                            .addComponent(lbMK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtMK, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jbTK, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                    .addGroup(fNhapLayout.createSequentialGroup()
                        .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMa1)
                            .addComponent(lbTen1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fNhapLayout.setVerticalGroup(
            fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fNhapLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa1)
                    .addComponent(jtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen1))
                .addGap(20, 20, 20)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTK)
                    .addComponent(jbTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMK)
                    .addComponent(jtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        lbMa2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMa2.setForeground(new java.awt.Color(255, 255, 255));
        lbMa2.setText("Mã nhân viên");

        lbtMa.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtMa.setForeground(new java.awt.Color(255, 255, 255));
        lbtMa.setText("AAAAAAAAAAAA");

        lbCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbCCCD.setForeground(new java.awt.Color(255, 255, 255));
        lbCCCD.setText("CCCD");

        lbtCCCD.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtCCCD.setForeground(new java.awt.Color(255, 255, 255));
        lbtCCCD.setText("AAAAAAAAAAAAAAAAAA");

        lbTen2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTen2.setForeground(new java.awt.Color(255, 255, 255));
        lbTen2.setText("Họ tên");

        lbtTen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtTen.setForeground(new java.awt.Color(255, 255, 255));
        lbtTen.setText("AAAAAAAAAAAA");

        lbNgaySinh.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        lbNgaySinh.setText("Ngày sinh");

        lbtNgaySinh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        lbtNgaySinh.setText("AAAAAAAAAAAAAAA");

        lbGioiTinh.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbGioiTinh.setForeground(new java.awt.Color(255, 255, 255));
        lbGioiTinh.setText("Giới tính");

        lbtGioiTinh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtGioiTinh.setForeground(new java.awt.Color(255, 255, 255));
        lbtGioiTinh.setText("AAAAAAAAAAAAAAAAAA");

        lbDiaChi.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbDiaChi.setForeground(new java.awt.Color(255, 255, 255));
        lbDiaChi.setText("Địa chỉ");

        lbtDiaChi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtDiaChi.setForeground(new java.awt.Color(255, 255, 255));
        lbtDiaChi.setText("AAAAAAAAAAAAAA");

        lbEmail.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("Email");

        lbtEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbtEmail.setText("AAAAAAAAAAAAAAAAAA");

        lbSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbSDT.setForeground(new java.awt.Color(255, 255, 255));
        lbSDT.setText("Số điện thoại");

        lbtSDT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtSDT.setForeground(new java.awt.Color(255, 255, 255));
        lbtSDT.setText("AAAAAAAAAAAAAAAAAA");

        lbTrangThai.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTrangThai.setForeground(new java.awt.Color(255, 255, 255));
        lbTrangThai.setText("Trạng thái");

        lbtTrangThai.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtTrangThai.setForeground(new java.awt.Color(255, 255, 255));
        lbtTrangThai.setText("AAAAAAAAAAAAAAA");

        javax.swing.GroupLayout fHienThiLayout = new javax.swing.GroupLayout(fHienThi);
        fHienThi.setLayout(fHienThiLayout);
        fHienThiLayout.setHorizontalGroup(
            fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fHienThiLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fHienThiLayout.createSequentialGroup()
                                                    .addComponent(lbMa2)
                                                    .addGap(40, 40, 40))
                                                .addGroup(fHienThiLayout.createSequentialGroup()
                                                    .addComponent(lbCCCD)
                                                    .addGap(85, 85, 85)))
                                            .addGroup(fHienThiLayout.createSequentialGroup()
                                                .addComponent(lbTen2)
                                                .addGap(84, 84, 84)))
                                        .addGroup(fHienThiLayout.createSequentialGroup()
                                            .addComponent(lbNgaySinh)
                                            .addGap(63, 63, 63)))
                                    .addGroup(fHienThiLayout.createSequentialGroup()
                                        .addComponent(lbGioiTinh)
                                        .addGap(72, 72, 72)))
                                .addGroup(fHienThiLayout.createSequentialGroup()
                                    .addComponent(lbDiaChi)
                                    .addGap(82, 82, 82)))
                            .addGroup(fHienThiLayout.createSequentialGroup()
                                .addComponent(lbEmail)
                                .addGap(91, 91, 91)))
                        .addGroup(fHienThiLayout.createSequentialGroup()
                            .addComponent(lbSDT)
                            .addGap(42, 42, 42)))
                    .addGroup(fHienThiLayout.createSequentialGroup()
                        .addComponent(lbTrangThai)
                        .addGap(60, 60, 60)))
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtTrangThai)
                    .addComponent(lbtSDT)
                    .addComponent(lbtEmail)
                    .addComponent(lbtDiaChi)
                    .addComponent(lbtGioiTinh)
                    .addComponent(lbtNgaySinh)
                    .addComponent(lbtTen)
                    .addComponent(lbtCCCD)
                    .addComponent(lbtMa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fHienThiLayout.setVerticalGroup(
            fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fHienThiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa2)
                    .addComponent(lbtMa))
                .addGap(18, 18, 18)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCCCD)
                    .addComponent(lbtCCCD))
                .addGap(18, 18, 18)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen2)
                    .addComponent(lbtTen))
                .addGap(18, 18, 18)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgaySinh)
                    .addComponent(lbtNgaySinh))
                .addGap(18, 18, 18)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGioiTinh)
                    .addComponent(lbtGioiTinh))
                .addGap(18, 18, 18)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiaChi)
                    .addComponent(lbtDiaChi))
                .addGap(18, 18, 18)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(lbtEmail))
                .addGap(18, 18, 18)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSDT)
                    .addComponent(lbtSDT))
                .addGap(18, 18, 18)
                .addGroup(fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTrangThai)
                    .addComponent(lbtTrangThai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTim.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.setBorder(null);
        btnTim.setBorderPainted(false);
        btnTim.setPreferredSize(new java.awt.Dimension(82, 55));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);
        btnThem.setPreferredSize(new java.awt.Dimension(75, 30));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setBorder(null);
        btnCapNhat.setBorderPainted(false);
        btnCapNhat.setPreferredSize(new java.awt.Dimension(86, 55));

        btnXoaT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnXoaT.setText("Xóa trắng");
        btnXoaT.setBorder(null);
        btnXoaT.setBorderPainted(false);
        btnXoaT.setPreferredSize(new java.awt.Dimension(82, 55));
        btnXoaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addComponent(fNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(fHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(fHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoaT;
    private form.Form fHienThi;
    private form.Form fNhap;
    private javax.swing.JTextField jbTK;
    private javax.swing.JTextField jtMK;
    private javax.swing.JTextField jtMa;
    private javax.swing.JTextField jtTen;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbMK;
    private javax.swing.JLabel lbMa1;
    private javax.swing.JLabel lbMa2;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTK;
    private javax.swing.JLabel lbTen1;
    private javax.swing.JLabel lbTen2;
    private javax.swing.JLabel lbTrangThai;
    private javax.swing.JLabel lbtCCCD;
    private javax.swing.JLabel lbtDiaChi;
    private javax.swing.JLabel lbtEmail;
    private javax.swing.JLabel lbtGioiTinh;
    private javax.swing.JLabel lbtMa;
    private javax.swing.JLabel lbtNgaySinh;
    private javax.swing.JLabel lbtSDT;
    private javax.swing.JLabel lbtTen;
    private javax.swing.JLabel lbtTrangThai;
    private javax.swing.JScrollPane sp;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
