package form;

import cell.TabelFiledTextEditor;
import cell.TableFieldTextCellRender;
import component.FormListDontreo;
import component.FormTabelVe;
import component.FormToaGhe;
import component.FormToaNam;
import component.IconToa;
import component.TauItem;
import event.EvenItemTau;
import event.EventItemToa;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import model.Model_Tau;
import swing.ScrollBar;
import swing.ScrollBar2;

public class FormChonTau extends javax.swing.JPanel {

    public EvenItemTau getEvent() {
        return eventTau;
    }

    public void setEvent(EvenItemTau event) {
        this.eventTau = event;
    }

    public void setEventToa(EventItemToa eventToa) {
        this.eventToa = eventToa;
    }

    public EventItemToa getEventToa() {
        return eventToa;
    }

    private EventItemToa eventToa;
    private EvenItemTau eventTau;
    private MainForm main;
    private FormToaGhe formGhe;
    private FormToaNam formNam;
    private FormListDontreo formDonTreo;

    public FormChonTau(MainForm main) {
        initComponents();
        jpIfHanhTrinh.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin hành trình", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.black));
        jpIfHanhTrinh.setBackground(Color.white);
        jpIfHanhKhach.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin khách hàng", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.black));
        jpIfHanhKhach.setBackground(Color.white);
        jpChucNang.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Nghiệp vụ", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.black));
        jpChucNang.setBackground(Color.white);
        scp.setHorizontalScrollBar(new ScrollBar());
        spListKhoang.setHorizontalScrollBar(new ScrollBar2());
        scpTbVe.setVerticalScrollBar(new ScrollBar());
        tbListVe.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        tbListVe.getColumnModel().getColumn(0).setCellRenderer(new TableFieldTextCellRender());
        tbListVe.getColumnModel().getColumn(0).setCellEditor(new TabelFiledTextEditor());
        tbListVe.getTableHeader().setPreferredSize(new Dimension(30,30));
        
        ((DefaultTableCellRenderer)tbListVe.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        this.main = main;
        AddDataTau();
        AddDataTableVe();
    }

//    Du lieu toa
    private void AddDataToa(String name) {
        listIconTau.removeAll();
        setEventToa(new EventItemToa() {
            @Override
            public void itemClick(Component com, int vt) {
                setSelectedToa(com);

            }

        });
        IconToa dau = new IconToa();
        dau.setData(new ImageIcon(getClass().getResource("/icon/trainHead.png")), name);
        listIconTau.add(dau);
        listIconTau.repaint();
        listIconTau.revalidate();
        for (int j = 0; j <= 9; j++) {
            addItemToa(j + 1);
        }
        Component com = listIconTau.getComponent(1);
        setSelectedToa(com);
        spListKhoang.setViewportView(formGhe = new FormToaGhe());
    }

    public void addItemToa(int vt) {
        IconToa toa = new IconToa();
        toa.setData(vt);
        toa.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    eventToa.itemClick(toa, vt);

                }
            }

        });
        listIconTau.add(toa);
        listIconTau.repaint();
        listIconTau.revalidate();
    }

    public void setSelectedToa(Component item) {
        for (Component com : listIconTau.getComponents()) {
            IconToa i = (IconToa) com;
            if (i.isSeleted()) {
                i.setSeleted(false);
            }
        }
        ((IconToa) item).setSeleted(true);
        int vt = ((IconToa) item).getVitri();
        if (vt < 5) {
            spListKhoang.setViewportView(formGhe = new FormToaGhe());
            lbifToa.setText("Toa " + vt + ": Ngồi mền điều hòa");
        } else if (vt < 8) {
            spListKhoang.setViewportView(formNam = new FormToaNam(6));
            lbifToa.setText("Toa " + vt + ": Giường nằm khoang 6 điều hòa");
        } else {
            spListKhoang.setViewportView(formNam = new FormToaNam(4));
            lbifToa.setText("Toa " + vt + ": Giường nằm khoang 4 điều hòa");
        }
    }

//    Du lieu tau
    private void AddDataTau() {
        setEvent(new EvenItemTau() {
            @Override
            public void itemClick(Component com, Model_Tau item) {
                setSelectedTau(com);
                AddDataToa(item.getTenTau());
            }

        });
        int i = 0;
        for (int j = 0; j <= 5; j++) {
            addItemTau(new Model_Tau("SE0" + i++, "11/04/2024 09;40", "11/04/2024 10;45"));
        }
        Component com = listTau.getComponent(0);
        ((TauItem) com).setSeleted(true);
        AddDataToa(((TauItem) com).getData().getTenTau());

    }

    public void addItemTau(Model_Tau data) {
        TauItem item = new TauItem();
        item.setData(data);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    eventTau.itemClick(item, data);
                }
            }

        });
        listTau.add(item);
        listTau.repaint();
        listTau.revalidate();
    }

    public void setSelectedTau(Component item) {
        for (Component com : listTau.getComponents()) {
            TauItem i = (TauItem) com;
            if (i.isSeleted()) {
                i.setSeleted(false);
            }
        }
        ((TauItem) item).setSeleted(true);
    }

    
    private void AddDataTableVe(){
        
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        scp = new javax.swing.JScrollPane();
        listTau = new component.ListTau();
        listIconTau = new component.ListIconTau();
        formIfToa1 = new component.FormIfToa();
        jpIfToa = new javax.swing.JPanel();
        lbifToa = new javax.swing.JLabel();
        spListKhoang = new javax.swing.JScrollPane();
        lbNext = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();
        formTabelVe1 = new component.FormTabelVe();
        scpTbVe = new javax.swing.JScrollPane();
        tbListVe = new javax.swing.JTable();
        jpIfHanhTrinh = new javax.swing.JPanel();
        lbGaDi = new javax.swing.JLabel();
        lbGaDen = new javax.swing.JLabel();
        rdMotChieu = new javax.swing.JRadioButton();
        rdHoiKhu = new javax.swing.JRadioButton();
        jtGaDi = new javax.swing.JTextField();
        jtGaDen = new javax.swing.JTextField();
        lbNgayDi = new javax.swing.JLabel();
        dateDi = new com.toedter.calendar.JDateChooser();
        lbVe = new javax.swing.JLabel();
        dateVe = new com.toedter.calendar.JDateChooser();
        btnTimChuyen = new javax.swing.JButton();
        jpIfHanhKhach = new javax.swing.JPanel();
        lbGaDi1 = new javax.swing.JLabel();
        jtGaDi1 = new javax.swing.JTextField();
        lbGaDi2 = new javax.swing.JLabel();
        jtGaDi2 = new javax.swing.JTextField();
        lbGaDi3 = new javax.swing.JLabel();
        lbGaDi4 = new javax.swing.JLabel();
        jtGaDi3 = new javax.swing.JTextField();
        jtGaDi4 = new javax.swing.JTextField();
        jpChucNang = new javax.swing.JPanel();
        btnTreoDon = new javax.swing.JButton();
        btnXuLyTreo = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();

        scp.setBorder(null);
        scp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scp.setViewportView(listTau);

        jpIfToa.setOpaque(false);

        lbifToa.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lbifToa.setText("Toa 2: Ngồi mền điều hòa");
        jpIfToa.add(lbifToa);

        spListKhoang.setBackground(new java.awt.Color(204, 204, 204));
        spListKhoang.setBorder(null);
        spListKhoang.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lbNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N

        lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_1.png"))); // NOI18N

        javax.swing.GroupLayout formIfToa1Layout = new javax.swing.GroupLayout(formIfToa1);
        formIfToa1.setLayout(formIfToa1Layout);
        formIfToa1Layout.setHorizontalGroup(
            formIfToa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formIfToa1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpIfToa, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formIfToa1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spListKhoang, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formIfToa1Layout.setVerticalGroup(
            formIfToa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formIfToa1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpIfToa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(formIfToa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formIfToa1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spListKhoang, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formIfToa1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lbNext))
                    .addGroup(formIfToa1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lbBack)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tbListVe.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tbListVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Thông tin khách hàng", "Thông tin chổ", "Giá vé", "Giảm đối tượng", "Khuyến mãi", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListVe.setOpaque(false);
        tbListVe.setRowHeight(125);
        tbListVe.setSelectionBackground(new java.awt.Color(204, 204, 204));
        scpTbVe.setViewportView(tbListVe);
        if (tbListVe.getColumnModel().getColumnCount() > 0) {
            tbListVe.getColumnModel().getColumn(0).setMinWidth(130);
            tbListVe.getColumnModel().getColumn(0).setPreferredWidth(200);
            tbListVe.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        javax.swing.GroupLayout formTabelVe1Layout = new javax.swing.GroupLayout(formTabelVe1);
        formTabelVe1.setLayout(formTabelVe1Layout);
        formTabelVe1Layout.setHorizontalGroup(
            formTabelVe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpTbVe, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        formTabelVe1Layout.setVerticalGroup(
            formTabelVe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpTbVe, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbGaDi.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbGaDi.setText("Ga đi");

        lbGaDen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbGaDen.setText("Ga đến");

        rdMotChieu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdMotChieu.setText("Một chiều");
        rdMotChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMotChieuActionPerformed(evt);
            }
        });

        rdHoiKhu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdHoiKhu.setText("Khứ hồi");

        jtGaDi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtGaDi.setMinimumSize(new java.awt.Dimension(64, 40));
        jtGaDi.setPreferredSize(new java.awt.Dimension(64, 40));

        jtGaDen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtGaDen.setMinimumSize(new java.awt.Dimension(64, 40));
        jtGaDen.setPreferredSize(new java.awt.Dimension(64, 40));

        lbNgayDi.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbNgayDi.setText("Ngày đi");

        dateDi.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        dateDi.setPreferredSize(new java.awt.Dimension(88, 40));

        lbVe.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbVe.setText("Ngày về");

        dateVe.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        dateVe.setPreferredSize(new java.awt.Dimension(88, 40));

        btnTimChuyen.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTimChuyen.setText("Tìm");
        btnTimChuyen.setBorder(null);
        btnTimChuyen.setPreferredSize(new java.awt.Dimension(75, 55));
        btnTimChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimChuyenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpIfHanhTrinhLayout = new javax.swing.GroupLayout(jpIfHanhTrinh);
        jpIfHanhTrinh.setLayout(jpIfHanhTrinhLayout);
        jpIfHanhTrinhLayout.setHorizontalGroup(
            jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIfHanhTrinhLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(rdHoiKhu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpIfHanhTrinhLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnTimChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIfHanhTrinhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbVe)
                    .addComponent(lbNgayDi)
                    .addComponent(dateDi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(lbGaDen)
                    .addComponent(lbGaDi)
                    .addComponent(jtGaDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtGaDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdMotChieu)
                    .addComponent(dateVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpIfHanhTrinhLayout.setVerticalGroup(
            jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIfHanhTrinhLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbGaDi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtGaDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbGaDen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtGaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMotChieu)
                    .addComponent(rdHoiKhu))
                .addGap(25, 25, 25)
                .addComponent(lbNgayDi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbVe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        lbGaDi1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbGaDi1.setText("CCCD");

        jtGaDi1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtGaDi1.setMinimumSize(new java.awt.Dimension(64, 40));
        jtGaDi1.setPreferredSize(new java.awt.Dimension(64, 40));

        lbGaDi2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbGaDi2.setText("Họ tên");

        jtGaDi2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtGaDi2.setMinimumSize(new java.awt.Dimension(64, 40));
        jtGaDi2.setPreferredSize(new java.awt.Dimension(64, 40));

        lbGaDi3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbGaDi3.setText("Số điện thoại");

        lbGaDi4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbGaDi4.setText("Email");

        jtGaDi3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtGaDi3.setMinimumSize(new java.awt.Dimension(64, 40));
        jtGaDi3.setPreferredSize(new java.awt.Dimension(64, 40));

        jtGaDi4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtGaDi4.setMinimumSize(new java.awt.Dimension(64, 40));
        jtGaDi4.setPreferredSize(new java.awt.Dimension(64, 40));

        javax.swing.GroupLayout jpIfHanhKhachLayout = new javax.swing.GroupLayout(jpIfHanhKhach);
        jpIfHanhKhach.setLayout(jpIfHanhKhachLayout);
        jpIfHanhKhachLayout.setHorizontalGroup(
            jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIfHanhKhachLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtGaDi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtGaDi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtGaDi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtGaDi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpIfHanhKhachLayout.createSequentialGroup()
                        .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGaDi4)
                            .addComponent(lbGaDi3)
                            .addComponent(lbGaDi2)
                            .addComponent(lbGaDi1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpIfHanhKhachLayout.setVerticalGroup(
            jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIfHanhKhachLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbGaDi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtGaDi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbGaDi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtGaDi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbGaDi3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtGaDi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbGaDi4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtGaDi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTreoDon.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTreoDon.setText("Treo đơn tạm");
        btnTreoDon.setBorder(null);
        btnTreoDon.setMinimumSize(new java.awt.Dimension(66, 55));
        btnTreoDon.setPreferredSize(new java.awt.Dimension(66, 55));

        btnXuLyTreo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnXuLyTreo.setText("Xử lý đơn tạm");
        btnXuLyTreo.setBorder(null);
        btnXuLyTreo.setMinimumSize(new java.awt.Dimension(66, 55));
        btnXuLyTreo.setPreferredSize(new java.awt.Dimension(66, 55));
        btnXuLyTreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuLyTreoActionPerformed(evt);
            }
        });

        btnXacNhan.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnXacNhan.setText("Xác nhận mua vé");
        btnXacNhan.setActionCommand("");
        btnXacNhan.setBorder(null);
        btnXacNhan.setMinimumSize(new java.awt.Dimension(66, 55));
        btnXacNhan.setPreferredSize(new java.awt.Dimension(66, 55));

        javax.swing.GroupLayout jpChucNangLayout = new javax.swing.GroupLayout(jpChucNang);
        jpChucNang.setLayout(jpChucNangLayout);
        jpChucNangLayout.setHorizontalGroup(
            jpChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpChucNangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTreoDon, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnXuLyTreo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jpChucNangLayout.setVerticalGroup(
            jpChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpChucNangLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTreoDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuLyTreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formIfToa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpIfHanhKhach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpIfHanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listIconTau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scp, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formTabelVe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(listIconTau, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(formIfToa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(formTabelVe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpIfHanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpIfHanhKhach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdMotChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMotChieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMotChieuActionPerformed

    private void btnTimChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimChuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimChuyenActionPerformed

    private void btnXuLyTreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuLyTreoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formDonTreo = new FormListDontreo();
                formDonTreo.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnXuLyTreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnTimChuyen;
    private javax.swing.JButton btnTreoDon;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXuLyTreo;
    private com.toedter.calendar.JDateChooser dateDi;
    private com.toedter.calendar.JDateChooser dateVe;
    private component.FormIfToa formIfToa1;
    private component.FormTabelVe formTabelVe1;
    private javax.swing.JPanel jpChucNang;
    private javax.swing.JPanel jpIfHanhKhach;
    private javax.swing.JPanel jpIfHanhTrinh;
    private javax.swing.JPanel jpIfToa;
    private javax.swing.JTextField jtGaDen;
    private javax.swing.JTextField jtGaDi;
    private javax.swing.JTextField jtGaDi1;
    private javax.swing.JTextField jtGaDi2;
    private javax.swing.JTextField jtGaDi3;
    private javax.swing.JTextField jtGaDi4;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbGaDen;
    private javax.swing.JLabel lbGaDi;
    private javax.swing.JLabel lbGaDi1;
    private javax.swing.JLabel lbGaDi2;
    private javax.swing.JLabel lbGaDi3;
    private javax.swing.JLabel lbGaDi4;
    private javax.swing.JLabel lbNext;
    private javax.swing.JLabel lbNgayDi;
    private javax.swing.JLabel lbVe;
    private javax.swing.JLabel lbifToa;
    private component.ListIconTau listIconTau;
    private component.ListTau listTau;
    private javax.swing.JRadioButton rdHoiKhu;
    private javax.swing.JRadioButton rdMotChieu;
    private javax.swing.JScrollPane scp;
    private javax.swing.JScrollPane scpTbVe;
    private javax.swing.JScrollPane spListKhoang;
    private javax.swing.JTable tbListVe;
    // End of variables declaration//GEN-END:variables
}
