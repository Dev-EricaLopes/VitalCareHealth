package Telas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import DAO.ConnectionFactory;
import classes.Paciente;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author erica
 */
public class LoginTela extends javax.swing.JFrame {
    
    private Connection conn;
    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
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

        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        btLogar = new javax.swing.JButton();
        ckSenha = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela De Login.");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("telaLogin"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(570, 130, 280, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(570, 240, 280, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(690, 100, 340, 100);

        btLogar.setBackground(new java.awt.Color(102, 153, 255));
        btLogar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btLogar.setForeground(new java.awt.Color(255, 255, 255));
        btLogar.setText("Logar");
        btLogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });
        getContentPane().add(btLogar);
        btLogar.setBounds(580, 360, 110, 30);

        ckSenha.setText("Mostrar senha");
        ckSenha.setInheritsPopupMenu(true);
        ckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(ckSenha);
        ckSenha.setBounds(570, 280, 170, 20);

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 360, 110, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(580, 120, 340, 100);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(690, 90, 340, 100);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(580, 90, 340, 100);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(690, 130, 340, 100);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(550, 200, 340, 100);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(810, 280, 340, 200);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(670, 200, 340, 100);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(560, 230, 340, 100);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(670, 220, 340, 100);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(550, 250, 340, 110);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(550, 300, 340, 110);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel29);
        jLabel29.setBounds(710, 300, 340, 110);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(590, 320, 340, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teladelogin.jpg"))); // NOI18N
        jLabel4.setText("jLabel3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1000, 460);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel27);
        jLabel27.setBounds(710, 320, 340, 110);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(710, 300, 340, 110);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brancolinha.jpg"))); // NOI18N
        getContentPane().add(jLabel30);
        jLabel30.setBounds(670, 200, 340, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teladelogin.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 460);
        getContentPane().add(jScrollBar1);
        jScrollBar1.setBounds(680, 340, 10, 48);

        setSize(new java.awt.Dimension(1008, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     public void abrirTelaMenu(Paciente paciente) {
        // Feche a tela de login
        dispose();

        // Crie e exiba a tela de menu
        TelaMenu telaMenu = new TelaMenu(paciente);
        telaMenu.setVisible(true);
    }
     
    private void ckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckSenhaActionPerformed

        
        if (ckSenha.isSelected()) {
                    txtSenha.setEchoChar((char) 0); // Exibe a senha
                } else {
                    txtSenha.setEchoChar('*'); // Oculta a senha
                }
    }//GEN-LAST:event_ckSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Teladecadastro().setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        // TODO add your handling code here:
        String login, senha;
        login = txtUsuario.getText();
        senha = txtSenha.getText();
        
        ConnectionFactory conexao = new ConnectionFactory();
        conn = conexao.obtemConexao();
        
        //String sql = "SELECT * FROM pacientes WHERE CPF = '234.567.890-00' AND senha = '12345'";
        String sql = "SELECT * FROM pacientes WHERE CPF = ? AND senha = ?";

        try {
            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            
            Paciente paciente = new Paciente();
            
            if(rs.next()) {
                paciente.setCodigo(rs.getInt("Codigo"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setEmail(rs.getString("Email"));
                paciente.setEndereco(rs.getString("Endereco"));
                paciente.setTelefone(rs.getString("Telefone"));
                paciente.setDataNascimento(rs.getString("DataNascimento"));
                paciente.setSenha(rs.getString("senha"));
                paciente.setNome(rs.getString("nome"));
                 
                
                JOptionPane.showMessageDialog(null, 
                        "Seja bem vindo a VitalCareHealth!!!");
                abrirTelaMenu(paciente);
            }
            else {
                JOptionPane.showMessageDialog(null,
                        "ERRO. Usuário e/ou Senha inválido!");
            }
            //return paciente
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btLogarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogar;
    private javax.swing.JCheckBox ckSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
