/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import algoritmocifrado.Cifrado;
import algoritmocifrado.Criptoanalisis;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mateo
 */
public class main extends javax.swing.JFrame {

    private String dirArchivo,dirArchivo2;
    private ArrayList<String>lineasSustitucion,lineasTransposicion;
    public main() {
        initComponents();
        this.dirArchivo="";
        this.dirArchivo2="";
        jTextFieldN.setVisible(false);
        jTextFieldN2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonSeleccionar = new javax.swing.JButton();
        jTextFieldSeleccionar = new javax.swing.JTextField();
        jCheckBoxTransposicion = new javax.swing.JCheckBox();
        jCheckBoxSustitucion = new javax.swing.JCheckBox();
        jLabelSubtitulo = new javax.swing.JLabel();
        jButtonCifrar = new javax.swing.JButton();
        jTextFieldN = new javax.swing.JTextField();
        jLabelSubtitulo1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaTransposicion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSustitucion = new javax.swing.JTextArea();
        jTextFieldN2 = new javax.swing.JTextField();
        jButtonSeleccionar2 = new javax.swing.JButton();
        jTextFieldArchivo2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPV = new javax.swing.JTextField();
        jTextFieldFV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRespuesta = new javax.swing.JTextField();
        jButtonCripto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 660, 1850, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1810, 20));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 30, 530));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(153, 255, 102));
        jLabelTitulo.setText("Detección de Cifrado - Sustitución vs Transposición");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 40));

        jButtonSeleccionar.setBackground(new java.awt.Color(153, 255, 102));
        jButtonSeleccionar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonSeleccionar.setForeground(new java.awt.Color(153, 153, 153));
        jButtonSeleccionar.setText("SELECCIONAR ARCHIVO");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jTextFieldSeleccionar.setEditable(false);
        jTextFieldSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 570, 40));

        jCheckBoxTransposicion.setBackground(new java.awt.Color(153, 255, 102));
        jCheckBoxTransposicion.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jCheckBoxTransposicion.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBoxTransposicion.setText("TRANSPOSICIÓN");
        jCheckBoxTransposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTransposicionActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTransposicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 90, 200, -1));

        jCheckBoxSustitucion.setBackground(new java.awt.Color(153, 255, 102));
        jCheckBoxSustitucion.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jCheckBoxSustitucion.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBoxSustitucion.setText("SUSTITUCIÓN");
        jCheckBoxSustitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSustitucionActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSustitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 50, 200, -1));

        jLabelSubtitulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelSubtitulo.setForeground(new java.awt.Color(153, 255, 102));
        jLabelSubtitulo.setText("Desplazamiento/Tamaño:");
        getContentPane().add(jLabelSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 20, -1, -1));

        jButtonCifrar.setBackground(new java.awt.Color(153, 255, 102));
        jButtonCifrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonCifrar.setForeground(new java.awt.Color(153, 153, 153));
        jButtonCifrar.setText("CIFRAR");
        jButtonCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCifrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCifrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 60, -1, -1));
        getContentPane().add(jTextFieldN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 50, 60, 30));

        jLabelSubtitulo1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelSubtitulo1.setForeground(new java.awt.Color(153, 255, 102));
        jLabelSubtitulo1.setText("SELECCIONE CIFRADO: ");
        getContentPane().add(jLabelSubtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, -1, -1));

        jTextAreaTransposicion.setEditable(false);
        jTextAreaTransposicion.setColumns(20);
        jTextAreaTransposicion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextAreaTransposicion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaTransposicion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 830, 450));

        jTextAreaSustitucion.setEditable(false);
        jTextAreaSustitucion.setColumns(20);
        jTextAreaSustitucion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextAreaSustitucion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSustitucion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 830, 450));
        getContentPane().add(jTextFieldN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 90, 60, 30));

        jButtonSeleccionar2.setBackground(new java.awt.Color(153, 255, 102));
        jButtonSeleccionar2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonSeleccionar2.setForeground(new java.awt.Color(153, 153, 153));
        jButtonSeleccionar2.setText("SELECCIONAR ARCHIVO");
        jButtonSeleccionar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeleccionar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, -1, -1));

        jTextFieldArchivo2.setEditable(false);
        jTextFieldArchivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldArchivo2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldArchivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 730, 490, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 102));
        jLabel1.setText("Algoritmo identificador de tipo de sistema de cifrado (SUSTITUCIÓN vs TRANSPOSICIÓN)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 102));
        jLabel3.setText("Porcentaje de Vocales: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 790, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 102));
        jLabel4.setText("Frecuencia de Vocales: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 860, -1, -1));

        jTextFieldPV.setEditable(false);
        jTextFieldPV.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextFieldPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPVActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 770, 320, 60));

        jTextFieldFV.setEditable(false);
        jTextFieldFV.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        getContentPane().add(jTextFieldFV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 850, 480, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 102));
        jLabel5.setText("SISTEMA DE CIFRADO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 740, -1, -1));

        jTextFieldRespuesta.setEditable(false);
        jTextFieldRespuesta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextFieldRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 780, 290, 50));

        jButtonCripto.setBackground(new java.awt.Color(153, 255, 102));
        jButtonCripto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonCripto.setForeground(new java.awt.Color(153, 153, 153));
        jButtonCripto.setText("CRIPTOANÁLISIS");
        jButtonCripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriptoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCripto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 720, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 102));
        jLabel2.setText("SUSTITUCIÓN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 102));
        jLabel6.setText("TRANSPOSICIÓN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 150, -1, -1));

        jLabelFondo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelFondo.setForeground(new java.awt.Color(153, 255, 102));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1805, 945));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        JFileChooser openFileChooser = new JFileChooser();
        openFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        openFileChooser.setMultiSelectionEnabled(false);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "txt"); 
        openFileChooser.setFileFilter(filtro);
        int returnSelection = openFileChooser.showOpenDialog(null);
        if(returnSelection == JFileChooser.APPROVE_OPTION){
            jTextFieldSeleccionar.setText(openFileChooser.getSelectedFile().getAbsolutePath());
            this.dirArchivo = openFileChooser.getSelectedFile().getAbsolutePath();
            jTextAreaSustitucion.setText("");
            jTextAreaTransposicion.setText("");
        }
        else if(returnSelection != JFileChooser.CANCEL_OPTION){
            jTextFieldSeleccionar.setText("No se encontro ningun archivo!");
            this.dirArchivo="";
        } 
        
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jTextFieldSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSeleccionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSeleccionarActionPerformed

    private void jCheckBoxTransposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTransposicionActionPerformed
        jTextFieldN2.setVisible(true);
    }//GEN-LAST:event_jCheckBoxTransposicionActionPerformed

    private void jCheckBoxSustitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSustitucionActionPerformed
        jTextFieldN.setVisible(true);
    }//GEN-LAST:event_jCheckBoxSustitucionActionPerformed

    private void jButtonCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCifrarActionPerformed
        boolean auxNum=true,auxNum2=true;
        int n = 0,n1=0;
        try{
            n=Integer.parseInt(jTextFieldN.getText().trim());
            //System.out.println("numero: "+n);
        }catch (Exception e) {
            System.out.println("No es numero");
            auxNum=false;
        }
        try{
            n1=Integer.parseInt(jTextFieldN2.getText().trim());
            //System.out.println("numero: "+n);
        }catch (Exception e) {
            System.out.println("No es numero");
            auxNum2=false;
        }
        
        if((((jCheckBoxSustitucion.isSelected()&& auxNum==true) || (jCheckBoxTransposicion.isSelected()) && auxNum2==true))&& !this.dirArchivo.equals("")){
            Cifrado cifrado=new Cifrado(this.dirArchivo,n,n1);
            if((jCheckBoxSustitucion.isSelected()&& auxNum==true)){
            try {
                cifrado.CifradoSustitucion();
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.lineasSustitucion=cifrado.getLineaCodificada();
            for(int i=0;i<this.lineasSustitucion.size();i++){
                jTextAreaSustitucion.append(this.lineasSustitucion.get(i)); 
                jTextAreaSustitucion.append(System.getProperty("line.separator")); // Esto para el salto de línea 
                //System.out.print("|"+this.lineasSustitucion.get(i)+"|\n");
            }
            }
            if((jCheckBoxTransposicion.isSelected()&& auxNum2==true)){
                try {
                    cifrado.CifradoTransposicion();
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.lineasTransposicion=cifrado.getLineaCodificada2();
                for(int i=0;i<this.lineasTransposicion.size();i++){
                    jTextAreaTransposicion.append(this.lineasTransposicion.get(i)); 
                    jTextAreaTransposicion.append(System.getProperty("line.separator")); // Esto para el salto de línea 
                    //System.out.print("|"+this.lineasSustitucion.get(i)+"|\n");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ausencia de parámetros para cifrar!\nVerifique el archivo y tipo de cifrado seleccionado\nAdvertencia: El desplazamiento/tamaño son valores numéricos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCifrarActionPerformed

    private void jButtonSeleccionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionar2ActionPerformed
        JFileChooser openFileChooser = new JFileChooser();
        openFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        openFileChooser.setMultiSelectionEnabled(false);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "txt"); 
        openFileChooser.setFileFilter(filtro);
        int returnSelection = openFileChooser.showOpenDialog(null);
        if(returnSelection == JFileChooser.APPROVE_OPTION){
            jTextFieldArchivo2.setText(openFileChooser.getSelectedFile().getAbsolutePath());
            this.dirArchivo2 = openFileChooser.getSelectedFile().getAbsolutePath();
            jTextFieldPV.setText("");
            jTextFieldFV.setText("");
            jTextFieldRespuesta.setText("");
        }
        else if(returnSelection != JFileChooser.CANCEL_OPTION){
            jTextFieldArchivo2.setText("No se encontro ningun archivo!");
            this.dirArchivo2="";
        } 
    }//GEN-LAST:event_jButtonSeleccionar2ActionPerformed

    private void jTextFieldArchivo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldArchivo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldArchivo2ActionPerformed

    private void jButtonCriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriptoActionPerformed
        if(!this.dirArchivo2.equals("")){
            Criptoanalisis criptoanalisis = new Criptoanalisis(this.dirArchivo2);
            criptoanalisis.AlgoritmoAnalisis();
            DecimalFormat df = new DecimalFormat("00.00");
            jTextFieldPV.setText(df.format(criptoanalisis.getPorcentajeV())+"%");
            jTextFieldFV.setText("A - "+df.format(criptoanalisis.getPorcA())+"% | E - "+df.format(criptoanalisis.getPorcE())+"% | U - "+df.format(criptoanalisis.getPorcU()));
            jTextFieldRespuesta.setText(criptoanalisis.getSistema()); 
        }else{
            JOptionPane.showMessageDialog(null, "Ausencia de parámetros para el criptoanálisis!\nVerifique seleccionar un archivo", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCriptoActionPerformed

    private void jTextFieldRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaActionPerformed

    private void jTextFieldPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPVActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCifrar;
    private javax.swing.JButton jButtonCripto;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JButton jButtonSeleccionar2;
    private javax.swing.JCheckBox jCheckBoxSustitucion;
    private javax.swing.JCheckBox jCheckBoxTransposicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelSubtitulo;
    private javax.swing.JLabel jLabelSubtitulo1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextAreaSustitucion;
    private javax.swing.JTextArea jTextAreaTransposicion;
    private javax.swing.JTextField jTextFieldArchivo2;
    private javax.swing.JTextField jTextFieldFV;
    private javax.swing.JTextField jTextFieldN;
    private javax.swing.JTextField jTextFieldN2;
    private javax.swing.JTextField jTextFieldPV;
    private javax.swing.JTextField jTextFieldRespuesta;
    private javax.swing.JTextField jTextFieldSeleccionar;
    // End of variables declaration//GEN-END:variables
}
