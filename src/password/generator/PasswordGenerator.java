/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.generator;

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Jonathan
 */
public class PasswordGenerator extends javax.swing.JFrame {

    /**
     * Creates new form PasswordGenerator
     */
    
    private boolean capitalized;
    private boolean number;
    private boolean symbol;
    
    public PasswordGenerator() {
        super("Password Generator by Jonathan Lin");
        initComponents();
        
        capitalized = false;
        number = false;
        symbol = false;
        password.setEditable(false);
        update();
    }
    
    
    private void update() {
        Random rand = new Random();
        String text = "";
        for (int x = 0; x < 30; x ++) {
            int chType = rand.nextInt(5);
            boolean added = false;
            if (chType == 0){
                if (number == true) {
                    String characters = "1234567890";
                    int index = rand.nextInt(characters.length()-1);
                    text = text + characters.substring(index,index+1);
                    added = true;
                }
            }
            if (chType == 1){
                if (capitalized == true){
                    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    int index = rand.nextInt(characters.length()-1);
                    text = text + characters.substring(index,index+1);
                    added = true;
                }
                
            }
            if (chType == 2){
                if (symbol == true) {
                    String characters = "@#$%^&*+={[}]:;<,>.?!";
                    int index = rand.nextInt(characters.length()-1);
                    text = text + characters.substring(index,index+1);
                    added = true;
                }
            }
            
            if (added == false) {
                String characters = "abcdefghijklmnopqrstuvwxyz";
                int index = rand.nextInt(characters.length()-1);
                text = text + characters.substring(index,index+1);
            }
        }
        password.setText(text);
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
        password = new javax.swing.JTextField();
        capitalizedButton = new javax.swing.JLabel();
        numberButton = new javax.swing.JLabel();
        symbolButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        password.setText("238AKJS#dfks#2");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        capitalizedButton.setBackground(new java.awt.Color(204, 0, 0));
        capitalizedButton.setForeground(new java.awt.Color(0, 0, 0));
        capitalizedButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        capitalizedButton.setText("Capitalized Letters");
        capitalizedButton.setOpaque(true);
        capitalizedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capitalizedButtonMouseClicked(evt);
            }
        });

        numberButton.setBackground(new java.awt.Color(204, 0, 0));
        numberButton.setForeground(new java.awt.Color(0, 0, 0));
        numberButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberButton.setText("Numbers");
        numberButton.setOpaque(true);
        numberButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberButtonMouseClicked(evt);
            }
        });

        symbolButton.setBackground(new java.awt.Color(204, 0, 0));
        symbolButton.setForeground(new java.awt.Color(0, 0, 0));
        symbolButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        symbolButton.setText("Special Symbols");
        symbolButton.setOpaque(true);
        symbolButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                symbolButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(capitalizedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(symbolButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capitalizedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symbolButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void capitalizedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capitalizedButtonMouseClicked
        // TODO add your handling code here:
        
        if (capitalized == false) {
            capitalizedButton.setBackground(Color.GREEN);
            capitalizedButton.setForeground(Color.BLACK);
        }
        if (capitalized == true) {
            capitalizedButton.setBackground(Color.RED);
            capitalizedButton.setForeground(Color.BLACK);
        }
        boolean temp = true;
        if (capitalized == true) {
            temp = false;
        }
        capitalized = temp;
        update();
    }//GEN-LAST:event_capitalizedButtonMouseClicked

    private void numberButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberButtonMouseClicked
        // TODO add your handling code here:
        if (number == false) {
            numberButton.setBackground(Color.GREEN);
            numberButton.setForeground(Color.BLACK);
        }
        if (number == true) {
            numberButton.setBackground(Color.RED);
            numberButton.setForeground(Color.BLACK);
        }
        boolean temp = true;
        if (number == true) {
            temp = false;
        }
        number = temp;
        update();
    }//GEN-LAST:event_numberButtonMouseClicked

    private void symbolButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_symbolButtonMouseClicked
        // TODO add your handling code here:
        if (symbol == false) {
            symbolButton.setBackground(Color.GREEN);
            symbolButton.setForeground(Color.BLACK);
        }
        if (symbol == true) {
            symbolButton.setBackground(Color.RED);
            symbolButton.setForeground(Color.BLACK);
        }
        boolean temp = true;
        if (symbol == true) {
            temp = false;
        }
        symbol = temp;
        update();
    }//GEN-LAST:event_symbolButtonMouseClicked

    
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
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel capitalizedButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numberButton;
    private javax.swing.JTextField password;
    private javax.swing.JLabel symbolButton;
    // End of variables declaration//GEN-END:variables
}
