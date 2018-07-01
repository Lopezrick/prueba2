/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RICK LOPEZ
 */
public class FrmBuscarPrestamo extends javax.swing.JFrame {

    
    Prestamos a=new Prestamos();
    DefaultTableModel mdlTabla=new DefaultTableModel();
    ResultSet rstTabla=null;
    ResultSet rstCarnet=null;
    ResultSet rstCodigos=null;
    DefaultComboBoxModel mdlCarnets = new DefaultComboBoxModel();
    DefaultComboBoxModel mdlCodigos = new DefaultComboBoxModel();

    public FrmBuscarPrestamo() {
        initComponents();
        this.setLocationRelativeTo(null);
        Actualizar();
        rbCarnet.setSelected(true);
        cmbCodigos.setEnabled(false);
    }
    private void Actualizar(){
        mdlCodigos.removeAllElements();
        mdlCarnets.removeAllElements();
        rstCarnet= a.Carnets();
        rstCodigos = a.codigosPrestamo();
        mdlCarnets.addElement("Seleccionar");
         try {
            while (rstCarnet.next()){
                
                mdlCarnets.addElement(rstCarnet.getString(1));
            }
            cmbCarnet.setModel(mdlCarnets);
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmNuevoPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         mdlCodigos.addElement("Seleccionar");
         try {
            while (rstCodigos.next()){
                
                mdlCodigos.addElement(rstCodigos.getString(1));
            }
            cmbCodigos.setModel(mdlCodigos);
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmNuevoPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void LimpiarTabla(){
        int filas=mdlTabla.getRowCount();
        for (int i=0; i<filas;i++){
            mdlTabla.removeRow(0);
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

        radios = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbCarnet = new javax.swing.JRadioButton();
        rbCodigo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cmbCarnet = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbCodigos = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar por:");

        radios.add(rbCarnet);
        rbCarnet.setText("Carnet");
        rbCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCarnetActionPerformed(evt);
            }
        });

        radios.add(rbCodigo);
        rbCodigo.setText("Codigo Prestamo");
        rbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Carnet:");

        jLabel3.setText("Codigo Prestamo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar pendientes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar todos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(mdlTabla);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(rbCodigo))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCarnet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCodigos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(rbCarnet))
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cmbCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbCarnet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbCodigo)
                            .addComponent(jLabel3)
                            .addComponent(cmbCodigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCarnetActionPerformed
        // TODO add your handling code here:
        cmbCarnet.setEnabled(true);
        cmbCodigos.setEnabled(false);
    }//GEN-LAST:event_rbCarnetActionPerformed

    private void rbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodigoActionPerformed
        // TODO add your handling code here:
        cmbCarnet.setEnabled(false);
        cmbCodigos.setEnabled(true);
    }//GEN-LAST:event_rbCodigoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         LimpiarTabla();
        mdlTabla.setColumnIdentifiers(new Object []{"Codigo","Carnet","Nombres","Apellidos","Articulo","Cantidad","Fecha pedido","Fecha devolucion"});
        
        rstTabla=a.mostrarTodos();
        
            try {
                while(rstTabla.next()){
                    mdlTabla.addRow(new Object []{(rstTabla.getString(1)),(rstTabla.getString(2)),(rstTabla.getString(3)),(rstTabla.getString(4)),(rstTabla.getString(5)),(rstTabla.getInt(6)),(rstTabla.getDate(7)),(rstTabla.getDate(8))});
                }
            } catch (SQLException ex) {
                Logger.getLogger(FrmBuscarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LimpiarTabla();
        mdlTabla.setColumnIdentifiers(new Object []{"Codigo","Carnet","Nombres","Apellidos","Articulo","Cantidad","Fecha pedido","Fecha devolucion"});
        
        rstTabla=a.mostrarTodos();
        
            try {
                while(rstTabla.next()){
                    if(rstTabla.getDate(8)==null){
                    mdlTabla.addRow(new Object []{(rstTabla.getString(1)),(rstTabla.getString(2)),(rstTabla.getString(3)),(rstTabla.getString(4)),(rstTabla.getString(5)),(rstTabla.getInt(6)),(rstTabla.getDate(7)),(rstTabla.getDate(8))});    
                    }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(FrmBuscarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
         LimpiarTabla();
        if(rbCodigo.isSelected()&&cmbCodigos.getSelectedIndex()!=0){
            
        mdlTabla.setColumnIdentifiers(new Object []{"Codigo","Carnet","Nombres","Apellidos","Articulo","Cantidad","Fecha pedido","Fecha devolucion"});
        
        rstTabla=a.buscarporCodigo(cmbCodigos.getSelectedIndex());
        
            try {
                while(rstTabla.next()){
                    
                    mdlTabla.addRow(new Object []{(rstTabla.getString(1)),(rstTabla.getString(2)),(rstTabla.getString(3)),(rstTabla.getString(4)),(rstTabla.getString(5)),(rstTabla.getInt(6)),(rstTabla.getDate(7)),(rstTabla.getDate(8))});    
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(FrmBuscarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(rbCarnet.isSelected()&&cmbCarnet.getSelectedIndex()!=0){
                
        mdlTabla.setColumnIdentifiers(new Object []{"Codigo","Carnet","Nombres","Apellidos","Articulo","Cantidad","Fecha pedido","Fecha devolucion"});
        
        rstTabla=a.buscarporCarnet(cmbCarnet.getSelectedItem()+"");
        
            try {
                while(rstTabla.next()){
                    
                    mdlTabla.addRow(new Object []{(rstTabla.getString(1)),(rstTabla.getString(2)),(rstTabla.getString(3)),(rstTabla.getString(4)),(rstTabla.getString(5)),(rstTabla.getInt(6)),(rstTabla.getDate(7)),(rstTabla.getDate(8))});    
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(FrmBuscarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmPrincipal obj = new FrmPrincipal();
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBuscarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBuscarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBuscarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBuscarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuscarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbCarnet;
    private javax.swing.JComboBox<String> cmbCodigos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.ButtonGroup radios;
    private javax.swing.JRadioButton rbCarnet;
    private javax.swing.JRadioButton rbCodigo;
    // End of variables declaration//GEN-END:variables
}
