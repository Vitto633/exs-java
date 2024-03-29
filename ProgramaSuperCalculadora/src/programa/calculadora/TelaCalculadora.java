/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programa.calculadora;

/**
 *
 * @author Pichau
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();
        panelCalc.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();
        panelCalc = new javax.swing.JPanel();
        lblResultadoDiv = new javax.swing.JLabel();
        lblResultadoQuadrado = new javax.swing.JLabel();
        lblResultadoCubo = new javax.swing.JLabel();
        lblResultadoElevado = new javax.swing.JLabel();
        lblResultadoAbsoluto = new javax.swing.JLabel();
        lblQuadrado = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblElevado = new javax.swing.JLabel();
        lblAbsoluto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadora.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Super Calculadora");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Informe um valor :");

        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        lblResultadoDiv.setForeground(new java.awt.Color(255, 0, 0));
        lblResultadoDiv.setText("0");

        lblResultadoQuadrado.setForeground(new java.awt.Color(255, 0, 0));
        lblResultadoQuadrado.setText("0");

        lblResultadoCubo.setForeground(new java.awt.Color(255, 0, 0));
        lblResultadoCubo.setText("0");

        lblResultadoElevado.setForeground(new java.awt.Color(255, 0, 0));
        lblResultadoElevado.setText("0");

        lblResultadoAbsoluto.setForeground(new java.awt.Color(255, 0, 0));
        lblResultadoAbsoluto.setText("0");

        lblQuadrado.setText("Raíz quadrada");

        lblCubo.setText("Raíz cubica");

        lblElevado.setText("Elevado ao cubo");

        lblAbsoluto.setText("Valor absoluto");

        jLabel4.setText("Resto da divisão por 2");

        javax.swing.GroupLayout panelCalcLayout = new javax.swing.GroupLayout(panelCalc);
        panelCalc.setLayout(panelCalcLayout);
        panelCalcLayout.setHorizontalGroup(
            panelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalcLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuadrado)
                    .addComponent(lblCubo)
                    .addComponent(lblAbsoluto)
                    .addComponent(lblElevado)
                    .addComponent(jLabel4))
                .addGap(47, 47, 47)
                .addGroup(panelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultadoAbsoluto)
                    .addComponent(lblResultadoCubo)
                    .addComponent(lblResultadoElevado)
                    .addComponent(lblResultadoQuadrado)
                    .addComponent(lblResultadoDiv))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        panelCalcLayout.setVerticalGroup(
            panelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalcLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoDiv)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoQuadrado)
                    .addComponent(lblQuadrado))
                .addGap(18, 18, 18)
                .addGroup(panelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoCubo)
                    .addComponent(lblCubo))
                .addGap(18, 18, 18)
                .addGroup(panelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoAbsoluto)
                    .addComponent(lblAbsoluto))
                .addGap(18, 18, 18)
                .addGroup(panelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoElevado)
                    .addComponent(lblElevado))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(panelCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalc))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        
        panelCalc.setVisible(true);
        int n = Integer.parseInt(txtN.getValue().toString());
        
        double raizQuadrada = (double) Math.sqrt(n);
        float raizCubica = (float) Math.cbrt(n);
        int divisao = (int) n%2;
        int elevado = (int) Math.pow(n, 3);
        int absoluto = (int) Math.abs(n);
        
       
        lblResultadoDiv.setText(Integer.toString(divisao));
        lblResultadoQuadrado.setText(String.format("%.2f", raizQuadrada));
        lblResultadoCubo.setText(Float.toString(raizCubica));
        lblResultadoElevado.setText(Integer.toString(elevado));
        lblResultadoAbsoluto.setText(Integer.toString(absoluto));
    }//GEN-LAST:event_btnCalcActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbsoluto;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblElevado;
    private javax.swing.JLabel lblQuadrado;
    private javax.swing.JLabel lblResultadoAbsoluto;
    private javax.swing.JLabel lblResultadoCubo;
    private javax.swing.JLabel lblResultadoDiv;
    private javax.swing.JLabel lblResultadoElevado;
    private javax.swing.JLabel lblResultadoQuadrado;
    private javax.swing.JPanel panelCalc;
    private javax.swing.JSpinner txtN;
    // End of variables declaration//GEN-END:variables
}
