

/*
Author: Jordan Adkins
Date: 4/22/18
Abstract: Menu that pops up informing the customer of their pizza selections.
 */

public class OrderSummary extends javax.swing.JDialog {
Pizza orderPizza;
    /**
     * Creates new form OrderSummary
     * @param parent
     * @param modal
     * @param inputPizza
     */
    public OrderSummary(java.awt.Frame parent, boolean modal, Pizza inputPizza) {
        super(parent, modal);
        this.orderPizza = inputPizza;       //create object pizza order pizza from inputPizza
        initComponents();                   //initialize components
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSize = new javax.swing.JLabel();
        lblToppings = new javax.swing.JLabel();
        lblCrust = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtSize = new javax.swing.JLabel();
        txtCrust = new javax.swing.JLabel();
        txtToppings = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPrice = new javax.swing.JLabel();
        txtTax = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ORDER SUMMARY");
        setAlwaysOnTop(true);

        lblSize.setText("SIZE:");

        lblToppings.setText("Toppings:");

        lblCrust.setText("Crust:");

        lblPrice.setText("Price:");

        lblTax.setText("Tax:");

        lblTotal.setText("Total:");

        txtSize.setText(orderPizza.getSize());

        txtCrust.setText(orderPizza.getCrust());

        txtToppings.setText(orderPizza.getToppings());

        txtPrice.setText(orderPizza.getStringPrice());

        txtTax.setText(orderPizza.getStringTax());

        txtTotal.setText(orderPizza.getTotal());

        btnConfirm.setText("Okay");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTax)
                        .addGap(18, 18, 18)
                        .addComponent(txtTax))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblToppings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtToppings))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSize)
                            .addComponent(lblCrust))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCrust)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize)
                    .addComponent(txtSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCrust)
                    .addComponent(txtCrust))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToppings)
                    .addComponent(txtToppings))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTax)
                    .addComponent(txtTax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirm)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        dispose(); //close order summary
    }//GEN-LAST:event_btnConfirmActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCrust;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblToppings;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel txtCrust;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JLabel txtSize;
    private javax.swing.JLabel txtTax;
    private javax.swing.JLabel txtToppings;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}