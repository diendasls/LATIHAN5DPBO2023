/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dinda
 */

/*Saya Adinda Salsabilla 2005319 mengerjakan Latihan 5 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin*/

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class MainJFrame extends javax.swing.JFrame {
    private DefaultTableModel dtm;
    private Boolean isUpdate = false;
    private int selectedID = -1;
    private ArrayList<Mahasiswa> listMhs;
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        // Constructors
        initComponents();
        listMhs = new ArrayList<>();
        
        //DUMMY
        listMhs.add(new Mahasiswa("11111", "Lee Hangyul", "A", "Male"));
        listMhs.add(new Mahasiswa("22222", "Wang Jarim", "B+", "Female"));
        listMhs.add(new Mahasiswa("33333", "Cha Gyeol", "C", "Male"));
       
        // set table
        tblMhs.setModel(setTable());
        
        // HIDE DELETE BUTTON
        btnDelete.setVisible(false);
    }

    // SET TABEL
    public final DefaultTableModel setTable() {
        // Column title
        Object[] column = {"NIM", "Nama", "Nilai", "Gender"};
        DefaultTableModel dataTabel = new DefaultTableModel(null, column);
        
        // get cell value
        for(int i = 0; i < listMhs.size(); i++){
            Object[] row = new Object[4]; // array of object
            row[0] = listMhs.get(i).getNim(); // cell 0
            row[1] = listMhs.get(i).getNama(); // cell 1
            row[2] = listMhs.get(i).getNilai(); // cell 2
            row[3] = listMhs.get(i).getGender(); // cell 3
            
            dataTabel.addRow(row);
        }
        
        return dataTabel;
    }
    
    // PROSEDUR INSERT DATA 
    public void insertData(){
        // get data from form
        String nim = fieldNim.getText();
        String nama = fieldNama.getText();
        String nilai = fieldNilai.getText();
        String gender = (String) cmbGender.getSelectedItem();
        
        // add new data
        listMhs.add(new Mahasiswa(nim, nama, nilai, gender));
        
        //reset form
        resetForm();
        
        // update table
        tblMhs.setModel(setTable());
        
        // show information
        System.out.println("Insert Success!");
        JOptionPane.showMessageDialog(null, "Data Successfully Added!");
    }
    
    // PROSEDUR UPDATE DATA
    public void updateData(){
        // get data from form
        String nim = fieldNim.getText();
        String nama = fieldNama.getText();
        String nilai = fieldNilai.getText();
        String gender = (String) cmbGender.getSelectedItem();
        
        // set data to object
        listMhs.get(selectedID).setNim(nim);
        listMhs.get(selectedID).setNama(nama);
        listMhs.get(selectedID).setNilai(nilai);
        listMhs.get(selectedID).setGender(gender);
        
        //reset form
        resetForm();
        
        // update table
        tblMhs.setModel(setTable());
        
        // show information
        System.out.println("Update Success!");
        JOptionPane.showMessageDialog(null, "Data Successfully Changed!");
    }
    
    // PROSEDUR DELETE DATA 
    public void deleteData(){
        // CONFIRMATION PROMPT YES OR NO
        int result = JOptionPane.showConfirmDialog 
        (this, "Are you sure you want to delete?", "Delete Data", 
         JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        // JIKA USER PILIH YES
        if(result == JOptionPane.YES_OPTION){
            //Remove Data from List
            listMhs.remove(selectedID);

            //Reset Form
            resetForm();

            //Update Table
            tblMhs.setModel(setTable());

            //Show Information
            System.out.println("Delete Success!");
            JOptionPane.showMessageDialog(null, "Data Successfully Deleted!");
        }
        // JIKA USER PILIH NO
        else if(result == JOptionPane.NO_OPTION){
            //Reset Form
            resetForm();
            
            //Show Information
            System.out.println("Delete Abort!");
            JOptionPane.showMessageDialog(null, "Data Is Not Deleted!");
        }
        
    }
    
    // PROSEDUR RESET FORM
    public void resetForm(){
        // RESET FORM
        fieldNim.setText("");
        fieldNama.setText("");
        fieldNilai.setText("");
        
        // show information
        System.out.println("Cancelled!");
    }
    
    // PROSEDUR EXIT PROGRAM
    public void doExit(){
        //dialog prompt
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are You Sure You Want to Exit?", "Exit Program", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        // if user choose YES, then exit 
        if(confirm == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldNim = new javax.swing.JTextField();
        fieldNama = new javax.swing.JTextField();
        fieldNilai = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        labelNim = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelNilai = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        labelGender = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMhs = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(126, 136, 176));

        fieldNim.setBackground(new java.awt.Color(255, 255, 255));
        fieldNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNimActionPerformed(evt);
            }
        });

        fieldNama.setBackground(new java.awt.Color(255, 255, 255));
        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        fieldNilai.setBackground(new java.awt.Color(255, 255, 255));
        fieldNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNilaiActionPerformed(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Poppins ExtraBold", 0, 24)); // NOI18N
        labelTitle.setText("Daftar Mahasiswa");

        labelNim.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelNim.setText("NIM");

        labelNama.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelNama.setText("Nama");

        labelNilai.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelNilai.setText("Nilai");

        cmbGender.setBackground(new java.awt.Color(255, 255, 255));
        cmbGender.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cmbGender.setForeground(new java.awt.Color(0, 0, 0));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Rather Not Say" }));
        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });

        labelGender.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelGender.setText("Gender");

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblMhs.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMhs);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Poppins", 3, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNim)
                                            .addComponent(labelNama)
                                            .addComponent(labelNilai))
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(fieldNama, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldNim, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelGender)
                                        .addGap(40, 40, 40)
                                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdd)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(labelTitle)))
                        .addContainerGap(362, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelNim))
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelNama)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNilai)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGender)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNimActionPerformed

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void fieldNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNilaiActionPerformed

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderActionPerformed
    
    // BUTTON CANCEL BEHAVIOUR
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        resetForm();
        // cancel input form
        btnAdd.setText("Add");
        btnDelete.setVisible(false);
        this.isUpdate = false;
        
    }//GEN-LAST:event_btnCancelActionPerformed
    
    // BUTTON ADD BEHAVIOUR
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(isUpdate == false){
            insertData();
        }
        else{
            updateData();
            btnAdd.setText("Add");
            btnDelete.setVisible(false);
            this.isUpdate = false;
        }
    }//GEN-LAST:event_btnAddActionPerformed

    // BUTTON DELETE BEHAVIOUR
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (isUpdate == true){
            deleteData();
            btnAdd.setText("Add");
            btnDelete.setVisible(false);
            this.isUpdate = false;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // MOUSE CLICK PADA TABEL
    private void tblMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMhsMouseClicked
        // TODO add your handling code here:
        // if data clicked
        this.isUpdate = true;
        
        // get selected data
        int row = tblMhs.getSelectedRow();
        String selectedNim = (tblMhs.getModel().getValueAt(row, 0).toString());
        String selectedNama = (tblMhs.getModel().getValueAt(row, 1).toString());
        String selectedNilai = (tblMhs.getModel().getValueAt(row, 2).toString());
        String selectedGender = (tblMhs.getModel().getValueAt(row, 3).toString());
        
        // search data
        for(int i = 0; i < listMhs.size(); i++){
            if(selectedNim.equals(listMhs.get(i).getNim())){
                selectedID = i;
                break;
            }
        }
        
        //set form value
        fieldNim.setText(selectedNim);
        fieldNama.setText(selectedNama);
        fieldNilai.setText(selectedNilai);
        cmbGender.setSelectedItem(selectedGender);
        
        btnAdd.setText("Update");
        btnDelete.setVisible(true);
        
    }//GEN-LAST:event_tblMhsMouseClicked

    // BUTTON EXIT BEHAVIOUR
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        // exit program
        doExit();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNilai;
    private javax.swing.JTextField fieldNim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNilai;
    private javax.swing.JLabel labelNim;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTable tblMhs;
    // End of variables declaration//GEN-END:variables

    
}
