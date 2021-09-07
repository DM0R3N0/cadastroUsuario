/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import modelo.Usuario;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author stephanie
 */
public class UsuarioGUI extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioGUI
     */
    public UsuarioGUI() {
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

        lblCadastroDeUsuario = new javax.swing.JLabel();
        pnlCadastroDeUsuario = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCadastroDeUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCadastroDeUsuario.setText("Cadastro de Usuário");

        pnlCadastroDeUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar novo usuário"));
        pnlCadastroDeUsuario.setToolTipText("");

        lblNome.setText("Nome");

        lblCpf.setText("CPF");

        lblEmail.setText("Email");

        lblTelefone.setText("Telefone");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseExited(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeletarMouseExited(evt);
            }
        });
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        lblId.setText("ID");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroDeUsuarioLayout = new javax.swing.GroupLayout(pnlCadastroDeUsuario);
        pnlCadastroDeUsuario.setLayout(pnlCadastroDeUsuarioLayout);
        pnlCadastroDeUsuarioLayout.setHorizontalGroup(
            pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroDeUsuarioLayout.createSequentialGroup()
                .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroDeUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(txtEmail)))
                    .addGroup(pnlCadastroDeUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpf)
                            .addComponent(lblNome)
                            .addComponent(lblId))
                        .addGap(25, 25, 25)
                        .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtId)))
                    .addGroup(pnlCadastroDeUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar))
                    .addGroup(pnlCadastroDeUsuarioLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListar)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pnlCadastroDeUsuarioLayout.setVerticalGroup(
            pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroDeUsuarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnDeletar))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnListar))
                .addContainerGap())
        );

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlCadastroDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCadastroDeUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroDeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCadastroDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
    
        if((txtNome.getText().isEmpty()) ||
           (txtCpf.getText().isEmpty()) ||
           (txtEmail.getText().isEmpty()) ||
           (txtTelefone.getText().isEmpty())
           ) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }
        else {
            Usuario usuario = new Usuario(
                txtNome.getText(),
                txtCpf.getText(),
                txtEmail.getText(),
                txtTelefone.getText()
            );
            UsuarioDAO dao = new UsuarioDAO();
            if(dao.adcionarUsuario(usuario)!=0){
                JOptionPane.showMessageDialog(null, "Usuário " + usuario.getNome() + " inserido com sucesso!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Falha ao inserir usuário!");
            }
        }
        txtId.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtId.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if(txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo de ID deve ser preenchido.");
        }
        else {
            Usuario usuario = new Usuario(
                Long.valueOf(txtId.getText())
            );
            UsuarioDAO dao = new UsuarioDAO();
            usuario = dao.pesquisarUsuario(usuario);
            if(usuario.getNome() == null) {
                JOptionPane.showMessageDialog(null, "O usuário de ID " + usuario.getId() + " não foi encontrado.");
                txtId.setText("");
                txtNome.setText("");
                txtTelefone.setText("");
                txtCpf.setText("");
                txtEmail.setText("");
            }
            else {
                txtNome.setText(usuario.getNome());
                txtCpf.setText(usuario.getCpf());
                txtEmail.setText(usuario.getEmail());
                txtTelefone.setText(usuario.getTelefone());
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCpf.setEnabled(false);
        txtEmail.setEnabled(false);
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        txtNome.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCpf.setEnabled(true);
        txtEmail.setEnabled(true);
    }//GEN-LAST:event_btnPesquisarMouseExited

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        Usuario usuario = new Usuario(
            Long.valueOf(txtId.getText())
        );
        UsuarioDAO dao = new UsuarioDAO();
        if(dao.deletarUsuario(usuario)>0){
            JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
        } else{
            JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
        }
        txtId.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        txtId.setEnabled(false);
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        txtId.setEnabled(true);
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseEntered
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCpf.setEnabled(false);
        txtEmail.setEnabled(false);
    }//GEN-LAST:event_btnDeletarMouseEntered

    private void btnDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseExited
        txtNome.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCpf.setEnabled(true);
        txtEmail.setEnabled(true);
    }//GEN-LAST:event_btnDeletarMouseExited

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Usuario usuario = new Usuario(
                Long.valueOf(txtId.getText()),
                txtNome.getText(),
                txtCpf.getText(),
                txtEmail.getText(),
                txtTelefone.getText()
        );
        UsuarioDAO dao = new UsuarioDAO();
        if(dao.alterarUsuario(usuario)>0){
            JOptionPane.showMessageDialog(null, "Usuário " + usuario.getNome() + " alterado com sucesso!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
        }
        txtId.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        new ListaGUI().setVisible(true);
    }//GEN-LAST:event_btnListarActionPerformed


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
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioGUI().setVisible(true);
            }
            
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCadastroDeUsuario;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlCadastroDeUsuario;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
