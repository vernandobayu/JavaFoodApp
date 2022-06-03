/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package javafoodapp.view;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import javafoodapp.database.ConnectionDatabase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lenovo
 */
public class dataPresensi extends javax.swing.JInternalFrame {

    /**
     * Creates new form dataPresensi
     */
    public dataPresensi() {
        initComponents();
        tampil_tabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_presensi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tambah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        bersih = new javax.swing.JButton();
        inputID = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        inputCari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Data Presensi");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_presensi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "ID", "Nama", "Tanggal"
            }
        ));
        tabel_presensi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_presensiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_presensi);

        jScrollPane1.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 166, 554, 207));

        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 169, -1, -1));

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 207, -1, -1));

        jLabel3.setText("Tanggal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 242, -1, -1));

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 285, -1, -1));

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 321, 71, -1));

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 285, 79, -1));

        bersih.setText("Bersihkan");
        bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihActionPerformed(evt);
            }
        });
        getContentPane().add(bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 321, -1, -1));
        getContentPane().add(inputID, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 166, 139, -1));
        getContentPane().add(inputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 204, 139, -1));
        getContentPane().add(inputTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 242, 139, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("DATA PRESENSI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 47, -1, -1));

        inputCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCariKeyReleased(evt);
            }
        });
        getContentPane().add(inputCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 139, 178, -1));

        jLabel5.setText("Cari");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 142, 31, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabel_presensiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_presensiMouseClicked
        // TODO add your handling code here:
        int baris = tabel_presensi.rowAtPoint(evt.getPoint());
        int kolom  = tabel_presensi.columnAtPoint(evt.getPoint());

        String id = tabel_presensi.getValueAt(baris, 1).toString();
        String nama = tabel_presensi.getValueAt(baris, 2).toString();
        String tanggal = tabel_presensi.getValueAt(baris, 3).toString();

        inputID.setText(id);
        inputNama .setText(nama);
        Date date;
        try {
            date = new SimpleDateFormat("yyy-MM-dd").parse((String)tabel_presensi.getValueAt(baris, 3).toString());
            inputTanggal.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(dataPresensi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tabel_presensiMouseClicked

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        String id = inputID.getText();
        String nama = inputNama.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        String tanggal = sdf.format(inputTanggal.getDate());
        
        if(id.equals("") || nama.equals("") || tanggal.equals("")){
            JOptionPane.showMessageDialog(null, "Isi Data Terlebih Dahulu!");
        }else{
            try{
            String q = "INSERT INTO presensi (id, nama, tanggal) VALUES ('"+id+"', '"+nama+"', '"+tanggal+"')";
            //Connection conn = (Connection)KoneksiDB.configDB();
            Connection conn = (Connection)ConnectionDatabase.getConnection();
            java.sql.PreparedStatement s = conn.prepareStatement(q);
            s.execute();
            JOptionPane.showMessageDialog(null, "Berhasil ditambahkan");
            bersih();
            tampil_tabel();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal ditambahkan");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }                         
    }//GEN-LAST:event_tambahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        String id = inputID.getText();
        String nama = inputNama.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        String tanggal = sdf.format(inputTanggal.getDate());
        
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, "Data Terlebih Dahulu!");
        }else{
            try{
            String q = "DELETE FROM presensi WHERE id = '"+id+"'";
            //Connection conn = (Connection)KoneksiDB.configDB();
            Connection conn = (Connection)ConnectionDatabase.getConnection();
            java.sql.PreparedStatement s = conn.prepareStatement(q);
            s.execute();
            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            bersih();
            tampil_tabel();
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal dihapus");
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//GEN-LAST:event_hapusActionPerformed
    }
    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        String id = inputID.getText();
        String nama = inputNama.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        String tanggal = sdf.format(inputTanggal.getDate());
        
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, "Data Terlebih Dahulu!");
        }else{
            try{
            String q = "UPDATE presensi SET id = '"+id+"', nama = '"+nama+"', tanggal = '"+tanggal+"' WHERE id = '"+id+"'";
            //Connection conn = (Connection)KoneksiDB.configDB();
            Connection conn = (Connection)ConnectionDatabase.getConnection();
            java.sql.PreparedStatement s = conn.prepareStatement(q);
            s.execute();
            JOptionPane.showMessageDialog(null, "Berhasil diubah");
            bersih();
            tampil_tabel();
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal diubah");
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }                                     
    }//GEN-LAST:event_ubahActionPerformed

    private void bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihActionPerformed
        // TODO add your handling code here:\
        bersih();
    }//GEN-LAST:event_bersihActionPerformed

    private void inputCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCariKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tabel_presensi.getModel();
        String search = inputCari.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tabel_presensi.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputCariKeyReleased
    

    private void tampil_tabel(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("No");
        tb.addColumn("ID");
        tb.addColumn("Nama");
        tb.addColumn("Tanggal");
        
        try{
            int counter = 1;
            //1. Query
            String query = "SELECT * FROM presensi";
            //2. Panggil fungsi koneksi
            //Connection conn = (Connection)KoneksiDB.configDB();
            Connection conn = (Connection)ConnectionDatabase.getConnection();
            //3. Kirim parameter fungsi java ke sql
            java.sql.Statement s = conn.createStatement();
            //4. Eksekusi query
            java.sql.ResultSet r = s.executeQuery(query);
            //5. Looping
            while (r.next()){
                tb.addRow(new Object[]{
                counter++, r.getString(2), r.getString(3), r.getString(4)
                });   
            }
            tabel_presensi.setModel(tb);
        } catch (Exception e) {

        }
    }
    
    private void bersih(){
        inputID.setText("");
        inputNama.setText("");
        inputTanggal.setDate(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersih;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField inputCari;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputNama;
    private com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel_presensi;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}