
import java.awt.Color;

public class Ikinci_ogr_lab1 extends javax.swing.JFrame {

    public Ikinci_ogr_lab1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ogr_no_lbl = new javax.swing.JLabel();
        ogr_isim_lbl = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        numara_ekle_btn = new javax.swing.JButton();
        isim_ekle_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ilk pencerem");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ogr_no_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogr_no_lbl.setText("Öğrenci No");
        ogr_no_lbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ogr_isim_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogr_isim_lbl.setText("Öğrenci İsim Soyisim");
        ogr_isim_lbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        numara_ekle_btn.setText("jButton1");
        numara_ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numara_ekle_btnActionPerformed(evt);
            }
        });

        isim_ekle_btn.setText("jButton2");
        isim_ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isim_ekle_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ogr_no_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ogr_isim_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numara_ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(isim_ekle_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ogr_no_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(ogr_isim_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numara_ekle_btn)
                    .addComponent(isim_ekle_btn))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ogr_no_lbl.setText("191213093");
        ogr_isim_lbl.setText("Aizat Esenbekova");
        numara_ekle_btn.setText("Numara Ekle");
        isim_ekle_btn.setText("Ad Soyad Ekle");
    }//GEN-LAST:event_formWindowOpened

    private void numara_ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numara_ekle_btnActionPerformed
        jTextField1.setText(ogr_no_lbl.getText());
        jTextField1.setForeground(Color.green);
        jTextField1.setEditable(true);
    }//GEN-LAST:event_numara_ekle_btnActionPerformed

    private void isim_ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isim_ekle_btnActionPerformed
        jTextField1.setText(jTextField1.getText()+" "+ogr_isim_lbl.getText());
        jTextField1.setForeground(Color.red);
        jTextField1.setEditable(false);
       
        
    }//GEN-LAST:event_isim_ekle_btnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.out.println("Cikis yapan kullanici: "+ogr_isim_lbl.getText());
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ikinci_ogr_lab1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton isim_ekle_btn;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton numara_ekle_btn;
    private javax.swing.JLabel ogr_isim_lbl;
    private javax.swing.JLabel ogr_no_lbl;
    // End of variables declaration//GEN-END:variables
}
