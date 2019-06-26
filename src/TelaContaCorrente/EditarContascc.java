/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaContaCorrente;

import Tela.Usuario.Listar;
import RegraDeNegocio.Agencia;
import RegraDeNegocio.ContaCorrente;
import RegraDeNegocio.Usuario;
import TelaContaCorrente.CadastrarContacc.Item;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Senai
 */
public class EditarContascc extends javax.swing.JFrame {

    private ContaCorrente u;

    public ContaCorrente getU() {
        return u;
    }

    public void setU(ContaCorrente u) {
        this.u = u;
        txtnumeroContaedit.setText(u.getNumeroConta());
        txtselectclienteedit.addItem(u.getAgencia());
        txtAgenciaEdit.addItem(u.getAgencia());
    }

    /**
     * Creates new form EditarContascc
     */
    public EditarContascc() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        select();
        diableinput();
    }
    public void diableinput(){
        txtnumeroContaedit.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtselectclienteedit = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtAgenciaEdit = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtnumeroContaedit = new javax.swing.JTextField();
        btcadastrarpoupanca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Conta Corrente");
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Conta Corrente");

        jLabel2.setText("Nome do Cliente:");

        txtselectclienteedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtselectclienteeditActionPerformed(evt);
            }
        });

        jLabel3.setText("Agência:");

        txtAgenciaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgenciaEditActionPerformed(evt);
            }
        });

        jLabel4.setText("Numero da Conta:");

        txtnumeroContaedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroContaeditActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(txtselectclienteedit, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtAgenciaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtnumeroContaedit))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btcadastrarpoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtselectclienteedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgenciaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumeroContaedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btcadastrarpoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtselectclienteeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtselectclienteeditActionPerformed


    }//GEN-LAST:event_txtselectclienteeditActionPerformed

    private void txtAgenciaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgenciaEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgenciaEditActionPerformed

    private void btcadastrarpoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarpoupancaActionPerformed
        ContaCorrente cc = new ContaCorrente();

        Item ag = (Item) txtAgenciaEdit.getSelectedItem();
        Item us = (Item) txtselectclienteedit.getSelectedItem();

        if (!this.txtnumeroContaedit.getText().equals("")) {
            cc.setNumeroConta(txtnumeroContaedit.getText());
            cc.setUsuario(us.id);
            cc.setAgencia(ag.id);
            int i = JOptionPane.showConfirmDialog(rootPane, "Deseja salvar essas informações?");
            if (i == 0) {
                try {
                    cc.editar();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao salvar",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(rootPane, "Salvou!!!");
                ListarContascc lp = new ListarContascc();
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

    private void txtnumeroContaeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroContaeditActionPerformed
        
    }//GEN-LAST:event_txtnumeroContaeditActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadastrarpoupanca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> txtAgenciaEdit;
    private javax.swing.JTextField txtnumeroContaedit;
    private javax.swing.JComboBox<String> txtselectclienteedit;
    // End of variables declaration//GEN-END:variables
public void select() throws IOException {
        Usuario user = new Usuario();
        Agencia a = new Agencia();
        DefaultComboBoxModel model = (DefaultComboBoxModel) txtselectclienteedit.getModel();
        DefaultComboBoxModel model1 = (DefaultComboBoxModel) txtAgenciaEdit.getModel();
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
