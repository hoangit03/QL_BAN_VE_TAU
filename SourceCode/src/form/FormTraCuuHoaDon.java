package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;




public class FormTraCuuHoaDon extends javax.swing.JPanel {

    public FormTraCuuHoaDon() {
        initComponents();        
        formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
        formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin hoá đơn", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
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
        lbMaHD = new javax.swing.JLabel();
        jtMaHD = new javax.swing.JTextField();
        lbThoiGian = new javax.swing.JLabel();
        jtThoiGian = new javax.swing.JTextField();
        jTraCuuKhuyenMai = new javax.swing.JButton();
        jCBThoiGian = new javax.swing.JComboBox<>();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 968));

        tableTraCuuKM.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tableTraCuuKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hoá đơn", "CCCD", "Khách hàng", "Ngày lập", "Tổng tiền", "Trạng thái", "Ghi chú"
            }
        ));
        tableTraCuuKM.setRowHeight(30);
        jScrollPane1.setViewportView(tableTraCuuKM);
        if (tableTraCuuKM.getColumnModel().getColumnCount() > 0) {
            tableTraCuuKM.getColumnModel().getColumn(0).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(1).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(2).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(3).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(4).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(5).setResizable(false);
        }

        lbMaHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMaHD.setForeground(new java.awt.Color(255, 255, 255));
        lbMaHD.setText("Mã hoá đơn");

        jtMaHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMaHD.setBorder(null);
        jtMaHD.setPreferredSize(new java.awt.Dimension(300, 40));
        jtMaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMaHDActionPerformed(evt);
            }
        });

        lbThoiGian.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbThoiGian.setForeground(new java.awt.Color(255, 255, 255));
        lbThoiGian.setText("Thời gian");

        jtThoiGian.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtThoiGian.setBorder(null);
        jtThoiGian.setPreferredSize(new java.awt.Dimension(64, 40));
        jtThoiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtThoiGianActionPerformed(evt);
            }
        });

        jTraCuuKhuyenMai.setText("Tra cứu");
        jTraCuuKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTraCuuKhuyenMaiActionPerformed(evt);
            }
        });

        jCBThoiGian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020-2021", "2021-2022", "2022-2023", "2023-2024" }));
        jCBThoiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBThoiGianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formThongTinLayout = new javax.swing.GroupLayout(formThongTin);
        formThongTin.setLayout(formThongTinLayout);
        formThongTinLayout.setHorizontalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaHD)
                            .addComponent(lbThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formThongTinLayout.createSequentialGroup()
                                .addComponent(jtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jTraCuuKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        formThongTinLayout.setVerticalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaHD)
                    .addComponent(jtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbThoiGian)))
                    .addComponent(jCBThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jTraCuuKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtThoiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtThoiGianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtThoiGianActionPerformed

    private void jTraCuuKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTraCuuKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTraCuuKhuyenMaiActionPerformed

    private void jCBThoiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBThoiGianActionPerformed

         String selectedValue = (String) jCBThoiGian.getSelectedItem();
         jtThoiGian.setText(selectedValue);

    }//GEN-LAST:event_jCBThoiGianActionPerformed

    private void jtMaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMaHDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private form.Form formThongTin;
    private javax.swing.ButtonGroup groupRadio;
    private javax.swing.JComboBox<String> jCBThoiGian;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jTraCuuKhuyenMai;
    private javax.swing.JTextField jtMaHD;
    private javax.swing.JTextField jtThoiGian;
    private javax.swing.JLabel lbMaHD;
    private javax.swing.JLabel lbThoiGian;
    private javax.swing.JTable tableTraCuuKM;
    // End of variables declaration//GEN-END:variables

}
