/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
//new

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author WAHYU LINTANG
 */
public class ProSetStatusTugas extends javax.swing.JFrame {

    /**
     * Creates new form MENU31
     */
    public ProSetStatusTugas() {
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
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnLogout = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        btnSetStatus = new javax.swing.JButton();
        btnBeranda = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAktif = new javax.swing.JButton();
        panelTugas = new javax.swing.JScrollPane();
        tabelTugas = new javax.swing.JTable();
        panelProyek = new javax.swing.JScrollPane();
        tabelProyek = new javax.swing.JTable();
        cmbInputNamaT = new javax.swing.JComboBox<>();
        cmbNamaProyek = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        lblAktif = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Set Status Tugas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 179, 72));

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 204));

        btnLogout.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        btnLogout.setText("LOGOUT ");

        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("USER :  PROGRAMMER");

        btnSetStatus.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnSetStatus.setText("SET STATUS TUGAS");

        btnBeranda.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnBeranda.setText("BERANDA");

        jDesktopPane1.setLayer(btnLogout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnSetStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnBeranda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnSetStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBeranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSetStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 0, -1, 530));

        jLabel14.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel14.setText("INPUT NAMA PROYEK  :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel15.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel15.setText("INPUT  NAMA TUGAS  :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 170, -1));

        jLabel4.setText("Daftar Proyek");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        btnAktif.setText("Aktifkan");
        jPanel1.add(btnAktif, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 100, -1));

        tabelTugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Tugas", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelTugas.setViewportView(tabelTugas);

        jPanel1.add(panelTugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 570, 110));

        tabelProyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Proyek", "Jumlah Programmer", "Tugas Aktif", "Tugas Selesai", "Deadline Proyek"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelProyek.setViewportView(tabelProyek);

        jPanel1.add(panelProyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 570, 140));

        jPanel1.add(cmbInputNamaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 170, -1));

        jPanel1.add(cmbNamaProyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 170, -1));

        btnSimpan.setText("SET SELESAI");
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 120, 30));

        lblAktif.setText("Daftar Tugas");
        jPanel1.add(lblAktif, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Tubes PBO\\wallhaven-41419.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 720, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
    private javax.swing.JButton btnAktif;
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSetStatus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbInputNamaT;
    private javax.swing.JComboBox<String> cmbNamaProyek;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAktif;
    private javax.swing.JLabel lblUser;
    private javax.swing.JScrollPane panelProyek;
    private javax.swing.JScrollPane panelTugas;
    private javax.swing.JTable tabelProyek;
    private javax.swing.JTable tabelTugas;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBeranda() {
        return btnBeranda;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public JButton getBtnSetStatus() {
        return btnSetStatus;
    }

    public void setlblUser(String input) {
        lblUser.setText(input);
    }

    public JButton getBtnSimpan() {
        return btnSimpan;
    }

    public int getCmbInputNamaT() {
        return cmbInputNamaT.getSelectedIndex();
    }

    public int getCmbNamaProyek() {
        return cmbNamaProyek.getSelectedIndex();
    }

    public void viewErrorMsg(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void addListener(ActionListener e) {
        btnBeranda.addActionListener(e);
        btnLogout.addActionListener(e);
        btnSetStatus.addActionListener(e);
        btnSimpan.addActionListener(e);
        btnAktif.addActionListener(e);
    }

    public void setCmbInputNamaT(String a) {
        cmbInputNamaT.addItem(a);
    }

    public void setCmbNamaProyek(String a) {
        cmbNamaProyek.addItem(a);
    }

    public void reset() {
        resetCmbInputNamaT();
        resetCmbNamaProyek();
        setlblAktif("");
    }

    public void resetCmbInputNamaT() {
        cmbInputNamaT.removeAllItems();
    }

    public void resetCmbNamaProyek() {
        cmbNamaProyek.removeAllItems();
    }

    public JButton getBtnAktif() {
        return btnAktif;
    }

    public JTable gettblProyek() {
        return tabelProyek;
    }

    public JTable gettblTugas() {
        return tabelTugas;
    }

    public void setBtnAktif(JButton btnAktif) {
        this.btnAktif = btnAktif;
    }

    public void setBtnBeranda(JButton btnBeranda) {
        this.btnBeranda = btnBeranda;
    }

    public void setBtnLogout(JButton btnLogout) {
        this.btnLogout = btnLogout;
    }

    public void setBtnSetStatus(JButton btnSetStatus) {
        this.btnSetStatus = btnSetStatus;
    }

    public void setBtnSimpan(JButton btnSimpan) {
        this.btnSimpan = btnSimpan;
    }

    public void setCmbInputNamaT(JComboBox<String> cmbInputNamaT) {
        this.cmbInputNamaT = cmbInputNamaT;
    }

    public void setCmbNamaProyek(JComboBox<String> cmbNamaProyek) {
        this.cmbNamaProyek = cmbNamaProyek;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public void setlblAktif(String input) {
        lblAktif.setText(input);
    }

    public void setjLabel2(JLabel jLabel2) {
        this.lblUser = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.lblAktif = jLabel5;
    }

    public JScrollPane getPanelProyek() {
        return panelProyek;
    }

    public JScrollPane getPanelTugas() {
        return panelTugas;
    }

}
