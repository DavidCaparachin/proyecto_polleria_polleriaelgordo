/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
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

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        correo_electronico = new javax.swing.JLabel();
        fecha_de_nacimiento = new javax.swing.JLabel();
        numero_de_celular = new javax.swing.JLabel();
        utilizado = new javax.swing.JLabel();
        ulti_vista = new javax.swing.JLabel();
        btnMinimisar = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Back.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Backsegundo.png"))); // NOI18N
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, 40, 40));

        id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id.setText("ID:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 108, 30, 20));

        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 17, 160, 30));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombre.setText("Nombres:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 158, 80, 20));

        apellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        apellido.setText("Apellidos:");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 208, 80, 20));

        correo_electronico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        correo_electronico.setText("Correo Electrónico:");
        jPanel1.add(correo_electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 158, 150, 20));

        fecha_de_nacimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fecha_de_nacimiento.setText("Fecha de Nacimiento:");
        jPanel1.add(fecha_de_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 108, 170, 20));

        numero_de_celular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero_de_celular.setText("Número de celular:");
        jPanel1.add(numero_de_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 208, 150, 20));

        utilizado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        utilizado.setText("Fecha de registro:");
        jPanel1.add(utilizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 108, 150, 20));

        ulti_vista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ulti_vista.setText("Ultima vista:");
        jPanel1.add(ulti_vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 158, 100, 20));

        btnMinimisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Minimizar.png"))); // NOI18N
        btnMinimisar.setBorder(null);
        btnMinimisar.setBorderPainted(false);
        btnMinimisar.setContentAreaFilled(false);
        btnMinimisar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Minimizarsegundo.png"))); // NOI18N
        jPanel1.add(btnMinimisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 20, 40, 40));

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_eliminar.png"))); // NOI18N
        btn.setAutoscrolls(true);
        btn.setBorder(null);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_eliminarsegundo.png"))); // NOI18N
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        jPanel1.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 200, -1, 30));

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_modificar.png"))); // NOI18N
        btnmodificar.setAutoscrolls(true);
        btnmodificar.setBorder(null);
        btnmodificar.setBorderPainted(false);
        btnmodificar.setContentAreaFilled(false);
        btnmodificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_modificarsegundo.png"))); // NOI18N
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1208, 155, -1, 30));

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_agregar.png"))); // NOI18N
        btnagregar.setAutoscrolls(true);
        btnagregar.setBorder(null);
        btnagregar.setBorderPainted(false);
        btnagregar.setContentAreaFilled(false);
        btnagregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_agregarsegundo.png"))); // NOI18N
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1208, 103, -1, 30));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Cerrar.png"))); // NOI18N
        btnCerrar.setAutoscrolls(true);
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Cerrarsegundo.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 40, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG_grande.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1260, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JButton btn;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimisar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel correo_electronico;
    private javax.swing.JLabel fecha_de_nacimiento;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numero_de_celular;
    private javax.swing.JLabel ulti_vista;
    private javax.swing.JLabel utilizado;
    // End of variables declaration//GEN-END:variables
}