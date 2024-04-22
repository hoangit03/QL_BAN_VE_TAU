package form;

import cell.TabelFiledTextEditor;
import cell.TableFieldTextCellRender;
import component.DataSearch;
import component.FormListDontreo;
import component.FormTabelVe;
import component.FormToaGhe;
import component.FormToaNam;
import component.IconToa;
import component.PanelSearch;
import component.TauItem;
import dao.ChoNgoiDao;
import dao.GaDao;
import dao.ToaDao;
import entity.ChoNgoi;
import entity.Chuyen;
import entity.Ga;
import entity.Toa;
import event.EvenItemGaClick;
import event.EvenItemTau;
import event.EventItemToa;
import jakarta.persistence.EntityManagerFactory;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

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

    private Ga gaDau;
    private Ga gaCuoi;
    private EntityManagerFactory emf;
    private EventItemToa eventToa;
    private EvenItemTau eventTau;
    private MainForm main;
    private FormToaGhe formGhe;
    private FormToaNam formNam;
    private FormListDontreo formDonTreo;
    private List<Chuyen> listChuyens;
    private Ga gaDi;
    private Ga gaDen;
    private LocalDate ngayDi;
    private LocalDate ngayVe;
    private boolean isMotChieu;
    private GaDao gaDao;
    private JPopupMenu menu;
    private PanelSearch search;
    private List<Ga> listGas;
    private ToaDao toaDao;
    private ChoNgoiDao choNgoiDao;
    private List<ChoNgoi> listChoChon;
    DefaultTableModel model;

    public FormChonTau(EntityManagerFactory emf,MainForm main,List<Chuyen> listChuyens, Ga gaDi, Ga gaDen, LocalDate ngayDi, LocalDate ngayVe,boolean isMotChieu) {
    	this.emf = emf;
    	this.main = main;
    	this.listChuyens = listChuyens;
    	this.gaDi = gaDi;
    	this.gaDen = gaDen;
    	this.ngayDi = ngayDi;
    	this.ngayVe = ngayVe;
    	this.isMotChieu = isMotChieu;
    	this.toaDao = new ToaDao(emf);
    	this.gaDao = new GaDao(emf);
    	this.choNgoiDao = new ChoNgoiDao(emf);
        this.listGas = gaDao.getAllGa();
        this.gaDau = gaDao.layGaDau();
        this.gaCuoi = gaDao.layGaCuoi();
        this.listChoChon = new ArrayList<ChoNgoi>(); 
        initComponents();
        model = (DefaultTableModel) tbListVe.getModel();
        jpIfHanhTrinh.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin hành trình", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.black));
        jpIfHanhTrinh.setBackground(Color.white);
        jpIfHanhKhach.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin khách hàng", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.black));
        jpChieu.setBackground(Color.white);
        jpChieu.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Chiều mua vé", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.black));
        jpIfHanhKhach.setBackground(Color.white);
        jpIfve.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin vé", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.black));
        jpIfve.setBackground(Color.white);
        jpChucNang.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Nghiệp vụ", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.black));
        jpChucNang.setBackground(Color.white);
        scp.setHorizontalScrollBar(new ScrollBar());
        spListKhoang.setHorizontalScrollBar(new ScrollBar2());
        scpTbVe.setVerticalScrollBar(new ScrollBar());
        tbListVe.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
//        tbListVe.getColumnModel().getColumn(0).setCellRenderer(new TableFieldTextCellRender());
//        tbListVe.getColumnModel().getColumn(0).setCellEditor(new TabelFiledTextEditor());
        tbListVe.getTableHeader().setPreferredSize(new Dimension(30,30));
        ((DefaultTableCellRenderer)tbListVe.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        AddDataTau();
        AddDataTableVe();
        menu = new JPopupMenu();
        search = new PanelSearch();
        menu.setBorder(BorderFactory.createLineBorder(new Color(176, 176, 176)));
        menu.add(search);
        menu.setFocusable(false);
        updateDataChuyen();
        
    }

//    Du lieu toa
    private void AddDataToa(Chuyen chuyen) {
        listIconTau.removeAll();
        setEventToa(new EventItemToa() {
            @Override
            public void itemClick(Component com, Toa toa) {
                setSelectedToa(com,toa,chuyen.getMaChuyen());
            }

        });
        IconToa dau = new IconToa();
        dau.setData(new ImageIcon(getClass().getResource("/icon/trainHead.png")), chuyen.getTau().getMaTau());
        listIconTau.add(dau);
        List<Toa> listToas = toaDao.getAllToaByMaChuyen(chuyen.getTau().getMaTau());
        for(Toa toa : listToas) {
        	addItemToa(toa);
        }
        Component com = listIconTau.getComponent(listToas.get(0).getViTri());
        setSelectedToa(com,listToas.get(0),chuyen.getMaChuyen());
    }

    public void addItemToa(Toa toa) {
        IconToa icontoa = new IconToa();
        icontoa.setData(toa.getViTri());
        icontoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    eventToa.itemClick(icontoa, toa);
                }
            }

        });
        listIconTau.add(icontoa);
        listIconTau.repaint();
        listIconTau.revalidate();
    }

    public void setSelectedToa(Component item,Toa toa,String maChuyen) {
    	if(((IconToa) item).isSeleted())
    		return;
        for (Component com : listIconTau.getComponents()) {
            IconToa i = (IconToa) com;
            if (i.isSeleted()) {
                i.setSeleted(false);
            }
        }
        ((IconToa) item).setSeleted(true);
        int index = toa.getViTri();
        
        if (index < 5) {
        	List<ChoNgoi> lisNgois = choNgoiDao.getAllChoNgoiTrongVTToa(gaDi.getId(), gaDen.getId(), maChuyen, index);
            spListKhoang.setViewportView(formGhe = new FormToaGhe(lisNgois,listChoChon,model));
            lbifToa.setText("Toa " + index + ": Ngồi mền điều hòa");
        } else if (index < 8) {
        	List<ChoNgoi> lisNgois = choNgoiDao.getAllChoNgoiTrongVTToa(gaDi.getId(), gaDen.getId(), maChuyen, index);
            spListKhoang.setViewportView(formNam = new FormToaNam(6,lisNgois,listChoChon,model));
            lbifToa.setText("Toa " + index + ": Giường nằm khoang 6 điều hòa");
        } else {
        	List<ChoNgoi> lisNgois = choNgoiDao.getAllChoNgoiTrongVTToa(gaDi.getId(), gaDen.getId(), maChuyen, index);
            spListKhoang.setViewportView(formNam = new FormToaNam(4,lisNgois,listChoChon,model));
            lbifToa.setText("Toa " + index + ": Giường nằm khoang 4 điều hòa");
        }
    }

//    Du lieu tau
    private void AddDataTau() {
        setEvent(new EvenItemTau() {
            @Override
            public void itemClick(Component com, Model_Tau item) {
                if(setSelectedTau(com)) 
                	AddDataToa(item.getChuyen());
            }

        });
        for (Chuyen chuyen : listChuyens) {
            if(isMotChieu)
            	addItemTau(new Model_Tau(chuyen,gaDi,gaDen,gaDau));
            else
            	addItemTau(new Model_Tau(chuyen,gaDi,gaDen,gaCuoi));
        }
        Component com = listTau.getComponent(0);
        ((TauItem) com).setSeleted(true);
        AddDataToa(((TauItem) com).getData().getChuyen());

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

    public boolean setSelectedTau(Component item) {
    	if(((TauItem) item).isSeleted())
    		return false;
        for (Component com : listTau.getComponents()) {
            TauItem i = (TauItem) com;
            if(i.isSeleted())
                i.setSeleted(false);
            
        }
        ((TauItem) item).setSeleted(true);
        return true;
    }

    
    private void AddDataTableVe(){
        
    }
    
    private void updateDataChuyen() {
    	jtGaDi.setText(gaDi.getTenGa());
    	jtGaDen.setText(gaDen.getTenGa());
    	if(isMotChieu) {
    		rdMotChieu.setSelected(true);
    		jrVe.setEnabled(false);
            jrDi.setSelected(true);
            dateVe.setEnabled(false);
    	}
    	else {
			rdHoiKhu.setSelected(true);
			jrVe.setEnabled(true);
			dateVe.setEnabled(true);
		}
    	dateDi.setDate(Date.from(ngayDi.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    	if(ngayVe!= null) 
    		dateVe.setDate(Date.from(ngayVe.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    	
    }
    
    private List<DataSearch> search(String text) {
        int limitData = 5;
        List<DataSearch> list = new ArrayList<DataSearch>();
        if (text.equalsIgnoreCase("")) {
            return list;
        }
        for (Ga a : listGas) {
            if (a.getTenGa().toLowerCase().contains(text)) {
                list.add(new DataSearch(a.getTenGa()));
                if (list.size() == limitData) {
                    break;
                }
            }
        }
        return list;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        groupDiVe = new javax.swing.ButtonGroup();
        scp = new javax.swing.JScrollPane();
        listTau = new component.ListTau();
        listIconTau = new component.ListIconTau();
        formIfToa1 = new component.FormIfToa();
        jpIfToa = new javax.swing.JPanel();
        lbifToa = new javax.swing.JLabel();
        spListKhoang = new javax.swing.JScrollPane();
        lbNext = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();
        formTabelVe = new component.FormTabelVe();
        scpTbVe = new javax.swing.JScrollPane();
        tbListVe = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
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
        jpIfve = new javax.swing.JPanel();
        lbTauChuyen = new javax.swing.JLabel();
        lbThoiGianLen = new javax.swing.JLabel();
        lbToaCho = new javax.swing.JLabel();
        lbMoTaVe = new javax.swing.JLabel();
        jpChieu = new javax.swing.JPanel();
        jrDi = new javax.swing.JRadioButton();
        jrVe = new javax.swing.JRadioButton();

        scp.setBorder(null);
        scp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listTau.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 20));
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
            .addGroup(formIfToa1Layout.createSequentialGroup()
                .addComponent(lbBack)
                .addGap(0, 0, 0)
                .addGroup(formIfToa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpIfToa, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addComponent(spListKhoang))
                .addGap(0, 0, 0)
                .addComponent(lbNext))
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
                        .addComponent(lbBack))
                    .addGroup(formIfToa1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lbNext)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tbListVe.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tbListVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CCCD", "Họ tên", "Đối tượng", "Thông tin vé", "Giá vé", "Giảm đối tương", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListVe.setOpaque(false);
        tbListVe.setRowHeight(30);
        tbListVe.setSelectionBackground(new java.awt.Color(204, 204, 204));
        scpTbVe.setViewportView(tbListVe);

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setText("Hủy chổ");
        jButton1.setPreferredSize(new java.awt.Dimension(96, 55));

        javax.swing.GroupLayout formTabelVeLayout = new javax.swing.GroupLayout(formTabelVe);
        formTabelVe.setLayout(formTabelVeLayout);
        formTabelVeLayout.setHorizontalGroup(
            formTabelVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpTbVe, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formTabelVeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        formTabelVeLayout.setVerticalGroup(
            formTabelVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTabelVeLayout.createSequentialGroup()
                .addComponent(scpTbVe, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbGaDi.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbGaDi.setText("Ga đi");

        lbGaDen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbGaDen.setText("Ga đến");

        btnGroup.add(rdMotChieu);
        rdMotChieu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdMotChieu.setText("Một chiều");
        rdMotChieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdMotChieuMouseClicked(evt);
            }
        });
        rdMotChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMotChieuActionPerformed(evt);
            }
        });

        btnGroup.add(rdHoiKhu);
        rdHoiKhu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdHoiKhu.setText("Khứ hồi");
        rdHoiKhu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdHoiKhuMouseClicked(evt);
            }
        });

        jtGaDi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtGaDi.setMinimumSize(new java.awt.Dimension(64, 40));
        jtGaDi.setPreferredSize(new java.awt.Dimension(64, 40));
        jtGaDi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtGaDiMouseClicked(evt);
            }
        });
        jtGaDi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtGaDiKeyReleased(evt);
            }
        });

        jtGaDen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtGaDen.setMinimumSize(new java.awt.Dimension(64, 40));
        jtGaDen.setPreferredSize(new java.awt.Dimension(64, 40));
        jtGaDen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtGaDenMouseClicked(evt);
            }
        });
        jtGaDen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtGaDenKeyReleased(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIfHanhTrinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGaDen)
                    .addComponent(lbGaDi)
                    .addComponent(lbVe)
                    .addComponent(lbNgayDi))
                .addGap(15, 15, 15)
                .addGroup(jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpIfHanhTrinhLayout.createSequentialGroup()
                        .addComponent(rdMotChieu)
                        .addGap(45, 45, 45)
                        .addComponent(rdHoiKhu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtGaDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtGaDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(jpIfHanhTrinhLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnTimChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpIfHanhTrinhLayout.setVerticalGroup(
            jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIfHanhTrinhLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGaDi)
                    .addComponent(jtGaDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtGaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGaDen))
                .addGap(6, 6, 6)
                .addGroup(jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdMotChieu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rdHoiKhu))
                .addGroup(jpIfHanhTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIfHanhTrinhLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dateDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(dateVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIfHanhTrinhLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbVe)
                        .addGap(25, 25, 25)
                        .addComponent(lbNgayDi)))
                .addGap(110, 110, 110)
                .addComponent(btnTimChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
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
                .addGap(10, 10, 10)
                .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpIfHanhKhachLayout.createSequentialGroup()
                        .addComponent(lbGaDi4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpIfHanhKhachLayout.createSequentialGroup()
                        .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGaDi2)
                            .addComponent(lbGaDi1))
                        .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpIfHanhKhachLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jtGaDi2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpIfHanhKhachLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jtGaDi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpIfHanhKhachLayout.createSequentialGroup()
                        .addComponent(lbGaDi3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtGaDi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtGaDi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        jpIfHanhKhachLayout.setVerticalGroup(
            jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIfHanhKhachLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGaDi1)
                    .addComponent(jtGaDi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGaDi2)
                    .addComponent(jtGaDi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGaDi3)
                    .addComponent(jtGaDi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jpIfHanhKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGaDi4)
                    .addComponent(jtGaDi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(btnTreoDon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnXuLyTreo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jpChucNangLayout.setVerticalGroup(
            jpChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuLyTreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTreoDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpIfve.setToolTipText("SE1 Long Khánh-Sài Gòn");
        jpIfve.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lbTauChuyen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbTauChuyen.setText("SE1 Long Khánh-Sài Gòn");

        lbThoiGianLen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbThoiGianLen.setText("03/04/2024 09:30");

        lbToaCho.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbToaCho.setText("Toa 2 chổ 29");

        lbMoTaVe.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbMoTaVe.setText("Nằm khoang 4 điều hòa Tầng 2");

        javax.swing.GroupLayout jpIfveLayout = new javax.swing.GroupLayout(jpIfve);
        jpIfve.setLayout(jpIfveLayout);
        jpIfveLayout.setHorizontalGroup(
            jpIfveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIfveLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpIfveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbThoiGianLen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbToaCho, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMoTaVe, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTauChuyen, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpIfveLayout.setVerticalGroup(
            jpIfveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIfveLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbTauChuyen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbThoiGianLen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbToaCho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMoTaVe)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        groupDiVe.add(jrDi);
        jrDi.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jrDi.setText("Chiều đi");

        groupDiVe.add(jrVe);
        jrVe.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jrVe.setText("Chiều về");
        jrVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrVeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpChieuLayout = new javax.swing.GroupLayout(jpChieu);
        jpChieu.setLayout(jpChieuLayout);
        jpChieuLayout.setHorizontalGroup(
            jpChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpChieuLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jrDi)
                .addGap(163, 163, 163)
                .addComponent(jrVe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpChieuLayout.setVerticalGroup(
            jpChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrVe)
                    .addComponent(jrDi))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listIconTau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scp, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpIfve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpIfHanhKhach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpIfHanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formIfToa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formTabelVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(listIconTau, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpIfHanhKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpIfve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpIfHanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(formIfToa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(formTabelVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jrVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrVeMouseClicked
    }//GEN-LAST:event_jrVeMouseClicked

    private void rdHoiKhuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdHoiKhuMouseClicked
        jrVe.setEnabled(true);
        isMotChieu = false;
        dateVe.setEnabled(true);
    }//GEN-LAST:event_rdHoiKhuMouseClicked
        
    private void rdMotChieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMotChieuMouseClicked
        jrVe.setEnabled(false);
        isMotChieu = true;
        jrDi.setSelected(true);
    }//GEN-LAST:event_rdMotChieuMouseClicked

    private void jtGaDiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtGaDiMouseClicked
    	String text = jtGaDi.getText().toLowerCase();
        search.setData(search(text));
   
        if(search.getItemSize() > 0){
            menu.show(jtGaDi, 0, jtGaDi.getHeight());
            menu.setPopupSize(jtGaDi.getWidth(), (search.getItemSize() * 45));
        }
    }//GEN-LAST:event_jtGaDiMouseClicked

    private void jtGaDenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtGaDenKeyReleased
    	search.addEventClick(new EvenItemGaClick() {
            public void itemClick(DataSearch data) {
            	menu.setVisible(false);
                jtGaDen.setText(data.getText());
            }
        });
        String text = jtGaDen.getText().toLowerCase();
        search.setData(search(text));
        if (search.getItemSize() >= 0) {
            menu.show(jtGaDen, 0, jtGaDen.getHeight());
            menu.setPopupSize(jtGaDen.getWidth(), (search.getItemSize() * 45));
        }
    }//GEN-LAST:event_jtGaDenKeyReleased

    private void jtGaDenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtGaDenMouseClicked
    	String text = jtGaDen.getText().toLowerCase();
        search.setData(search(text));
        if(search.getItemSize() > 0){
            menu.show(jtGaDen, 0, jtGaDen.getHeight());
            menu.setPopupSize(jtGaDen.getWidth(), (search.getItemSize() * 45));
        }
    }//GEN-LAST:event_jtGaDenMouseClicked

    private void jtGaDiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtGaDiKeyReleased
    	search.addEventClick(new EvenItemGaClick() {
            public void itemClick(DataSearch data) {
            	menu.setVisible(false);
                jtGaDi.setText(data.getText());
            }
        });
        String text = jtGaDi.getText().toLowerCase();
        search.setData(search(text));
        if (search.getItemSize() >= 0) {
            menu.show(jtGaDi, 0, jtGaDi.getHeight());
            menu.setPopupSize(jtGaDi.getWidth(), (search.getItemSize() * 45));
        }
    }//GEN-LAST:event_jtGaDiKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnTimChuyen;
    private javax.swing.JButton btnTreoDon;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXuLyTreo;
    private com.toedter.calendar.JDateChooser dateDi;
    private com.toedter.calendar.JDateChooser dateVe;
    private component.FormIfToa formIfToa1;
    private component.FormTabelVe formTabelVe;
    private javax.swing.ButtonGroup groupDiVe;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jpChieu;
    private javax.swing.JPanel jpChucNang;
    private javax.swing.JPanel jpIfHanhKhach;
    private javax.swing.JPanel jpIfHanhTrinh;
    private javax.swing.JPanel jpIfToa;
    private javax.swing.JPanel jpIfve;
    private javax.swing.JRadioButton jrDi;
    private javax.swing.JRadioButton jrVe;
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
    private javax.swing.JLabel lbMoTaVe;
    private javax.swing.JLabel lbNext;
    private javax.swing.JLabel lbNgayDi;
    private javax.swing.JLabel lbTauChuyen;
    private javax.swing.JLabel lbThoiGianLen;
    private javax.swing.JLabel lbToaCho;
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
