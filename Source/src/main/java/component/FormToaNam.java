
package component;




public class FormToaNam extends javax.swing.JPanel {

    private int soLuong;
    public FormToaNam(int soluong) {
        initComponents();
        setOpaque(false);
        this.soLuong = soluong;
        addDataKhoangGhe();
        repaint();
        revalidate();
    }
    
    private void addDataKhoangGhe(){
        for(int i=0; i< 6; i++){
            addItemKhoang(i+1,soLuong);
        }
    }

    public void addItemKhoang(int i,int soLuong){
//        nằm 6
        KhoangNam item = new KhoangNam(soLuong);
//        nằm 4
//        KhoangNam item = new KhoangNam(4);
        item.setVtToa(i);
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
