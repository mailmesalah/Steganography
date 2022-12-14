/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package steganography;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Sely
 */
public class JFMainPage extends javax.swing.JFrame {

    /**
     * Creates new form JFMainPage
     */
    File file;

    public JFMainPage() {
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

        jTPMainPage = new javax.swing.JTabbedPane();
        jPEncode = new javax.swing.JPanel();
        jTFImageEncode = new javax.swing.JTextField();
        jBBrowseNormalImage = new javax.swing.JButton();
        jTFEncodeCode = new javax.swing.JTextField();
        jBEncode = new javax.swing.JButton();
        jPDecode = new javax.swing.JPanel();
        jBDecode = new javax.swing.JButton();
        jBBrowseEncodedImage = new javax.swing.JButton();
        jTFImageDecode = new javax.swing.JTextField();
        jLDecodedCode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBBrowseNormalImage.setText("Browse");
        jBBrowseNormalImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBrowseNormalImageActionPerformed(evt);
            }
        });

        jBEncode.setText("Encode");
        jBEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEncodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEncodeLayout = new javax.swing.GroupLayout(jPEncode);
        jPEncode.setLayout(jPEncodeLayout);
        jPEncodeLayout.setHorizontalGroup(
            jPEncodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEncodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEncodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEncodeLayout.createSequentialGroup()
                        .addComponent(jTFImageEncode, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBrowseNormalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPEncodeLayout.createSequentialGroup()
                        .addComponent(jTFEncodeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEncode, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPEncodeLayout.setVerticalGroup(
            jPEncodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEncodeLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPEncodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFImageEncode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBrowseNormalImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEncodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEncodeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEncode))
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jTPMainPage.addTab("Encode", jPEncode);

        jBDecode.setText("Decode");
        jBDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDecodeActionPerformed(evt);
            }
        });

        jBBrowseEncodedImage.setText("Browse");
        jBBrowseEncodedImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBrowseEncodedImageActionPerformed(evt);
            }
        });

        jLDecodedCode.setLabelFor(jBDecode);
        jLDecodedCode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPDecodeLayout = new javax.swing.GroupLayout(jPDecode);
        jPDecode.setLayout(jPDecodeLayout);
        jPDecodeLayout.setHorizontalGroup(
            jPDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDecodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFImageDecode, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(jLDecodedCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDecodeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBrowseEncodedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDecodeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jBDecode, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPDecodeLayout.setVerticalGroup(
            jPDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDecodeLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFImageDecode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBrowseEncodedImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBDecode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLDecodedCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jTPMainPage.addTab("Decode", jPDecode);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPMainPage)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPMainPage)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBrowseNormalImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBrowseNormalImageActionPerformed
        // TODO add your handling code here:       
        if (evt.getSource() == jBBrowseNormalImage) {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int returnVal = jfc.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = jfc.getSelectedFile();

                jTFImageEncode.setText(file.getName());

            } else {
                file = null;
            }
        }
    }//GEN-LAST:event_jBBrowseNormalImageActionPerformed

    private void jBBrowseEncodedImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBrowseEncodedImageActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == jBBrowseEncodedImage) {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int returnVal = jfc.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = jfc.getSelectedFile();

                jTFImageDecode.setText(file.getName());

            } else {
                file = null;
            }
        }
    }//GEN-LAST:event_jBBrowseEncodedImageActionPerformed

    private void jBEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEncodeActionPerformed
        try {
            // TODO add your handling code here:
            BufferedImage buffered = (BufferedImage)ImageIO.read(file);
            BufferedImage encodedImage=encodeImageWithCode(buffered, jTFEncodeCode.getText());
            File outputfile = new File("EncodedImage.jpeg");
            ImageIO.write(encodedImage, "jpeg", outputfile); // Write the Buffered Image into an output file
            JOptionPane.showMessageDialog(this, "Encoding has Completed !, Please Check application path for the Encoded Image");
        } catch (IOException ex) {
            Logger.getLogger(JFMainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBEncodeActionPerformed

    private void jBDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDecodeActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            BufferedImage buffered = (BufferedImage)ImageIO.read(file);
            String str = decodeImageForCode(buffered);
            jLDecodedCode.setText(str);            
            JOptionPane.showMessageDialog(this, "Decoding has Completed !");
        } catch (IOException ex) {
            Logger.getLogger(JFMainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBDecodeActionPerformed

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
            java.util.logging.Logger.getLogger(JFMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFMainPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBrowseEncodedImage;
    private javax.swing.JButton jBBrowseNormalImage;
    private javax.swing.JButton jBDecode;
    private javax.swing.JButton jBEncode;
    private javax.swing.JLabel jLDecodedCode;
    private javax.swing.JPanel jPDecode;
    private javax.swing.JPanel jPEncode;
    private javax.swing.JTextField jTFEncodeCode;
    private javax.swing.JTextField jTFImageDecode;
    private javax.swing.JTextField jTFImageEncode;
    private javax.swing.JTabbedPane jTPMainPage;
    // End of variables declaration//GEN-END:variables

    public static BufferedImage encodeImageWithCode(BufferedImage image, String code) {
        BufferedImage imageIn = image;
        BufferedImage imageOut =
                new BufferedImage(imageIn.getWidth(), imageIn.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
        int width = imageIn.getWidth();
        int height = imageIn.getHeight();
        int[] imageInPixels = imageIn.getRGB(0, 0, width, height, null, 0, width);
        int[] imageOutPixels = new int[imageInPixels.length];
        int ii=0,jj=16;
        String charToCode = null;
        for (int i = 0; i < imageInPixels.length; i++) {
            //int inR = (imageInPixels[i] & 0x00FF0000) >> 16;
            //int inG = (imageInPixels[i] & 0x0000FF00) >> 8;
            //int inB = (imageInPixels[i] & 0x000000FF);

            char c;            
            if(ii<code.length() && jj>=16){
                jj=0;
                c= code.charAt(ii);
                charToCode=getCodeFromChar(c);
                ++ii;
            }
            if(jj<16 && charToCode != null){
                if(charToCode.charAt(jj)=='0'){
                    imageOutPixels[i]=imageInPixels[i];
                }else{
                    imageOutPixels[i]=0;
                }
                ++jj;
            }else{
                imageOutPixels[i]=imageInPixels[i];
            }
       
        }
        imageOut.setRGB(0, 0, width, height, imageOutPixels, 0, width);
        return imageOut;
    }
    
    public static String decodeImageForCode(BufferedImage image) {
        String code="";
        BufferedImage imageIn = image;
        int width = imageIn.getWidth();
        int height = imageIn.getHeight();
        int[] imageInPixels = imageIn.getRGB(0, 0, width, height, null, 0, width);
        
        String tempCode="";
        for (int i = 0; i < imageInPixels.length; i++) {
            //int inR = (imageInPixels[i] & 0x00FF0000) >> 16;
            //int inG = (imageInPixels[i] & 0x0000FF00) >> 8;
            //int inB = (imageInPixels[i] & 0x000000FF);
            
            if(i!=0 && i%16==0){
                code=code+getCharFromCode(tempCode);
                if(imageInPixels[i]>0){
                    tempCode="1";
                }else{
                    tempCode="0";
                }
                
            }else{
                tempCode=tempCode+(imageInPixels[i]>0?1:0);
            }       
        }
        
        return code;
    }
    
    
    private static  String getCodeFromChar(char c){
        String code;
        switch(c){
            case 'A':
                code="1000000000000000";
                break;
            case 'B':
                code="0100000000000000";
                break;
            case 'C':
                code="0010000000000000";
                break;
            case 'D':
                code="0001000000000000";
                break;
            case 'E':
                code="0000100000000000";
                break;
            case 'F':
                code="0000010000000000";
                break;
            default:
                code = "0000000000000000";
        }
        return code;        
    }
    
    private static  char getCharFromCode(String code){
        char c;
        switch(code){
            case "1000000000000000":
                c='A';
                break;
            case "0100000000000000":
                c='B';
                break;
            case "0010000000000000":
                c='C';
                break;
            case "0001000000000000":
                c='D';
                break;
            case "0000100000000000":
                c='E';
                break;
            case "0000010000000000":
                c='F';
                break;
            default:
                c = ' ';
        }
        return c;        
    }
}
