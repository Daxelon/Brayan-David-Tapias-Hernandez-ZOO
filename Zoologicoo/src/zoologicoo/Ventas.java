/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zoologicoo;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import Interfaz.Buscador;

/**
 *
 * @author braya
 */
public class Ventas extends javax.swing.JFrame implements Buscador{
static ArrayList<Cliente> ingreCliente = new ArrayList();
static ArrayList<ClienteDeudor> ingreClienteDeu = new ArrayList();

public static float valor, valor1= 50000, valor2=75000, valor3= 25000, valor4=45000, valor5=90000;
public static int descuento, desc1= 5, desc2= 7, desc3= 9, desc4=10, desc5=10;
public static String text1="Plan Tortolitos \n Dos adultos que demuestren ser pareja \n Incluye folleto con descripcion de los animales mas amorosos", text2="Plan mal tercio \n Dos adultos que demuestren ser pareja y un adulto o niño que no sea hijo de ninguno de los dos \n incluye un folleto amoroso y uno normal", text3="Plan gusanito \n nadie te quiere todos te odian mejor te comes un gusanito \n Un adulto, incluye un paquete de gusanos de dulce y un folleto con descripcion de gusanos", text4="Padre soltero \n Un adulto y un niño que desmuestre ser hijo del adulto", text5="Plan familia \n dos adultos y dos niños que demuestren ser familia";


    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
       ClientesDef();
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPago = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        admiVentas = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnLupa = new javax.swing.JButton();
        txtVisitas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlan = new javax.swing.JTextField();
        btnPlan2 = new javax.swing.JButton();
        btnPlan1 = new javax.swing.JButton();
        btnPlan3 = new javax.swing.JButton();
        btnPlan4 = new javax.swing.JButton();
        btnPlan5 = new javax.swing.JButton();
        btnPlan6 = new javax.swing.JButton();
        rbtContado = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        comboAbonos = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelValor = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelDesff = new javax.swing.JLabel();
        labelDesc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelCan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        admiVentas.setText("ADIMINISTRAR VENTAS");
        admiVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admiVentasActionPerformed(evt);
            }
        });

        ventas.setText("VENTAS");
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });

        inicio.setText("INICIO");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        jButton2.setText("ANIMALES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(ventas)
                .addGap(42, 42, 42)
                .addComponent(admiVentas)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(inicio)
                    .addContainerGap(780, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admiVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 147, -1));

        jLabel1.setText("NOMBRE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("CEDULA");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 147, -1));

        btnLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupaActionPerformed(evt);
            }
        });
        jPanel3.add(btnLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 77, 34, -1));

        txtVisitas.setEditable(false);
        txtVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisitasActionPerformed(evt);
            }
        });
        jPanel3.add(txtVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 21, 121, -1));

        jLabel3.setText("CANTIDAD DE VISITAS");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 0, -1, -1));

        jLabel4.setText("PLAN  ELEGIDO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 55, -1, -1));

        txtPlan.setEditable(false);
        txtPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlanActionPerformed(evt);
            }
        });
        jPanel3.add(txtPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, -1));

        btnPlan2.setText("PLAN 2");
        btnPlan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlan2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnPlan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        btnPlan1.setText("PLAN 1");
        btnPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlan1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnPlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        btnPlan3.setText("PLAN 3");
        btnPlan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlan3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnPlan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        btnPlan4.setText("PLAN 4");
        btnPlan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlan4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnPlan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        btnPlan5.setText("PLAN 5");
        btnPlan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlan5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnPlan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        btnPlan6.setText("PLAN 6");
        btnPlan6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlan6ActionPerformed(evt);
            }
        });
        jPanel3.add(btnPlan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        grupoPago.add(rbtContado);
        rbtContado.setText("CONTADO");
        jPanel3.add(rbtContado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        grupoPago.add(jRadioButton2);
        jRadioButton2.setText("ABONOS");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        comboAbonos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));
        comboAbonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAbonosActionPerformed(evt);
            }
        });
        jPanel3.add(comboAbonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        jLabel9.setText("CANTIDAD DE CUOTAS");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jLabel10.setText("FORMA DE PAGO");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel3.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        labelValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelValor.setText("$0");

        jButton7.setText("ABONOS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("IMPRIMIR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("TOTAL A PAGAR:");

        labelDesff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDesff.setText("DESCUENTO POR VISITAS: ");

        labelDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDesc.setText("0%");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("CANTIDAD POR ABONO:");

        labelCan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelCan.setText("$0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(40, 40, 40)
                .addComponent(labelDesff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDesc)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(labelValor))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(labelCan)))
                .addGap(104, 104, 104))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton8))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7)
                                .addComponent(labelDesff)
                                .addComponent(labelDesc))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(labelValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(labelCan))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inicioActionPerformed

    private void txtVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVisitasActionPerformed

    private void txtPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanActionPerformed

    private void btnPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlan1ActionPerformed
        plan1();
        
    }//GEN-LAST:event_btnPlan1ActionPerformed

    private void btnPlan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlan2ActionPerformed
        Plan2();
    }//GEN-LAST:event_btnPlan2ActionPerformed

    private void btnPlan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlan3ActionPerformed
        Plan3();
    }//GEN-LAST:event_btnPlan3ActionPerformed

    private void btnPlan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlan4ActionPerformed
Plan4();
    }//GEN-LAST:event_btnPlan4ActionPerformed

    private void btnPlan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlan5ActionPerformed
Plan5();
    }//GEN-LAST:event_btnPlan5ActionPerformed

    private void btnPlan6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlan6ActionPerformed
Plan6();
    }//GEN-LAST:event_btnPlan6ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaActionPerformed
        buscarId();
    }//GEN-LAST:event_btnLupaActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      Insertar();
        Imprimir();
      Limpiar();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
       Ventas ventas = new Ventas();
       ventas.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ventasActionPerformed

    private void admiVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admiVentasActionPerformed
        administrarVentas admi= new administrarVentas();
        admi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_admiVentasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Animales animal = new Animales();
        animal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    Abonos abono = new Abonos();
    abono.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void comboAbonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAbonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAbonosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
Calcular();    
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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admiVentas;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLupa;
    private javax.swing.JButton btnPlan1;
    private javax.swing.JButton btnPlan2;
    private javax.swing.JButton btnPlan3;
    private javax.swing.JButton btnPlan4;
    private javax.swing.JButton btnPlan5;
    private javax.swing.JButton btnPlan6;
    private javax.swing.JComboBox<String> comboAbonos;
    private javax.swing.ButtonGroup grupoPago;
    private javax.swing.JButton inicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel labelCan;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelDesff;
    private javax.swing.JLabel labelValor;
    private javax.swing.JRadioButton rbtContado;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlan;
    private javax.swing.JTextField txtVisitas;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables

public void Plan(String plan){
    txtPlan.setText(plan);
}

public void Insertar(){
String nombre = txtNombre.getText(), plan = txtPlan.getText();

int cc = Integer.parseInt(txtCedula.getText()), visitas= Integer.parseInt(txtVisitas.getText()), cuotas=0;
float total= Float.valueOf(labelValor.getText()), canCuota, deuda;
 switch(comboAbonos.getSelectedIndex()){
    case 0 -> cuotas=2;
    case 1-> cuotas=3;
    case 2-> cuotas=4;
    case 3-> cuotas=5;
    case 4-> cuotas=6;
}
    
deuda = total+(total*(cuotas/100.0f));
canCuota= deuda/cuotas;
deuda-=canCuota;
 Cliente clienteEncontrado = buscarId();
    if(clienteEncontrado != null){
        clienteEncontrado.setName(nombre);
        clienteEncontrado.setPlan(plan);
        clienteEncontrado.setTotal(total);
        clienteEncontrado.setCanVisitas(visitas+1);
}else if(rbtContado.isSelected()){
ingreCliente.add(new Cliente(cc, visitas, nombre, plan, total));
}else{
ingreClienteDeu.add(new ClienteDeudor(cuotas, deuda, canCuota,cc, visitas, nombre, plan, total));
}
}

public void Calcular(){
    float totall, canCuo, deuda;
    int cuotas=0;
    switch(comboAbonos.getSelectedIndex()){
    case 0 -> cuotas=2;
    case 1-> cuotas=3;
    case 2-> cuotas=4;
    case 3-> cuotas=5;
    case 4-> cuotas=6;
}

   
totall=valor - (valor * (descuento / 100.0f));
if(rbtContado.isSelected()){
labelValor.setText(String.valueOf(totall));
labelDesc.setText(String.valueOf(descuento+"%"));

}else{
totall+=(totall*(8/100.0f)); 
    deuda = totall+(totall*(cuotas/100.0f));
    
    canCuo= deuda/cuotas;
 

labelCan.setText(String.valueOf("$"+canCuo));
labelValor.setText(String.valueOf(totall));
labelDesc.setText(String.valueOf(descuento+"%"));
}

}

public void plan1(){
String [] planes= {"VOLVER","INSERTAR"};
String plan= "PLAN 1";

int opc =JOptionPane.showOptionDialog(null, text1+"\n"+"Valor: "+"$"+valor1+"\n"+"Descuento: "+desc1+"%", plan, WIDTH, HEIGHT, null, planes, "INSERTAR");

if(opc == 1){
txtPlan.setText(plan);
valor= valor1;
descuento = desc1;
}
}
public void Plan2(){
String [] planes= {"VOLVER","INSERTAR"};
String plan= "PLAN 2";

int opc =JOptionPane.showOptionDialog(null, text2+"\n"+"Valor: "+"$"+valor2+"\n"+"Descuento: "+desc2+"%", plan, WIDTH, HEIGHT, null, planes, "INSERTAR");
if(opc == 1){
txtPlan.setText(plan);
valor= valor2;
descuento = desc2;
}
}
public void Plan3(){
    String [] planes= {"VOLVER","INSERTAR"};
String plan= "PLAN 3";

int opc =JOptionPane.showOptionDialog(null, text3+"\n"+"Valor: "+"$"+valor3+"\n"+"Descuento: "+desc3+"%", plan, WIDTH, HEIGHT, null, planes, "INSERTAR");

if(opc == 1){
txtPlan.setText(plan);
valor= valor3;
descuento = desc3;
}
}
public void Plan4(){
   String [] planes= {"VOLVER","INSERTAR"};
String plan= "PLAN 4";

int opc =JOptionPane.showOptionDialog(null, text4+"\n"+"Valor: "+"$"+valor4+"\n"+"Descuento: "+desc4+"%", plan, WIDTH, HEIGHT, null, planes, "INSERTAR");

if(opc == 1){
txtPlan.setText(plan);
valor= valor4;
descuento = desc4;
}
}
public void Plan5(){
    String [] planes= {"VOLVER","INSERTAR"};
String plan= "PLAN 5";

int opc =JOptionPane.showOptionDialog(null, text5+"\n"+"Valor: "+"$"+valor5+"\n"+"Descuento: "+desc5+"%", plan, WIDTH, HEIGHT, null, planes, "INSERTAR");

if(opc == 1){
txtPlan.setText(plan);
valor= valor5;
descuento = desc5;
}
}
public void Plan6(){   
  String [] planes= {"VOLVER","INSERTAR"};
  String plan= "PLAN 6";
int opc =JOptionPane.showOptionDialog(null, text5+"\n"+"Valor: "+"$"+valor5+"\n"+"Descuento: "+desc5+"%", plan, WIDTH, HEIGHT, null, planes, "INSERTAR");
}

public Cliente buscarId(){
       int id = Integer.parseInt(txtCedula.getText());
       boolean encon = false;
       for(Cliente cliente : ingreCliente){
           if(cliente != null && cliente.getCc() == id){
         txtNombre.setText(cliente.getName());
         txtVisitas.setText(String.valueOf(cliente.getCanVisitas()));
           encon = true;
           return cliente;
           }
           
       }
       for(ClienteDeudor cliente : ingreClienteDeu){
           if(cliente != null && cliente.getCc() == id){
         txtNombre.setText(cliente.getName());
         txtVisitas.setText(String.valueOf(cliente.getCanVisitas()));
           encon = true;
           JOptionPane.showMessageDialog(rootPane, "EL CLIENTE "+cliente.getName() +" NOS DEBE "+cliente.getDeuda()+" NO ES POSIBLE COMPRAR HASTA QUE NO CANCELE SU DEUDA");
           
           }
           
       }
       
       
       if(encon == false){
       JOptionPane.showMessageDialog(rootPane, "NO EXISTE");
       txtVisitas.setText("1");
      return null;
       }
       return null;
   }



public void Imprimir(){
    Document document = new Document();
    int cuotas=0;
    switch(comboAbonos.getSelectedIndex()){
    case 0 -> cuotas+=2;
    case 1-> cuotas+=3;
    case 2-> cuotas+=4;
    case 3-> cuotas+=5;
    case 4-> cuotas+=6;
}
    try{
    PdfWriter.getInstance(document, new FileOutputStream("Venta"+txtCedula.getText()+txtNombre.getText()+".pdf"));
    document.open();
    String texto = "EL ZOO DE EDUARDO";
    Paragraph paragraph = new Paragraph(texto);
    paragraph.setAlignment(Element.ALIGN_CENTER);
    document.add(paragraph);
    
    String text = "______________________________________________________________________________";
    Paragraph linea = new Paragraph(text);
    document.add(linea);
    String espacio = "NOMBRE USUARIO", nombre = txtNombre.getText(),cedula = "CEDULA", cc= txtCedula.getText();
    String plan= "EL PLAN ELEGIDO ES", planEle = txtPlan.getText(), pago = "FORMA DE PAGO", pagoEl;
    String descu= "DESCUENTO", descuLa= labelDesc.getText(), valor= "TOTAL A PAGAR", valorLa= labelValor.getText();
    String cuotasSt="CUAOTAS", cuotasEl= String.valueOf(cuotas), salto = "\n";
    if(rbtContado.isSelected()){
    pagoEl = "CONTADO";
    Paragraph nombEs = new Paragraph(salto+espacio+salto+nombre+salto+salto+cedula+salto+cc+salto+salto
    +plan+salto+planEle+salto+salto+pago+salto+pagoEl+salto+salto+descu+salto+descuLa+salto+salto+valor+salto
    +valorLa);
    nombEs.setAlignment(Element.ALIGN_CENTER);
    document.add(nombEs);
    
    }else{
        pagoEl = "CREDITO";
         Paragraph nombEs = new Paragraph(salto+espacio+salto+nombre+salto+salto+cedula+salto+cc+salto+salto
         +plan+salto+planEle+salto+salto+pago+salto+pagoEl+salto+salto+descu+salto+descuLa+salto+salto
         +valor+salto+valorLa+salto+salto+cuotasSt+salto+cuotasEl);
        nombEs.setAlignment(Element.ALIGN_CENTER);
        document.add(nombEs);
    }
   
    
    
    }catch(DocumentException e){
    e.printStackTrace();
    }catch(Exception e){
    e.printStackTrace();
    }finally{
    document.close();
    }
    
    
    
    
    }
public void ClientesDef(){
    if (ingreCliente.size() == 0) {
        ingreCliente.add(new Cliente(1039679338, 2, "JUAN","Plan 2", 46780));
       
       ingreCliente.add(new Cliente(1039679330, 2, "Pepe","Plan 2", 46780));
       
    }
    if (ingreClienteDeu.size() == 0) {
        ingreClienteDeu.add(new ClienteDeudor(3, 162000, 54000,1039679339, 5, "JOSE", "Plan1 ", 216000));
        ingreClienteDeu.add(new ClienteDeudor(4, 175000, 3,1039679331, 5, "JOSELITO", "Plan 2 ", 12425154));
    }
      
}

public void Limpiar(){
txtNombre.setText("");
txtCedula.setText("");
txtVisitas.setText("");
txtPlan.setText("");
}
}
