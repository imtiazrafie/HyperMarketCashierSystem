package hyperMarketSystems;

import java.util.*;
import java.util.stream.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Pay extends javax.swing.JFrame 
{
    /**
     * Creates new Pay form
     */
    private double totalPayment = 0;
    private String custID = "";
    private int counterNumber = 0;
    private int countItem = 0;

    public Pay(String custID, double totalPayment, int counterNumber, int countItem) 
    {
    	getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
        this.totalPayment = totalPayment;
        this.custID = custID;
        this.counterNumber = counterNumber;
        this.countItem = countItem;
        initComponents();
        pack();
        setLocationRelativeTo(null);

        paymentTitle.setText("Payment for customer " + custID + " at Counter " + counterNumber);
        totalNeedPaylabel.setText("Total: RM " + totalPayment);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        paymentTitle = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        amountPayField = new javax.swing.JTextField();
        amountPayField.setHorizontalAlignment(SwingConstants.CENTER);
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        totalNeedPaylabel = new javax.swing.JLabel();
        totalNeedPaylabel.setHorizontalAlignment(SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PAYMENT");

        jPanel2.setBackground(new Color(230, 230, 250));

        paymentTitle.setFont(new Font("Arial", Font.PLAIN, 20)); // NOI18N
        paymentTitle.setForeground(new java.awt.Color(51, 51, 51));
        paymentTitle.setText("Pay for customer - counter -");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymentTitle)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymentTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new Color(230, 230, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new Font("Arial", Font.PLAIN, 18)); // NOI18N
        jLabel3.setText("Enter amount (RM):");

        amountPayField.setFont(new Font("Arial", Font.PLAIN, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5Layout.setHorizontalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addGap(330)
        					.addComponent(jLabel3))
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addGap(59)
        					.addComponent(amountPayField, 700, 700, 700)))
        			.addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(amountPayField, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel5.setLayout(jPanel5Layout);

        jButton1.setFont(new Font("Arial", Font.PLAIN, 18)); // NOI18N
        jButton1.setText("Pay");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jPanel6.setBackground(new Color(245, 245, 245));

        totalNeedPaylabel.setFont(new Font("Arial", Font.PLAIN, 18)); // NOI18N
        totalNeedPaylabel.setText("Total : RM 0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6Layout.setHorizontalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addGap(313)
        			.addComponent(totalNeedPaylabel, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
        			.addContainerGap(20, Short.MAX_VALUE)
        			.addComponent(totalNeedPaylabel)
        			.addGap(19))
        );
        jPanel6.setLayout(jPanel6Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        				.addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(354)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(18))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) 
    {//GEN-FIRST:event_jButton1MouseReleased
    	//Payment process and displaying receipt
        double paymentAmount = 0;
        try 
        {
            paymentAmount = Double.parseDouble(amountPayField.getText());
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Please select valid amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (paymentAmount < totalPayment) 
        {
            JOptionPane.showMessageDialog(null, "Insufficient amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double balance = paymentAmount - totalPayment;

        //Find customer data in queue
        List<CustomerInformation> convertedCustList = null;
        if (counterNumber == 1) 
        {
            convertedCustList = (List<CustomerInformation>) hyperMarketSystems.Main.getCounter1().stream().collect(Collectors.toList());
        } 
        else if (counterNumber == 2) 
        {
            convertedCustList = (List<CustomerInformation>) hyperMarketSystems.Main.getCounter2().stream().collect(Collectors.toList());
        } 
        else if (counterNumber == 3) 
        {
            convertedCustList = (List<CustomerInformation>) hyperMarketSystems.Main.getCounter3().stream().collect(Collectors.toList());
        }
        
        String custIC = "";
        String custName = "";
        String custGender = "";
        String custAddress = "";
        
        for (Iterator iterator = convertedCustList.iterator(); iterator.hasNext();) 
        {
            CustomerInformation nextCustomerData = (CustomerInformation) iterator.next();
            if (nextCustomerData.getCustID().equalsIgnoreCase(custID)) 
            {
                custIC = nextCustomerData.getCustIC();
                custName = nextCustomerData.getCustName();
                custGender = nextCustomerData.getCustGender();
                custAddress = nextCustomerData.getCustAddress();
                break;
            }
        }

        //Remove customer and item after payment made and also save item list for display receipt
        Queue listItem = new LinkedList();
        for (int i = 0; i < countItem; i++) 
        {
            if (counterNumber == 1) 
            {
                CustomerInformation itemCurrent = (CustomerInformation) hyperMarketSystems.Main.getCounter1().peek();
                listItem.add(itemCurrent);
                hyperMarketSystems.Main.getCounter1().remove();
            } 
            else if (counterNumber == 2) 
            {
                CustomerInformation itemCurrent = (CustomerInformation) hyperMarketSystems.Main.getCounter2().peek();
                listItem.add(itemCurrent);
                hyperMarketSystems.Main.getCounter2().remove();
            } 
            else if (counterNumber == 3)
            {
                CustomerInformation itemCurrent = (CustomerInformation) hyperMarketSystems.Main.getCounter3().peek();
                listItem.add(itemCurrent);
                hyperMarketSystems.Main.getCounter3().remove();
            }
        }

        //Displaying receipt
        Receipt receipt = new Receipt(custID, custIC, custName, custGender, custAddress, totalPayment, paymentAmount, balance, listItem);
        receipt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountPayField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel paymentTitle;
    private javax.swing.JLabel totalNeedPaylabel;
    // End of variables declaration//GEN-END:variables
}