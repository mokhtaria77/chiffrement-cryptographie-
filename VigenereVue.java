package cryptDecrypt;

 


import java.awt.*;

import java.awt.event.*;
import javax.swing.*;


public class VigenereVue extends JFrame implements ActionListener{

    public VigenereVue() {
        initComponents();
        this.setResizable(false);//fenetre ? taille fixe
        this.setTitle("Dryptage/D?cryptage par Vigen?re");
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        bCryptage.addActionListener(this);
        bDecryptage.addActionListener(this);
        
    }

    
    @SuppressWarnings("unchecked")
     
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea2 = new javax.swing.JTextArea();
        bCryptage = new javax.swing.JButton();
        bDecryptage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        keyWord = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea1.setColumns(20);
        textArea1.setRows(5);
        jScrollPane1.setViewportView(textArea1);

        textArea2.setColumns(20);
        textArea2.setRows(5);
        jScrollPane2.setViewportView(textArea2);

        bCryptage.setText("Crypter >>");

        bDecryptage.setText("<< Decrypter");

        jLabel1.setText("Mot cl? de cryptage/d?cryptage :");

        jLabel2.setText("CRYPTAGE ET DECRYPTAGE PAR LA METHODE DE BLAISE VIGENERE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addComponent(bCryptage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bDecryptage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(keyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(keyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDecryptage)
                    .addComponent(bCryptage))
                .addContainerGap())
        );

        pack();
    } 

    /*
     * Methode actionPerformed de l'interface ActionListener
     */
    public void actionPerformed(ActionEvent evt){
        Object source=evt.getSource();
        codeVig=new VigenereCode();
        String key=keyWord.getText().toUpperCase();;
        
        if(source==bCryptage){
            
            if(!key.equals("")){
            String texte=textArea1.getText().toUpperCase();
            String cryptogramme=codeVig.crypter(texte,key);
            textArea2.setText(cryptogramme);
            }
            else{
                //Boite de Dialog
                JOptionPane.showMessageDialog(null,"La cl? est obligatoire,sans"
                        + " espace ni autres caracteres non alphabetique !");
            }
        }
        if(source==bDecryptage){
            if(!key.equals("")){
            String texte=textArea2.getText().toUpperCase();
            String claire=codeVig.decrypter(texte,key);
            textArea1.setText(claire);
            }
            else{
                //Boite de Dialog
                JOptionPane.showMessageDialog(null,"La cl? est obligatoire,sans"
                        + " espace ni autres caracteres non alphabetique !");
            }
        }
        
    }
   
    VigenereCode codeVig;
    // Variables declaration  
    private javax.swing.JButton bCryptage;
    private javax.swing.JButton bDecryptage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyWord;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JTextArea textArea2;
    // End of variables declaration 
}
