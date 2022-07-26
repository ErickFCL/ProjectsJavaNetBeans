
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame implements iAcciones{
    static ArrayList<DetalleFactura> det = new ArrayList<DetalleFactura>();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTRuc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCbxCantidad = new javax.swing.JComboBox<>();
        jCbxDescrip = new javax.swing.JComboBox<>();
        jTpUnitario = new javax.swing.JTextField();
        jtImporte = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBtnImprimir = new javax.swing.JButton();
        jBtnComprar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jTSubTotal = new javax.swing.JTextField();
        jTTotal = new javax.swing.JTextField();
        jTIGV = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtTElefono = new javax.swing.JTextField();
        htFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("R.U.C 20602078524");

        jLabel3.setText("       FACTURA");

        jLabel4.setText("R.U.C");

        jLabel5.setText("Señor (es) :");

        jLabel6.setText("Direccion :");

        jLabel7.setText("CANTIDAD");

        jLabel8.setText("                                   DESCRIPSION");

        jLabel9.setText("P. UNIT");

        jLabel10.setText("IMPORTE");

        jCbxCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jCbxDescrip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PANTALON", "CAMISA", "CHOMPA" }));
        jCbxDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxDescripActionPerformed(evt);
            }
        });

        jTpUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpUnitarioActionPerformed(evt);
            }
        });

        jLabel11.setText("TOTAL");

        jLabel12.setText("I.G.V");

        jLabel13.setText("SUB TOTAL");

        jBtnImprimir.setText("IMPRIMIR");

        jBtnComprar.setText("COMPRAR");
        jBtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnComprarActionPerformed(evt);
            }
        });

        jBtnLimpiar.setText("LIMPIAR");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jLabel14.setText("Telefono");

        jLabel15.setText("fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jCbxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtnImprimir)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jBtnLimpiar)
                                        .addComponent(jBtnComprar)))
                                .addGap(103, 103, 103)))
                        .addGap(35, 35, 35)
                        .addComponent(jCbxDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTpUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jTSubTotal)
                            .addComponent(jTIGV))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jTDireccion))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtTElefono, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(htFecha)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jtTElefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(htFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbxDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLimpiar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnComprar)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jBtnImprimir)
                    .addComponent(jTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jLabel1.setText("Ropa El Llico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTpUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpUnitarioActionPerformed

    private void jBtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComprarActionPerformed
        guardar();        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnComprarActionPerformed

    private void jCbxDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxDescripActionPerformed
        String nom,dir,ruc,desc;
       int can;
       double pUni,imp,sub,igv,total;
       ruc = jTRuc.getText();
       nom=jTNombre.getText();
       dir=jTDireccion.getText();
       desc = jCbxDescrip.getSelectedItem().toString();
       can = Integer.parseInt((String) jCbxCantidad.getSelectedItem());
       
       if("PANTALON".equals(desc)){
           jTpUnitario.setText("150");
           pUni = 150;
           imp = pUni*can;
           jtImporte.setText(""+imp);
           sub = imp/1.18;
           jTSubTotal.setText(""+sub);
           total=imp;
           jTTotal.setText(""+total);
           igv=total-sub;
           jTIGV.setText(""+igv);
           
       }else if("CAMISA".equals(desc)){
           jTpUnitario.setText("40");
           pUni = 40;
           imp = pUni*can;
           jtImporte.setText(""+imp);
           sub = imp/1.18;
           jTSubTotal.setText(""+sub);
           total=imp;
           jTTotal.setText(""+total);
           igv=total-sub;
           jTIGV.setText(""+igv);
           
       }else if("CHOMPA".equals(desc)){
           jTpUnitario.setText("75");
           pUni = 75;
           imp = pUni*can;
           jtImporte.setText(""+imp);
           sub = imp/1.18;
           jTSubTotal.setText(""+sub);
           total=imp;
           jTTotal.setText(""+total);
           igv=total-sub;
           jTIGV.setText(""+igv);
           
       }
    }//GEN-LAST:event_jCbxDescripActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        limpiar();// TODO add your handling code here:
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    @Override
    public void guardar() {
    
        String nom,dir,ruc,desc,tel;
       int can,fecha;
       double pUni,imp,sub,igv,total;
       ruc = jTRuc.getText();
       nom=jTNombre.getText();
       dir=jTDireccion.getText();
       desc = jCbxDescrip.getSelectedItem().toString();
       can = Integer.parseInt((String) jCbxCantidad.getSelectedItem());
       tel=jtTElefono.getText();
       fecha = Integer.parseInt((String) htFecha.getText());
       if("PANTALON".equals(desc)){
           pUni = 150;
           imp = pUni*can;
           
           sub = imp/1.18;
          
           total=imp;
          
           igv=total-sub;
           DetalleFactura d = new DetalleFactura(desc, can, pUni, imp, sub, igv, total, nom, dir, tel,ruc,fecha);
           det.add(d);
           JOptionPane.showMessageDialog(this, "Guardado con exito");
           
           String FILE_NAME = ("Compra de "+d.getDescripcion()+" "+d.getNomSenior()+".txt");
           try{
               FileWriter output= new FileWriter(FILE_NAME);
               output.write(d.getNomSenior());
               output.write(d.getDireccion());
               output.write(d.getTelefono());
               output.write(d.getRuc());
               output.write(d.getFechaFactura());
               
               
               output.write(d.getDescripcion());
               output.write(d.getCantidad());
               output.write((int) d.getpUnitario()+"");
               output.write((int) d.getImporte()+"");
               output.write((int) d.getSubTotal()+"");
               output.write((int) d.getIgv()+"");
               output.write((int) d.getTotal()+"");
               
               output.close();
           }catch (IOException ex){
               System.out.println(":(");
           }
       }else if("CAMISA".equals(desc)){
           
           pUni = 40;
           imp = pUni*can;
          
           sub = imp/1.18;
          
           total=imp;
           
           igv=total-sub;
          DetalleFactura d = new DetalleFactura(desc, can, pUni, imp, sub, igv, total, nom, dir, tel,ruc,fecha);
           det.add(d);
            JOptionPane.showMessageDialog(this, "Guardado con exito");
           
            String FILE_NAME = ("Compra de "+d.getDescripcion()+" "+d.getNomSenior()+".txt");
           try{
               FileWriter output= new FileWriter(FILE_NAME);
               output.write(d.getNomSenior());
               output.write(d.getDireccion());
               output.write(d.getTelefono());
               output.write(d.getRuc());
               output.write(d.getFechaFactura());
               
               output.write(d.getDescripcion());
               output.write(d.getCantidad());
               output.write((int) d.getpUnitario()+"");
               output.write((int) d.getImporte()+"");
               output.write((int) d.getSubTotal()+"");
               output.write((int) d.getIgv()+"");
               output.write((int) d.getTotal()+"");
               
               output.close();
           }catch (IOException ex){
               System.out.println(":(");
           }
       }else if("CHOMPA".equals(desc)){
          
           pUni = 75;
           imp = pUni*can;
          
           sub = imp/1.18;
           
           total=imp;
           
           igv=total-sub;
            DetalleFactura d = new DetalleFactura(desc, can, pUni, imp, sub, igv, total, nom, dir, tel,ruc,fecha);
           det.add(d);
            JOptionPane.showMessageDialog(this, "Guardado con exito");
           
            String FILE_NAME = ("Compra de "+d.getDescripcion()+" "+d.getNomSenior()+".txt");
           try{
               FileWriter output= new FileWriter(FILE_NAME);
               output.write(d.getNomSenior());
               output.write(d.getDireccion());
               output.write(d.getTelefono());
               output.write(d.getRuc());
               output.write(d.getFechaFactura());
               
               
               output.write(d.getDescripcion());
               output.write(d.getCantidad());
               output.write((int) d.getpUnitario()+"");
               output.write((int) d.getImporte()+"");
               output.write((int) d.getSubTotal()+"");
               output.write((int) d.getIgv()+"");
               output.write((int) d.getTotal()+"");
               
               output.close();
           }catch (IOException ex){
               System.out.println(":(");
           }
       }
    }

    @Override
    public void limpiar() {
        jTDireccion.setText(null);
        jTRuc.setText(null);
        jtTElefono.setText(null);
        htFecha.setText(null);
        jTNombre.setText(null);
        jTNombre.setText(null);
        jTpUnitario.setText(null);
        jTIGV.setText(null);
        jtImporte.setText(null);
        jTTotal.setText(null);
        jTSubTotal.setText(null);
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField htFecha;
    private javax.swing.JButton jBtnComprar;
    private javax.swing.JButton jBtnImprimir;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JComboBox<String> jCbxCantidad;
    private javax.swing.JComboBox<String> jCbxDescrip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTIGV;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTRuc;
    private javax.swing.JTextField jTSubTotal;
    private javax.swing.JTextField jTTotal;
    private javax.swing.JTextField jTpUnitario;
    private javax.swing.JTextField jtImporte;
    private javax.swing.JTextField jtTElefono;
    // End of variables declaration//GEN-END:variables
}
