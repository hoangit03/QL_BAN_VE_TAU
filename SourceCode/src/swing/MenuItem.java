
package swing;

import event.EventMenuSelected;
import model.Model_Menu;
import event.EvenMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;

public class MenuItem extends javax.swing.JPanel {

    private float alpha;
    private Model_Menu menu;
    private boolean open;
    private EventMenuSelected eventSelected;
    private int index;

    public boolean isOpen() {
        return open;
    }

    public EventMenuSelected getEventSelected() {
        return eventSelected;
    }

    public int getIndex() {
        return index;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setEventSelected(EventMenuSelected eventSelected) {
        this.eventSelected = eventSelected;
    }

    
    public MenuItem(Model_Menu menu, EvenMenu evenMenu,EventMenuSelected eventSeleted, int inedx) {
        initComponents();
        this.menu = menu;
        this.eventSelected = eventSeleted;
        this.index = inedx;
        setOpaque(false);
        setLayout(new MigLayout("wrap, fillx, insets 0", "[fill]", "[fill, 64!]0[fill, 50!]"));
        MenuButton firstItem = new MenuButton("    "+menu.getName(),menu.getIcon());
        firstItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (menu.getSubMenu().length > 0) {
                    if (evenMenu.menuPressed(MenuItem.this, !open)) {
                        open = !open;
                    }
                }
                eventSelected.menuSelected(index, -1);
            }
            
        });
        add(firstItem);
        int subMenuIndex = -1;
        for(String st: menu.getSubMenu()){
            MenuButton item = new MenuButton(st);
            item.setIndex(++subMenuIndex);
            item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    eventSelected.menuSelected(index, item.getIndex());
                }
            });
            add(item);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
