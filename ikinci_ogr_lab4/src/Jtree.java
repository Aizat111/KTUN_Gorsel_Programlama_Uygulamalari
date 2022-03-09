
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class Jtree extends javax.swing.JFrame {
 DefaultTreeModel tree1;
 DefaultTreeModel tree2;
 int maxFilmNumber=1;
    public Jtree() {
        initComponents();
        this.setTitle(name+ "Sinemasi(Bir Odada Max:"+ maxFilmNumber+"Film Bulunur)");
        lbl_sinema.setText(name+" Sinemasi");
        tree1=(DefaultTreeModel)arf_sinemasi.getModel();
        tree2=(DefaultTreeModel)filmler.getModel();
        
    }
   
    String name=" Aizat ESENBEKOVA";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lbl_maxFilm = new javax.swing.JLabel();
        txt_maxFilm = new javax.swing.JTextField();
        btn_ayarlariKaydet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmler = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        arf_sinemasi = new javax.swing.JTree();
        ekle_btn = new javax.swing.JButton();
        cikar_btn = new javax.swing.JButton();
        filmler_lbl = new javax.swing.JLabel();
        lbl_sinema = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sifirla = new javax.swing.JMenuItem();
        ayarlar = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        jFrame1.setTitle("Ayarlar");
        jFrame1.setBounds(new java.awt.Rectangle(250, 250, 400, 300));
        jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_maxFilm.setText("Odada Bulunacak Max Film");

        txt_maxFilm.setText("1");

        btn_ayarlariKaydet.setText("Ayarlari Kaydet");
        btn_ayarlariKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayarlariKaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ayarlariKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_maxFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_maxFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_maxFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_maxFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_ayarlariKaydet)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Esaretin Bedeli");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Matrix");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Yesil Yol");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Zor Olum");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Prestij");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Iron Man");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Star Wars");
        treeNode1.add(treeNode2);
        filmler.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        filmler.setRootVisible(false);
        jScrollPane1.setViewportView(filmler);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        arf_sinemasi.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arf_sinemasi.setRootVisible(false);
        jScrollPane2.setViewportView(arf_sinemasi);

        ekle_btn.setText("Secilen Filmi Odaya Ekle");
        ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_btnActionPerformed(evt);
            }
        });

        cikar_btn.setText("Secilen filmi Gosterimden Cikar");
        cikar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikar_btnActionPerformed(evt);
            }
        });

        filmler_lbl.setText("FILMLER");

        lbl_sinema.setText("ARF Sinemasi");

        jMenu1.setText("Dosya");

        sifirla.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sifirla.setLabel("Listeyi Sifirla");
        sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifirlaActionPerformed(evt);
            }
        });
        jMenu1.add(sifirla);

        ayarlar.setText("Ayarlar");
        ayarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayarlarActionPerformed(evt);
            }
        });
        jMenu1.add(ayarlar);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exit.setText("Cikis Yap");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filmler_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cikar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_sinema, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filmler_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sinema, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(cikar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifirlaActionPerformed
        Object [] options={"Evet","Hayir tesekkurler","Iptal Et"};
        int retry=JOptionPane.showOptionDialog(rootPane, "Listeyi Sifirlamak istiyor musunuz?", name+" Sinemasi_Film Listesi", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        if(retry==JOptionPane.YES_OPTION)
        {
            //tree1=(DefaultTreeModel)arf_sinemasi.getModel();
            DefaultMutableTreeNode root=(DefaultMutableTreeNode)tree1.getRoot();
            for(int i=1;i<4;i++)
            {
                root.add(new DefaultMutableTreeNode(i+".oda"));
            }
          tree1.reload();
        }
    }//GEN-LAST:event_sifirlaActionPerformed

    private void ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_btnActionPerformed
        
      //  tree2=(DefaultTreeModel)filmler.getModel();
        DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)arf_sinemasi.getLastSelectedPathComponent();
        DefaultMutableTreeNode selectedFilm=(DefaultMutableTreeNode)filmler.getLastSelectedPathComponent();
        System.out.println(selectedNode.getChildCount());
        
        if(selectedNode.getChildCount()<maxFilmNumber&&selectedNode!=null)
        { 
            tree1.insertNodeInto(selectedFilm, selectedNode,selectedNode.getChildCount());
            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Yeni Film Ekleyebilmek Icin Uygun Salon Seciniz",name+" Sinemasi-Yen Film",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ekle_btnActionPerformed

    private void cikar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikar_btnActionPerformed
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)arf_sinemasi.getLastSelectedPathComponent();
        if(selectedNode.isLeaf()==true&& selectedNode!=null)
        tree1.removeNodeFromParent(selectedNode);
    }//GEN-LAST:event_cikar_btnActionPerformed

    private void ayarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayarlarActionPerformed
        jFrame1.setVisible(true);
    }//GEN-LAST:event_ayarlarActionPerformed

    private void btn_ayarlariKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayarlariKaydetActionPerformed
        maxFilmNumber=Integer.parseInt(txt_maxFilm.getText());
        jFrame1.setVisible(false);
    }//GEN-LAST:event_btn_ayarlariKaydetActionPerformed

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jtree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jtree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jtree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jtree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arf_sinemasi;
    private javax.swing.JMenuItem ayarlar;
    private javax.swing.JButton btn_ayarlariKaydet;
    private javax.swing.JButton cikar_btn;
    private javax.swing.JButton ekle_btn;
    private javax.swing.JMenuItem exit;
    private javax.swing.JTree filmler;
    private javax.swing.JLabel filmler_lbl;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_maxFilm;
    private javax.swing.JLabel lbl_sinema;
    private javax.swing.JMenuItem sifirla;
    private javax.swing.JTextField txt_maxFilm;
    // End of variables declaration//GEN-END:variables
}
