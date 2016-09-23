/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lcastane6
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNF = new javax.swing.JTextField();
        txtNC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizFinal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizInicial = new javax.swing.JTable();
        cmbOper = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        txtR = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Operaciones Con Matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Numero De Filas");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jLabel3.setText("Numero De Columnas");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 20));
        jPanel2.add(txtNF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 40, -1));
        jPanel2.add(txtNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 350, 70));

        tblMatrizFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatrizFinal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 290, 150));

        tblMatrizInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMatrizInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, 150));

        cmbOper.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cant Numeros Pares", "Numeros Pares", "Diagonal Principal", "Letra C", "Letra H" }));
        jPanel1.add(cmbOper, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtR.setEditable(false);
        jPanel3.add(txtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 350, 70));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, -1));

        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 80, -1));

        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        cmdLimpiar.setText("Limpiar");
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 70, -1));

        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 470, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(907, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        DefaultTableModel tm, tm2;
        int nf, nc;
        tm = (DefaultTableModel) tblMatrizInicial.getModel();
        tm2 = (DefaultTableModel) tblMatrizFinal.getModel();

        nf = Integer.parseInt(txtNF.getText());
        nc = Integer.parseInt(txtNC.getText());

        tm.setRowCount(nf);
        tm.setColumnCount(nc);

        tm2.setRowCount(nf);
        tm2.setColumnCount(nc);

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed

        /*double n;
        int aux, res;
        boolean sw=true;
        for (int i = 0; i < v.length; i++) {
            do {
                aux = 1;
                try {
                    n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posición: " + i));
                    v[i] = n;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Digite la información correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                    aux = 0;
                } catch (NullPointerException e) {
                   res= JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Salir", JOptionPane.YES_NO_OPTION);
                   if(res == 0){
                    aux = 1;
                    i = v.length;
                    sw = false;
                   }else{
                       aux =0;
                   }
                   
                }
            } while (aux == 0);
        }**/
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed

        int nf, nc;
        int n;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 25 + 1);
                tblMatrizInicial.setValueAt(n, i, j);
            }
        }
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed

        int op, nf, nc, aux, cont;
        op = cmbOper.getSelectedIndex();
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();
        cont = 0;

        switch (op) {
            case 0:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {

                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (aux % 2 == 0);
                        cont++;

                    }
                }

                break;
            case 1:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {

                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (aux % 2 == 0);
                        tblMatrizFinal.setValueAt(aux, i, j);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {

                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (aux % 2 == 0);
                        tblMatrizFinal.setValueAt(aux, i, j);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {

                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (i == 0 || j == 0 || i == nf - 1) {
                            tblMatrizFinal.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
            case 4:
                for (int i = 0; i < nf; i++) {
                    for (int j = 0; j < nc; j++) {

                        aux = (int) tblMatrizInicial.getValueAt(i, j);
                        if (j == 0 || j == nc -1 || i == (nf - 1)/2) {
                            tblMatrizFinal.setValueAt(aux, i, j);
                        }
                    }
                }

    }//GEN-LAST:event_cmdOperacionActionPerformed
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOper;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMatrizFinal;
    private javax.swing.JTable tblMatrizInicial;
    private javax.swing.JTextField txtNC;
    private javax.swing.JTextField txtNF;
    private javax.swing.JTextField txtR;
    // End of variables declaration//GEN-END:variables
}
