/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Platillos extends javax.swing.JFrame {

    /**
     * Creates new form Platillos
     */
    public Platillos() {
        initComponents();
        TextPrompt IDE = new TextPrompt("Ingrese si ID", tf_id);//ID
        TextPrompt nombre = new TextPrompt("Ingrese su nombre", tf_nombre);//ID
        TextPrompt cocineros = new TextPrompt("Cantidad de cocineros", tf_cocinero);//ID
        TextPrompt categoria = new TextPrompt("Ingrese su Categoria", tf_categoria);//CATEGORIA
        TextPrompt precio = new TextPrompt("Ingrese el precio", tf_precio);//PRECIO
        TextPrompt descripcion = new TextPrompt("Ingrese su Descripcion", tf_descripcion);//DESCRIPCION
        TextPrompt insumo = new TextPrompt("Ingrese su Insumos", tf_insumos);//INSUMOS
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
        cupones = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        stock = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        valido = new javax.swing.JLabel();
        fechadecreacion = new javax.swing.JLabel();
        utilizado = new javax.swing.JLabel();
        fechadeuso = new javax.swing.JLabel();
        btnMinimisar = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tf_id = new javax.swing.JTextField();
        tf_cocinero = new javax.swing.JTextField();
        tf_descripcion = new javax.swing.JTextField();
        tf_ventas = new javax.swing.JTextField();
        tf_precio = new javax.swing.JTextField();
        tf_insumos = new javax.swing.JTextField();
        tf_categoria = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        cupones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/platillos_titulo.png"))); // NOI18N
        jPanel1.add(cupones, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 17, -1, 30));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titulo.setText("Nombre:");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 158, 80, 20));

        stock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stock.setText("Categoría:");
        jPanel1.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 208, 90, 30));

        descuento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descuento.setText("Precio:");
        jPanel1.add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 158, 60, 20));

        valido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valido.setText("Días de ventas:");
        jPanel1.add(valido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 108, 130, 20));

        fechadecreacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechadecreacion.setText("Insumos:");
        jPanel1.add(fechadecreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 208, 80, 20));

        utilizado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        utilizado.setText("Descripción:");
        jPanel1.add(utilizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 108, 100, 20));

        fechadeuso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechadeuso.setText("Cocinero:");
        jPanel1.add(fechadeuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 158, 80, 20));

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 230, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 230, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 167, 230, 10));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 230, 10));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 230, 10));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 230, 10));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, 10));

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

        tf_id.setBorder(null);
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 230, 30));

        tf_cocinero.setBorder(null);
        jPanel1.add(tf_cocinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 300, 30));

        tf_descripcion.setBorder(null);
        jPanel1.add(tf_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 300, 30));

        tf_ventas.setBorder(null);
        jPanel1.add(tf_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 250, 30));

        tf_precio.setBorder(null);
        jPanel1.add(tf_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 300, 30));

        tf_insumos.setBorder(null);
        jPanel1.add(tf_insumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 280, 30));

        tf_categoria.setBorder(null);
        jPanel1.add(tf_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 250, 30));

        tf_nombre.setBorder(null);
        jPanel1.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

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
        //INGRESANDO EL BOTON DE CERRAR SESION
        System.exit(0);
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
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Platillos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimisar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel cupones;
    private javax.swing.JLabel descuento;
    private javax.swing.JLabel fechadecreacion;
    private javax.swing.JLabel fechadeuso;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel stock;
    private javax.swing.JTextField tf_categoria;
    private javax.swing.JTextField tf_cocinero;
    private javax.swing.JTextField tf_descripcion;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_insumos;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_ventas;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel utilizado;
    private javax.swing.JLabel valido;
    // End of variables declaration//GEN-END:variables
}
