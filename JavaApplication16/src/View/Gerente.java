/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Banco.ContaCorrente;
import Banco.ContaSalario;
import Banco.PessoaFisica;
import Banco.Semana05;
import Semana05;
import javax.swing.JOptionPane;

/**
 *
 * @author alisson_formento
 */
public class Gerente extends javax.swing.JPanel {

    private Banco.Pessoa titular;

    /**
     * Creates new form MenuConta
     */
    public Gerente() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        buttonGroup6 = new javax.swing.ButtonGroup();
        tipoTitular = new javax.swing.JComboBox<>();
        alternativaContaCorrente = new javax.swing.JRadioButton();
        alternativaContaPoupanca = new javax.swing.JRadioButton();
        alternativaContaSalario = new javax.swing.JRadioButton();
        labelGerente = new javax.swing.JLabel();
        botaoCliente = new javax.swing.JButton();
        labelCPFCNPJ = new javax.swing.JLabel();
        caixadetextoCPF = new javax.swing.JTextField();
        botaoCriarConta = new javax.swing.JButton();
        labelTipoDeTitular = new javax.swing.JLabel();
        caixadetextoNomeTitular = new javax.swing.JTextField();
        labelNomeTitular = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tipoTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica" }));
        tipoTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTitularActionPerformed(evt);
            }
        });

        buttonGroup1.add(alternativaContaCorrente);
        alternativaContaCorrente.setText("Conta Corrente");
        alternativaContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaContaCorrenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(alternativaContaPoupanca);
        alternativaContaPoupanca.setText("Conta Poupança");
        alternativaContaPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaContaPoupancaActionPerformed(evt);
            }
        });

        buttonGroup1.add(alternativaContaSalario);
        alternativaContaSalario.setText("Conta Salario");
        alternativaContaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaContaSalarioActionPerformed(evt);
            }
        });

        labelGerente.setFont(new java.awt.Font("DS ISO 1", 0, 48)); // NOI18N
        labelGerente.setText("Gerente");

        botaoCliente.setText("Cliente");
        botaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteActionPerformed(evt);
            }
        });

        labelCPFCNPJ.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCPFCNPJ.setText("CPF/CNPJ");

        caixadetextoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixadetextoCPFActionPerformed(evt);
            }
        });

        botaoCriarConta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoCriarConta.setText("CRIAR CONTA");
        botaoCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarContaActionPerformed(evt);
            }
        });

        labelTipoDeTitular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelTipoDeTitular.setText("Tipo de Titular");

        caixadetextoNomeTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixadetextoNomeTitularActionPerformed(evt);
            }
        });

        labelNomeTitular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelNomeTitular.setText("Nome Titular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(alternativaContaCorrente)
                                        .addGap(42, 42, 42)
                                        .addComponent(alternativaContaPoupanca)
                                        .addGap(38, 38, 38)
                                        .addComponent(alternativaContaSalario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(caixadetextoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelCPFCNPJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelTipoDeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tipoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(labelGerente))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(caixadetextoNomeTitular)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCliente)
                .addGap(72, 72, 72)
                .addComponent(labelGerente)
                .addGap(71, 71, 71)
                .addComponent(labelNomeTitular)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoDeTitular)
                    .addComponent(labelCPFCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caixadetextoCPF)
                    .addComponent(tipoTitular, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternativaContaCorrente)
                    .addComponent(alternativaContaPoupanca)
                    .addComponent(alternativaContaSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(249, 249, 249)
                    .addComponent(caixadetextoNomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tipoTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTitularActionPerformed

    private void alternativaContaSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaContaSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alternativaContaSalarioActionPerformed

    private void alternativaContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaContaCorrenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alternativaContaCorrenteActionPerformed

    private void alternativaContaPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaContaPoupancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alternativaContaPoupancaActionPerformed

    private void botaoCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarContaActionPerformed
        String nome = this.caixadetextoNomeTitular.getText();
        String cpfOuCnpj = this.caixadetextoCPF.getText();
        String tipoPessoa = (String) this.tipoTitular.getSelectedItem();
        
        Pessoa pessoatitular = null;
        if(tipoTitular.equals("Pessoa Física")){
            pessoatitular = new PessoaFisica(nome, cpfOuCnpj);
        }else if(tipoPessoa.equals("Pessoa Jurídica")){
            pessoatitular = new PessoaJuridica(nome, cpfOuCnpj);
        }
        
        
        
        
        
        Conta conta = null;
        if(this.alternativaContaCorrente.isSelected()){
            conta = new ContaCorrente(new Pessoa("tsets", "sadsad"));
        }else if(this.alternativaContaSalario.isSelected()){
            conta = new ContaPoupança(new Pessoa("tsets", "sadsad"));
        }else if(this.alternativaContaPoupanca.isSelected()){
            conta = new ContaSalario(titular);
        }
        
        
        
        
        Semana05.banco.add(conta);
        JOptionPane.showMessageDialog(this, "Sua conta foi criada com sucesso. O número dela é: "+ conta.getNumero());
        
        this.nomeTitular.setText("");
        this.cpfOuCnpj.setText("");
        
    }//GEN-LAST:event_botaoCriarContaActionPerformed

    private void caixadetextoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixadetextoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixadetextoCPFActionPerformed

    private void caixadetextoNomeTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixadetextoNomeTitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixadetextoNomeTitularActionPerformed

    private void botaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteActionPerformed
        this.dispose();
        new Cliente().setVisible(true);
    }//GEN-LAST:event_botaoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton alternativaContaCorrente;
    private javax.swing.JRadioButton alternativaContaPoupanca;
    private javax.swing.JRadioButton alternativaContaSalario;
    private javax.swing.JButton botaoCliente;
    private javax.swing.JButton botaoCriarConta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JTextField caixadetextoCPF;
    private javax.swing.JTextField caixadetextoNomeTitular;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCPFCNPJ;
    private javax.swing.JLabel labelGerente;
    private javax.swing.JLabel labelNomeTitular;
    private javax.swing.JLabel labelTipoDeTitular;
    private javax.swing.JComboBox<String> tipoTitular;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
