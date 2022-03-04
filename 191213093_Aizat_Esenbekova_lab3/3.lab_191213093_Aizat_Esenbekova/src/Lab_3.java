import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPasswordField;

public class Lab_3 extends javax.swing.JFrame {

 DefaultTableModel myModel;
  DefaultListModel model;
 public Lab_3() {
        initComponents();
      
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ae93_lbl1 = new javax.swing.JLabel();
        ae93_lbl2 = new javax.swing.JLabel();
        ae93_lbl3 = new javax.swing.JLabel();
        ae93_lbl4 = new javax.swing.JLabel();
        ae93_lbl5 = new javax.swing.JLabel();
        ae93_lbl6 = new javax.swing.JLabel();
        ae93_lbl7 = new javax.swing.JLabel();
        ae93_jTextField1 = new javax.swing.JTextField();
        ae93_jTextField2 = new javax.swing.JTextField();
        ae93_jFormattedTextField1 = new javax.swing.JFormattedTextField();
        ae93_jFormattedTextField2 = new javax.swing.JFormattedTextField();
        ae93_jFormattedTextField3 = new javax.swing.JFormattedTextField();
        ae93_jFormattedTextField4 = new javax.swing.JFormattedTextField();
        ae93_jPasswordField1 = new javax.swing.JPasswordField();
        ae93_jButton1 = new javax.swing.JButton();
        ae93_jButton2 = new javax.swing.JButton();
        ae93_jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ae93_jList1 = new javax.swing.JList<>();
        ae93_jScrollPane2 = new javax.swing.JScrollPane();
        ae93_jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ae93_lbl1.setText("Ad");

        ae93_lbl2.setText("Soyad");

        ae93_lbl3.setText("Maaş");

        ae93_lbl4.setText("İşe giriş tarihi");

        ae93_lbl5.setText("Şifre");

        ae93_lbl6.setText("Tarih");

        ae93_lbl7.setText("Yeni Maas");

        ae93_jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jTextField2ActionPerformed(evt);
            }
        });

        ae93_jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));

        ae93_jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy"))));

        ae93_jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy"))));

        ae93_jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));

        ae93_jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jPasswordField1ActionPerformed(evt);
            }
        });

        ae93_jButton1.setText("Kayit Ekle");
        ae93_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jButton1ActionPerformed(evt);
            }
        });

        ae93_jButton2.setText("Listele");
        ae93_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jButton2ActionPerformed(evt);
            }
        });

        ae93_jButton3.setText("Guncelle");

        ae93_jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ae93_jList1);

        ae93_jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ahmet", "Arf", "3000", "10.02.2017"},
                {"Ayşe", "Yılmaz", "4000", "05.12.2016"},
                {"Fatma", "Uçar", "5000", "07.09.2015"},
                {"Mustafa", "Yıldırım", "3000", "10.02.2017"}
            },
            new String [] {
                "Ad", "Soyad", "Maaş", "İşe Giriş Tarihi"
            }
        ));
        ae93_jScrollPane2.setViewportView(ae93_jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ae93_jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ae93_lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ae93_jFormattedTextField4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ae93_lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ae93_jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ae93_jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ae93_jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ae93_lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ae93_lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ae93_jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(ae93_jFormattedTextField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ae93_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ae93_lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ae93_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ae93_jTextField1)
                            .addComponent(ae93_jFormattedTextField1)
                            .addComponent(ae93_jTextField2))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(ae93_jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ae93_lbl1)
                            .addComponent(ae93_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ae93_lbl2)
                            .addComponent(ae93_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ae93_lbl3)
                            .addComponent(ae93_jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ae93_lbl4)
                            .addComponent(ae93_jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ae93_jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ae93_lbl5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ae93_jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ae93_lbl6)
                            .addComponent(ae93_jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ae93_jButton2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ae93_lbl7)
                            .addComponent(ae93_jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ae93_jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ae93_jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ae93_jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jTextField2ActionPerformed
       
    }//GEN-LAST:event_ae93_jTextField2ActionPerformed

    private void ae93_jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jPasswordField1ActionPerformed
       
    }//GEN-LAST:event_ae93_jPasswordField1ActionPerformed

    private void ae93_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jButton1ActionPerformed
        
        int i;
        
        if(String.valueOf(ae93_jPasswordField1.getPassword()).equals("123"))
        {
            System.out.println("buraya geldim");
            myModel=(DefaultTableModel) ae93_jTable1.getModel();
            //for(i=0;i<myModel.getRowCount();i++);
           /* myModel.setValueAt(ae93_jTextField1.getText(),i, 0);
              myModel.setValueAt(ae93_jTextField2.getText(),i, 1);
              myModel.setValueAt(ae93_jFormattedTextField1.getText(),i,2);
              myModel.setValueAt(ae93_jFormattedTextField2.getText(),i,3);*/
            String [] data= new String[4];
        data[0]=ae93_jTextField1.getText();
        data[1]=ae93_jTextField2.getText();
        data[2]=ae93_jFormattedTextField1.getText();
        data[3]=ae93_jFormattedTextField2.getText();
        myModel.addRow(data);
          
        }
    }//GEN-LAST:event_ae93_jButton1ActionPerformed

    private void ae93_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jButton2ActionPerformed
        // TODO add your handling code here:
       model=new DefaultListModel(); 
        ae93_jList1.setModel(model);
       Object ae93_bilgi = null;
        
        Object ae93_temp=ae93_jFormattedTextField3.getAccessibleContext();
        for(int j=0;j<myModel.getRowCount();j++)
        {
            if(myModel.getValueAt(j,3)==ae93_temp)
            {
                ae93_bilgi= myModel.getValueAt(j,0) +" "+myModel.getValueAt(j,1);
                   model.addElement(ae93_bilgi);
                  System.out.println("dfvsf");
            }
         
        }
    }//GEN-LAST:event_ae93_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ae93_jButton1;
    private javax.swing.JButton ae93_jButton2;
    private javax.swing.JButton ae93_jButton3;
    private javax.swing.JFormattedTextField ae93_jFormattedTextField1;
    private javax.swing.JFormattedTextField ae93_jFormattedTextField2;
    private javax.swing.JFormattedTextField ae93_jFormattedTextField3;
    private javax.swing.JFormattedTextField ae93_jFormattedTextField4;
    private javax.swing.JList<String> ae93_jList1;
    private javax.swing.JPasswordField ae93_jPasswordField1;
    private javax.swing.JScrollPane ae93_jScrollPane2;
    private javax.swing.JTable ae93_jTable1;
    private javax.swing.JTextField ae93_jTextField1;
    private javax.swing.JTextField ae93_jTextField2;
    private javax.swing.JLabel ae93_lbl1;
    private javax.swing.JLabel ae93_lbl2;
    private javax.swing.JLabel ae93_lbl3;
    private javax.swing.JLabel ae93_lbl4;
    private javax.swing.JLabel ae93_lbl5;
    private javax.swing.JLabel ae93_lbl6;
    private javax.swing.JLabel ae93_lbl7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
