/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author TOBIAS
 */
public class FrmNuevoPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form FrmNuevoPrestamo
     */
    Prestamos a = new Prestamos();
    ResultSet rstCarnets=null;
    DefaultComboBoxModel mdlCarnets = new DefaultComboBoxModel();
    ResultSet rstArticulos=null; 
    DefaultComboBoxModel mdlArticulos = new DefaultComboBoxModel();
    DefaultComboBoxModel mdlDia = new DefaultComboBoxModel();
   
    public FrmNuevoPrestamo() {
        initComponents();
         mdlDia.addElement("DIAS");
         cmbDia.setModel(mdlDia);
         cmbDia.setEnabled(false);
        rstCarnets= a.Carnets();
        rstArticulos = a.Articulos();
        mdlCarnets.addElement("Seleccionar");
         try {
            while (rstCarnets.next()){
                
                mdlCarnets.addElement(rstCarnets.getString(1));
            }
            cmbCarnet.setModel(mdlCarnets);
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmNuevoPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         mdlArticulos.addElement("Seleccionar");
         try {
            while (rstArticulos.next()){
                
                mdlArticulos.addElement(rstArticulos.getString(2));
            }
            cmbArticulo.setModel(mdlArticulos);
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmNuevoPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    private boolean Bisiesto(int a){
        
            boolean bisiesto=false;
            if(a%4==0){
                
            if(a%100==0 ){
                if(a%400==0){
                    bisiesto=true;
                }
                else{
                    bisiesto=false;               }
            }
            else{
            bisiesto=true;    
            }
            }
            
            return bisiesto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCarnet = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbArticulo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbAnio = new javax.swing.JComboBox<>();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Agregar alumno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Elija el carnet:");

        jLabel2.setText("Elija el articulo:");

        jButton2.setText("Nuevo articulo");

        jLabel3.setText("Cantidad:");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel4.setText("Fecha:");

        jButton3.setText("Realizar prestamo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Año/Mes/Dia");

        cmbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AÑO", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2026", "2027", "2028", "2029", "2030" }));
        cmbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnioActionPerformed(evt);
            }
        });

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MES", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(cmbCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        a.insertarPrestamo(10,"LM1602" , 1, 2, "2018/06/30");
        JOptionPane.showMessageDialog(null,"Prestamo exitoso");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmAgregarAlumno obj = new FrmAgregarAlumno();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        // TODO add your handling code here:
        int i = cmbMes.getSelectedIndex();
        mdlDia.removeAllElements();
        mdlDia.addElement("DIAS");
        if(i==0){
            cmbDia.setEnabled(false);
        }
        else{
            cmbDia.setEnabled(true);
        }
        
        if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
           
           for(int j=1;j<=31;j++){
               mdlDia.addElement(""+j);
           }
            
        }
        else if(i==2){
            if(cmbAnio.getSelectedIndex()==0){
              for(int j=1;j<=28;j++){
               mdlDia.addElement(""+j);
              }
            }
            else{
                int a= Integer.parseInt((String) cmbAnio.getSelectedItem());
                
            if(Bisiesto(a)==true){
             for(int j=1;j<=29;j++){
               mdlDia.addElement(""+j);
           }    
            }else{
             for(int j=1;j<=28;j++){
               mdlDia.addElement(""+j);
           }   
            }    
            }
            
            
             
        }
        else{
             for(int j=1;j<=30;j++){
               mdlDia.addElement(""+j);
           }
        }
        cmbDia.setModel(mdlDia);
        
    }//GEN-LAST:event_cmbMesActionPerformed

    private void cmbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnioActionPerformed
        // TODO add your handling code here:
        
         if(cmbAnio.getSelectedIndex()!=0){
             int a= Integer.parseInt((String) cmbAnio.getSelectedItem());
        if(cmbMes.getSelectedIndex()==2 && Bisiesto(a)==true){
            mdlDia.removeAllElements();
        mdlDia.addElement("DIAS");
            for(int j=1;j<=29;j++){
               mdlDia.addElement(""+j);
           }  
        }
        else{
            mdlDia.removeAllElements();
        mdlDia.addElement("DIAS");
            for(int j=1;j<=28;j++){
               mdlDia.addElement(""+j);
           }  
        }
        cmbDia.setModel(mdlDia);     
         }       
        
    }//GEN-LAST:event_cmbAnioActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        // TODO add your handling code here:
        char tecla= evt.getKeyChar();
        if(Character.isDigit(tecla)){
            if(txtCantidad.getText().length()>1){
                evt.consume();
            }
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNuevoPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAnio;
    private javax.swing.JComboBox<String> cmbArticulo;
    private javax.swing.JComboBox<String> cmbCarnet;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
