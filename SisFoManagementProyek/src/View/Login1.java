/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
//new
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author WAHYU LINTANG
 */
public class Login1 extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    public Login1() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnProgrammer = new javax.swing.JButton();
        btnManajerProyek = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAJEMEN PROYEK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 135, 310, 50));

        jLabel1.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEM INFORMASI \n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 95, 270, 40));

        btnProgrammer.setText("Programmer");
        jPanel1.add(btnProgrammer, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 383, 200, 50));

        btnManajerProyek.setText("Manajer Proyek");
        jPanel1.add(btnManajerProyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 315, 200, 50));

        btnAdmin.setText("Admin");
        jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 451, 200, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Tubes PBO\\low_poly_mountains_by_nheus-d8otn2f.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnManajerProyek;
    private javax.swing.JButton btnProgrammer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    public void addListener(ActionListener e){
        btnManajerProyek.addActionListener(e);
        btnProgrammer.addActionListener(e);
        btnAdmin.addActionListener(e);
    }

    public Object getBtnManajerProyek() {
        return btnManajerProyek;
    }

    public Object getBtnProgrammer() {
        return btnProgrammer;
    }

    public JButton getBtnAdmin() {
        return btnAdmin;
    }
    
    
    
    

}
