package com.experiencia.programa;

import com.experiencia.entidades.Funcionalidad;
import com.experiencia.entidades.Puntos;
import com.experiencia.entidades.PuntuacionGeneral;
import java.awt.Color;

/**
 *
 * @author Facundo
 */
public class PrimerPestania extends javax.swing.JFrame {

    private PuntuacionGeneral puntuacionGeneral;
    private int puntosSeguridad;
    private int puntosExactitud;
    /**
     * Creates new form PrimerPestania
     */
    public PrimerPestania() {
        initComponents();
        puntuacionGeneral = new PuntuacionGeneral();
        this.getContentPane().setBackground(new Color(84, 86, 86));
        this.setLocationRelativeTo(null);
        jRadioLoginTrue.setSelected(true);
        jRadioEncripTrue.setSelected(true);
    }

    public void setPuntuacionGeneral(PuntuacionGeneral puntuacionGeneral) {
        this.puntuacionGeneral = puntuacionGeneral;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioEncripTrue = new javax.swing.JRadioButton();
        jRadioEncripFalse = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioLoginTrue = new javax.swing.JRadioButton();
        jRadioLoginFalse = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxResultado = new javax.swing.JComboBox<>();
        jButtonSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Experiencia de usuario");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Funcionalidad del sistema");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Capacidad del producto software para proporcionar");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jRadioEncripTrue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioEncripTrue.setForeground(new java.awt.Color(255, 255, 255));
        jRadioEncripTrue.setText("Si");
        jRadioEncripTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEncripTrueActionPerformed(evt);
            }
        });

        jRadioEncripFalse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioEncripFalse.setForeground(new java.awt.Color(255, 255, 255));
        jRadioEncripFalse.setText("No");
        jRadioEncripFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEncripFalseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿El sistema cuenta con control de acceso validado con usuario y contraseña?");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jRadioLoginTrue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioLoginTrue.setForeground(new java.awt.Color(255, 255, 255));
        jRadioLoginTrue.setText("Si");
        jRadioLoginTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioLoginTrueActionPerformed(evt);
            }
        });

        jRadioLoginFalse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioLoginFalse.setForeground(new java.awt.Color(255, 255, 255));
        jRadioLoginFalse.setText("No");
        jRadioLoginFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioLoginFalseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seguridad de Acceso");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exactitud de los Resultados");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿El sistema cumple con la encriptación de datos?");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("los resultados con el grado necesario de precisión");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jComboBoxResultado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBoxResultado.setMaximumRowCount(3);
        jComboBoxResultado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buena", "Regular", "Mala", " " }));

        jButtonSiguiente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jRadioEncripTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jRadioEncripFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jComboBoxResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jRadioLoginTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jRadioLoginFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioLoginFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioLoginTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioEncripFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioEncripTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButtonSiguiente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        if(jRadioLoginFalse.isSelected() && jRadioEncripFalse.isSelected()){
            puntosSeguridad += Puntos.MALA.getPuntos();
        } else if(jRadioEncripTrue.isSelected() && jRadioEncripTrue.isSelected()) {
            puntosSeguridad += Puntos.BUENA.getPuntos();
        } else {
            puntosSeguridad += Puntos.REGULAR.getPuntos();
        }
        String calificacionExactitud = (String)jComboBoxResultado.getSelectedItem();
        switch(calificacionExactitud){
            case "Buena": puntosExactitud += Puntos.BUENA.getPuntos();break;
            case "Regular": puntosExactitud += Puntos.REGULAR.getPuntos();break;
            case "Mala": puntosExactitud += Puntos.MALA.getPuntos();break;
        }
        asignarPuntos();
        SegundaPestania eficiencia = new SegundaPestania();
        eficiencia.requestFocusInWindow();
        eficiencia.setPuntuacionGeneral(puntuacionGeneral);
        eficiencia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jRadioLoginFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioLoginFalseActionPerformed
        jRadioLoginTrue.setSelected(false);
    }//GEN-LAST:event_jRadioLoginFalseActionPerformed

    private void jRadioLoginTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioLoginTrueActionPerformed
        jRadioLoginFalse.setSelected(false);
    }//GEN-LAST:event_jRadioLoginTrueActionPerformed

    private void jRadioEncripFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEncripFalseActionPerformed
        jRadioEncripTrue.setSelected(false);
    }//GEN-LAST:event_jRadioEncripFalseActionPerformed

    private void jRadioEncripTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEncripTrueActionPerformed
        jRadioEncripFalse.setSelected(false);
    }//GEN-LAST:event_jRadioEncripTrueActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimerPestania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrimerPestania().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JComboBox<String> jComboBoxResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioEncripFalse;
    private javax.swing.JRadioButton jRadioEncripTrue;
    private javax.swing.JRadioButton jRadioLoginFalse;
    private javax.swing.JRadioButton jRadioLoginTrue;
    // End of variables declaration//GEN-END:variables

    private void asignarPuntos() {
        puntuacionGeneral.getFuncionalidad().replace(Funcionalidad.SEGURIDAD.getAtributo(), puntosSeguridad);
        puntuacionGeneral.getFuncionalidad().replace(Funcionalidad.EXACTITUD.getAtributo(), puntosExactitud);
        puntuacionGeneral.sumar(puntosExactitud);
        puntuacionGeneral.sumar(puntosSeguridad);
    }
}
