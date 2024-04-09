
package component;

import event.EventItemChoNgoi;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KhoangGhe extends javax.swing.JPanel {

    public EventItemChoNgoi getEvent() {
        return event;
    }

    public void setEvent(EventItemChoNgoi event) {
        this.event = event;
    }

    
    
    private EventItemChoNgoi event;
    

    public KhoangGhe() {
        initComponents();
        setOpaque(false);
        addDataGhe();
    }

    
    private void addDataGhe(){
        setEvent(new EventItemChoNgoi() {
            @Override
            public void itemClick(Component com, int vt) {
                System.out.println(vt);
                setSeleted(com);
            }
        });     
        for(int i = 0; i < 16; i++){
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
        listGhe.add(item);
        listGhe.repaint();
        listGhe.revalidate();
    }
    
    
    public void setSeleted(Component item){
        for(Component com : listGhe.getComponents()){
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

        listGhe = new component.listChoNgoi();

        setMaximumSize(new java.awt.Dimension(1000, 32767));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.listChoNgoi listGhe;
    // End of variables declaration//GEN-END:variables
}
