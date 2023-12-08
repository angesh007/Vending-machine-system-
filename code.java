
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vendin_machine;

import javax.swing.JOptionPane;
import java.sql.*;


public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }

    /
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        spriteRB = new javax.swing.JRadioButton();
        cokeRB = new javax.swing.JRadioButton();
        pepsiRB = new javax.swing.JRadioButton();
        waterRB = new javax.swing.JRadioButton();
        lemonadeRB = new javax.swing.JRadioButton();
        rootbeerRB = new javax.swing.JRadioButton();
        purchaseBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        moneyTF = new javax.swing.JTextField();
        changeTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine");
        setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("VENDING MACHINE");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select an item"));

        spriteRB.setText("Sprite  Rs40");
        spriteRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteRBActionPerformed(evt);
            }
        });

        cokeRB.setText("Coke  Rs 40");
        cokeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeRBActionPerformed(evt);
            }
        });

        pepsiRB.setText("Pepsi  Rs35");
        pepsiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiRBActionPerformed(evt);
            }
        });

        waterRB.setText("Water Rs20");
        waterRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterRBActionPerformed(evt);
            }
        });

        lemonadeRB.setText("Lemonade Rs50");
        lemonadeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadeRBActionPerformed(evt);
            }
        });

        rootbeerRB.setText("Root beer  Rs100");
        rootbeerRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootbeerRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cokeRB)
                    .addComponent(spriteRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pepsiRB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(waterRB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rootbeerRB)
                    .addComponent(lemonadeRB))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spriteRB)
                    .addComponent(pepsiRB)
                    .addComponent(lemonadeRB))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cokeRB)
                    .addComponent(waterRB)
                    .addComponent(rootbeerRB))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        purchaseBtn.setText("Purchase");
        purchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Insert money :");

        jLabel3.setText("Change :");

        changeTF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(purchaseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearBtn)
                        .addGap(176, 176, 176)
                        .addComponent(cancelBtn)))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moneyTF)
                            .addComponent(changeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(moneyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(changeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseBtn)
                    .addComponent(clearBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void spriteRBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // changing radio button to select only one
        if(spriteRB.isSelected())
        {
            cokeRB.setSelected(false);
            pepsiRB.setSelected(false);
            lemonadeRB.setSelected(false);
            waterRB.setSelected(false);
        rootbeerRB.setSelected(false);
        }
    }                                        

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // cancel selections
        System.exit(0);
    }                                        

    private void cokeRBActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // changing radio button to select only one
        if(cokeRB.isSelected())
        {
            spriteRB.setSelected(false);
            pepsiRB.setSelected(false);
            lemonadeRB.setSelected(false);
            waterRB.setSelected(false);
            rootbeerRB.setSelected(false);
        }
    }                                      

    private void waterRBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // changing radio button to select only one
        if(waterRB.isSelected())
        {
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            lemonadeRB.setSelected(false);
            pepsiRB.setSelected(false);
            rootbeerRB.setSelected(false);
        }
    }                                      

    private void pepsiRBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // changing radio button to select only one
        if(pepsiRB.isSelected())
        {
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            lemonadeRB.setSelected(false);
            waterRB.setSelected(false);
            rootbeerRB.setSelected(false);
        }

    }                                      

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // to clear all slection and text fields
        spriteRB.setSelected(false);
        cokeRB.setSelected(false);
        pepsiRB.setSelected(false);
        lemonadeRB.setSelected(false);
        waterRB.setSelected(false);
        rootbeerRB.setSelected(false);
        moneyTF.setText(" ");
        changeTF.setText(" ");
    }                                        

    private void lemonadeRBActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // changing radio button to select only one
        if(lemonadeRB.isSelected())
        {
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);
            rootbeerRB.setSelected(false);
        }
    }                                          

    private void rootbeerRBActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // changing radio button to select only one
        if(rootbeerRB.isSelected())
        {
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            lemonadeRB.setSelected(false);
            waterRB.setSelected(false);
            pepsiRB.setSelected(false);
        }
    }                                          

    private void purchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // this pays for our purchase if we have enough money
        double money=0;
        money= Double.parseDouble(moneyTF.getText());
        String item = "";
        if(spriteRB.isSelected())
        {
            item = "Sprite";
            money= money-40;
        }
        else if(cokeRB.isSelected())
        {
            item = "Coke";
            money = money-40;
        }
        else if(pepsiRB.isSelected())
        {
            item = "Pepsi";
            money = money-35;
        }
        else if(waterRB.isSelected())
        {
            item = "Water";
            money = money-20;
        }
        else if(lemonadeRB.isSelected())
        {
            item = "Lemonade";
            money = money-50;
        }
        else if(rootbeerRB.isSelected())
        {
            item = "Root Beer";
            money = money-100;
        }
       
        if(money<0)
        {
            JOptionPane.showMessageDialog(rootPane, "Sorry you Do not Have Enough Money");
        }
        else{
            changeTF.setText(Double.toString(money));
            try {
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "sysasmin", "asdf");
               conn.createStatement().executeUpdate("use vending_machine");
               String sql = "INSERT INTO `items_sold` (`ID`, `Item`, `Payment`, `ChangeR`) VALUES (NULL, ?, ?, ?)";
               PreparedStatement ps = conn.prepareStatement(sql);
               ps.setString(1, item);
               ps.setString(2, moneyTF.getText());
               ps.setString(3, Double.toString(money));
               ps.executeUpdate();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField changeTF;
    private javax.swing.JButton clearBtn;
    private javax.swing.JRadioButton cokeRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton lemonadeRB;
    private javax.swing.JTextField moneyTF;
    private javax.swing.JRadioButton pepsiRB;
    private javax.swing.JButton purchaseBtn;
 
  private javax.swing.JRadioButton rootbeerRB;
    private javax.swing.JRadioButton spriteRB;
    private javax.swing.JRadioButton waterRB;
}

