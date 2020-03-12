//  Program: DisplayItem.java
//  Author: Gary R. Smith
//  Date Written: 10/31/2009

/*  Abstract: This program reads the items.csv file and diaplays the data on
 *  a form.
 */
package displayItem;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayItem extends javax.swing.JFrame
{

    private FileItem fileItem = new FileItem();

    /**
     * Creates new form DisplayItem
     */
    public DisplayItem() throws IOException
    {
        initComponents();

        //  Centers the screen in the window
        setLocationRelativeTo(null);

        //  Open and read the first record.
        try
        {
            //  Open the file.
            fileItem.open();
            
            //  If opened, get the next record.  Otherwise close the program.
            if (fileItem.isOpen)
            {
                getNextRecord();
            }
        } catch (IOException err)
        {
            System.exit(0);
        }
    }
    
        //  Reads teh next record in the items file.
    public void getNextRecord()
    {
        try
        {
            fileItem.readFile();
            if (!fileItem.isEOF)
            {
                populateForm();
            } else
            {
                lblMessage.setText("There are no more records to read.");
                btnNextRecord.setEnabled(false);
            }
        } catch (Exception err)
        {
            System.exit(0);
        }
    }
    
    //  Populate the form from the Item class
    public void populateForm()
    {
        txtItemNumber.setText(String.valueOf(fileItem.data.getItemNumber()));
        txtStatus.setText(String.valueOf(fileItem.data.getStatus()));
        txtCategory.setText(String.valueOf(fileItem.data.getCategory()));
        txtDescription.setText(fileItem.data.getDescription());
        chkDiscount.setSelected(fileItem.data.getHasDiscount());
        txtPrice.setText(String.valueOf(fileItem.data.getPrice()));
        txtCost.setText(String.valueOf(fileItem.data.getCost()));
        txtQtyOnHand.setText(String.valueOf(fileItem.data.getQtyOnOrder()));
        txtQtyOnOrder.setText(String.valueOf(fileItem.data.getQtyOnOrder()));
        txtYtdSalesQty.setText(String.valueOf(fileItem.data.getQtyOnOrder()));
        txtYtdSalesAmt.setText(String.valueOf(fileItem.data.getYtdSalesAmt()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblItemNumber = new javax.swing.JLabel();
        txtItemNumber = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblCategory = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        chkDiscount = new javax.swing.JCheckBox();
        lblPrice = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblQtyOnHand = new javax.swing.JLabel();
        lblQtyOnOrder = new javax.swing.JLabel();
        lblYtdSalesQty = new javax.swing.JLabel();
        lblYtdSalesAmt = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        txtQtyOnHand = new javax.swing.JTextField();
        txtQtyOnOrder = new javax.swing.JTextField();
        txtYtdSalesQty = new javax.swing.JTextField();
        txtYtdSalesAmt = new javax.swing.JTextField();
        btnNextRecord = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Items List");

        lblItemNumber.setText("Item Number:");

        lblStatus.setText("Status:");

        lblCategory.setText("Category:");

        lblDescription.setText("Description:");

        chkDiscount.setText("Discount");

        lblPrice.setText("Price:");

        lblCost.setText("Cost:");

        lblQtyOnHand.setText("Quantity on Hand:");

        lblQtyOnOrder.setText("Quantity on Order:");

        lblYtdSalesQty.setText("YTD Sales Quantity:");

        lblYtdSalesAmt.setText("YTD Sales Amount: ");

        btnNextRecord.setBackground(new java.awt.Color(102, 204, 0));
        btnNextRecord.setText("Next Record");
        btnNextRecord.setToolTipText("");
        btnNextRecord.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextRecordActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 51, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 0, 51));
        lblMessage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus)
                            .addComponent(lblCategory)
                            .addComponent(lblDescription)
                            .addComponent(lblQtyOnOrder)
                            .addComponent(lblCost)
                            .addComponent(lblQtyOnHand)
                            .addComponent(lblItemNumber)
                            .addComponent(lblPrice))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtyOnHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkDiscount)
                            .addComponent(txtItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtyOnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblYtdSalesQty)
                            .addComponent(lblYtdSalesAmt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtYtdSalesQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtYtdSalesAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnExit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNextRecord))
                        .addComponent(lblMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemNumber)
                    .addComponent(txtItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkDiscount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtyOnHand)
                    .addComponent(txtQtyOnHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtyOnOrder)
                    .addComponent(txtQtyOnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYtdSalesQty)
                    .addComponent(txtYtdSalesQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYtdSalesAmt)
                    .addComponent(txtYtdSalesAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnNextRecord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextRecordActionPerformed
        //  Get the next record in the file.
        getNextRecord();
    }//GEN-LAST:event_btnNextRecordActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(DisplayItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(DisplayItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(DisplayItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(DisplayItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new DisplayItem().setVisible(true);
                } 
                catch (IOException err)
                {
                    Logger.getLogger(DisplayItem.class.getName()).log(Level.SEVERE, null, err);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNextRecord;
    private javax.swing.JCheckBox chkDiscount;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblItemNumber;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQtyOnHand;
    private javax.swing.JLabel lblQtyOnOrder;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblYtdSalesAmt;
    private javax.swing.JLabel lblYtdSalesQty;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtItemNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQtyOnHand;
    private javax.swing.JTextField txtQtyOnOrder;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtYtdSalesAmt;
    private javax.swing.JTextField txtYtdSalesQty;
    // End of variables declaration//GEN-END:variables
}
