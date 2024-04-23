
package component;

import event.EventItemChoNgoi;
import model.Model_Tau;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.table.DefaultTableModel;

import entity.ChoNgoi;
import entity.Chuyen;

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
    private Map<String, Set<ChoNgoi>> listChon;
    private Model_Tau chuyen;

    public KhoangGhe(List<ChoNgoi> list,Map<String, Set<ChoNgoi>> listChon2, DefaultTableModel model,Model_Tau chuyen2,int from, int to) {
    	this.list = list;
    	this.model = model;
    	this.listChon = listChon2;
    	this.chuyen = chuyen2; 
        initComponents();
        setOpaque(false);
        addDataGhe(from,to);
    }

    
    private void addDataGhe(int from, int to){
        setEvent(new EventItemChoNgoi() {
            @Override
            public void itemClick(Component com, ChoNgoi choNgoi) {
                setSeleted(com,choNgoi);
            }
        }); 
        int temp;
        for(int i = from; i <= to;i++) {
        	temp = getIndexChoNgoiTrong(i);
        	if(temp >= 0)
        		if(checkDataSelect(list.get(temp)))
        			addItemGhe(i, list.get(temp), true);
        		else
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
    
    private boolean checkDataSelect(ChoNgoi choNgoi) {
        for (Map.Entry<String, Set<ChoNgoi>> entry : listChon.entrySet()) {
            String maChuyen = entry.getKey();
            Set<ChoNgoi> danhSachChoNgoi = entry.getValue();
            for (ChoNgoi cn : danhSachChoNgoi) {
                if (cn.equals(choNgoi) && maChuyen.equalsIgnoreCase(chuyen.getChuyen().getMaChuyen())) {
                    return true;
                }
            }
        }
        return false;
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
    
    
    public void setSeleted(Component item,ChoNgoi choNgoi){
    	String keyName = chuyen.getChuyen().getMaChuyen();
        for(Component com : listGhe.getComponents()){
            ChoNgoiItem i = (ChoNgoiItem) com;
            if(i.getViTri() == ((ChoNgoiItem)item).getViTri() && i.isSelected()){
                i.setSelected(false);
                if(listChon.containsKey(keyName)) {
                	Set<ChoNgoi> list = listChon.get(keyName);
                	list.remove(choNgoi);
                }
                	
                return;
            }
        }
        ((ChoNgoiItem)item).setSelected(true);
        if(!listChon.containsKey(keyName)) {
        	Set<ChoNgoi> newCN = new HashSet<ChoNgoi>();
        	newCN.add(choNgoi);
        	listChon.put(keyName, newCN);
        }
        else {
        	listChon.get(keyName).add(choNgoi);
        }
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
