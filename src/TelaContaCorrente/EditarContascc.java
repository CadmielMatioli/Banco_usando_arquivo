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
import Telas.Menu;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtselectclienteedit = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtAgenciaEdit = new javax.swing.JComboBox<>();
        txtnumeroContaedit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btcadastrarpoupanca = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Conta Corrente");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ladoedit.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 249, 570));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Conta Corrente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 61, 278, 54));

        jLabel2.setText("Nome do Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 168, -1, -1));

        txtselectclienteedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtselectclienteeditActionPerformed(evt);
            }
        });
        jPanel1.add(txtselectclienteedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 191, 530, -1));

        jLabel3.setText("Agência:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 231, -1, -1));

        txtAgenciaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgenciaEditActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgenciaEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 254, 136, -1));

        txtnumeroContaedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroContaeditActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumeroContaedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 254, 380, -1));

        jLabel4.setText("Numero da Conta:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 231, -1, -1));

        btcadastrarpoupanca.setBackground(new java.awt.Color(204, 51, 0));
        btcadastrarpoupanca.setForeground(new java.awt.Color(255, 255, 255));
        btcadastrarpoupanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botao cad.png"))); // NOI18N
        btcadastrarpoupanca.setText("Editar");
        btcadastrarpoupanca.setAutoscrolls(true);
        btcadastrarpoupanca.setBorder(null);
        btcadastrarpoupanca.setContentAreaFilled(false);
        btcadastrarpoupanca.setDoubleBuffered(true);
        btcadastrarpoupanca.setFocusCycleRoot(true);
        btcadastrarpoupanca.setFocusTraversalPolicyProvider(true);
        btcadastrarpoupanca.setHideActionText(true);
        btcadastrarpoupanca.setInheritsPopupMenu(true);
        btcadastrarpoupanca.setOpaque(false);
        btcadastrarpoupanca.setSelected(true);
        btcadastrarpoupanca.setVerifyInputWhenFocusTarget(false);
        btcadastrarpoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrarpoupancaActionPerformed(evt);
            }
        });
        jPanel1.add(btcadastrarpoupanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 130, -1));

        jToggleButton1.setBackground(new java.awt.Color(102, 0, 204));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bot Voltar.png"))); // NOI18N
        jToggleButton1.setText("Voltar");
        jToggleButton1.setAutoscrolls(true);
        jToggleButton1.setBorder(null);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setDoubleBuffered(true);
        jToggleButton1.setFocusCycleRoot(true);
        jToggleButton1.setFocusTraversalPolicyProvider(true);
        jToggleButton1.setHideActionText(true);
        jToggleButton1.setInheritsPopupMenu(true);
        jToggleButton1.setVerifyInputWhenFocusTarget(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 128, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadastrarpoupanca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
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
