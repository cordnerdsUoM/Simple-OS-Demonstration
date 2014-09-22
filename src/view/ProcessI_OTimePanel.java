/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.util.ArrayList;

/**
 *
 * @author Amila
 */
public class ProcessI_OTimePanel extends javax.swing.JPanel {

    private ArrayList<ProcessI_OTimePanel> listI_Oope;
    int fulltime;
    AddNewProcess parent;
    /**
     * Creates new form ProcessI_OTimePanel
     */
    public ProcessI_OTimePanel() {
        initComponents();
    }
    
    public ProcessI_OTimePanel(int operationNo,ArrayList<ProcessI_OTimePanel> listI_Oope,int fullTime,AddNewProcess parent) {
        initComponents();
        lbName.setText("I/O Operation "+operationNo);
        this.fulltime=fullTime;
        this.parent=parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sdI_OOperation = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtOpTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sdI_OOperation.setValue(0);
        sdI_OOperation.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sdI_OOperationStateChanged(evt);
            }
        });
        jPanel1.add(sdI_OOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 33, 410, 30));

        jLabel4.setText("I/O Operation Time");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 30));

        lbName.setText("I/O operation");
        jPanel1.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        txtOpTime.setText("0");
        txtOpTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOpTimeKeyReleased(evt);
            }
        });
        jPanel1.add(txtOpTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 60, 30));

        jLabel6.setText("ms");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtOpTimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpTimeKeyReleased
        System.out.println(fulltime+" wwww");
        int value=(Integer.parseInt(txtOpTime.getText())*100)/fulltime;
        sdI_OOperation.setValue(value);
    }//GEN-LAST:event_txtOpTimeKeyReleased

    private void sdI_OOperationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sdI_OOperationStateChanged
        System.out.println(fulltime+" wwwwggg");
        int value=(sdI_OOperation.getValue()*fulltime)/100;
        txtOpTime.setText(value+"");
    }//GEN-LAST:event_sdI_OOperationStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbName;
    private javax.swing.JSlider sdI_OOperation;
    private javax.swing.JTextField txtOpTime;
    // End of variables declaration//GEN-END:variables

    public int getI_OOperationTime(){
        return Integer.parseInt(txtOpTime.getText());
    }
    
    public void update(int newFullTime){
        if(fulltime!=0){
            int value=(Integer.parseInt(txtOpTime.getText())*newFullTime)/fulltime;
            System.out.println(fulltime +" dddd");
            sdI_OOperation.setValue((value*100)/fulltime);
            txtOpTime.setText(value+"");
        }
        System.out.println(newFullTime);
        fulltime=newFullTime;
    }
}