
package components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.ModelMenu;



public class Menu extends javax.swing.JPanel {


    public Menu() {
        initComponents();
        setOpaque(false);
        menu.setOpaque(false);
        init();
    }
    public void init(){
        menu.addItem(new ModelMenu("1", "Dashboard", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("2", "UI Elements", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("3", "Comonents", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("4", "Forms Stuff", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("5", "Date Table", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("", " ", ModelMenu.Type.EMPTY));

        menu.addItem(new ModelMenu("", "My Data", ModelMenu.Type.TITLE));
        menu.addItem(new ModelMenu("", " ", ModelMenu.Type.EMPTY));
        menu.addItem(new ModelMenu("6", "Icons", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("7", "Sample Page", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("8", "Extra", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("9", "More", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("10", "Logout", ModelMenu.Type.MENU));
        menu.addItem(new ModelMenu("", "", ModelMenu.Type.EMPTY));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new swing.ListMenu<>();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ListMenu<String> menu;
    // End of variables declaration//GEN-END:variables
}
