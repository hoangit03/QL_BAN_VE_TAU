
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class GD_KhuyenMaiTrenKhachHang extends javax.swing.JPanel {

    public GD_KhuyenMaiTrenKhachHang() {
        initComponents();
        formText.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin khuyến mãi", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.WHITE));
        formTable.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Bảng khuyến mãi trên khách hàng", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.PLAIN,14) {
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

        formTable = new form.Form();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        formText = new form.Form();
        lbMa = new javax.swing.JLabel();
        jtMa = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        jtTen = new javax.swing.JTextField();
        lbDoiT = new javax.swing.JLabel();
        jcbDoiT = new javax.swing.JComboBox<>();
        lbTimeStart = new javax.swing.JLabel();
        jDateStart = new com.toedter.calendar.JDateChooser();
        lbTimeEnd = new javax.swing.JLabel();
        jDateEnd = new com.toedter.calendar.JDateChooser();
        lbChietK = new javax.swing.JLabel();
        jtChietK = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnNgung = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLoc = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1600, 1100));

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khuyến mãi", "Tên khuyến mãi", "Đối tượng", "Thời gian áp dụng", "Thời gian kết thúc", "Chiết khấu"
            }
        ));
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setRowHeight(30);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout formTableLayout = new javax.swing.GroupLayout(formTable);
        formTable.setLayout(formTableLayout);
        formTableLayout.setHorizontalGroup(
            formTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        formTableLayout.setVerticalGroup(
            formTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        lbMa.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMa.setForeground(new java.awt.Color(255, 255, 255));
        lbMa.setText("Mã khuyến mãi");

        jtMa.setEditable(false);
        jtMa.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMa.setBorder(null);
        jtMa.setMinimumSize(new java.awt.Dimension(64, 64));
        jtMa.setPreferredSize(new java.awt.Dimension(91, 40));

        lbTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTen.setForeground(new java.awt.Color(255, 255, 255));
        lbTen.setText("Tên khuyến mãi");

        jtTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtTen.setBorder(null);
        jtTen.setMinimumSize(new java.awt.Dimension(64, 64));
        jtTen.setPreferredSize(new java.awt.Dimension(91, 40));

        lbDoiT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbDoiT.setForeground(new java.awt.Color(255, 255, 255));
        lbDoiT.setText("Đối tượng");

        jcbDoiT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jcbDoiT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbDoiT.setBorder(null);
        jcbDoiT.setPreferredSize(new java.awt.Dimension(81, 40));

        lbTimeStart.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTimeStart.setForeground(new java.awt.Color(255, 255, 255));
        lbTimeStart.setText("Thời gian áp dụng");

        jDateStart.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jDateStart.setPreferredSize(new java.awt.Dimension(88, 40));

        lbTimeEnd.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTimeEnd.setForeground(new java.awt.Color(255, 255, 255));
        lbTimeEnd.setText("Thời gian kết thúc");

        jDateEnd.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jDateEnd.setPreferredSize(new java.awt.Dimension(88, 40));

        lbChietK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbChietK.setForeground(new java.awt.Color(255, 255, 255));
        lbChietK.setText("Chiết khấu");

        jtChietK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtChietK.setBorder(null);
        jtChietK.setMinimumSize(new java.awt.Dimension(64, 64));
        jtChietK.setPreferredSize(new java.awt.Dimension(91, 40));

        javax.swing.GroupLayout formTextLayout = new javax.swing.GroupLayout(formText);
        formText.setLayout(formTextLayout);
        formTextLayout.setHorizontalGroup(
            formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTextLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formTextLayout.createSequentialGroup()
                        .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDoiT)
                            .addComponent(lbTimeStart)
                            .addComponent(lbTimeEnd)
                            .addComponent(lbChietK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbDoiT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jtMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtChietK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbTen)
                    .addComponent(lbMa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formTextLayout.setVerticalGroup(
            formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTextLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa)
                    .addComponent(jtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen))
                .addGap(20, 20, 20)
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbDoiT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDoiT))
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formTextLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbTimeStart))
                    .addGroup(formTextLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formTextLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbTimeEnd)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formTextLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtChietK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChietK))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lbMa.getAccessibleContext().setAccessibleName("lbMa");

        btnTim.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.setBorder(null);
        btnTim.setBorderPainted(false);
        btnTim.setPreferredSize(new java.awt.Dimension(105, 55));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);
        btnThem.setPreferredSize(new java.awt.Dimension(96, 55));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnNgung.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnNgung.setText("Tạm ngưng");
        btnNgung.setBorder(null);
        btnNgung.setBorderPainted(false);
        btnNgung.setPreferredSize(new java.awt.Dimension(96, 55));
        btnNgung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgungActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setBorder(null);
        btnCapNhat.setBorderPainted(false);
        btnCapNhat.setPreferredSize(new java.awt.Dimension(96, 55));

        btnLoc.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.setBorder(null);
        btnLoc.setBorderPainted(false);
        btnLoc.setPreferredSize(new java.awt.Dimension(96, 55));
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNgung, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 568, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNgung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnNgungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNgungActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#085d81"), 0, getHeight(), Color.decode("#085d81"));
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintChildren(g); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnNgung;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private form.Form formTable;
    private form.Form formText;
    private com.toedter.calendar.JDateChooser jDateEnd;
    private com.toedter.calendar.JDateChooser jDateStart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbDoiT;
    private javax.swing.JTextField jtChietK;
    private javax.swing.JTextField jtMa;
    private javax.swing.JTextField jtTen;
    private javax.swing.JLabel lbChietK;
    private javax.swing.JLabel lbDoiT;
    private javax.swing.JLabel lbMa;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lbTimeEnd;
    private javax.swing.JLabel lbTimeStart;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
