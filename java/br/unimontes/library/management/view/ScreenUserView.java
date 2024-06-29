/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.view;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author marce
 */
public class ScreenUserView extends javax.swing.JFrame {

    /**
     * Creates new form ScreenUserView
     */
    public ScreenUserView() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iIsbnReturn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tShowBookLoanUser = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tBookAvailableUser = new javax.swing.JTextArea();
        bBookLoan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        iIsbnLoan1 = new javax.swing.JTextField();
        bReturnBookUser = new javax.swing.JButton();
        iCpfLoan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Livros Emprestados");

        jLabel2.setText("Pedir empréstimo");

        iIsbnReturn.setText("Informe o ISBN do livro");
        iIsbnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iIsbnReturnActionPerformed(evt);
            }
        });

        jLabel3.setText("Livros disponíveis");

        tShowBookLoanUser.setColumns(20);
        tShowBookLoanUser.setRows(5);
        jScrollPane1.setViewportView(tShowBookLoanUser);

        tBookAvailableUser.setColumns(20);
        tBookAvailableUser.setRows(5);
        jScrollPane2.setViewportView(tBookAvailableUser);

        bBookLoan.setText("Solicitar");
        bBookLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBookLoanActionPerformed(evt);
            }
        });

        jLabel4.setText("Devolver livro");

        iIsbnLoan1.setText("Informe o ISBN do livro");
        iIsbnLoan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iIsbnLoan1ActionPerformed(evt);
            }
        });

        bReturnBookUser.setText("Devolver");
        bReturnBookUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReturnBookUserActionPerformed(evt);
            }
        });

        iCpfLoan.setText("Informe seu CPF");
        iCpfLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iCpfLoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(bReturnBookUser, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(iIsbnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(bBookLoan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iIsbnLoan1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(iCpfLoan))
                        .addGap(274, 274, 274))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iIsbnLoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iCpfLoan, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBookLoan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iIsbnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bReturnBookUser))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iIsbnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iIsbnReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iIsbnReturnActionPerformed

    private void bBookLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBookLoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBookLoanActionPerformed

    private void iIsbnLoan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iIsbnLoan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iIsbnLoan1ActionPerformed

    private void bReturnBookUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReturnBookUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bReturnBookUserActionPerformed

    private void iCpfLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iCpfLoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iCpfLoanActionPerformed

    public JTextField getiCpfLoan() {
        return iCpfLoan;
    }

    public void setiCpfLoan(JTextField iCpfLoan) {
        this.iCpfLoan = iCpfLoan;
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
            java.util.logging.Logger.getLogger(ScreenUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenUserView().setVisible(true);
            }
        });
    }

    public JButton getbBookLoan() {
        return bBookLoan;
    }

    public void setbBookLoan(JButton bBookLoan) {
        this.bBookLoan = bBookLoan;
    }

    public JButton getbReturnBookUser() {
        return bReturnBookUser;
    }

    public void setbReturnBookUser(JButton bReturnBookUser) {
        this.bReturnBookUser = bReturnBookUser;
    }

    public JTextField getiIsbnLoan1() {
        return iIsbnLoan1;
    }

    public void setiIsbnLoan1(JTextField iIsbnLoan1) {
        this.iIsbnLoan1 = iIsbnLoan1;
    }

    public JTextField getiIsbnReturn() {
        return iIsbnReturn;
    }

    public void setiIsbnReturn(JTextField iIsbnReturn) {
        this.iIsbnReturn = iIsbnReturn;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextArea gettBookAvailableUser() {
        return tBookAvailableUser;
    }

    public void settBookAvailableUser(JTextArea tBookAvailableUser) {
        this.tBookAvailableUser = tBookAvailableUser;
    }

    public JTextArea gettShowBookLoanUser() {
        return tShowBookLoanUser;
    }

    public void settShowBookLoanUser(JTextArea tShowBookLoanUser) {
        this.tShowBookLoanUser = tShowBookLoanUser;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBookLoan;
    private javax.swing.JButton bReturnBookUser;
    private javax.swing.JTextField iCpfLoan;
    private javax.swing.JTextField iIsbnLoan1;
    private javax.swing.JTextField iIsbnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tBookAvailableUser;
    private javax.swing.JTextArea tShowBookLoanUser;
    // End of variables declaration//GEN-END:variables
}
