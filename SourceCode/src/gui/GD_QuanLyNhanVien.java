package gui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.border.EmptyBorder;


public class GD_QuanLyNhanVien extends javax.swing.JPanel {

    public GD_QuanLyNhanVien() {
        initComponents();
        setBorder(new EmptyBorder(10,10,10,10));
        
    }


    
    
        @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#2C5364"), 0, getHeight(), Color.decode("#2C5364"));
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintChildren(g); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNhanVien = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        formNhanVien1 = new form.FormNhanVien();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1600, 1100));

        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNhanVien.setMaximumSize(new java.awt.Dimension(75, 20));
        btnNhanVien.setMinimumSize(new java.awt.Dimension(75, 20));

        btnTaiKhoan.setText("Tài khoản");
        btnTaiKhoan.setFocusTraversalPolicyProvider(true);

        formNhanVien1.setOpaque(false);

        tableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "CCCD/CMND", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Email", "Số điện thoại", "Trạng thái"
            }
        ));
        tableNV.setOpaque(false);
        jScrollPane1.setViewportView(tableNV);

        javax.swing.GroupLayout formNhanVien1Layout = new javax.swing.GroupLayout(formNhanVien1);
        formNhanVien1.setLayout(formNhanVien1Layout);
        formNhanVien1Layout.setHorizontalGroup(
            formNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formNhanVien1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 435, Short.MAX_VALUE))
        );
        formNhanVien1Layout.setVerticalGroup(
            formNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formNhanVien1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(formNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnTaiKhoan;
    private form.FormNhanVien formNhanVien1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNV;
    // End of variables declaration//GEN-END:variables
}
