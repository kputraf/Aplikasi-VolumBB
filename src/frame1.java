
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisna Putra F
 */
public class frame1 extends javax.swing.JFrame {
String temp="";
Double h1,bt,ti;
    /**
     * Creates new form frame1
     */
    public frame1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        kideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        knama = new javax.swing.JTextField();
        ksaran = new javax.swing.JTextField();
        ktinggi = new javax.swing.JTextField();
        kbadan = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Jenis Kelamin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 170, 90, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 280, 200, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("kg");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 250, 20, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tinggi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 100, 50, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Berat Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 140, 90, 15);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Perempuan");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(170, 170, 100, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Laki-laki");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(280, 170, 80, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 210, 110, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 10, 170, 20);

        kideal.setEditable(false);
        getContentPane().add(kideal);
        kideal.setBounds(260, 250, 50, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nama");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 70, 40, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("cm");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 100, 34, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 140, 34, 15);
        getContentPane().add(knama);
        knama.setBounds(170, 60, 190, 30);
        getContentPane().add(ksaran);
        ksaran.setBounds(70, 340, 270, 40);
        getContentPane().add(ktinggi);
        ktinggi.setBounds(170, 100, 50, 30);
        getContentPane().add(kbadan);
        kbadan.setBounds(170, 140, 50, 30);

        hasil.setEditable(false);
        getContentPane().add(hasil);
        hasil.setBounds(70, 300, 270, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 250, 200, 15);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Hitung");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(40, 210, 110, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Coba Lagi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(150, 210, 110, 23);

        setSize(new java.awt.Dimension(428, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(knama.getText().equals("")||ktinggi.getText().equals("")|kbadan.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"data harus diisi semua!");
        }
        else if(jRadioButton1.isSelected()||jRadioButton2.isSelected())
        { 
            try 
            {
                Proses();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"inputan ada yang belum diisikan");
            }
        }
        else
        {
                JOptionPane.showMessageDialog(null,"Radio Button harus diisi");
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        knama.setText("");
        kbadan.setText("");
        ktinggi.setText("");
        hasil.setText("");
        ksaran.setText("");
        kideal.setText("");
        buttonGroup1.clearSelection();
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField kbadan;
    private javax.swing.JTextField kideal;
    private javax.swing.JTextField knama;
    private javax.swing.JTextField ksaran;
    private javax.swing.JTextField ktinggi;
    // End of variables declaration//GEN-END:variables

    private void Proses() 
    {
      ti = Double.parseDouble(ktinggi.getText());
      bt = Double.parseDouble(kbadan.getText());
      
      if(jRadioButton1.isSelected())
      {h1=(ti-100) *1;}
      else if(jRadioButton2.isSelected())
      {h1=(ti-104)*1;}
      temp = Double.toString(h1.intValue());
      
      if(h1<bt)
      {
          kideal.setText(temp);
          hasil.setText("Maaf "+knama.getText()+", Sepertinya anda Terlalu gendut");
          ksaran.setText("Banyakin Olahraga Guys..");        
      }
      else if(h1>bt)
      {
          kideal.setText(temp);
          hasil.setText("Maaf "+knama.getText()+", Sepertinya anda Terlalu kurus");
          ksaran.setText("Banyakin Makan yang bergizi..");
      }
      else
      {
          kideal.setText(temp);
          hasil.setText("Halo "+knama.getText()+"Berat anda sudah ideal ");
          ksaran.setText("Lanjutkan dengan gaya hidup yang sehat :)");
      }
        //To change body of generated methods, choose Tools | Templates.
    }
}
