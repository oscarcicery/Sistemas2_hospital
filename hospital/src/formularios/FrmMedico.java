/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import conexionDB.ConectarDB;
import hospital.Medico;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class FrmMedico extends javax.swing.JFrame {

    /**
     * Creates new form FrmMedico
     */
    public FrmMedico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtGen = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCodEs = new javax.swing.JTextField();
        lblIDP = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblApe = new javax.swing.JLabel();
        lblGen = new javax.swing.JLabel();
        lblDir = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCodEs = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIDP.setText("ID medico:");

        lblNom.setText("Nombres medico:");

        lblApe.setText("Apellidos medico:");

        lblGen.setText("Genero medico:");

        lblDir.setText("Dirección medico:");

        lblEmail.setText("Email Medico:");

        lblCodEs.setText("Codigo Especialidad:");

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setText("Registro de personal medico.");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblGen)
                        .addComponent(lblApe)
                        .addComponent(lblNom)
                        .addComponent(lblCodEs)
                        .addComponent(lblIDP)
                        .addComponent(lblDir)
                        .addComponent(lblEmail))
                    .addComponent(btnInsertar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addComponent(txtCodEs, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(49, 49, 49)
                        .addComponent(btnSalir)
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodEs))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApe))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDir)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnActualizar)
                    .addComponent(btnSalir)
                    .addComponent(btnEliminar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        ConectarDB cc =new ConectarDB();
        Connection cn=cc.conexion();
        
        
        Medico med=new Medico(Integer.parseInt(txtCodEs.getText()), Integer.parseInt(txtID.getText()), txtNom.getText(), txtApe.getText(), txtGen.getText(), txtDir.getText(), txtEmail.getText());
        String sql;
        
        System.out.println(med.getDireccion());
        System.out.println(txtDir.getText());
        System.out.println(med.getGenero());
        System.out.println(txtGen.getText());
        System.out.println(med.getEmail());
        System.out.println(txtEmail.getText());
        
        if(med.getId()<0 ||med.getCodEspecialidad()<0){
            JOptionPane.showMessageDialog(null,"No es posible almacenar una ID negativo o un Codigo de especialidad negativo.");
            limpiar();
        }
        else{
            sql="insert into tblMedicos(IDMedico, Nombres, Apellidos, Genero, Direccion, Email,  CodEspecialidad) values (?,?,?,?,?,?,?)";
            try{
                PreparedStatement pst=cn.prepareStatement(sql);
                pst.setInt(1, med.getId());
                pst.setString(2,med.getNombres());
                pst.setString(3,med.getApellidos());
                pst.setString(4, med.getGenero());
                pst.setString(5, med.getDireccion());
                pst.setString(6,med.getEmail());
                pst.setInt(7,med.getCodEspecialidad());
                
                int registro=pst.executeUpdate();
                if(registro>0){
                  JOptionPane.showMessageDialog(null," Registro almacenado correctamente ");
                  limpiar();  
                }
                
            }catch (HeadlessException | SQLException e){
               if(e.getMessage().equals("Duplicate entry '"+med.getId()+"' for key 'PRIMARY'")){
                   
                   JOptionPane.showMessageDialog(null,"El registro ya existe" );
                   sql="Select * from tblMedicos WHERE IDMedico= "+med.getId();
                 
                try {
                   PreparedStatement pst = cn.prepareStatement(sql);
                    ResultSet rs= pst.executeQuery(sql);
                    
                    while(rs.next()){
                        txtNom.setText(rs.getString(2));
                        txtApe.setText(rs.getString(3));
                        txtGen.setText(rs.getString(4));
                        txtDir.setText(rs.getString(5));
                        txtEmail.setText(rs.getString(6));
                        txtCodEs.setText(String.valueOf(rs.getInt(7)));
                    }
                } catch (SQLException xe) {
                    JOptionPane.showMessageDialog(null," Registro no encontrado "+xe.getMessage());
                }
               }else{
                   JOptionPane.showMessageDialog(null," Registro no almacenado "+e.getMessage());
               }
            }
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ConectarDB cc =new ConectarDB();
        Connection cn=cc.conexion();
        
        Medico med=new Medico(Integer.parseInt(txtCodEs.getText()), Integer.parseInt(txtID.getText()), txtNom.getText(), txtApe.getText(), txtGen.getText(), txtDir.getText(), txtEmail.getText());
        String sql;
        
        if(med.getId()<0 ||med.getCodEspecialidad()<0){
            JOptionPane.showMessageDialog(null,"No hay una ID negativo o un codigo de especialidad negativo.");
            limpiar();
        }
        else{
            sql="update tblMedicos SET "
                +"Nombres= '"+med.getNombres()+"',"
                +"Apellidos= '"+med.getApellidos()+"',"
                +"Genero= '"+med.getGenero() +"',"
                +"Direccion= '"+med.getDireccion()+"'," 
                +"Email= '"+med.getEmail()+"',"
                +"CodEspecialidad= "+med.getCodEspecialidad()
                +" WHERE IDMedico= "+med.getId();
            
            try{
                PreparedStatement pst=cn.prepareStatement(sql);
               
                int registro=pst.executeUpdate();
                if(registro>0){
                  JOptionPane.showMessageDialog(null," Registro actualizado correctamente ");
                  limpiar();  
                }else{
                    JOptionPane.showMessageDialog(null," Registro no encontrado ");
                }
                
            }catch (HeadlessException | SQLException e){
               JOptionPane.showMessageDialog(null," Registro no actualizado "+e.getMessage());
               limpiar();
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ConectarDB cc =new ConectarDB();
        Connection cn=cc.conexion();
        
        Medico med=new Medico(Integer.parseInt(txtCodEs.getText()), Integer.parseInt(txtID.getText()), txtNom.getText(), txtApe.getText(), txtGen.getText(), txtDir.getText(), txtEmail.getText());
        String sql;
        
        if(med.getId()<0){
            JOptionPane.showMessageDialog(null, "No se permite ID negativo");
            limpiar();
        }
        else{
            sql="DELETE FROM tblMedicos WHERE IDMedico="+med.getId();
        
        try{
               PreparedStatement pst = cn.prepareStatement(sql);
              
                 int registro=pst.executeUpdate();
                 if (registro>0)
                 {  
                     JOptionPane.showMessageDialog(null," Registro eliminado correctamente ");
                     limpiar();
                 }else{
                     JOptionPane.showMessageDialog(null," Registro no encontrado.");
                     limpiar();
                 }
                 
           }catch (HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null," Registro no elimiado  "+e.getMessage());
           limpiar();
           }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    public void limpiar(){
        txtApe.setText("");
        txtCodEs.setText("");
        txtDir.setText("");
        txtEmail.setText("");
        txtGen.setText("");
        txtID.setText("");
        txtNom.setText("");
    }
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
            java.util.logging.Logger.getLogger(FrmMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmMedico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblApe;
    private javax.swing.JLabel lblCodEs;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGen;
    private javax.swing.JLabel lblIDP;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCodEs;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGen;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
