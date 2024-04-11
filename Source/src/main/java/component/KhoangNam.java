
package component;

import event.EventItemChoNgoi;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class KhoangNam extends javax.swing.JPanel {

    
    private int vtToa;
    private int soLuong;

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    

    public int getVtToa() {
        return vtToa;
    }

    public void setVtToa(int vtToa) {
        this.vtToa = vtToa;
        lbVT.setText("Khoang "+vtToa);
    }
    
    
    public KhoangNam(int soLuong) {
        initComponents();
        this.soLuong = soLuong;
        setOpaque(false);
        addDataGhe();
    }
    
    public EventItemChoNgoi getEvent() {
        return event;
    }

    public void setEvent(EventItemChoNgoi event) {
        this.event = event;
    }

    private EventItemChoNgoi event;
    private void addDataGhe(){
        setEvent(new EventItemChoNgoi() {
            @Override
            public void itemClick(Component com, int vt) {
                System.out.println(vt);
                setSeleted(com);
            }
        });     
        for(int i = 0; i < soLuong; i++){
            addItemGhe(i+1);
        }
    }
    public void addItemGhe(int vt){
        ChoNgoiItem item = new ChoNgoiItem();
        item.setChoNgoi(vt);
        item.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                event.itemClick(item, vt);
            }
            
        });
        listChoNgoi.add(item);
        listChoNgoi.repaint();
        listChoNgoi.revalidate();
    }
    
    
    public void setSeleted(Component item){
        for(Component com : listChoNgoi.getComponents()){
            ChoNgoiItem i = (ChoNgoiItem) com;
            if(i.getViTri() == ((ChoNgoiItem)item).getViTri() && i.isSelected()){
                i.setSelected(false);
                return;
            }
        }
        ((ChoNgoiItem)item).setSelected(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVT = new javax.swing.JLabel();
        jp1 = new javax.swing.JPanel();
        jp2 = new javax.swing.JPanel();
        listChoNgoi = new component.listChoNgoi();

        lbVT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbVT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVT.setText("Khoang 1");

        jp1.setBackground(new java.awt.Color(102, 102, 102));
        jp1.setForeground(new java.awt.Color(51, 0, 51));
        jp1.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jp2.setBackground(new java.awt.Color(102, 102, 102));
        jp2.setForeground(new java.awt.Color(51, 0, 51));
        jp2.setPreferredSize(new java.awt.Dimension(4, 166));

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbVT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(listChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JLabel lbVT;
    private component.listChoNgoi listChoNgoi;
    // End of variables declaration//GEN-END:variables
}
