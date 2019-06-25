/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Poupanca;

import RegraDeNegocio.Agencia;
import RegraDeNegocio.Poupanca;
import RegraDeNegocio.Usuario;
import Tela.Usuario.Listar;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Senai
 */
public class CadastrarContapp extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarContapp
     */
    public CadastrarContapp() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        select();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btcadastrarpoupanca = new javax.swing.JButton();
        txtAgenciaSelectp = new javax.swing.JComboBox<>();
        txtnumeroContaPoupana = new javax.swing.JTextField();
        txtselectclientep = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btcadastrarpoupanca.setText("Cadastrar");
        btcadastrarpoupanca.setAutoscrolls(true);
        btcadastrarpoupanca.setDoubleBuffered(true);
        btcadastrarpoupanca.setFocusCycleRoot(true);
        btcadastrarpoupanca.setHideActionText(true);
        btcadastrarpoupanca.setInheritsPopupMenu(true);
        btcadastrarpoupanca.setSelected(true);
        btcadastrarpoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrarpoupancaActionPerformed(evt);
            }
        });

        txtnumeroContaPoupana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroContaPoupanaActionPerformed(evt);
            }
        });

        txtselectclientep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtselectclientepActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Cadastrar Poupança");

        jLabel2.setText("Nome do Cliente:");

        jLabel3.setText("Agência:");

        jLabel4.setText("Numero da Conta:");

        jPanel1.setBackground(new java.awt.Color(147, 52, 141));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addComponent(btcadastrarpoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtselectclientep, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtAgenciaSelectp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtnumeroContaPoupana, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtselectclientep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgenciaSelectp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumeroContaPoupana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(btcadastrarpoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcadastrarpoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarpoupancaActionPerformed

        Poupanca pp = new Poupanca();

        if (!this.txtnumeroContaPoupana.getText().equals("")){
            Agencia a = new Agencia();
            Usuario u = new Usuario();
            Item ag = (Item) txtAgenciaSelectp.getSelectedItem();
            Item us = (Item) txtselectclientep.getSelectedItem();
            u.setCpf(us.id);
            a.setNumeroPredio(ag.id);
            pp.setUsuario(u);
            pp.setAgencia(a);
            pp.setNumeroConta(txtnumeroContaPoupana.getText());
            int i = JOptionPane.showConfirmDialog(rootPane, "Deseja salvar essas informações?");
            if (i == 0) {
                try {
                    pp.cadastrar();
                    txtnumeroContaPoupana.setText("");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao salvar",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(rootPane, "Salvou!!!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não Salvo",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Existe campos vazios", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btcadastrarpoupancaActionPerformed

    private void txtnumeroContaPoupanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroContaPoupanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroContaPoupanaActionPerformed

    private void txtselectclientepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtselectclientepActionPerformed
    
        

    }//GEN-LAST:event_txtselectclientepActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadastrarpoupanca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> txtAgenciaSelectp;
    private javax.swing.JTextField txtnumeroContaPoupana;
    private javax.swing.JComboBox<String> txtselectclientep;
    // End of variables declaration//GEN-END:variables

public void select() throws IOException {
        Usuario user = new Usuario();
        Agencia a = new Agencia();
        DefaultComboBoxModel model = (DefaultComboBoxModel) txtselectclientep.getModel();
        DefaultComboBoxModel model1 = (DefaultComboBoxModel) txtAgenciaSelectp.getModel();
        try {
            List<Usuario> l = user.listar();
            for (Usuario u : l) {
                String id = u.getCpf();
                String description = u.getNome();
                model.addElement(new Item(id, description));
            }
        } catch (IOException ex) {
            Logger.getLogger(Listar.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        List<Agencia> l = a.listar();
        for (Agencia u : l) {
            String id = u.getNumeroPredio();
            String description = u.getNumeroPredio();
            model1.addElement(new Item(id, description));
        }
    }
    class Item {

        private String id;
        private String description;

        public Item(String id, String description) {
            this.id = id;
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }

        public String toString() {
            return description;
        }
    }
}

