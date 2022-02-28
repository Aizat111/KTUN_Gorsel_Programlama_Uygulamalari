
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
public class NewJFrame extends javax.swing.JFrame {
  
    public NewJFrame() {
      
        initComponents();
  
    }

    DefaultListModel  myModel = new DefaultListModel();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ae93_jCheckBox1 = new javax.swing.JCheckBox();
        ae93_jCheckBox2 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox ae93_jCheckBox3 = new javax.swing.JCheckBox();
        ae93_jCheckBox4 = new javax.swing.JCheckBox();
        ae93_jCheckBox5 = new javax.swing.JCheckBox();
        ae93_jRadioButton1 = new javax.swing.JRadioButton();
        ae93_jRadioButton2 = new javax.swing.JRadioButton();
        ae93_jComboBox1 = new javax.swing.JComboBox<>();
        ae93_jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ae93_jList1 = new javax.swing.JList<>();
        ae93_jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ae93_jCheckBox1.setText("Marka");

        ae93_jCheckBox2.setText("Hafıza");
        ae93_jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jCheckBox2ActionPerformed(evt);
            }
        });

        ae93_jCheckBox3.setText("Kamera Çözünürlüğü");
        ae93_jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jCheckBox3ActionPerformed(evt);
            }
        });

        ae93_jCheckBox4.setText("Ekran Boyutu");

        ae93_jCheckBox5.setText("Fiyat");

        buttonGroup1.add(ae93_jRadioButton1);
        ae93_jRadioButton1.setText("Listeye  Ekle");
        ae93_jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(ae93_jRadioButton2);
        ae93_jRadioButton2.setText("Yeni  telefon ekle");
        ae93_jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jRadioButton2ActionPerformed(evt);
            }
        });

        ae93_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apple 64GB 12MP 6.1\" 5000", "Huawei 128GB 48MP 6.4\" 4000", "Samsung 128GB 64MP 6.7\" 3500", "Vestel 128GB 12MP 6.1\" 3000", "Samsung 128GB 12MP 6.7\" 4500", "Huawei 64GB 12MP 6.4\" 2500" }));

        ae93_jButton1.setText("Uygula");
        ae93_jButton1.setName(""); // NOI18N
        ae93_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ae93_jList1);

        ae93_jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ae93_jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ae93_jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ae93_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ae93_jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ae93_jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ae93_jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ae93_jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ae93_jRadioButton2)
                                    .addComponent(ae93_jRadioButton1))
                                .addGap(0, 105, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(ae93_jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(ae93_jTextField1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ae93_jCheckBox1)
                    .addComponent(ae93_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ae93_jRadioButton1)
                    .addComponent(ae93_jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ae93_jCheckBox3)
                    .addComponent(ae93_jRadioButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ae93_jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ae93_jCheckBox5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ae93_jButton1)
                            .addComponent(ae93_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ae93_jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ae93_jCheckBox2ActionPerformed

    private void ae93_jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ae93_jCheckBox3ActionPerformed

    private void ae93_jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ae93_jTextField1ActionPerformed

    private void ae93_jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ae93_jRadioButton1ActionPerformed

    private void ae93_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jButton1ActionPerformed
       
        
       //Listeye Ekle butonu seçildiyse
       if(ae93_jRadioButton1.isSelected()){
        //jlistte yansıtmak için yeni ListModel tanımlıyoruz
          
        //comboboxta seçilen itemi alıyoruz
        String selItem=(String) ae93_jComboBox1.getSelectedItem();
        // arasındaki boşuklara göre kelimeleri bölmek
        String [] splitItem=selItem.split(" ");
        // sonuncu texti tutmak için tablo
        String resultText="";
        if(ae93_jCheckBox1.isSelected())
        {
            resultText=splitItem[0];
        }
         if(ae93_jCheckBox2.isSelected())
        {
            resultText+=" ";
            resultText+=splitItem[1];
        }
         
         //!!! şuan bu check boxu tanımıyor neden sorunu anlamadım
        /*  if(ae93_jCheckBox3.isSelected())
        {
            resultText+=splitItem[2];
        }*/
           if(ae93_jCheckBox4.isSelected())
        {
            resultText+=" ";
            resultText+=splitItem[3];
        }
               if(ae93_jCheckBox5.isSelected())
        {
            resultText+=" ";
            resultText+=splitItem[4];
        }
               
        //sonuc olan texti liste eklemek
        myModel.addElement(resultText);
        //listi güncellemek
        ae93_jList1.setModel(myModel);
       }
       // yeni telefon ekle butonu seçiliyse
       else
       if(ae93_jRadioButton2.isSelected()){
           ae93_jTextField1.setVisible(true);
           ae93_jComboBox1.addItem(ae93_jTextField1.getText());
           ae93_jTextField1.setText(" ");
           
       }
                
    }//GEN-LAST:event_ae93_jButton1ActionPerformed

    private void ae93_jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ae93_jRadioButton2ActionPerformed

  
    public static void main(String args[]) {
        
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    private javax.swing.JCheckBox ae93_jCheckBox3;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ae93_jButton1;
    private javax.swing.JCheckBox ae93_jCheckBox1;
    private javax.swing.JCheckBox ae93_jCheckBox2;
    private javax.swing.JCheckBox ae93_jCheckBox4;
    private javax.swing.JCheckBox ae93_jCheckBox5;
    private javax.swing.JComboBox<String> ae93_jComboBox1;
    private javax.swing.JList<String> ae93_jList1;
    private javax.swing.JRadioButton ae93_jRadioButton1;
    private javax.swing.JRadioButton ae93_jRadioButton2;
    private javax.swing.JTextField ae93_jTextField1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
