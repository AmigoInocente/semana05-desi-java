/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author alisson_formento
 */
public class Sistema extends javax.swing.JPanel {

    /**
     * Creates new form MenuConta
     */
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSelecioneUmUsuario = new javax.swing.JLabel();
        botaoGerente = new javax.swing.JButton();
        botaoCliente = new javax.swing.JButton();

        labelSelecioneUmUsuario.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        labelSelecioneUmUsuario.setText("Selecione um usuário");

        botaoGerente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        botaoGerente.setText("GERENTE");
        botaoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenteActionPerformed(evt);
            }
        });

        botaoCliente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        botaoCliente.setText("CLIENTE");
        botaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(labelSelecioneUmUsuario)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labelSelecioneUmUsuario)
                .addGap(32, 32, 32)
                .addComponent(botaoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteActionPerformed
        this.dispose();
        new Cliente().set
    }//GEN-LAST:event_botaoClienteActionPerformed

    private void botaoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenteActionPerformed
        this.dispose();
        new Gerente().setVisible(true);
    }//GEN-LAST:event_botaoGerenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCliente;
    private javax.swing.JButton botaoGerente;
    private javax.swing.JLabel labelSelecioneUmUsuario;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}