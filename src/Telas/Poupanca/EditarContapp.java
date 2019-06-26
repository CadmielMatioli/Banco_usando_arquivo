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
public class EditarContapp extends javax.swing.JFrame {

    private Poupanca p;

    public Poupanca getAg() {
        return p;
    }

    public void setU(Poupanca p) {
        this.p = p;
        txtEditarContaPP.setText(p.getNumeroConta());
        txtEditarCliente.addItem(p.getUsuario());
        txtEditarAgencia.addItem(p.getAgencia());
    }

    /**
     * Creates new form EditarContapp
     */
    public EditarContapp() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        select();
        disableinput();
    }

    public void disableinput() {
        txtEditarContaPP.setEditable(false);
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
        txtEditarContaPP = new javax.swing.JTextField();
        txtEditarCliente = new javax.swing.JComboBox<>();
        txtEditarAgencia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Conta Poupança");
        setPreferredSize(new java.awt.Dimension(980, 580));
        getContentPane().setLayout(null);

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
        getContentPane().add(btcadastrarpoupanca);
        btcadastrarpoupanca.setBounds(299, 371, 213, 40);

        txtEditarContaPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarContaPPActionPerformed(evt);
            }
        });
        getContentPane().add(txtEditarContaPP);
        txtEditarContaPP.setBounds(458, 226, 477, 20);

        txtEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtEditarCliente);
        txtEditarCliente.setBounds(299, 174, 636, 20);

        getContentPane().add(txtEditarAgencia);
        txtEditarAgencia.setBounds(299, 226, 136, 20);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Editar Poupança");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(539, 69, 200, 54);

        jLabel2.setText("Nome do Cliente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(299, 151, 82, 14);

        jLabel4.setText("Numero da Conta:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(458, 203, 88, 14);

        jLabel3.setText("Agência:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(299, 203, 42, 14);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pppppp.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 990, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcadastrarpoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarpoupancaActionPerformed
        Poupanca pp = new Poupanca();

        Item ag = (Item) txtEditarAgencia.getSelectedItem();
        Item us = (Item) txtEditarCliente.getSelectedItem();

        if (!this.txtEditarContaPP.getText().equals("")) {
            pp.setNumeroConta(txtEditarContaPP.getText());
            pp.setUsuario(us.id);
            pp.setAgencia(ag.id);
            int i = JOptionPane.showConfirmDialog(rootPane, "Deseja salvar essas informações?");
            if (i == 0) {
                try {
                    pp.editar();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao salvar",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(rootPane, "Salvou!!!");
                ListarContaspp lp = new ListarContaspp();
                lp.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não Salvo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Existe campos vazios", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btcadastrarpoupancaActionPerformed

    private void txtEditarContaPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarContaPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditarContaPPActionPerformed

    private void txtEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarClienteActionPerformed

    }//GEN-LAST:event_txtEditarClienteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadastrarpoupanca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> txtEditarAgencia;
    private javax.swing.JComboBox<String> txtEditarCliente;
    private javax.swing.JTextField txtEditarContaPP;
    // End of variables declaration//GEN-END:variables
public void select() throws IOException {
        Usuario user = new Usuario();
        Agencia a = new Agencia();
        DefaultComboBoxModel model = (DefaultComboBoxModel) txtEditarCliente.getModel();
        DefaultComboBoxModel model1 = (DefaultComboBoxModel) txtEditarAgencia.getModel();
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
