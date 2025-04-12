/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import domain.*;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class AgregarAnimalView extends javax.swing.JFrame {

    /**
     * Creates new form AgregarAnimalView
     */
    public AgregarAnimalView() {
        initComponents();
    }

    
    
        
    public void CargarComboboxes(){
        ArrayList<Especie> especies = Controlador.getEspecies();
        
        for (Especie especie : especies ){
            cbespecie.addItem(especie.getNombre());
        }
        
        ArrayList<Sector> sectores = Controlador.getSectores();
for(Sector sector : sectores){
    cbsector.addItem(sector.toString());
}
        
        ArrayList<Pais> paises = Controlador.getPaises();
        
        for (Pais pais : paises){
            cbpais.addItem(pais.getNombre());
        }
        
        
        
        for (TipoAlimentacion tipo : Controlador.getTiposAlimentacion()){
        cbalimentacion.addItem(String.valueOf(tipo));
    }
        
    }
    public Especie getEspecie(){
        String nombreEspecie = String.valueOf(cbespecie.getSelectedItem());
        for (Especie especie : Controlador.getEspecies()){
             if (nombreEspecie.equals(especie.getNombre())){
                 return especie; 
             }
        }
        return null;
    }
    
    public Sector getSector(){
    String sectorTexto = String.valueOf(cbsector.getSelectedItem());
    // Extraer el número del sector del formato "Sector N°: X [TIPO]"
    String numeroStr = sectorTexto.split(":")[1].trim().split("\\[")[0].trim();
    int numeroSector = Integer.parseInt(numeroStr);
    
    for (Sector sector : Controlador.getSectores()){
        if (numeroSector == sector.getNumero()){
            return sector;
        }
    }
    return null;
}
    
    public Pais getPais(){
        String nombrePais = String.valueOf(cbpais.getSelectedItem());
        for (Pais pais : Controlador.getPaises()){
             if (nombrePais.equals(pais.getNombre())){
                 return pais;
             }
        }
        return null;
    }
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edad = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbespecie = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alimento = new javax.swing.JTextField();
        cbpais = new javax.swing.JComboBox<>();
        cbsector = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbalimentacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        jLabel1.setText("Peso:");

        jLabel2.setText("Edad:");

        cbespecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbespecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbespecieActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Especie:");

        jLabel4.setText("Sector:");

        jLabel5.setText("Alimento fijo:");

        jLabel6.setText("Pais de Origen:");

        cbpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpaisActionPerformed(evt);
            }
        });

        jLabel7.setText("Agregar Animal");

        jLabel8.setText("Alimentacion");

        cbalimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbalimentacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(77, 83, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(alimento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cbalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbpais, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbespecie, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbsector, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbespecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbsector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    
    private void cbespecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbespecieActionPerformed
     
        
        
        
    }//GEN-LAST:event_cbespecieActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void cbpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpaisActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
//        if (peso.getText().isEmpty() || edad.getText().isEmpty() || 
//            cbespecie.getSelectedIndex() <= 0 || 
//            cbpais.getSelectedIndex() <= 0 || cbsector.getSelectedIndex() <= 0 ||
//               cbalimentacion.getSelectedIndex() <= 0 ) {
//            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", 
//                "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        
        // Obtener los valores
        int edad1 = Integer.parseInt(edad.getText());
        double peso1 = Double.parseDouble(peso.getText());

        double alimentoFijo = Double.parseDouble(alimento.getText());



        
      
                
      Mamifero animal = null;
      if ("HERBIVORO".equals(cbalimentacion.getSelectedItem())){
        
      
            try {
                Controlador.guardarAnimal(new Herbivoro(edad1, peso1, getEspecie(), getSector(),alimentoFijo,getPais()));
            } catch (InvalidPropertiesFormatException ex) {
                Logger.getLogger(AgregarAnimalView.class.getName()).log(Level.SEVERE, null, ex);
            }
          
          
      }
      if ("CARNIVORO".equals(cbalimentacion.getSelectedItem())){
        try {
                Controlador.guardarAnimal(new Carnivoro(edad1, peso1, getEspecie(), getSector(),getPais()));
            } catch (InvalidPropertiesFormatException ex) {
                Logger.getLogger(AgregarAnimalView.class.getName()).log(Level.SEVERE, null, ex);
            }  
      }
        
         
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
    
    
    
    private void cbalimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbalimentacionActionPerformed
//        String alimentacion = (String) cbalimentacion.getSelectedItem();
//        System.out.println(alimentacion);
//        if ("HERBIVORO".equals(alimentacion)){
//            alimento.setEditable(true);}
//            if ("CARNIVORO".equals(alimentacion)){
//            alimento.setEditable(false);
//        
        
    }//GEN-LAST:event_cbalimentacionActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarAnimalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAnimalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alimento;
    private javax.swing.JComboBox<String> cbalimentacion;
    private javax.swing.JComboBox<String> cbespecie;
    private javax.swing.JComboBox<String> cbpais;
    private javax.swing.JComboBox<String> cbsector;
    private javax.swing.JTextField edad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField peso;
    // End of variables declaration//GEN-END:variables
}
