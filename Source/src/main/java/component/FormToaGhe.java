
package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;



public class FormToaGhe extends javax.swing.JPanel {

    public FormToaGhe() {
        initComponents();
        setOpaque(false);
        addDataKhoangGhe();
        repaint();
        revalidate();
    }
    
    private void addDataKhoangGhe(){
        for(int i=0; i< 4; i++){
            addItemKhoang();
        }
    }

    public void addItemKhoang(){
        KhoangGhe item = new KhoangGhe();
        listKhoangGhe.add(item);
        listKhoangGhe.repaint();
        listKhoangGhe.revalidate();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listKhoangGhe = new component.ListKhoang();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listKhoangGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listKhoangGhe, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.ListKhoang listKhoangGhe;
    // End of variables declaration//GEN-END:variables
}
