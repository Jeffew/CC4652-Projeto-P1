/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import hotel.Fila;
import hotel.LDE;
import hotel.LES;
import hotel.Pessoa;
import hotel.Quarto;
import javax.swing.JOptionPane;

/**
 *
 * @author unifjbizarri
 */

public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    LDE lde = new LDE();
    LES les = new LES();
    Fila fila = new Fila();
    int cpf;
    Pessoa p;
    Quarto q;
    public CheckIn() {
        initComponents();
    }
    
    public CheckIn(LDE ldeParameter, LES lesParameter, Fila filaParameter){
        initComponents();
        lde = ldeParameter;
        les = lesParameter;
        fila = filaParameter;
        
        lbNome.setVisible(false);
        lbEndereco.setVisible(false);
        lbCidade.setVisible(false);
        lbContato.setVisible(false);
        lbQuarto.setVisible(false);
        lbEstadia.setVisible(false);
        lbDias.setVisible(false);
        lbMensagem.setVisible(false);
        lbNumero.setVisible(false);
        
        txtQuarto.setVisible(false);
        txtEstadia.setVisible(false);
        
        btnCheckIn.setVisible(false);
        btnCalcular.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltarIn = new javax.swing.JButton();
        lbCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lbCidade = new javax.swing.JLabel();
        lbContato = new javax.swing.JLabel();
        btnCheckIn = new javax.swing.JButton();
        lbQuarto = new javax.swing.JLabel();
        txtQuarto = new javax.swing.JTextField();
        lbEstadia = new javax.swing.JLabel();
        txtEstadia = new javax.swing.JTextField();
        lbDias = new javax.swing.JLabel();
        lbMensagem = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lbNumero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnVoltarIn.setText("Voltar");
        btnVoltarIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarInActionPerformed(evt);
            }
        });

        lbCpf.setText("CPF");

        lbNome.setText("Nome");

        lbEndereco.setText("Endereço");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lbCidade.setText("Cidade");

        lbContato.setText("Contato");

        btnCheckIn.setText("Check-In");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        lbQuarto.setText("Quarto");

        lbEstadia.setText("Estadia");

        txtEstadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadiaActionPerformed(evt);
            }
        });

        lbDias.setText("Dias");

        lbMensagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lbNumero.setText("Número (1-50)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCheckIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarIn)
                        .addGap(168, 168, 168))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCpf)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpf)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(156, 156, 156))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(lbEndereco)
                            .addComponent(lbCidade)
                            .addComponent(lbContato))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbQuarto)
                                            .addComponent(lbEstadia))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEstadia, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(txtQuarto))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbDias)
                                            .addComponent(lbNumero)))
                                    .addComponent(btnCalcular)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(lbNome)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(lbQuarto)
                    .addComponent(txtQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade)
                    .addComponent(lbEstadia)
                    .addComponent(txtEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDias))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbContato)
                    .addComponent(btnCalcular))
                .addGap(37, 37, 37)
                .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarIn)
                    .addComponent(btnCheckIn))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarInActionPerformed
        new Recepcao(lde,les,fila).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarInActionPerformed

    private void txtEstadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadiaActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
       int quarto = Integer.parseInt(txtQuarto.getText());
       cpf = Integer.parseInt(txtCpf.getText());
       p = lde.busca(cpf);
       q = les.busca(quarto);
       
       q.setOcupado(true);
       p.setHospedado(true);
       p.setQuarto(quarto);
       JOptionPane.showMessageDialog(null, "Hospedado com sucesso");
       new Recepcao(lde,les,fila).setVisible(true);
       dispose();
       
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cpf = Integer.parseInt(txtCpf.getText());
        p = lde.busca(cpf);
        if(p!=null){
            if(p.isHospedado()==false){
                lbNome.setVisible(true);
                lbEndereco.setVisible(true);
                lbCidade.setVisible(true);
                lbContato.setVisible(true);
                lbQuarto.setVisible(true);
                lbEstadia.setVisible(true);
                lbDias.setVisible(true);
                lbNumero.setVisible(true);

                txtQuarto.setVisible(true);
                txtEstadia.setVisible(true);

                btnCalcular.setVisible(true);

                lbNome.setText(p.getNome());
                lbEndereco.setText(p.getEndereco());
                lbCidade.setText(p.getCidade());
                lbContato.setText(p.getContato());
            }else{
                JOptionPane.showMessageDialog(null, "Pessoa já hospedada", "Alert", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int quarto = Integer.parseInt(txtQuarto.getText());
        int dias = Integer.parseInt(txtEstadia.getText());
        
        q = les.busca(quarto);
        if(q!=null){
            if(q.isReservado()==false){
                if(q.isOcupado()==false){
                    q.setTempo(dias);
                    float precoFinal = q.precoTotal();
                    lbMensagem.setText("Preço final: "+precoFinal);
                    lbMensagem.setVisible(true);
                    btnCheckIn.setVisible(true);
                }else{
                    lbMensagem.setText("O Quarto já está ocupado");
                    lbMensagem.setVisible(true);  
                }
            }else{
                lbMensagem.setText("O Quarto já está reservado");
                lbMensagem.setVisible(true);
            }
        }else{
            lbMensagem.setText("Quarto inexistente");
            lbMensagem.setVisible(true);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnVoltarIn;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDias;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstadia;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbQuarto;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEstadia;
    private javax.swing.JTextField txtQuarto;
    // End of variables declaration//GEN-END:variables
}
