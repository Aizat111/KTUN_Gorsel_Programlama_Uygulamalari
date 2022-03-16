
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Lab_4 extends javax.swing.JFrame {

    public Lab_4() {
        initComponents();
        this.setTitle(name);
        ae93_jLabel1.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jframe2_text = new javax.swing.JTextField();
        market_adi_degistir = new javax.swing.JButton();
        ae93_jButton1 = new javax.swing.JButton();
        ae93_jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ae93_jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        ae93_jTree2 = new javax.swing.JTree();
        ae93_jButton2 = new javax.swing.JButton();
        ae93_jLabel2 = new javax.swing.JLabel();
        ae93_jMenuBar1 = new javax.swing.JMenuBar();
        ae93_jMenu1 = new javax.swing.JMenu();
        ae93_jMenuItem1 = new javax.swing.JMenuItem();
        ae93_jMenuItem2 = new javax.swing.JMenuItem();
        ae93_jMenuItem3 = new javax.swing.JMenuItem();

        jFrame1.setBounds(new java.awt.Rectangle(200, 200, 400, 200));

        market_adi_degistir.setText("market adi degistir");
        market_adi_degistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                market_adi_degistirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jframe2_text, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(market_adi_degistir, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jframe2_text, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(market_adi_degistir))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESENBEKOVA MARKET");

        ae93_jButton1.setText("Seçileni Sipariş Olarak Ekle");
        ae93_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jButton1ActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        ae93_jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        ae93_jTree1.setRootVisible(false);
        jScrollPane1.setViewportView(ae93_jTree1);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Meyve Sebze");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Domates");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Patates");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Elma");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Günlük");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Süt");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ekmek");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        ae93_jTree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        ae93_jTree2.setRootVisible(false);
        jScrollPane2.setViewportView(ae93_jTree2);

        ae93_jButton2.setText("Seçileni Siparişten Çıkar");
        ae93_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jButton2ActionPerformed(evt);
            }
        });

        ae93_jLabel2.setText("KAPICI SİPARİŞ LİSTESİ");

        ae93_jMenu1.setText("Dosya");

        ae93_jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ae93_jMenuItem1.setText("Yeni Sipariş");
        ae93_jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jMenuItem1ActionPerformed(evt);
            }
        });
        ae93_jMenu1.add(ae93_jMenuItem1);

        ae93_jMenuItem2.setText("Ayarlar");
        ae93_jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jMenuItem2ActionPerformed(evt);
            }
        });
        ae93_jMenu1.add(ae93_jMenuItem2);

        ae93_jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ae93_jMenuItem3.setText("Çıkış Yap");
        ae93_jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jMenuItem3ActionPerformed(evt);
            }
        });
        ae93_jMenu1.add(ae93_jMenuItem3);

        ae93_jMenuBar1.add(ae93_jMenu1);

        setJMenuBar(ae93_jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ae93_jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(ae93_jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ae93_jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(ae93_jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(397, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ae93_jLabel1)
                .addGap(66, 66, 66)
                .addComponent(ae93_jButton1)
                .addGap(26, 26, 26)
                .addComponent(ae93_jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(ae93_jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public String name="Esenbekova MARKET";
    private void ae93_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jButton1ActionPerformed
      
      DefaultMutableTreeNode selectednode=(DefaultMutableTreeNode)ae93_jTree2.getLastSelectedPathComponent();
      DefaultMutableTreeNode addnode=(DefaultMutableTreeNode)ae93_jTree1.getLastSelectedPathComponent();
      DefaultTreeModel treemodel=(DefaultTreeModel)ae93_jTree1.getModel();
      if(addnode!=null)
      {
          treemodel.insertNodeInto(selectednode,addnode, addnode.getChildCount());
      }
    }//GEN-LAST:event_ae93_jButton1ActionPerformed

    private void ae93_jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ae93_jMenuItem3ActionPerformed

    private void ae93_jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jMenuItem1ActionPerformed
       Object [] options={"Evet","Hayir tesekkurler","Iptal Et"};
        int reply=JOptionPane.showOptionDialog(null, "Siparişler tamamlandı. Yeni sipariş listesi alınsın mı?",name+"-Sipariş Listesi",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
        
        if(reply==JOptionPane.YES_OPTION)
        {
        DefaultTreeModel treemodel=(DefaultTreeModel)ae93_jTree1.getModel();
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)treemodel.getRoot();
        root.add(new DefaultMutableTreeNode("1.daire"));
        treemodel.reload(root);
        for(int i=2;i<=5;i++)
        {
            DefaultMutableTreeNode addnode=new DefaultMutableTreeNode(i+".daire");
            treemodel.insertNodeInto(addnode,root,root.getChildCount());
            
        }
            JOptionPane.showMessageDialog(null,"Yeni Sipariş Almaya Başlayabilirsiniz",name+"-Yeni Sipariş",JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_ae93_jMenuItem1ActionPerformed

    private void ae93_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jButton2ActionPerformed
        DefaultMutableTreeNode selectednode=(DefaultMutableTreeNode)ae93_jTree1.getLastSelectedPathComponent();
       DefaultTreeModel treemodel=(DefaultTreeModel)ae93_jTree1.getModel();
       if(selectednode!=null)
       {
           treemodel.removeNodeFromParent(selectednode);
       }
    }//GEN-LAST:event_ae93_jButton2ActionPerformed

    private void ae93_jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jMenuItem2ActionPerformed
        /*Ayarlar ae93_ayarlar=new Ayarlar();
        ae93_ayarlar.show(true);
       name=ae93_ayarlar.a;*/
        jFrame1.setTitle("Ayarlar");
       jFrame1.setVisible(true);
       
       
      
        
    }//GEN-LAST:event_ae93_jMenuItem2ActionPerformed

    private void market_adi_degistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_market_adi_degistirActionPerformed
       name=jframe2_text.getText();
       ae93_jLabel1.setText(name+" MARKET");
       this.setTitle(name+" MARKET");
    }//GEN-LAST:event_market_adi_degistirActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ae93_jButton1;
    private javax.swing.JButton ae93_jButton2;
    private javax.swing.JLabel ae93_jLabel1;
    private javax.swing.JLabel ae93_jLabel2;
    private javax.swing.JMenu ae93_jMenu1;
    private javax.swing.JMenuBar ae93_jMenuBar1;
    private javax.swing.JMenuItem ae93_jMenuItem1;
    private javax.swing.JMenuItem ae93_jMenuItem2;
    private javax.swing.JMenuItem ae93_jMenuItem3;
    private javax.swing.JTree ae93_jTree1;
    private javax.swing.JTree ae93_jTree2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jframe2_text;
    private javax.swing.JButton market_adi_degistir;
    // End of variables declaration//GEN-END:variables
}
