
package component;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import entity.ChoNgoi;

public class FormToaNam extends javax.swing.JPanel {

    private int soLuong;
    private List<ChoNgoi> list;
    private List<ChoNgoi> listChon;
    private DefaultTableModel model;
    public FormToaNam(int soluong,List<ChoNgoi> list,List<ChoNgoi> listChon,DefaultTableModel model) {
        initComponents();
        setOpaque(false);
        this.list = list;
        this.soLuong = soluong;
        this.model = model;
        addDataKhoangGhe();
        repaint();
        revalidate();
    }
    
    private void addDataKhoangGhe(){
        for(int i=1; i<= 6; i++){
            addItemKhoang(i,soLuong);
        }
    }

    public void addItemKhoang(int i,int soLuong){
        KhoangNam item = new KhoangNam(i,soLuong,list,model);
        listKhoangNam.add(item);
        listKhoangNam.repaint();
        listKhoangNam.revalidate();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listKhoangNam = new component.listKhoangNam();

        listKhoangNam.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listKhoangNam, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listKhoangNam, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.listKhoangNam listKhoangNam;
    // End of variables declaration//GEN-END:variables
}
