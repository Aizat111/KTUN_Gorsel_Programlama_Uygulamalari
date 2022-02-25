
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ListModel;


public class Jlist_ComboBox_CheckBox_radioButton extends javax.swing.JFrame {
 DefaultListModel myList;
 ListModel listmodel;
    public Jlist_ComboBox_CheckBox_radioButton() {
        initComponents();
       
       
    }
     private void modelGetir()
     {
         listmodel=jList1.getModel();
         myList=new DefaultListModel();
        for(int i=0;i<listmodel.getSize();i++)
        {
            myList.addElement(listmodel.getElementAt(i));
        }
       jList1.setModel(myList);
     }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        r_btn_secilenleriEkle = new javax.swing.JRadioButton();
        r_btn_kucbuy = new javax.swing.JRadioButton();
        r_btn_buykuc = new javax.swing.JRadioButton();
        ch_box_kucuk = new javax.swing.JCheckBox();
        ch_box_buyuk = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btn_uygula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "10", "20", "30", "40", "50", "60", "70", "80", "90" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        buttonGroup1.add(r_btn_secilenleriEkle);
        r_btn_secilenleriEkle.setText("Secilenleri Ekle");

        buttonGroup1.add(r_btn_kucbuy);
        r_btn_kucbuy.setText("Tumunu Sirlari Ekle(Kucukten Buyuge)");

        buttonGroup1.add(r_btn_buykuc);
        r_btn_buykuc.setText("Tumunu Sirali Ekle(Buyukten Kucuge)");

        buttonGroup2.add(ch_box_kucuk);
        ch_box_kucuk.setText("En Kucuk");

        buttonGroup2.add(ch_box_buyuk);
        ch_box_buyuk.setText("En Buyuk");

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_uygula.setText("Uygula");
        btn_uygula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uygulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_uygula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r_btn_kucbuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r_btn_secilenleriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_btn_buykuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ch_box_kucuk, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ch_box_buyuk, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r_btn_secilenleriEkle, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r_btn_kucbuy)
                        .addGap(7, 7, 7)
                        .addComponent(r_btn_buykuc)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch_box_kucuk)
                            .addComponent(ch_box_buyuk))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_uygula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_uygulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uygulaActionPerformed

   
        if(r_btn_secilenleriEkle.isSelected())
        {
            for(Object item: jList1.getSelectedValuesList())
            {
                jComboBox1.addItem(String.valueOf(item));
            }
            jComboBox1.addItem("--");
       
        }
        else if(r_btn_kucbuy.isSelected())
        { 
            modelGetir();
            
            for(int i=0;i<myList.getSize();i++)
            {
                jComboBox1.addItem(String.valueOf(myList.getElementAt(i)));
            }
             jComboBox1.addItem("--");
        }
        else if(r_btn_buykuc.isSelected())
        {
            modelGetir();
            for(int i=myList.getSize()-1;i>=0;i--)
            {
                jComboBox1.addItem(String.valueOf(myList.getElementAt(i)));
                
            }
             jComboBox1.addItem("--");
        }
        if(ch_box_buyuk.isSelected())
        { modelGetir();
            int enBuyuk=Integer.parseInt(String.valueOf(myList.getElementAt(0)));
           
            for(int i=0;i<myList.getSize();i++)
            {
                if(Integer.parseInt(String.valueOf(myList.getElementAt(i)))>enBuyuk)
                    enBuyuk=Integer.parseInt(String.valueOf(myList.getElementAt(i)));
            }
            jLabel1.setText(""+enBuyuk);
        }
        else if(ch_box_kucuk.isSelected())
        {
            modelGetir();
            int enKucuk=Integer.parseInt(String.valueOf(myList.getElementAt(0)));
           
            for(int i=0;i<myList.getSize();i++)
            {
                if(Integer.parseInt(String.valueOf(myList.getElementAt(i)))<enKucuk)
                    enKucuk=Integer.parseInt(String.valueOf(myList.getElementAt(i)));
            }
            jLabel1.setText(""+enKucuk);
        }
        
    }//GEN-LAST:event_btn_uygulaActionPerformed

 
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jlist_ComboBox_CheckBox_radioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jlist_ComboBox_CheckBox_radioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jlist_ComboBox_CheckBox_radioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jlist_ComboBox_CheckBox_radioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jlist_ComboBox_CheckBox_radioButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_uygula;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox ch_box_buyuk;
    private javax.swing.JCheckBox ch_box_kucuk;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r_btn_buykuc;
    private javax.swing.JRadioButton r_btn_kucbuy;
    private javax.swing.JRadioButton r_btn_secilenleriEkle;
    // End of variables declaration//GEN-END:variables
}
