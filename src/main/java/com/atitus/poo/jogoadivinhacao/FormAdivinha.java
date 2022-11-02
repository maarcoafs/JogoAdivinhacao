package com.atitus.poo.jogoadivinhacao;

import java.util.Random;

public class FormAdivinha extends javax.swing.JFrame {

    public FormAdivinha() {
        initComponents();
        sorteiaNumero(1000);
    }
    
    private int numeroSorteado;
    
    private void sorteiaNumero(int limite){
        Random sorteador = new Random();
        numeroSorteado = sorteador.nextInt(limite);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnTentar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo - Adivinhe o número");

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Adivinhe o número");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Eu tenho um número entre 1 e 1000, você pode adivinhá-lo?");

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.setAutoscrolls(false);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        btnTentar.setText("Tentar");
        btnTentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTentarActionPerformed(evt);
            }
        });

        jLabel2.setText("Clique em Tentar para começar!");

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 0, 0));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel3.setText("Autor: Marco Flores");

        jLabel4.setText("https://github.com/maarcoafs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel2)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTentar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTentar)))
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnTentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTentarActionPerformed
        String numeroDigitado = txtNumero.getText();
        int numeroDigitadoInt = Integer.valueOf(numeroDigitado);
        if (numeroSorteado > numeroDigitadoInt)
            lblResultado.setText("MAIOR");
        else if (numeroSorteado < numeroDigitadoInt)
            lblResultado.setText("MENOR");
        else
            lblResultado.setText("CORRETO");
    }//GEN-LAST:event_btnTentarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdivinha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTentar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
