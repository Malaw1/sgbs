/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sgbs.*;

/**
 *
 * @author Malaw
 */
public class Stocks extends javax.swing.JFrame {

    /**
     * Creates new form Stocks
     */
    
    
    public Stocks() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setSize(d.width, d.height);
        afficher();
    }
    
  
   public Connection getConnection(){
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/banquedesang", "root", "");
            return con;
        }
        catch(SQLException e){
            return null;
        }
    }

    //Date Addition
    
   
   public ArrayList<Stock> getUserList(){
        ArrayList<Stock> usersList = new ArrayList<>();
        Connection connection = getConnection();
        String query = "SELECT * FROM stock";
        Statement st;
        ResultSet rs;
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Stock stock;
            while(rs.next()){
                stock = new Stock(rs.getString("idStock"), rs.getString("dateStock"), rs.getString("dateExp"), rs.getString("grpSanguin"));
                usersList.add(stock);            
            }
        }
        catch(SQLException e){
        }
        return usersList;
    }
   
   public final void afficher(){
        ArrayList<Stock> list = getUserList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[5];
        for(int i = 0; i < list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getId();
            row[2] = list.get(i).getDateStock();
            row[3] = list.get(i).getDateExp();
            row[4] = list.get(i).getGrpSanguin();
            
            model.addRow(row); 
        }
    }
   
   public ArrayList<Stock> getPerimes(){
        ArrayList<Stock> usersList = new ArrayList<>();
        Connection connection = getConnection();
        String query = "SELECT * FROM stock where nbreJrs restan > 35";
        Statement st;
        ResultSet rs;
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Stock stock;
            while(rs.next()){
                stock = new Stock(rs.getString("idStock"), rs.getString("dateStock"), rs.getString("dateExp"), rs.getString("grpSanguin"));
                usersList.add(stock);            
            }
        }
        catch(SQLException e){
        }
        return usersList;
    }
   
   public final void afficherPerimes(){
        ArrayList<Stock> list = getUserList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[6];
        for(int i = 0; i < list.size(); i++){

            row[0] = i + 1;
            row[1] = list.get(i).getId();
            row[2] = list.get(i).getDateStock();
            row[3] = list.get(i).getDateExp();
            row[4] = list.get(i).getGrpSanguin();
   
            model.addRow(row); 
        }
    }
                
                 //Add days to date in java
	
	public static Date addDays(Date date, int days){
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}
	
	
	//Subtract days to date
	
	public static Date subtractDays(Date date, int days){
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, -days);
		return cal.getTime();
	}
   public void executeSqlQuery(String query, String message){
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if(st.executeUpdate(query) ==1){
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
                afficher();
                JOptionPane.showMessageDialog(null, "Stock "+message+" avec succees");
            }
            else{
                JOptionPane.showMessageDialog(null, "Stock non "+ message);
                
            }
        }
        catch(HeadlessException | SQLException ex){
           
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jText_ID = new javax.swing.JTextField();
        jTextField_dateStock = new javax.swing.JTextField();
        jTextField_dateExp = new javax.swing.JTextField();
        jTextField_grpSanguin = new javax.swing.JTextField();
        accBtn = new javax.swing.JButton();
        diversBtn = new javax.swing.JButton();
        perimeBtn = new javax.swing.JButton();
        ajoutBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        suppBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 2, 36)); // NOI18N
        jLabel1.setText("GESTION DU STOCK");

        jLabel2.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        jLabel2.setText("ID: ");

        jLabel3.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        jLabel3.setText("Date de Stock: ");

        jLabel4.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        jLabel4.setText("Groupe Sanguin:");

        jLabel5.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        jLabel5.setText("Date d'Exp: ");

        accBtn.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        accBtn.setText("ACCEUIL");
        accBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accBtnActionPerformed(evt);
            }
        });

        diversBtn.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        diversBtn.setText("DIVERS");

        perimeBtn.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        perimeBtn.setText("PERIMES");

        ajoutBtn.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        ajoutBtn.setText("Ajouter");
        ajoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        updateBtn.setText("Modifier");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        suppBtn.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        suppBtn.setText("Supprimer");
        suppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        refreshBtn.setText("Actualiser");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "ID", "Date Stock", "Date Exp", "Groupe Sanguin", "Nbr Jrs Restant"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(69, 69, 69))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_dateExp)
                            .addComponent(jTextField_grpSanguin)
                            .addComponent(jText_ID)
                            .addComponent(jTextField_dateStock)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(accBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(perimeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(diversBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(204, 204, 204)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(ajoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diversBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perimeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(99, 99, 99)
                                .addComponent(jText_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_dateStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_dateExp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_grpSanguin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ajoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppBtnActionPerformed
        // TODO add your handling code here:
        String query = "DELETE from stock where id = '"+jText_ID.getText()+"'";
        executeSqlQuery(query, "Supprimées");
    }//GEN-LAST:event_suppBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void accBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        sgbs.Welcome wel = new sgbs.Welcome();
        wel.setVisible(true);
        
    }//GEN-LAST:event_accBtnActionPerformed

    private void ajoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutBtnActionPerformed
        // TODO add your handling code here:
        String query = "INSERT into stock ( ID, dateStock, dateExp, grpSanguin) VALUES ('"+jText_ID.getText()+"','"+jTextField_dateStock.getText()+"', '"+jTextField_dateExp.getText()+"', '"+jTextField_grpSanguin.getText()+"')";
        executeSqlQuery(query, "Ajoutées");
        
    }//GEN-LAST:event_ajoutBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Afficher le text selectionne :
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        jText_ID.setText(model.getValueAt(i, 1).toString());
        jTextField_dateStock.setText(model.getValueAt(i, 2).toString());
        jTextField_dateExp.setText(model.getValueAt(i, 3).toString());
        jTextField_grpSanguin.setText(model.getValueAt(i, 4).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String query = "Update stock set idStock = '"+jText_ID.getText()+"', dateStock '"+jTextField_dateStock.getText()+"', dateExp = '"+jTextField_dateExp.getText()+"', grpSanguin = '"+jTextField_grpSanguin.getText()+" WHERE isStock = ' "+jText_ID.getText();
        executeSqlQuery(query, "Modifiées");
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Stocks().setVisible(true);
            Date dt = new Date();
            Date date = new Date();
		System.out.print("Today's date is: "+ date.toString());
		//Test addDays Method
		int i = 10;
		while(i<=50){
			Date newDate = addDays(date, i);
			System.out.println("Java Date after adding "+i+" days : "+ newDate.toString());
			i+=10;
		}
		
		// Test Substract days Method
		
		 i = 10;
		 while(i <= 50){
			 Date newDate = subtractDays(date, i);
			 System.out.print("Java Date after subtracting "+i+" days: "+newDate.toString());
			 i+=10;
		 }
                 
    
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accBtn;
    private javax.swing.JButton ajoutBtn;
    private javax.swing.JButton diversBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_dateExp;
    private javax.swing.JTextField jTextField_dateStock;
    private javax.swing.JTextField jTextField_grpSanguin;
    private javax.swing.JTextField jText_ID;
    private javax.swing.JButton perimeBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton suppBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
