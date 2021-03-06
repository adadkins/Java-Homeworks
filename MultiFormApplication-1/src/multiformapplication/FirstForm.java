//  Program: FirstForm.java
//  Author: Gary R. Smith
//  Date Written: 5/1/2016

/*  Abstract: Displays a JFrame and passes data to a second form.
*/

package multiformapplication;
import javax.swing.JOptionPane;

public class FirstForm extends javax.swing.JFrame {

    /** Creates new form FirstForm */
    public FirstForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnInputDialog = new javax.swing.JButton();
        btnMessageDialog = new javax.swing.JButton();
        txtInputDialogText = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("FirstForm"); // NOI18N

        lblName.setText("Name: ");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubmitActionPerformed(evt);
            }
        });

        btnInputDialog.setText("Display Input Dialog");
        btnInputDialog.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInputDialogActionPerformed(evt);
            }
        });

        btnMessageDialog.setText("Display Message Dialog");
        btnMessageDialog.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMessageDialogActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInputDialogText)
                    .addComponent(txtName)
                    .addComponent(btnInputDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMessageDialog, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addGap(44, 44, 44)
                .addComponent(btnInputDialog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInputDialogText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnMessageDialog)
                .addGap(2, 2, 2)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubmitActionPerformed
    {//GEN-HEADEREND:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        SecondForm secondForm = new SecondForm(txtName.getText());
        secondForm.setVisible(true);
        txtName.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnInputDialogActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInputDialogActionPerformed
    {//GEN-HEADEREND:event_btnInputDialogActionPerformed
        // Display an input dialog box.
        txtInputDialogText.setText(JOptionPane.showInputDialog("Enter Some Data")); 
    }//GEN-LAST:event_btnInputDialogActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        // Display a confirmation dialog box.
        // Buttons can be: YES_NO_OPTION, YES_NO_CANCEL_OPTION, or OK_CANCEL_OPTION
        // Icon can be: ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, or PLAIN_MESSAGE
        int resultButton = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Confirmation", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resultButton == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMessageDialogActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMessageDialogActionPerformed
    {//GEN-HEADEREND:event_btnMessageDialogActionPerformed
        // Display a message dialog box.
        JOptionPane.showMessageDialog(this, "This is the message", "Message Box Title", 
                JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(this, "This is the message", "Message Box Title", 
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "This is the message", "Message Box Title", 
                JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(this, "This is the message", "Message Box Title", 
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(this, "This is the message", "Message Box Title", 
                JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_btnMessageDialogActionPerformed

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
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInputDialog;
    private javax.swing.JButton btnMessageDialog;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtInputDialogText;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
