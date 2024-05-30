/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ADMIN;

import java.awt.CardLayout;

/**
 *
 * @author ADMIN
 */
public class ChamCong extends javax.swing.JPanel {

    private QLCCForm formQLCC ;
    private QLPCForm formQLPC ;
    
    public ChamCong() {
        initComponents();
        setLayout(new CardLayout());    
        formQLCC =new QLCCForm();
        formQLPC = new QLPCForm();
        add(formQLCC);
        add(formQLPC);
        show(0);
    }
    
    
    public void show( int x)
    {
        switch(x)
        {
            case 1 :
            {
                this.formQLCC.setVisible(false);
                this.formQLPC.setVisible(true);
            }
            default:
            {
                this.formQLCC.setVisible(true);
                this.formQLPC.setVisible(false);
            }
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
