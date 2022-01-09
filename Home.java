
import cryptDecrypt.*;



 
import java.awt.Color;

 
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Home");
        this.jtxtArea.setEditable(false);
        
      
    }

    
    @SuppressWarnings("unchecked")
     
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cesarItem = new javax.swing.JMenuItem();
        vigenereItem = new javax.swing.JMenuItem();
         

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

         
        
        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtxtArea.setColumns(20);
        jtxtArea.setRows(5);
        jtxtArea.setText(" dans cette application :les methode de cryptographie :\n *methode de chiffrement cesar   \n *methode vigenere  \n \n");
        jScrollPane1.setViewportView(jtxtArea);

        

        jMenu1.setText("Cryptographie");

        cesarItem.setText("Méthode de César");
        cesarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cesarItemActionPerformed(evt);
            }
        });
        jMenu1.add(cesarItem);

        

        vigenereItem.setText("Vigenère");
        vigenereItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigenereItemActionPerformed(evt);
            }
        });
        jMenu1.add(vigenereItem);

        jMenuBar1.add(jMenu1);

        
         
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    } 

     

    private void cesarItemActionPerformed(java.awt.event.ActionEvent evt) { 
        // TODO add your handling code here:
        CesarVue fen=new CesarVue();
        fen.setVisible(true);
    } 

    private void vigenereItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        VigenereVue fen=new VigenereVue();
        fen.setVisible(true);
        
    } 

    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
        // TODO add your handling code here:
        System.exit(0);
    } 

    
     
    private javax.swing.JMenuItem cesarItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jtxtArea;  
    private javax.swing.JMenuItem vigenereItem;
    private javax.swing.JLabel jLabel5;
 
}

