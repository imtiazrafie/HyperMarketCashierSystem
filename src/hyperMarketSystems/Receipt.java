package hyperMarketSystems;

import java.util.*;
import javax.swing.table.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Receipt extends javax.swing.JFrame
{
    public Receipt(String custID, String custIC, String custName, String custGender, String custAddress, double totalAmount, double paidAmount, double balance, Queue listItem) 
    {
        initComponents();
        pack();
        setLocationRelativeTo(null);

        //Displaying all data
        custNamelabel.setText("Customer Name: " + custName);
        custIDlabel.setText("Customer ID: " +custID);
        custIClabel.setText("Customer IC: " +custIC);
        genderLabel.setText("Gender: " + custGender);
        addressLabel.setText("Address: " + custAddress);
        paymenttitle.setText("Receipt " + custID);
        totalAmountlabel.setText("Total: RM " + totalAmount);
        paidlabel.setText("Amount Paid: RM " + paidAmount);
        balancelabel.setText("Balance: RM " + balance);

        //Displaying item into table
        DefaultTableModel receiptTableModel = (DefaultTableModel) itemReceiptTable.getModel();
        for (Iterator iterator = listItem.iterator(); iterator.hasNext();) 
        {
            CustomerInformation customeritemdata = (CustomerInformation) iterator.next();
            receiptTableModel.addRow(new Object[]{customeritemdata.getItemName(), "RM " + customeritemdata.getitemPrice(), customeritemdata.getDatePurchase()});
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

        jPanel1 = new javax.swing.JPanel();
        custNamelabel = new javax.swing.JLabel();
        custIClabel = new javax.swing.JLabel();
        custIDlabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        paymenttitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemReceiptTable = new javax.swing.JTable();
        totalAmountlabel = new javax.swing.JLabel();
        paidlabel = new javax.swing.JLabel();
        balancelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RECEIPT");

        custNamelabel.setFont(new Font("Arial", Font.PLAIN, 18)); // NOI18N
        custNamelabel.setText("CUSTOMER NAME");

        custIClabel.setFont(new Font("Arial", Font.PLAIN, 18)); // NOI18N
        custIClabel.setText("CUSTOMER IC");

        custIDlabel.setFont(new Font("Arial", Font.PLAIN, 18)); // NOI18N
        custIDlabel.setText("CUSTOMER ID");

        jPanel2.setBackground(new Color(230, 230, 250));

        paymenttitle.setFont(new Font("Arial", Font.PLAIN, 20)); // NOI18N
        paymenttitle.setForeground(new java.awt.Color(51, 51, 51));
        paymenttitle.setText("Receipt - Customer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymenttitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymenttitle)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        itemReceiptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price", "Date Purchased"
            }
        ));
        jScrollPane1.setViewportView(itemReceiptTable);

        totalAmountlabel.setFont(new Font("Arial", Font.BOLD, 18)); // NOI18N
        totalAmountlabel.setText("Total: RM 0");

        paidlabel.setFont(new Font("Arial", Font.PLAIN, 17)); // NOI18N
        paidlabel.setText("Paid: RM 0");

        balancelabel.setFont(new Font("Arial", Font.PLAIN, 17)); // NOI18N
        balancelabel.setText("Balance: RM 0");
        
        genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        
        addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(custNamelabel)
        				.addComponent(custIClabel)
        				.addComponent(custIDlabel)
        				.addComponent(totalAmountlabel)
        				.addComponent(paidlabel)
        				.addComponent(balancelabel))
        			.addPreferredGap(ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(genderLabel)
        				.addComponent(addressLabel))
        			.addContainerGap(178, Short.MAX_VALUE))
        		.addComponent(jScrollPane1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(custNamelabel)
        				.addComponent(genderLabel))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(custIClabel)
        				.addComponent(addressLabel))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(custIDlabel)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(totalAmountlabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(paidlabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(balancelabel)
        			.addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balancelabel;
    private javax.swing.JLabel custIClabel;
    private javax.swing.JLabel custIDlabel;
    private javax.swing.JLabel custNamelabel;
    private javax.swing.JTable itemReceiptTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel paidlabel;
    private javax.swing.JLabel paymenttitle;
    private javax.swing.JLabel totalAmountlabel;
    private JLabel genderLabel;
    private JLabel addressLabel;
}