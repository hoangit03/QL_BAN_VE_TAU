package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.NhanVienDao;
import entity.NhanVien;
import jakarta.persistence.EntityManagerFactory;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableColumn;

public class FormTraCuuNhanVien extends javax.swing.JPanel {

    private EntityManagerFactory emf;
    private NhanVienDao nhanVienDao;
    private SimpleDateFormat format = new SimpleDateFormat();

    public FormTraCuuNhanVien(EntityManagerFactory emf) {
        this.emf = emf;
        initComponents();
        formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
        formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
                "Thông tin nhân viên", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.BOLD, 20) {
        }, Color.WHITE));
        tableTraCuuNV.setShowGrid(false);
        tableTraCuuNV.setShowHorizontalLines(false);
        tableTraCuuNV.setShowVerticalLines(false);
        tableTraCuuNV.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        tableTraCuuNV.getTableHeader().setPreferredSize(new Dimension(30, 30));
        ((DefaultTableCellRenderer) tableTraCuuNV.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(JLabel.CENTER);
        nhanVienDao = new NhanVienDao(emf);
        List<NhanVien> list = nhanVienDao.getAllNhanVien();
        addDataTable(list);
    }

    private void addDataTable(List<NhanVien> list) {
        DefaultTableModel model = (DefaultTableModel) tableTraCuuNV.getModel();
        model.setRowCount(0);

        for (NhanVien nhanVien : list) {
            Object ngaySinhFormatted = ""; // Khởi tạo giá trị mặc định

            // Kiểm tra và định dạng ngày sinh nếu không null
            if (nhanVien.getNgaySinh() != null) {
                ngaySinhFormatted = nhanVien.getNgaySinh().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            }

            Object[] row = {nhanVien.getMaNhanVien(), nhanVien.getCccd(), nhanVien.getHoTen(), ngaySinhFormatted,
                nhanVien.isGioiTinh() ? "Nam" : "Nữ", nhanVien.getDiaChi(), nhanVien.getEmail(), nhanVien.getSdt(),
                nhanVien.getTrangThai() ? "Đang làm" : "Nghỉ làm"};
            model.addRow(row);
        }
        model.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTraCuuNV = new javax.swing.JTable();
        formThongTin = new form.Form();
        lbMaNV = new javax.swing.JLabel();
        jtMaNV = new javax.swing.JTextField();
        lbCCCD = new javax.swing.JLabel();
        jtCCCD = new javax.swing.JTextField();
        btnTraCuu = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        lbTrangThai = new javax.swing.JLabel();
        jMess = new javax.swing.JPanel();
        jcbTrangThai = new javax.swing.JComboBox<>();
        btnLoc = new javax.swing.JButton();
        lbSDT = new javax.swing.JLabel();
        jtSDT = new javax.swing.JTextField();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 968));

        tableTraCuuNV.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tableTraCuuNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "CCCD", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Email", "Số điện thoại", "Trạng thái"
            }
        ));
        tableTraCuuNV.setRowHeight(30);
        tableTraCuuNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTraCuuNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTraCuuNV);
        if (tableTraCuuNV.getColumnModel().getColumnCount() > 0) {
            tableTraCuuNV.getColumnModel().getColumn(0).setResizable(false);
            tableTraCuuNV.getColumnModel().getColumn(1).setResizable(false);
            tableTraCuuNV.getColumnModel().getColumn(2).setResizable(false);
            tableTraCuuNV.getColumnModel().getColumn(3).setResizable(false);
            tableTraCuuNV.getColumnModel().getColumn(4).setResizable(false);
            tableTraCuuNV.getColumnModel().getColumn(5).setResizable(false);
            tableTraCuuNV.getColumnModel().getColumn(6).setResizable(false);
            tableTraCuuNV.getColumnModel().getColumn(7).setResizable(false);
            tableTraCuuNV.getColumnModel().getColumn(8).setResizable(false);
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < tableTraCuuNV.getColumnCount(); i++) {
            tableTraCuuNV.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        int[] columnWidths = {100, 100, 150, 100, 70, 200, 180, 100, 100}; // Mảng chứa kích thước cố định của từng cột
        for (int i = 0; i < columnWidths.length; i++) {
            TableColumn column = tableTraCuuNV.getColumnModel().getColumn(i);
            column.setPreferredWidth(columnWidths[i]);
        }

        lbMaNV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMaNV.setForeground(new java.awt.Color(255, 255, 255));
        lbMaNV.setText("Mã nhân viên");

        jtMaNV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMaNV.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jtMaNV.setPreferredSize(new java.awt.Dimension(300, 40));
        jtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMaNVActionPerformed(evt);
            }
        });

        lbCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbCCCD.setForeground(new java.awt.Color(255, 255, 255));
        lbCCCD.setText("CCCD");

        jtCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtCCCD.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jtCCCD.setPreferredSize(new java.awt.Dimension(64, 40));

        btnTraCuu.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuu.setText("Tra Cứu");
        btnTraCuu.setBorder(null);
        btnTraCuu.setBorderPainted(false);
        btnTraCuu.setFocusPainted(false);
        btnTraCuu.setPreferredSize(new java.awt.Dimension(103, 55));
        btnTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuActionPerformed(evt);
            }
        });

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

        lbTrangThai.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTrangThai.setForeground(new java.awt.Color(255, 255, 255));
        lbTrangThai.setText("Trạng thái");

        jMess.setBackground(new java.awt.Color(44, 83, 100));

        javax.swing.GroupLayout jMessLayout = new javax.swing.GroupLayout(jMess);
        jMess.setLayout(jMessLayout);
        jMessLayout.setHorizontalGroup(
            jMessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jMessLayout.setVerticalGroup(
            jMessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jcbTrangThai.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jcbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Đang làm", "Nghỉ làm" }));
        jcbTrangThai.setSelectedItem(null);
        jcbTrangThai.setAutoscrolls(true);
        jcbTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTrangThaiActionPerformed(evt);
            }
        });

        btnLoc.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.setBorder(null);
        btnLoc.setBorderPainted(false);
        btnLoc.setFocusPainted(false);
        btnLoc.setPreferredSize(new java.awt.Dimension(103, 55));
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        lbSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbSDT.setForeground(new java.awt.Color(255, 255, 255));
        lbSDT.setText("Số điện thoại");

        jtSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtSDT.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jtSDT.setPreferredSize(new java.awt.Dimension(64, 40));
        jtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formThongTinLayout = new javax.swing.GroupLayout(formThongTin);
        formThongTin.setLayout(formThongTinLayout);
        formThongTinLayout.setHorizontalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formThongTinLayout.createSequentialGroup()
                                .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbMaNV, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCCCD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        formThongTinLayout.setVerticalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNV)
                    .addComponent(jtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCCCD)
                    .addComponent(jtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTrangThai))
                .addGap(18, 18, 18)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSDT)
                    .addComponent(jtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSDTActionPerformed

    private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTraCuuActionPerformed
        FindBySDT();
        FindByMa();
        
    }// GEN-LAST:event_btnTraCuuActionPerformed

    private void jcbTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jcbTrangThaiActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jcbTrangThaiActionPerformed

    private void jtMaNVActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtMaNVActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jtMaNVActionPerformed

    private void tableTraCuuNVMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableTraCuuNVMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableTraCuuNV.getModel();
        int index = tableTraCuuNV.getSelectedRow();
        if (index < 0) {
            return;
        }
        jtMaNV.setText(model.getValueAt(index, 0).toString());
        jtCCCD.setText(model.getValueAt(index, 1).toString());
        jcbTrangThai.setSelectedItem(model.getValueAt(index, 8));
        jtSDT.setText(model.getValueAt(index, 7).toString());
    }// GEN-LAST:event_tableTraCuuNVMouseClicked

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLocActionPerformed
        // TODO add your handling code here:
        Object selectedItem = jcbTrangThai.getSelectedItem();
        if (selectedItem != null) {
            String sltTT = selectedItem.toString();
            DefaultTableModel model = (DefaultTableModel) tableTraCuuNV.getModel();
            model.setRowCount(0);

            if (!sltTT.equals("Tất cả")) {

                List<NhanVien> l = nhanVienDao.getNhanVienByTrangThaiForUser(sltTT.equals("Đang làm"));

                for (NhanVien nv : l) {
                    Object ngaySinhFormatted = ""; // Khởi tạo giá trị mặc định

                    // Kiểm tra và định dạng ngày sinh nếu không null
                    if (nv.getNgaySinh() != null) {
                        ngaySinhFormatted = nv.getNgaySinh().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    }

                    model.addRow(new Object[]{nv.getMaNhanVien(), nv.getCccd(), nv.getHoTen(), ngaySinhFormatted,
                        nv.isGioiTinh() ? "Nam" : "Nữ", nv.getDiaChi(), nv.getEmail(), nv.getSdt(),
                        nv.getTrangThai() ? "Đang làm" : "Nghỉ làm"});
                }
            } else {
                List<NhanVien> allNhanVien = nhanVienDao.getAllNhanVien();
                addDataTable(allNhanVien);
                // Bạn cần điều chỉnh phần này để đảm bảo rằng bạn sử dụng danh sách chính xác
            }
        } else {
            // Xử lý trường hợp giá trị được chọn từ combobox là null
        }

    }// GEN-LAST:event_btnLocActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaTrangActionPerformed
        jtMaNV.setText("");
        jtCCCD.setText("");
        jtSDT.setText("");
        jcbTrangThai.setSelectedIndex(-1);

    }// GEN-LAST:event_btnXoaTrangActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoaTrang;
    private form.Form formThongTin;
    private javax.swing.ButtonGroup groupRadio;
    private javax.swing.JPanel jMess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTrangThai;
    private javax.swing.JTextField jtCCCD;
    private javax.swing.JTextField jtMaNV;
    private javax.swing.JTextField jtSDT;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTrangThai;
    private javax.swing.JTable tableTraCuuNV;
    // End of variables declaration//GEN-END:variables
private void FindByMa() {
        // Sử dụng DocumentListener để theo dõi sự thay đổi trong trường jtMaNV
        jtMaNV.getDocument().addDocumentListener(new DocumentListener() {
            private ActionEvent evt;

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            private void updateSuggestions() {
                String tieuChi = jtMaNV.getText();
                boolean showMessage = (!jtMaNV.getText().trim().equals("")); // Mặc định hiển thị thông báo
//                System.out.println("UPDATING...");
                if (!tieuChi.isEmpty()) {
                    List<NhanVien> list = nhanVienDao.getNhanVienByPartialMaAndLoai(tieuChi, "User");
                    if (!list.isEmpty()) {
                        addDataTable(list);
                        showMessage = false; // Không hiển thị thông báo nếu có kết quả tìm kiếm
                    }
                }

                if (showMessage) {
                    // Chỉ hiển thị thông báo nếu biến showMessage vẫn là true
                    JOptionPane.showMessageDialog(jMess, "Không tìm thấy nhân viên với mã này", "Thông báo",
                            JOptionPane.INFORMATION_MESSAGE);
                    SwingUtilities.invokeLater(() -> btnXoaTrangActionPerformed(evt));
                }
            }
        });
    }
private void FindBySDT(){
            // Sử dụng DocumentListener để theo dõi sự thay đổi trong trường jtMaNV
        jtSDT.getDocument().addDocumentListener(new DocumentListener() {
            private ActionEvent evt;

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            private void updateSuggestions() {
                String tieuChi = jtSDT.getText();
                boolean showMessage = (!jtSDT.getText().trim().equals("")); // Mặc định hiển thị thông báo
//                System.out.println("UPDATING...");
                if (!tieuChi.isEmpty()) {
                    List<NhanVien> list = nhanVienDao.getNhanVienBySDTForUser(tieuChi, "User");
                    if (!list.isEmpty()) {
                        addDataTable(list);
                        showMessage = false; // Không hiển thị thông báo nếu có kết quả tìm kiếm
                    }
                }

                if (showMessage) {
                    // Chỉ hiển thị thông báo nếu biến showMessage vẫn là true
                    JOptionPane.showMessageDialog(jMess, "Không tìm thấy SDT với mã này", "Thông báo",
                            JOptionPane.INFORMATION_MESSAGE);
                    SwingUtilities.invokeLater(() -> btnXoaTrangActionPerformed(evt));
                }
            }
        });
}}
