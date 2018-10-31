/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author unifjbizarri
 */
import hotel.*;
import javax.swing.JOptionPane;
public class Listagem extends javax.swing.JFrame {

    /**
     * Creates new form Listagem
     */
    LDE lde = new LDE();
    LES les = new LES();
    Fila fila = new Fila();
    
    public Listagem() {
        initComponents();
    }
    
    public Listagem(LDE ldeParameter, LES lesParameter, Fila filaParameter){
        initComponents();
        lde = ldeParameter;
        les = lesParameter;
        fila = filaParameter;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltarListagem = new javax.swing.JButton();
        txtCpfBusca = new javax.swing.JTextField();
        lbCpfAviso = new javax.swing.JLabel();
        lbNomeBusca = new javax.swing.JLabel();
        lbEnderecoBusca = new javax.swing.JLabel();
        lbCidadeBusca = new javax.swing.JLabel();
        lbContatoBusca = new javax.swing.JLabel();
        lbCpfBusca = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lbHospedado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnVoltarListagem.setText("Voltar");
        btnVoltarListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarListagemActionPerformed(evt);
            }
        });

        txtCpfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfBuscaActionPerformed(evt);
            }
        });

        lbCpfAviso.setText("Digite o CPF para a busca:");

        btnBuscar.setText("Busca");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(btnVoltarListagem)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHospedado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCpfAviso)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbCpfBusca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(lbContatoBusca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCidadeBusca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEnderecoBusca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNomeBusca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCpfAviso)
                    .addComponent(btnBuscar))
                .addGap(52, 52, 52)
                .addComponent(lbNomeBusca)
                .addGap(18, 18, 18)
                .addComponent(lbEnderecoBusca)
                .addGap(18, 18, 18)
                .addComponent(lbCidadeBusca)
                .addGap(18, 18, 18)
                .addComponent(lbContatoBusca)
                .addGap(18, 18, 18)
                .addComponent(lbCpfBusca)
                .addGap(18, 18, 18)
                .addComponent(lbHospedado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(btnVoltarListagem)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarListagemActionPerformed
        new Menu(lde,les,fila).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarListagemActionPerformed

    private void txtCpfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfBuscaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int cpf = Integer.parseInt(txtCpfBusca.getText());
        Pessoa p = lde.busca(cpf);
        if(p!=null){
            lbNomeBusca.setText(p.getNome());
            lbEnderecoBusca.setText(p.getEndereco());
            lbCidadeBusca.setText(p.getCidade());
            lbContatoBusca.setText(p.getContato());
            lbCpfBusca.setText(Integer.toString(p.getCpf()));
            if(p.isHospedado()==true){
                lbHospedado.setText("Hospedado no quarto "+p.getQuarto());
            }else{
                lbHospedado.setText("Não Hospedado");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltarListagem;
    private javax.swing.JLabel lbCidadeBusca;
    private javax.swing.JLabel lbContatoBusca;
    private javax.swing.JLabel lbCpfAviso;
    private javax.swing.JLabel lbCpfBusca;
    private javax.swing.JLabel lbEnderecoBusca;
    private javax.swing.JLabel lbHospedado;
    private javax.swing.JLabel lbNomeBusca;
    private javax.swing.JTextField txtCpfBusca;
    // End of variables declaration//GEN-END:variables
}
