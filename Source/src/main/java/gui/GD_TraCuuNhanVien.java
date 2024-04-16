package gui;

import form.FormNhanVien;
import form.FormTaiKhoan;
import form.FormTraCuuHoaDon;
import form.FormTraCuuNhanVien;
import form.FormTraCuuKhuyenMai;
import form.FormTraCuuKhachHang;
import form.FormTraCuuVe;
import jakarta.persistence.EntityManagerFactory;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class GD_TraCuuNhanVien extends javax.swing.JPanel {

    private EntityManagerFactory emf;
    public GD_TraCuuNhanVien(EntityManagerFactory emf) {
        initComponents();
        setBorder(new EmptyBorder(10, 10, 10, 10));
        
        btnTraCuuHoaDon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm1.showForm(new FormTraCuuHoaDon());
            }
        });
        btnTraCuuVe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm1.showForm(new FormTraCuuVe());
            }
        });
        btnTraCuuKhachHang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm1.showForm(new FormTraCuuKhachHang(emf));
            }
        });
        btnTraCuuKhuyenMai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm1.showForm(new FormTraCuuKhuyenMai());
            }
        });
        btnTraCuuNhanVien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm1.showForm(new FormTraCuuNhanVien());
            }
        });

        mainForm1.showForm(new FormTraCuuNhanVien());
    }

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#2C5364"), 0, getHeight(), Color.decode("#2C5364"));
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintChildren(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReturn = new javax.swing.JButton();
        mainForm1 = new form.MainForm();
        btnTraCuuHoaDon = new javax.swing.JButton();
        btnTraCuuVe = new javax.swing.JButton();
        btnTraCuuKhachHang = new javax.swing.JButton();
        btnTraCuuKhuyenMai = new javax.swing.JButton();
        btnTraCuuNhanVien = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1600, 1100));

        btnReturn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnReturn.setText("Trở về");
        btnReturn.setBorderPainted(false);
        btnReturn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnReturn.setMaximumSize(new java.awt.Dimension(120, 45));
        btnReturn.setMinimumSize(new java.awt.Dimension(120, 45));
        btnReturn.setPreferredSize(new java.awt.Dimension(120, 45));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        mainForm1.setPreferredSize(new java.awt.Dimension(1600, 1000));

        btnTraCuuHoaDon.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuuHoaDon.setText("Tra cứu hoá đơn");
        btnTraCuuHoaDon.setBorderPainted(false);
        btnTraCuuHoaDon.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTraCuuHoaDon.setMaximumSize(new java.awt.Dimension(120, 45));
        btnTraCuuHoaDon.setMinimumSize(new java.awt.Dimension(120, 45));
        btnTraCuuHoaDon.setPreferredSize(new java.awt.Dimension(120, 45));
        btnTraCuuHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuHoaDonActionPerformed(evt);
            }
        });

        btnTraCuuVe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuuVe.setText("Tra cứu vé");
        btnTraCuuVe.setBorderPainted(false);
        btnTraCuuVe.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTraCuuVe.setMaximumSize(new java.awt.Dimension(120, 45));
        btnTraCuuVe.setMinimumSize(new java.awt.Dimension(120, 45));
        btnTraCuuVe.setPreferredSize(new java.awt.Dimension(120, 45));
        btnTraCuuVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuVeActionPerformed(evt);
            }
        });

        btnTraCuuKhachHang.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuuKhachHang.setText("Tra cứu khách hàng");
        btnTraCuuKhachHang.setBorderPainted(false);
        btnTraCuuKhachHang.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTraCuuKhachHang.setMaximumSize(new java.awt.Dimension(120, 45));
        btnTraCuuKhachHang.setMinimumSize(new java.awt.Dimension(120, 45));
        btnTraCuuKhachHang.setPreferredSize(new java.awt.Dimension(120, 45));
        btnTraCuuKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuKhachHangActionPerformed(evt);
            }
        });

        btnTraCuuKhuyenMai.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuuKhuyenMai.setText("Tra cứu khuyến mãi");
        btnTraCuuKhuyenMai.setBorderPainted(false);
        btnTraCuuKhuyenMai.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTraCuuKhuyenMai.setMaximumSize(new java.awt.Dimension(120, 45));
        btnTraCuuKhuyenMai.setMinimumSize(new java.awt.Dimension(120, 45));
        btnTraCuuKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 45));
        btnTraCuuKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuKhuyenMaiActionPerformed(evt);
            }
        });

        btnTraCuuNhanVien.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuuNhanVien.setText("Tra cứu nhân viên");
        btnTraCuuNhanVien.setBorderPainted(false);
        btnTraCuuNhanVien.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTraCuuNhanVien.setMaximumSize(new java.awt.Dimension(120, 45));
        btnTraCuuNhanVien.setMinimumSize(new java.awt.Dimension(120, 45));
        btnTraCuuNhanVien.setPreferredSize(new java.awt.Dimension(120, 45));
        btnTraCuuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTraCuuHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTraCuuVe, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTraCuuKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTraCuuNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTraCuuKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuuHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuuVe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuuKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuuNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuuKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnTraCuuHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraCuuHoaDonActionPerformed

    private void btnTraCuuVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraCuuVeActionPerformed

    private void btnTraCuuKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraCuuKhachHangActionPerformed

    private void btnTraCuuKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraCuuKhuyenMaiActionPerformed

    private void btnTraCuuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraCuuNhanVienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnTraCuuHoaDon;
    private javax.swing.JButton btnTraCuuKhachHang;
    private javax.swing.JButton btnTraCuuKhuyenMai;
    private javax.swing.JButton btnTraCuuNhanVien;
    private javax.swing.JButton btnTraCuuVe;
    private form.MainForm mainForm1;
    // End of variables declaration//GEN-END:variables
}
