package pendataan_penduduk;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Finterface extends javax.swing.JFrame {
   public DefaultTableModel tabel;
   
    public Finterface() {
        initComponents();
        
        grupgender.add(rdlk);
        grupgender.add(rdprm);
        grupkwngr.add(cbwna);
        grupkwngr.add(cbwni);
        
        tabel = new DefaultTableModel();

        //menambahkan table model ke tabel
        tabelhasil.setModel(tabel);
        tabel.fireTableDataChanged();
        
        tabel.addColumn("NIK");
        tabel.addColumn("NAMA");
        tabel.addColumn("TEMPAT LAHIR");
        tabel.addColumn("TANGGAL LAHIR");
        tabel.addColumn("STATUS");
        tabel.addColumn("JENIS KELAMIN");
        tabel.addColumn("KEWARGANEGARAAN");
        tabel.addColumn("GOLONGAN DARAH");
        tabel.addColumn("AGAMA");
        tabel.addColumn("ALAMAT");
        tabel.addColumn("RT / RW");
        tabel.addColumn("KELURAHAN");
        tabel.addColumn("KECAMATAN");
        tabel.addColumn("KABUPATEN/KOTA");
        tabel.addColumn("FOTO");
        }
    
    public void hanyaangka(KeyEvent evt){
    if(Character.isAlphabetic(evt.getKeyChar())){
           evt.consume();
           JOptionPane.showMessageDialog(null, "Hanya Boleh Masukkan Angka");
        }
    }
    
    public void hanyahuruf(KeyEvent avt){
    if(Character.isDigit(avt.getKeyChar())){
           avt.consume();
           JOptionPane.showMessageDialog(null, "Hanya Boleh Masukkan Huruf");
        }
    }
    
    int batas;
    String Filenama = null;
    byte[] foto_mahasiswa=null;
    
    public void reset(){
        jnik.setText("");
        jnama.setText("");
        jtempat.setText("");
        jtgllahir.setText("");
        grupgender.clearSelection();
        grupkwngr.clearSelection();
        cbgoldar.setSelectedIndex(0);
        jagama.setText("");
        jalamat.setText("");
        jrtrw.setText("");
        jdesa.setText("");
        jkecamatan.setText("");
        jkota.setText("");
        cbstatus.setSelectedIndex(0);
        jgambar.setIcon(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupgender = new javax.swing.ButtonGroup();
        grupkwngr = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        paneldaftar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jnik = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jnama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtempat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtgllahir = new javax.swing.JTextField();
        rdlk = new javax.swing.JRadioButton();
        rdprm = new javax.swing.JRadioButton();
        cbwni = new javax.swing.JCheckBox();
        cbwna = new javax.swing.JCheckBox();
        cbgoldar = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jagama = new javax.swing.JTextField();
        jalamat = new javax.swing.JTextField();
        jrtrw = new javax.swing.JTextField();
        jdesa = new javax.swing.JTextField();
        jkota = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jgambar = new javax.swing.JLabel();
        btnfoto = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        cbstatus = new javax.swing.JComboBox();
        jkecamatan = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        paneldata = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelhasil = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menubaru = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuedit = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuexit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PENDUDUK APP");
        setPreferredSize(new java.awt.Dimension(1079, 630));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        paneldaftar.setBackground(new java.awt.Color(108, 105, 226));
        paneldaftar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PENDATAAN PENDUDUK 2021");
        paneldaftar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, 16));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DAERAH PROVINSI JAWA TENGAH");
        paneldaftar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, 19));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        paneldaftar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1060, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIK");
        paneldaftar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnikActionPerformed(evt);
            }
        });
        jnik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jnikKeyTyped(evt);
            }
        });
        paneldaftar.add(jnik, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 125, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NAMA");
        paneldaftar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jnamaKeyTyped(evt);
            }
        });
        paneldaftar.add(jnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TEMPAT LAHIR");
        paneldaftar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jtempat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtempatKeyTyped(evt);
            }
        });
        paneldaftar.add(jtempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 125, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TANGGAL LAHIR");
        paneldaftar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jtgllahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtgllahirActionPerformed(evt);
            }
        });
        paneldaftar.add(jtgllahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 125, -1));

        rdlk.setForeground(new java.awt.Color(255, 255, 255));
        rdlk.setText("Laki-laki");
        paneldaftar.add(rdlk, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        rdprm.setForeground(new java.awt.Color(255, 255, 255));
        rdprm.setText("Perempuan");
        paneldaftar.add(rdprm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        cbwni.setForeground(new java.awt.Color(255, 255, 255));
        cbwni.setText("WNI");
        paneldaftar.add(cbwni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        cbwna.setForeground(new java.awt.Color(255, 255, 255));
        cbwna.setText("WNA");
        paneldaftar.add(cbwna, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        cbgoldar.setForeground(new java.awt.Color(255, 255, 255));
        cbgoldar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-PILIH GOLDAR-", "A", "B", "O", "AB" }));
        paneldaftar.add(cbgoldar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("JENIS KELAMIN");
        paneldaftar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("KEWARGANEGARAAN");
        paneldaftar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 14));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("GOLONGAN DARAH");
        paneldaftar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 11));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("AGAMA");
        paneldaftar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jagama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jagamaKeyTyped(evt);
            }
        });
        paneldaftar.add(jagama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 103, -1));

        jalamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jalamatKeyTyped(evt);
            }
        });
        paneldaftar.add(jalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 210, -1));

        jrtrw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jrtrwKeyTyped(evt);
            }
        });
        paneldaftar.add(jrtrw, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 70, -1));

        jdesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdesaKeyTyped(evt);
            }
        });
        paneldaftar.add(jdesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 158, -1));

        jkota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkotaActionPerformed(evt);
            }
        });
        jkota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jkotaKeyTyped(evt);
            }
        });
        paneldaftar.add(jkota, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 158, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("RT / RW");
        paneldaftar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ALAMAT");
        paneldaftar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("KELURAHAN / DESA");
        paneldaftar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("KECAMATAN");
        paneldaftar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jgambar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        paneldaftar.add(jgambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 113, 148));

        btnfoto.setBackground(new java.awt.Color(255, 153, 0));
        btnfoto.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        btnfoto.setForeground(new java.awt.Color(255, 255, 255));
        btnfoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\gallery.png")); // NOI18N
        btnfoto.setText("PILIH FILE FOTO");
        btnfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfotoActionPerformed(evt);
            }
        });
        paneldaftar.add(btnfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 150, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("FOTO");
        paneldaftar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        btnsubmit.setBackground(new java.awt.Color(102, 255, 0));
        btnsubmit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\upload.png")); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        paneldaftar.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, 34));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("KABUPATEN / KOTA");
        paneldaftar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        cbstatus.setForeground(new java.awt.Color(255, 255, 255));
        cbstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-PILIH STATUS-", "PELAJAR", "BELUM MENIKAH", "MENIKAH" }));
        paneldaftar.add(cbstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jkecamatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jkecamatanKeyTyped(evt);
            }
        });
        paneldaftar.add(jkecamatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 158, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("STATUS");
        paneldaftar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon("E:\\Praktikum DKP\\JAVA\\icon\\hayooo.png")); // NOI18N
        paneldaftar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1080, 630));

        jTabbedPane5.addTab("PENDAFTARAN", paneldaftar);

        paneldata.setBackground(new java.awt.Color(114, 90, 249));
        paneldata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelhasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIK", "NAMA", "TEMPAT LAHIR", "TANGGAL LAHIR", "JENIS KELAMIN", "KEWARGANEGARAAN", "GOLONGAN DARAH", "AGAMA", "ALAMAT", "RT / RW", "KELURAHAN / DESA", "KECAMATAN", "KABUPATEN / KOTA", "STATUS ", "FOTO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelhasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelhasilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelhasil);

        paneldata.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1057, 280));

        jLabel16.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DATA HASIL PENDATAAN PENDUDUK 2021");
        paneldata.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 16));

        jLabel18.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DAERAH PROVINSI JAWA TENGAH");
        paneldata.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        btndelete.setBackground(new java.awt.Color(102, 102, 102));
        btndelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\trash.png")); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        paneldata.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        paneldata.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1077, 10));

        jLabel21.setIcon(new javax.swing.ImageIcon("E:\\Praktikum DKP\\JAVA\\icon\\wdata.png")); // NOI18N
        paneldata.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 570));

        jTabbedPane5.addTab("DATA HASIL", paneldata);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Created by Nur Ayuk Febreyanti Teknik Komputer 2020 UNDIP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\compartment.png")); // NOI18N
        jMenu2.setText("File");

        menubaru.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menubaru.setBackground(new java.awt.Color(253, 208, 41));
        menubaru.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\add-file (1).png")); // NOI18N
        menubaru.setText("New");
        menubaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubaruActionPerformed(evt);
            }
        });
        jMenu2.add(menubaru);
        jMenu2.add(jSeparator4);

        menuedit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuedit.setBackground(new java.awt.Color(253, 208, 41));
        menuedit.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\edit (1).png")); // NOI18N
        menuedit.setText("Update");
        menuedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menueditActionPerformed(evt);
            }
        });
        jMenu2.add(menuedit);
        jMenu2.add(jSeparator5);

        menuexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuexit.setBackground(new java.awt.Color(253, 208, 41));
        menuexit.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\logout (1).png")); // NOI18N
        menuexit.setText("Exit");
        menuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuexitActionPerformed(evt);
            }
        });
        jMenu2.add(menuexit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelhasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelhasilMouseClicked
   
        int a = tabelhasil.getSelectedRow();
        if(a == -1){
            return;
        }
        String rnik = (String) tabel.getValueAt(a, 0);
        jnik.setText(rnik);

        String rnama = (String) tabel.getValueAt(a, 1);
        jnama.setText(rnama);

        String rtempat = (String) tabel.getValueAt(a, 2);
        jtempat.setText(rtempat);

        String rtanggal = (String) tabel.getValueAt(a, 3);
        jtgllahir.setText(rtanggal);
        
        String rstatus = (String) tabel.getValueAt(a, 4);
        switch(rstatus){
            case"-PILIH STATUS-":
            cbstatus.setSelectedIndex(0);
            break;
            case "PELAJAR":
            cbstatus.setSelectedIndex(1);
            break;
            case "BELUM MENIKAH":
            cbstatus.setSelectedIndex(2);
            break;
            case "MENIKAH":
            cbstatus.setSelectedIndex(3);
            break;
        }

        String rlk = (String) tabel.getValueAt(a, 5);
        if(rlk.equals("")){
            rdlk.setSelected(true);
        }
        else{
            rdprm.setSelected(true);
        }

        String warga = (String) tabel.getValueAt(a, 6);
        switch(warga){
            case "WNI ":
            cbwni.setSelected(true);
            cbwna.setSelected(false);
            break;
            case "WNA ":
            cbwna.setSelected(true);
            cbwni.setSelected(false);
            break;
            default:
            cbwna.setSelected(true);
            cbwni.setSelected(true);
            break;
        }

        String rgoldar = (String) tabel.getValueAt(a, 7);
        switch(rgoldar){
            case"-PILIH GOLDAR-":
            cbgoldar.setSelectedIndex(0);
            break;
            case "A":
            cbgoldar.setSelectedIndex(1);
            break;
            case "B":
            cbgoldar.setSelectedIndex(2);
            break;
            case "O":
            cbgoldar.setSelectedIndex(3);
            break;
            case "AB":
            cbgoldar.setSelectedIndex(4);
            break;
        }

        String ragama = (String) tabel.getValueAt(a, 8);
        jagama.setText(ragama);

        String ralamat = (String) tabel.getValueAt(a, 9);
        jalamat.setText(ralamat);

        String rrtrw = (String) tabel.getValueAt(a, 10);
        jrtrw.setText(rrtrw);

        String rdesa = (String) tabel.getValueAt(a, 11);
        jdesa.setText(rdesa);

        String rkecamatan = (String) tabel.getValueAt(a, 12);
        jkecamatan.setText(rkecamatan);

        String rkota = (String) tabel.getValueAt(a, 13);
        jkota.setText(rkota);
        if(tabelhasil.getValueAt(a, 14)!=null){
        ImageIcon imageIcon = (ImageIcon) tabelhasil.getValueAt(a, 14);
        Image ukuran = imageIcon.getImage().getScaledInstance(jgambar.getWidth(),jgambar.getHeight() ,Image.SCALE_SMOOTH);
        ImageIcon image1 = new ImageIcon(ukuran);
        jgambar.setIcon(image1);
        }else{
            System.out.println("");
        }
    }//GEN-LAST:event_tabelhasilMouseClicked

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
       DefaultTableModel tabel = (DefaultTableModel) tabelhasil.getModel();
        if(jnik.getText().trim().equals("") || jnama.getText().trim().equals("") 
            || jtempat.getText().trim().equals("")|| jtgllahir.getText().trim().equals("")
            || cbgoldar.getSelectedItem().equals("") || cbstatus.getSelectedItem().equals("")
            || jagama.getText().trim().equals("") || jalamat.getText().trim().equals("")
            || jrtrw.getText().trim().equals("") || jdesa.getText().trim().equals("") 
            || jkota.getText().trim().equals("") || jkecamatan.getText().trim().equals("")
            || Filenama.getBytes().equals("")){
            JOptionPane.showMessageDialog(null, "SEMUA DATA WAJIB DI ISI","Peringatan",JOptionPane.WARNING_MESSAGE);
        } else {
            String jk="";
            if(rdlk.isSelected()){
                jk = rdlk.getText();
            }else if(rdprm.isSelected()){
                jk = rdprm.getText();
            }
            String negara = "";
            if(cbwni.isSelected()){
                negara = "WNI";
            }else{
                negara = "WNA";
            }
            ImageIcon imageicon = new ImageIcon(Filenama);
            
        List list = new ArrayList<>();
        tabelhasil.setAutoCreateColumnsFromModel(true);
        list.add(jnik.getText());
        list.add(jnama.getText());
        list.add(jtempat.getText());
        list.add(jtgllahir.getText());
        list.add(cbstatus.getSelectedItem().toString());
        list.add(jk);
        list.add(negara);
        list.add(cbgoldar.getSelectedItem().toString());
        list.add(jagama.getText());
        list.add(jalamat.getText());
        list.add(jrtrw.getText());
        list.add(jdesa.getText());
        list.add(jkecamatan.getText());
        list.add(jkota.getText());
        list.add(imageicon);
        tabel.addRow(list.toArray());
        tabel.fireTableDataChanged();
        reset();
        JOptionPane.showMessageDialog(null, "Success\n\tThank You","Successfully",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfotoActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter f = new FileNameExtensionFilter("IMAGE","png","jpg","jpeg");
        chooser.addChoosableFileFilter(f);
        int showOpenDialog = chooser.showOpenDialog(null);
        
        if(showOpenDialog==JFileChooser.APPROVE_OPTION){
            File pilihfile = chooser.getSelectedFile();
            Filenama = pilihfile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, Filenama);
            ImageIcon rgambar = new ImageIcon(Filenama);
            Image gimage = rgambar.getImage().getScaledInstance(jgambar.getWidth(), jgambar.getHeight(), Image.SCALE_SMOOTH);
            jgambar.setIcon(new ImageIcon(gimage));
        }
    }//GEN-LAST:event_btnfotoActionPerformed

    private void jkotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkotaActionPerformed
        
    }//GEN-LAST:event_jkotaActionPerformed

    private void jtgllahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtgllahirActionPerformed

    }//GEN-LAST:event_jtgllahirActionPerformed

    private void menubaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubaruActionPerformed
        reset();
        JOptionPane.showConfirmDialog(this, "Are You sure to Add data ?"
               + "\n\t\t Make sure your data is stored !","New",JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_menubaruActionPerformed

    private void menuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuexitActionPerformed
        int jawab = JOptionPane.showConfirmDialog(this,"Are you sure you want to Exit ?",
                "Exit",JOptionPane.YES_NO_OPTION);
        if(jawab==JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_menuexitActionPerformed

    private void jnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnikActionPerformed
        
    }//GEN-LAST:event_jnikActionPerformed

    private void jnikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnikKeyTyped
        hanyaangka(evt);
    }//GEN-LAST:event_jnikKeyTyped

    private void menueditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menueditActionPerformed
        DefaultTableModel tabel = (DefaultTableModel) tabelhasil.getModel();
        int h = tabelhasil.getSelectedRowCount();
        if (h==-1){
        
        }else{
        tabel.setValueAt(jnik.getText(), tabelhasil.getSelectedRow(), 0);
        tabel.setValueAt(jnama.getText(), tabelhasil.getSelectedRow(), 1);
        tabel.setValueAt(jtempat.getText(), tabelhasil.getSelectedRow(), 2);
        tabel.setValueAt(jtgllahir.getText(), tabelhasil.getSelectedRow(), 3);
        tabel.setValueAt(cbstatus.getSelectedItem(), tabelhasil.getSelectedRow(), 4);
        String gender ="";
        if(rdlk.isSelected()){
            gender = "Laki-laki";
        }
        if(rdprm.isSelected()){
            gender = "Perempuan";
        }
        tabel.setValueAt(gender, tabelhasil.getSelectedRow(), 5);
        String warga="";
        if(cbwni.isSelected()){
            warga+=cbwni.getText()+" ";
        }
        if(cbwna.isSelected()){
            warga+=cbwna.getText()+" ";
        }
        tabel.setValueAt(warga, tabelhasil.getSelectedRow(), 6);
        tabel.setValueAt(cbgoldar.getSelectedItem().toString(), tabelhasil.getSelectedRow(), 7);
        tabel.setValueAt(jagama.getText(), tabelhasil.getSelectedRow(), 8);
        tabel.setValueAt(jalamat.getText(), tabelhasil.getSelectedRow(), 9);
        tabel.setValueAt(jrtrw.getText(), tabelhasil.getSelectedRow(), 10);
        tabel.setValueAt(jdesa.getText(), tabelhasil.getSelectedRow(), 11);
        tabel.setValueAt(jkecamatan.getText(), tabelhasil.getSelectedRow(), 12);
        tabel.setValueAt(jkota.getText(), tabelhasil.getSelectedRow(), 13);
        ImageIcon imageicon = new ImageIcon(Filenama);
        tabel.setValueAt(imageicon, tabelhasil.getSelectedRow(), 14);
        reset();
        }
        JOptionPane.showMessageDialog(null, "Successfully Changed Data");
    }//GEN-LAST:event_menueditActionPerformed

    private void jnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnamaKeyTyped
       hanyahuruf(evt);
    }//GEN-LAST:event_jnamaKeyTyped

    private void jtempatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtempatKeyTyped
        hanyahuruf(evt);
    }//GEN-LAST:event_jtempatKeyTyped

    private void jagamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jagamaKeyTyped
        hanyahuruf(evt);
    }//GEN-LAST:event_jagamaKeyTyped

    private void jalamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jalamatKeyTyped
        hanyahuruf(evt);
    }//GEN-LAST:event_jalamatKeyTyped

    private void jrtrwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrtrwKeyTyped
        hanyaangka(evt);
    }//GEN-LAST:event_jrtrwKeyTyped

    private void jdesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdesaKeyTyped
        hanyahuruf(evt);
    }//GEN-LAST:event_jdesaKeyTyped

    private void jkecamatanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jkecamatanKeyTyped
        hanyahuruf(evt);
    }//GEN-LAST:event_jkecamatanKeyTyped

    private void jkotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jkotaKeyTyped
        hanyahuruf(evt);
    }//GEN-LAST:event_jkotaKeyTyped

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        DefaultTableModel tabel = (DefaultTableModel) tabelhasil.getModel();
        int jwb = JOptionPane.showConfirmDialog(this,
                "Are you sure to delete data ?",
                "Delete",
                JOptionPane.YES_NO_OPTION);
        if (jwb == 0){
        
        if(tabelhasil.getSelectedRowCount()==1){
           tabel.removeRow(tabelhasil.getSelectedRow());
        }else{
            if(tabelhasil.getRowCount()==0){
                JOptionPane.showMessageDialog(null, "Tabel is Empty");
            }else{
                 JOptionPane.showMessageDialog(null, "Please select Row For Delete");
            }
        }
        }
    }//GEN-LAST:event_btndeleteActionPerformed
    
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
            java.util.logging.Logger.getLogger(Finterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnfoto;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox cbgoldar;
    private javax.swing.JComboBox cbstatus;
    private javax.swing.JCheckBox cbwna;
    private javax.swing.JCheckBox cbwni;
    private javax.swing.ButtonGroup grupgender;
    private javax.swing.ButtonGroup grupkwngr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField jagama;
    private javax.swing.JTextField jalamat;
    private javax.swing.JTextField jdesa;
    private javax.swing.JLabel jgambar;
    private javax.swing.JTextField jkecamatan;
    private javax.swing.JTextField jkota;
    private javax.swing.JTextField jnama;
    private javax.swing.JTextField jnik;
    private javax.swing.JTextField jrtrw;
    private javax.swing.JTextField jtempat;
    private javax.swing.JTextField jtgllahir;
    private javax.swing.JMenuItem menubaru;
    private javax.swing.JMenuItem menuedit;
    private javax.swing.JMenuItem menuexit;
    private javax.swing.JPanel paneldaftar;
    private javax.swing.JPanel paneldata;
    private javax.swing.JRadioButton rdlk;
    private javax.swing.JRadioButton rdprm;
    private javax.swing.JTable tabelhasil;
    // End of variables declaration//GEN-END:variables
}
