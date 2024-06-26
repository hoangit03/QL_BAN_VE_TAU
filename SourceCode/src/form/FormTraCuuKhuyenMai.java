package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;




public class FormTraCuuKhuyenMai extends javax.swing.JPanel {

    public FormTraCuuKhuyenMai() {
        initComponents();
        formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
        formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin khuyến mãi", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.WHITE));
        tableTraCuuKM.setShowGrid(false);
        tableTraCuuKM.setShowHorizontalLines(false);
        tableTraCuuKM.setShowVerticalLines(false);
        tableTraCuuKM.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        tableTraCuuKM.getTableHeader().setPreferredSize(new Dimension(30,30));
        ((DefaultTableCellRenderer)tableTraCuuKM.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTraCuuKM = new javax.swing.JTable();
        formThongTin = new form.Form();
        lbMaKM = new javax.swing.JLabel();
        jtMaKM = new javax.swing.JTextField();
        lbTenKM = new javax.swing.JLabel();
        jtTenKM = new javax.swing.JTextField();
        lbChietKhau = new javax.swing.JLabel();
        jtChietKhau = new javax.swing.JTextField();
        lbNgayBatDauKM = new javax.swing.JLabel();
        jNgayBatDauKM = new com.toedter.calendar.JDateChooser();
        lbNgayKetThucKM = new javax.swing.JLabel();
        jNgayKetThucKM = new com.toedter.calendar.JDateChooser();
        btnXoaTrang = new javax.swing.JButton();
        btnTraCuu = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 968));

        tableTraCuuKM.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tableTraCuuKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã khuyến mãi", "Tên khuyến mãi", "Ngày bắt đầu khuyến mãi", "Ngày ngày kết thúc khuyến mãi", "Chiết khấu"
            }
        ));
        tableTraCuuKM.setRowHeight(30);
        jScrollPane1.setViewportView(tableTraCuuKM);
        if (tableTraCuuKM.getColumnModel().getColumnCount() > 0) {
            tableTraCuuKM.getColumnModel().getColumn(1).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(2).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(3).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(4).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(5).setResizable(false);
        }

        lbMaKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMaKM.setForeground(new java.awt.Color(255, 255, 255));
        lbMaKM.setText("Mã khuyến mãi");

        jtMaKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMaKM.setBorder(null);
        jtMaKM.setPreferredSize(new java.awt.Dimension(300, 40));

        lbTenKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTenKM.setForeground(new java.awt.Color(255, 255, 255));
        lbTenKM.setText("Tên khuyến mãi");

        jtTenKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtTenKM.setBorder(null);
        jtTenKM.setPreferredSize(new java.awt.Dimension(64, 40));
        jtTenKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTenKMActionPerformed(evt);
            }
        });

        lbChietKhau.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbChietKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbChietKhau.setText("Chiết khấu");

        jtChietKhau.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtChietKhau.setBorder(null);
        jtChietKhau.setMinimumSize(new java.awt.Dimension(64, 30));
        jtChietKhau.setPreferredSize(new java.awt.Dimension(64, 40));

        lbNgayBatDauKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbNgayBatDauKM.setForeground(new java.awt.Color(255, 255, 255));
        lbNgayBatDauKM.setText("Ngày bắt đầu");

        jNgayBatDauKM.setAlignmentX(0.0F);
        jNgayBatDauKM.setAlignmentY(0.0F);
        jNgayBatDauKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jNgayBatDauKM.setPreferredSize(new java.awt.Dimension(88, 40));

        lbNgayKetThucKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbNgayKetThucKM.setForeground(new java.awt.Color(255, 255, 255));
        lbNgayKetThucKM.setText("Ngày kết thúc");

        jNgayKetThucKM.setAlignmentX(0.0F);
        jNgayKetThucKM.setAlignmentY(0.0F);
        jNgayKetThucKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jNgayKetThucKM.setPreferredSize(new java.awt.Dimension(88, 40));

        btnXoaTrang.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnXoaTrang.setText("Xóa Trắng");
        btnXoaTrang.setBorder(null);
        btnXoaTrang.setBorderPainted(false);
        btnXoaTrang.setFocusPainted(false);
        btnXoaTrang.setPreferredSize(new java.awt.Dimension(103, 55));
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });

        btnTraCuu.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuu.setText("Tra Cứu");
        btnTraCuu.setBorder(null);
        btnTraCuu.setBorderPainted(false);
        btnTraCuu.setFocusPainted(false);
        btnTraCuu.setPreferredSize(new java.awt.Dimension(103, 55));

        javax.swing.GroupLayout formThongTinLayout = new javax.swing.GroupLayout(formThongTin);
        formThongTin.setLayout(formThongTinLayout);
        formThongTinLayout.setHorizontalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTenKM, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbChietKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNgayBatDauKM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                    .addComponent(lbNgayKetThucKM, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtChietKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtTenKM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNgayBatDauKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addComponent(jtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jNgayKetThucKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formThongTinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        formThongTinLayout.setVerticalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaKM)
                    .addComponent(jtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenKM)
                    .addComponent(jtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChietKhau))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNgayBatDauKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgayBatDauKM, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNgayKetThucKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgayKetThucKM))
                .addGap(55, 55, 55)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 402, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtTenKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTenKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTenKMActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        jtMaKM.setText("");
        jtTenKM.setText("");
        jtChietKhau.setText("");
        jNgayBatDauKM.setDate(null);
        jNgayKetThucKM.setDate(null);
    }//GEN-LAST:event_btnXoaTrangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoaTrang;
    private form.Form formThongTin;
    private javax.swing.ButtonGroup groupRadio;
    private com.toedter.calendar.JDateChooser jNgayBatDauKM;
    private com.toedter.calendar.JDateChooser jNgayKetThucKM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtChietKhau;
    private javax.swing.JTextField jtMaKM;
    private javax.swing.JTextField jtTenKM;
    private javax.swing.JLabel lbChietKhau;
    private javax.swing.JLabel lbMaKM;
    private javax.swing.JLabel lbNgayBatDauKM;
    private javax.swing.JLabel lbNgayKetThucKM;
    private javax.swing.JLabel lbTenKM;
    private javax.swing.JTable tableTraCuuKM;
    // End of variables declaration//GEN-END:variables

}
