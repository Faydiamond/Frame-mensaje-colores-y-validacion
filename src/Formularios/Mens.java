/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author usuario
 */
public class Mens extends javax.swing.JFrame {

    /**
     * Creates new form Mens
     */
    public Mens() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TxtMos = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        BttLet = new javax.swing.JButton();
        BttMen = new javax.swing.JButton();
        BttFon = new javax.swing.JButton();
        BttSal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtMos.setColumns(20);
        TxtMos.setRows(5);
        TxtMos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtMosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TxtMos);

        BttLet.setText("Color Letra");
        BttLet.setToolTipText("Haz click para cambiar el color de la letra");
        BttLet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttLetActionPerformed(evt);
            }
        });

        BttMen.setText("Mensaje");
        BttMen.setToolTipText("Haz click para mostrar el mensaje");
        BttMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttMenActionPerformed(evt);
            }
        });

        BttFon.setText("Color Fondo");
        BttFon.setToolTipText("Haz click para cambiar el color del fondo");
        BttFon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttFonActionPerformed(evt);
            }
        });

        BttSal.setText("Salir");
        BttSal.setToolTipText("Haz click para salir de la palicación");
        BttSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttSalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(BttLet)
                        .addGap(34, 34, 34)
                        .addComponent(BttFon)
                        .addGap(28, 28, 28)
                        .addComponent(BttSal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(BttMen)
                    .addContainerGap(400, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttLet)
                    .addComponent(BttFon)
                    .addComponent(BttSal))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(310, Short.MAX_VALUE)
                    .addComponent(BttMen)
                    .addGap(38, 38, 38)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BttMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttMenActionPerformed
        String Message="A lake in the sky\n" +
"I want to be gentle\n" +
"To avoid your harshness\n" +
"I put out your fire\n" +
"I turn on my water\n" +
"Perhaps there are no certainties\n" +
" \n" +
"We go slowly\n" +
"To find each other\n" +
"Time is sand in my hands\n" +
"I know by your marks\n" +
"How much you have loved\n" +
"More than you promised\n" +
" \n" +
"Today I hurried you\n" +
"(I was so sensitive)\n" +
"Mirages are what increase thirst\n" +
"If I passed, pay me no heed\n" +
"Sometimes I cannot with solitude\n" +
" \n" +
"We go slowly\n" +
"To find each other\n" +
"Time is sand in my hands\n" +
"I know by your marks\n" +
"How much you have left\n" +
"To forget what you did\n" +
"To feel something you never felt\n" +
" \n" +
"You are the dreamiest landscape\n" +
"And you shook the strongest sorrows\n" +
"And you replied each time I have called you\n" +
" \n" +
"We go slowly\n" +
"To find each other\n" +
"Time is sand in my hands\n" +
"A lake in the sky\n" +
"Is my gift\n" +
"To forget what you did\n" +
"To feel something you never felt\n" +
"To make you feel\n" +
"Something you never felt";
        
TxtMos.setText(Message);
        
    }//GEN-LAST:event_BttMenActionPerformed

    private void BttSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttSalActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_BttSalActionPerformed

    private void BttLetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttLetActionPerformed
       Color c=JColorChooser.showDialog(rootPane,"Por favor selecciona un color para establecerlo a el color de letra", this.getForeground());
       TxtMos.setForeground(c);
    }//GEN-LAST:event_BttLetActionPerformed

    private void BttFonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttFonActionPerformed
       Color c=JColorChooser.showDialog(rootPane,"Por favor selecciona un color para establecerlo a el fondo", this.getBackground());
       TxtMos.setBackground(c);
    }//GEN-LAST:event_BttFonActionPerformed

    private void TxtMosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMosKeyTyped
        char H=evt.getKeyChar();                                    //declaro variable tipo string
        if ((H<'0' || H>'9') && (H<'.' || H>'.'))
        {
            getToolkit().beep();
            evt.consume();
        }
        if ((H<'a' || H>'z') && (H<'.' || H>'.'))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TxtMosKeyTyped

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
            java.util.logging.Logger.getLogger(Mens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttFon;
    private javax.swing.JButton BttLet;
    private javax.swing.JButton BttMen;
    private javax.swing.JButton BttSal;
    private javax.swing.JTextArea TxtMos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
