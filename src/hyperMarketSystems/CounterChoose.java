package hyperMarketSystems;

import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class CounterChoose extends javax.swing.JFrame 
{
	
	Counter counterGUI1;
    Counter counterGUI2;
    Counter counterGUI3;

    public CounterChoose() 
    {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    private void initComponents() 
    {
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("COUNTER SELECTOR");

        jPanel2.setBackground(new Color(230, 230, 250));

        jLabel1.setFont(new Font("Arial", Font.PLAIN, 20)); // NOI18N
        jLabel1.setText("Choose Counter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        JComboBox counterComboBox = new JComboBox();
        counterComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        counterComboBox.setModel(new DefaultComboBoxModel(new String[] {"Counter 1", "Counter 2", "Counter 3"}));
        
        JButton btnNewButton = new JButton("OK");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		System.out.println(counterComboBox.getSelectedIndex());
        		if(counterComboBox.getSelectedIndex() == 0) {
        			//Open for counter 1
        	        if(counterGUI1 != null)
        	        {
        	            counterGUI1.setVisible(true);
        	        }
        	        else
        	        {
        	            counterGUI1 = new Counter(1);
        	            counterGUI1.setVisible(true);
        	        }
        		}else if(counterComboBox.getSelectedIndex() == 1) {
        			//Open for counter 2
        	        if(counterGUI2 != null)
        	        {
        	            counterGUI2.setVisible(true);
        	        }
        	        else
        	        {
        	            counterGUI2 = new Counter(2);
        	            counterGUI2.setVisible(true);
        	        }
        		}else if(counterComboBox.getSelectedIndex() == 2) {
        			//Open for counter 3
        	        if(counterGUI3 != null)
        	        {
        	            counterGUI3.setVisible(true);
        	        }
        	        else
        	        {
        	            counterGUI3 = new Counter(3);
        	            counterGUI3.setVisible(true);
        	        }
        		}
        	}
        });
        btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(76)
        			.addComponent(counterComboBox, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(72)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(counterComboBox, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        				.addComponent(btnNewButton))
        			.addGap(70))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
}