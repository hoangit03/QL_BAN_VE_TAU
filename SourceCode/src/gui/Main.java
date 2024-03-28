
package gui;

import component.Herder;
import component.Menu;
import event.EventMenuSelected;
import from.GD_Chinh;
import from.MainForm;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;


public class Main extends javax.swing.JFrame {

    
    private MigLayout layout;
    private Menu menu;
    private Herder herder;
    private MainForm main;
    
    public Main() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setLocation(0, 0);
        setResizable(false);
        init();
    }
    
    public void init(){
        layout = new MigLayout("fill","0[]0[100%,fill]0","0[fill,top]0");
        bg.setLayout(layout);
        menu = new Menu();
        herder = new Herder();
        main = new MainForm();
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu Index : " + menuIndex + " SubMenu Index " + subMenuIndex);
//                if (menuIndex == 0) {
//                    if (subMenuIndex == 0) {
//                        main.showForm(new Form_Home());
//                    } else if (subMenuIndex == 1) {
//                        main.showForm(new Form1());
//                    }
//                }
            }
        });
        menu.initMenuItem();
        bg.add(menu,"w 300!, spany 2");
        bg.add(herder,"h 100!,wrap");
        bg.add(main,"w 100%, h 100%");
        
        main.add(new GD_Chinh());
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ứng dụng bán vé tàu tại đại lý Aplus");
        setPreferredSize(new java.awt.Dimension(2000, 1100));

        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1712, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1129, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
