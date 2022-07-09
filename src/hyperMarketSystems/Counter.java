package hyperMarketSystems;

import java.awt.event.*;
import java.util.*;
import java.util.stream.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Counter extends javax.swing.JFrame 
{
    private int counterNumber = 0;
    private String custIDPopup = "";
    Map<String, ItemsList> itemInstance = new TreeMap<String, ItemsList>();
   
    public Counter(int counterNumber) 
    {
        this.counterNumber = counterNumber;
        initComponents();
        pack();
        setLocationRelativeTo(null);
        counterlabel.setText("Counter " + counterNumber);
        if (counterNumber == 1) 
        {
            displayCustomer(hyperMarketSystems.Main.getCounter1());
        } 
        else if (counterNumber == 2) 
        {
            displayCustomer(hyperMarketSystems.Main.getCounter2());
        } 
        else if (counterNumber == 3) 
        {
            displayCustomer(hyperMarketSystems.Main.getCounter3());
        }
    }

    private void displayCustomer(Queue counter) 
    {
        String currentCustID = "";
        DefaultTableModel customerTableModel = (DefaultTableModel) customerTable.getModel();
        customerTableModel.setRowCount(0);
        
        //To convert, need to filter customer only and add to new list
        List<CustomerInformation> convertedCustList = (List<CustomerInformation>) counter.stream().collect(Collectors.toList());

        int custCount = 0;
        for (Iterator iterator = convertedCustList.iterator(); iterator.hasNext();) 
        {
            CustomerInformation nextCustomerData = (CustomerInformation) iterator.next();
            if (!nextCustomerData.getCustID().equalsIgnoreCase(currentCustID)) 
            {
                currentCustID = nextCustomerData.getCustID();
                custCount++;
                customerTableModel.addRow(new Object[]{nextCustomerData.getCustID(), nextCustomerData.getCustName(), nextCustomerData.getCustGender(), nextCustomerData.getCustAddress(), nextCustomerData.getCustIC()});
            }
        }
    }

    private void initComponents() 
    {
    	JPopupMenu popupCust;
        popupCust = new JPopupMenu();
        JMenuItem custMenuItem = new JMenuItem("View Items");
        popupCust.add(custMenuItem);

        jPanel2 = new javax.swing.JPanel();
        counterlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        customerTable.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (e.getButton() == MouseEvent.BUTTON3) {
                    int tablepoint = customerTable.rowAtPoint(e.getPoint());
                    if (tablepoint >= 0 && tablepoint < customerTable.getRowCount()) {
                        customerTable.setRowSelectionInterval(tablepoint, tablepoint);
                    } else {
                        customerTable.clearSelection();
                    }
                    JTable target = (JTable) e.getSource();
                    int row = target.getSelectedRow(); // select a row
                    String getCustIDFromTable = (String)customerTable.getValueAt(row, 0);
                    custIDPopup = getCustIDFromTable;
                    popupCust.show(e.getComponent(), e.getX(), e.getY());
                }
        	}
        });
        custMenuItem.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
            	ItemsList getItemUI = itemInstance.get("items" + custIDPopup);
                if (getItemUI == null) 
                {
                    ItemsList newItemUI = new ItemsList(custIDPopup, counterNumber);
                    itemInstance.put("items" + custIDPopup, newItemUI);
                    newItemUI.setVisible(true);
                } 
                else 
                {
                    getItemUI.setVisible(true);
                }
            }
        });
        jButton1 = new javax.swing.JButton();
        jButton1.setFont(new Font("Arial", Font.PLAIN, 18));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COUNTER");

        jPanel2.setBackground(new Color(230, 230, 250));

        counterlabel.setFont(new Font("Arial", Font.PLAIN, 20)); // NOI18N
        counterlabel.setText("Counter 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(counterlabel)
                .addContainerGap(713, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(counterlabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customerTable.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Customer ID", "Customer Name", "Gender", "Address", "Customer IC"
        	}
        ));
        customerTable.getColumnModel().getColumn(0).setPreferredWidth(87);
        customerTable.getColumnModel().getColumn(1).setPreferredWidth(250);
        jScrollPane1.setViewportView(customerTable);

        jButton1.setText("Payment");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(686, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Pay paymentui;
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
    	//Payment process here
        if (paymentui == null) 
        {
        	//Get who first queue of customer
            CustomerInformation datacust = null;
            if (counterNumber == 1) 
            {
                datacust = (CustomerInformation) hyperMarketSystems.Main.getCounter1().peek();
            } 
            else if (counterNumber == 2)
            {
                datacust = (CustomerInformation) hyperMarketSystems.Main.getCounter2().peek();
            } 
            else if (counterNumber == 3)
            {
                datacust = (CustomerInformation) hyperMarketSystems.Main.getCounter3().peek();
            }
            if (datacust == null) {
                JOptionPane.showMessageDialog(null, "No customer queue to pay", "No customer", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String custIDPay = datacust.getCustID();
            double totalPayment = 0;

            List<CustomerInformation> convertedItemList = null;
            List<CustomerInformation> filteredItemListCust = null;
            if (counterNumber == 1) 
            {
                convertedItemList = (List<CustomerInformation>) hyperMarketSystems.Main.getCounter1().stream().collect(Collectors.toList());
                filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custIDPay)).collect(Collectors.toList());
            } 
            else if (counterNumber == 2) 
            {
                convertedItemList = (List<CustomerInformation>) hyperMarketSystems.Main.getCounter2().stream().collect(Collectors.toList());
                filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custIDPay)).collect(Collectors.toList());
            } 
            else if (counterNumber == 3) 
            {
                convertedItemList = (List<CustomerInformation>) hyperMarketSystems.Main.getCounter3().stream().collect(Collectors.toList());
                filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custIDPay)).collect(Collectors.toList());
            }

            int countItem = 0;
            for (Iterator iterator = filteredItemListCust.iterator(); iterator.hasNext();) 
            {
                CustomerInformation nextItemData = (CustomerInformation) iterator.next();
                countItem++;
                //Calculate total payment
                totalPayment = totalPayment + nextItemData.getitemPrice();
            }

            paymentui = new Pay(custIDPay, totalPayment, counterNumber, countItem);
            paymentui.setVisible(true);
            paymentui.addWindowListener(new WindowAdapter() 
            {
                @Override
                public void windowClosed(WindowEvent e)
                {
                    if (counterNumber == 1)
                    {
                        displayCustomer(hyperMarketSystems.Main.getCounter1());
                    } 
                    else if (counterNumber == 2) 
                    {
                        displayCustomer(hyperMarketSystems.Main.getCounter2());
                    } 
                    else if (counterNumber == 3) 
                    {
                        displayCustomer(hyperMarketSystems.Main.getCounter3());
                    }
                    paymentui = null;
                }

            });
        } 
        else 
        {
            paymentui.setVisible(true);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel counterlabel;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}