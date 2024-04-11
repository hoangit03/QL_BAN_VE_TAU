
package form;

import form.MainForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMuaVe extends javax.swing.JPanel {

    private MainForm main;
    public FormMuaVe(MainForm main) {
        initComponents();
        this.main = main;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboGaDi = new javax.swing.JComboBox<>();
        cboGaDen = new javax.swing.JComboBox<>();
        radBtnMotChieu = new javax.swing.JRadioButton();
        radBtnKhuHoi = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ngayDi = new com.toedter.calendar.JDateChooser();
        ngayVe = new com.toedter.calendar.JDateChooser();
        btnTimChuyen = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1600, 1000));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/muaveImgBack.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ga đi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ga đến");

        cboGaDi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cboGaDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboGaDi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        cboGaDi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboGaDiFocusGained(evt);
            }
        });
        cboGaDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGaDiActionPerformed(evt);
            }
        });

        cboGaDen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cboGaDen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboGaDen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        cboGaDen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboGaDenFocusGained(evt);
            }
        });
        cboGaDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGaDenActionPerformed(evt);
            }
        });

        buttonGroup1.add(radBtnMotChieu);
        radBtnMotChieu.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        radBtnMotChieu.setText("Một chiều");
        radBtnMotChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnMotChieuActionPerformed(evt);
            }
        });

        buttonGroup1.add(radBtnKhuHoi);
        radBtnKhuHoi.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        radBtnKhuHoi.setText("Khứ hồi");
        radBtnKhuHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnKhuHoiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ngày đi");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ngày về");

        ngayDi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ngayDi.setDateFormatString("dd/MM/yyyy");
        ngayDi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ngayDi.setMaxSelectableDate(new java.util.Date(253370743311000L));
        ngayDi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ngayDiFocusGained(evt);
            }
        });

        ngayVe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ngayVe.setDateFormatString("dd/MM/yyyy");
        ngayVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ngayVe.setMaxSelectableDate(new java.util.Date(253370743311000L));

        btnTimChuyen.setBackground(new java.awt.Color(204, 204, 255));
        btnTimChuyen.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        btnTimChuyen.setForeground(new java.awt.Color(102, 102, 255));
        btnTimChuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnTimChuyen.setText("Tìm kiếm");
        btnTimChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimChuyenActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thông tin hành trình");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(radBtnMotChieu)
                        .addGap(50, 50, 50)
                        .addComponent(radBtnKhuHoi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboGaDen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGaDi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ngayVe, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnTimChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cboGaDi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboGaDen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radBtnKhuHoi)
                    .addComponent(radBtnMotChieu))
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(ngayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ngayVe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(btnTimChuyen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void cboGaDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGaDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGaDenActionPerformed

    private void cboGaDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGaDiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGaDiActionPerformed

    private void radBtnKhuHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnKhuHoiActionPerformed
        // TODO add your handling code here:
        if (radBtnKhuHoi.isSelected()) {
            ngayVe.setEnabled(true);
        }
    }//GEN-LAST:event_radBtnKhuHoiActionPerformed

    private void cboGaDenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboGaDenFocusGained
        // TODO add your handling code here:
        cboGaDen.setSelectedItem(null);
    }//GEN-LAST:event_cboGaDenFocusGained

    private void cboGaDiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboGaDiFocusGained
        // TODO add your handling code here:
        cboGaDi.setSelectedItem(null);
    }//GEN-LAST:event_cboGaDiFocusGained

    private void ngayDiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ngayDiFocusGained

    }//GEN-LAST:event_ngayDiFocusGained

    private void btnTimChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimChuyenActionPerformed
        // TODO add your handling code here:
        main.showForm(new FormChonTau(main));
    }//GEN-LAST:event_btnTimChuyenActionPerformed

    private void radBtnMotChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnMotChieuActionPerformed
        // TODO add your handling code here:
        if (radBtnMotChieu.isSelected()) {
            ngayVe.setEnabled(false);
        }
    }//GEN-LAST:event_radBtnMotChieuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimChuyen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboGaDen;
    private javax.swing.JComboBox<String> cboGaDi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser ngayDi;
    private com.toedter.calendar.JDateChooser ngayVe;
    private javax.swing.JRadioButton radBtnKhuHoi;
    private javax.swing.JRadioButton radBtnMotChieu;
    // End of variables declaration//GEN-END:variables
}