/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.ProductManagement.Product;
import java.util.List;


/**
 *
 * @author jia
 */
public class ViewProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewProductJPanel
     */
    private final SupplierDirectory supplierDirectory;
    
    public ViewProductJPanel(JPanel workPanel) {
        this.supplierDirectory = spList.getSupplierDirectory();
        initComponents();
        populateSupplierCombo();
    }

    private void populateSupplierCombo() {
        cmbSupplier.removeAllItems();

        for (Supplier supplier : supplierDirectory.getSupplierList()) {
            cmbSupplier.addItem(supplier);
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

        cmbSupplier = new javax.swing.JComboBox<>();
        lblSupplier = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        lblSupplier.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lblSupplier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSupplier.setText("Choose Supplier:");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Floor Price", "Target Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnView)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSupplier)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(96, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSupplier))
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:   
        
        Supplier selectedSupplier = (Supplier) cmbSupplier.getSelectedItem();
        if (selectedSupplier == null) {
        System.out.println("No supplier selected.");
        return;
    }
        populateProductTable(selectedSupplier);
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<Object> cmbSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JTable tblProduct;
    // End of variables declaration//GEN-END:variables

    
    
    private void populateProductTable(Supplier supplier) {
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        model.setRowCount(0);

        if (supplier != null && supplier.getProductCatalog() != null) {
        List<Product> products = supplier.getProductCatalog().getProductList();
        if (products.isEmpty()) {
            System.out.println("No products found for supplier: " + supplier.getName());
        }

        for (Product product : products) {
            System.out.println("Adding product: " + product.getName()); // Debug log
            model.addRow(new Object[]{
                product.getName(),
                product.getFloorPrice(),
                product.getTargetPrice()
            });
        }
       }
    }
}
