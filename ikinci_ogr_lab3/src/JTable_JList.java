
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;


public class JTable_JList extends javax.swing.JFrame {

  DefaultTableModel myTable;
  DefaultListModel myList;
    public JTable_JList() {
        initComponents();
        myTable=(DefaultTableModel)jTable1.getModel();
        jTable1.setModel(myTable);
        myList=new DefaultListModel();
        jList1.setModel(myList);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ad_lbl = new javax.swing.JLabel();
        soyad_lbl = new javax.swing.JLabel();
        vize_lbl = new javax.swing.JLabel();
        final_lbl = new javax.swing.JLabel();
        sifre_lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ad_txt = new javax.swing.JTextField();
        soyad_txt = new javax.swing.JTextField();
        ortalama_txt = new javax.swing.JTextField();
        vize_txt = new javax.swing.JFormattedTextField();
        final_txt = new javax.swing.JFormattedTextField();
        password = new javax.swing.JPasswordField();
        ekle_btn = new javax.swing.JButton();
        listele_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ad_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ad_lbl.setText("Ad");

        soyad_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        soyad_lbl.setText("Soyad");

        vize_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vize_lbl.setText("Vize Notu");

        final_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        final_lbl.setText("Final Notu");

        sifre_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sifre_lbl.setText("Sifre");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Not Ortalamasi");

        ad_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_txtActionPerformed(evt);
            }
        });

        soyad_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyad_txtActionPerformed(evt);
            }
        });

        ortalama_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ortalama_txtActionPerformed(evt);
            }
        });

        vize_txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###.##"))));

        final_txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        final_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_txtActionPerformed(evt);
            }
        });

        password.setEchoChar('#');

        ekle_btn.setText("Ekle");
        ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_btnActionPerformed(evt);
            }
        });

        listele_btn.setText("Listele");
        listele_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listele_btnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ahmet", "Arf", "60", "50", "55", null},
                {"Ayse", "Yilmaz", "72", "80", "76", null},
                {"Fatma", "Ucar", "40", "80", "60", null},
                {"Mustafa", "Yildirim", "30", "52", "45", null}
            },
            new String [] {
                "Ad", "Soyad", "Vize Notu", "Final Notu", "Ortalama", "Durum"
            }
        ));
        jTable1.setOpaque(false);
        jTable1.setShowGrid(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(final_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifre_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyad_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vize_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vize_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(final_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ortalama_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(listele_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ad_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyad_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vize_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vize_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(final_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(final_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sifre_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ekle_btn)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ortalama_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listele_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ad_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad_txtActionPerformed

    private void soyad_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyad_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyad_txtActionPerformed

    private void ortalama_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ortalama_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ortalama_txtActionPerformed

    private void final_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_final_txtActionPerformed

    private void listele_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listele_btnActionPerformed
        int girilen_Ortalama=Integer.parseInt(ortalama_txt.getText());
        Object bilgi;
        for(int i=0;i<myTable.getRowCount();i++)
        {
            if(Double.parseDouble(String.valueOf(myTable.getValueAt(i,4)))>=girilen_Ortalama)
            {
                bilgi=myTable.getValueAt(i,0)+" "+myTable.getValueAt(i,1);
                myList.addElement(bilgi);
            }
        }
    }//GEN-LAST:event_listele_btnActionPerformed

    private void ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_btnActionPerformed
        
    
        
        if(String.valueOf(password.getPassword()).equals("123"))
        {
         
           String [] data=new String[4];
           data[0]=ad_txt.getText();
           data[1]=soyad_txt.getText();
           data[2]=vize_txt.getText();
           data[3]=final_txt.getText();
           Double ortalama=(Double.parseDouble(data[2])+Double.parseDouble(data[3]))/2;
           myTable.addRow(data);
           int i;
           for( i=0;i<myTable.getRowCount();i++);
           myTable.setValueAt(ortalama, i-1,4);
           password.setText("");
        }
    }//GEN-LAST:event_ekle_btnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow=jTable1.getSelectedRow();
        String Ortalama=String.valueOf(myTable.getValueAt(selectedRow,4));
        if(Double.parseDouble(Ortalama)>=60)
        {
            myTable.setValueAt("Basarili",selectedRow, 5);
        }
        else
        {
            myTable.setValueAt("Basarisiz",selectedRow, 5);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTable_JList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_lbl;
    private javax.swing.JTextField ad_txt;
    private javax.swing.JButton ekle_btn;
    private javax.swing.JLabel final_lbl;
    private javax.swing.JFormattedTextField final_txt;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton listele_btn;
    private javax.swing.JTextField ortalama_txt;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel sifre_lbl;
    private javax.swing.JLabel soyad_lbl;
    private javax.swing.JTextField soyad_txt;
    private javax.swing.JLabel vize_lbl;
    private javax.swing.JFormattedTextField vize_txt;
    // End of variables declaration//GEN-END:variables
}
