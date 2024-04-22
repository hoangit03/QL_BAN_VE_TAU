
package component;

import event.EventItemChoNgoi;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.table.DefaultTableModel;

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
    private DefaultTableModel model;

    public KhoangGhe(List<ChoNgoi> list, DefaultTableModel model,int from, int to) {
    	this.list = list;
    	this.model = model;
        initComponents();
        setOpaque(false);
        addDataGhe(from,to);
    }

    
    private void addDataGhe(int from, int to){
        setEvent(new EventItemChoNgoi() {
            @Override
            public void itemClick(Component com, ChoNgoi choNgoi) {
//            	Click Ghế
                System.out.println(choNgoi);
                setSeleted(com);
            }
        }); 
        int temp;
        for(int i = from; i <= to;i++) {
        	temp = getIndexChoNgoiTrong(i);
        	if(temp >= 0)
        		addItemGhe(i, list.get(temp), false);
        	else
        		addItemGhe(i, null, true);
        }
        
    }
    
    private int getIndexChoNgoiTrong(int vt) {
    	int count = 0;
    	for(ChoNgoi choNgoi : list) {
    		if(choNgoi.getViTri()==vt)
    			return count;
    		count++;
    			
    	}
    	return -1;
    }
    
    public void addItemGhe(int vt,ChoNgoi choNgoi,boolean select){
        ChoNgoiItem item = new ChoNgoiItem();
        item.setChoNgoi(vt);
        item.setChoNgoi(choNgoi);
        item.setSelected(select);
        item.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                event.itemClick(item,choNgoi);
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
