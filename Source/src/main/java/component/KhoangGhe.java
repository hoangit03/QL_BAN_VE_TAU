
package component;

import event.EventItemChoNgoi;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import entity.ChoNgoi;

public class KhoangGhe extends javax.swing.JPanel {

    public EventItemChoNgoi getEvent() {
        return event;
    }

    public void setEvent(EventItemChoNgoi event) {
        this.event = event;
    }

    
    
    private EventItemChoNgoi event;
    private List<ChoNgoi> list;

    public KhoangGhe(List<ChoNgoi> list,int from, int to) {
    	this.list = list;
        initComponents();
        setOpaque(false);
        addDataGhe(from,to);
    }

    
    private void addDataGhe(int from, int to){
        setEvent(new EventItemChoNgoi() {
            @Override
            public void itemClick(Component com, int vt) {
//            	Click Ghế
                System.out.println(vt);
                setSeleted(com);
            }
        });     
        System.out.println(list);
    }
    public void addItemGhe(int vt,ChoNgoi choNgoi){
        ChoNgoiItem item = new ChoNgoiItem();
        item.setChoNgoi(vt);
        item.setChoNgoi(choNgoi);
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
