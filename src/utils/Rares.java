/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malaw
 */
public class Rares extends javax.swing.JFrame {

    /**
     * Creates new form Rares
     */
    public Rares() {
        initComponents();
        afficherAplus();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setSize(d.width, d.height);
        
    }
    
    public  Connection getConnection(){
        Connection con;
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/banquedesang", "root", "");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    //Affichage Groupe A+
    
    public ArrayList<Donneur> getAplus(){
        ArrayList<Donneur> usersList = new ArrayList<Donneur>();
        Connection connection = getConnection();
        String query = "SELECT * FROM donneur d, groupesanguin g WHERE d.idGroupe = g.idGroupe AND nomGroupe = 'A+'";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Donneur donneur;
            while(rs.next()){
                
                donneur = new Donneur(rs.getString("idDonneur"), rs.getString("nomDonneur"), rs.getString("prenomDonneur"), rs.getString("adresse"),rs.getString("lieuNaiss"), rs.getString("genre"), rs.getString("login"), rs.getString("password"), rs.getString("dateNaiss"), rs.getString("cin"), rs.getString("numTel"), rs.getInt("taille"), rs.getInt("poids"), rs.getInt("idGroupe"), rs.getString("nomGroupe") );
                usersList.add(donneur);
                
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void afficherAplus(){
        ArrayList<Donneur> list = getAplus();
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        Object[] row = new Object[13];
 
                //Date subDate = Donneur.subtractDays(rs.getDate("dateStock"), 35 );
        for(int i = 0; i < list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getIdDonneur();
            row[2] = list.get(i).getPrenomDonneur();
            row[3] = list.get(i).getNomDonneur();
            row[4] = list.get(i).getNomGroupe();
            row[5] = list.get(i).getAdresse();
            row[6] = list.get(i).getDateNaiss();
            row[7] = list.get(i).getLieuNaiss();
            row[8] = list.get(i).getTaille();
            row[9] = list.get(i).getPoids();
            row[10] = list.get(i).getGenre();
            row[11] = list.get(i).getNumTel();
            row[12] = list.get(i).getCin();
            
            model.addRow(row); 
        }
    }
    
    //Affichage Groupe A-
    
    public ArrayList<Donneur> getAnegatif(){
        ArrayList<Donneur> usersList = new ArrayList<Donneur>();
        Connection connection = getConnection();
        String query = "SELECT * FROM donneur d, groupesanguin g WHERE d.idGroupe = g.idGroupe AND nomGroupe = 'A-'";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Donneur donneur;
            while(rs.next()){
                
                donneur = new Donneur(rs.getString("idDonneur"), rs.getString("nomDonneur"), rs.getString("prenomDonneur"), rs.getString("adresse"),rs.getString("lieuNaiss"), rs.getString("genre"), rs.getString("login"), rs.getString("password"), rs.getString("dateNaiss"), rs.getString("cin"), rs.getString("numTel"), rs.getInt("taille"), rs.getInt("poids"), rs.getInt("idGroupe"), rs.getString("nomGroupe") );
                usersList.add(donneur);
                
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void afficherAnegatif(){
        ArrayList<Donneur> list = getAnegatif();
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        Object[] row = new Object[13];
 
                //Date subDate = Donneur.subtractDays(rs.getDate("dateStock"), 35 );
        for(int i = 0; i < list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getIdDonneur();
            row[2] = list.get(i).getPrenomDonneur();
            row[3] = list.get(i).getNomDonneur();
            row[4] = list.get(i).getNomGroupe();
            row[5] = list.get(i).getAdresse();
            row[6] = list.get(i).getDateNaiss();
            row[7] = list.get(i).getLieuNaiss();
            row[8] = list.get(i).getTaille();
            row[9] = list.get(i).getPoids();
            row[10] = list.get(i).getGenre();
            row[11] = list.get(i).getNumTel();
            row[12] = list.get(i).getCin();
            
            model.addRow(row); 
        }
    }
    
    //Affichage Groupe A-
    
    public ArrayList<Donneur> getBpositif(){
        ArrayList<Donneur> usersList = new ArrayList<Donneur>();
        Connection connection = getConnection();
        String query = "SELECT * FROM donneur d, groupesanguin g WHERE d.idGroupe = g.idGroupe AND nomGroupe = 'B+'";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Donneur donneur;
            while(rs.next()){
                
                donneur = new Donneur(rs.getString("idDonneur"), rs.getString("nomDonneur"), rs.getString("prenomDonneur"), rs.getString("adresse"),rs.getString("lieuNaiss"), rs.getString("genre"), rs.getString("login"), rs.getString("password"), rs.getString("dateNaiss"), rs.getString("cin"), rs.getString("numTel"), rs.getInt("taille"), rs.getInt("poids"), rs.getInt("idGroupe"), rs.getString("nomGroupe") );
                usersList.add(donneur);
                
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void afficherBpositif(){
        ArrayList<Donneur> list = getBpositif();
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        Object[] row = new Object[13];
 
                //Date subDate = Donneur.subtractDays(rs.getDate("dateStock"), 35 );
        for(int i = 0; i < list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getIdDonneur();
            row[2] = list.get(i).getPrenomDonneur();
            row[3] = list.get(i).getNomDonneur();
            row[4] = list.get(i).getNomGroupe();
            row[5] = list.get(i).getAdresse();
            row[6] = list.get(i).getDateNaiss();
            row[7] = list.get(i).getLieuNaiss();
            row[8] = list.get(i).getTaille();
            row[9] = list.get(i).getPoids();
            row[10] = list.get(i).getGenre();
            row[11] = list.get(i).getNumTel();
            row[12] = list.get(i).getCin();
            
            model.addRow(row); 
        }
    }
    
    //Affichage Groupe A-
    
    public ArrayList<Donneur> getBnegatif(){
        ArrayList<Donneur> usersList = new ArrayList<Donneur>();
        Connection connection = getConnection();
        String query = "SELECT * FROM donneur d, groupesanguin g WHERE d.idGroupe = g.idGroupe AND nomGroupe = 'B-'";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Donneur donneur;
            while(rs.next()){
                
                donneur = new Donneur(rs.getString("idDonneur"), rs.getString("nomDonneur"), rs.getString("prenomDonneur"), rs.getString("adresse"),rs.getString("lieuNaiss"), rs.getString("genre"), rs.getString("login"), rs.getString("password"), rs.getString("dateNaiss"), rs.getString("cin"), rs.getString("numTel"), rs.getInt("taille"), rs.getInt("poids"), rs.getInt("idGroupe"), rs.getString("nomGroupe") );
                usersList.add(donneur);
                
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void afficherBnegatif(){
        ArrayList<Donneur> list = getBnegatif();
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        Object[] row = new Object[13];
 
                //Date subDate = Donneur.subtractDays(rs.getDate("dateStock"), 35 );
        for(int i = 0; i < list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getIdDonneur();
            row[2] = list.get(i).getPrenomDonneur();
            row[3] = list.get(i).getNomDonneur();
            row[4] = list.get(i).getNomGroupe();
            row[5] = list.get(i).getAdresse();
            row[6] = list.get(i).getDateNaiss();
            row[7] = list.get(i).getLieuNaiss();
            row[8] = list.get(i).getTaille();
            row[9] = list.get(i).getPoids();
            row[10] = list.get(i).getGenre();
            row[11] = list.get(i).getNumTel();
            row[12] = list.get(i).getCin();
            
            model.addRow(row); 
        }
    }
    
    
    //Affichage Groupe A-
    
    public ArrayList<Donneur> getABnegatif(){
        ArrayList<Donneur> usersList = new ArrayList<Donneur>();
        Connection connection = getConnection();
        String query = "SELECT * FROM donneur d, groupesanguin g WHERE d.idGroupe = g.idGroupe AND nomGroupe = 'AB-'";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Donneur donneur;
            while(rs.next()){
                
                donneur = new Donneur(rs.getString("idDonneur"), rs.getString("nomDonneur"), rs.getString("prenomDonneur"), rs.getString("adresse"),rs.getString("lieuNaiss"), rs.getString("genre"), rs.getString("login"), rs.getString("password"), rs.getString("dateNaiss"), rs.getString("cin"), rs.getString("numTel"), rs.getInt("taille"), rs.getInt("poids"), rs.getInt("idGroupe"), rs.getString("nomGroupe") );
                usersList.add(donneur);
                
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void afficherABnegatif(){
        ArrayList<Donneur> list = getABnegatif();
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        Object[] row = new Object[13];
 
                //Date subDate = Donneur.subtractDays(rs.getDate("dateStock"), 35 );
        for(int i = 0; i < list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getIdDonneur();
            row[2] = list.get(i).getPrenomDonneur();
            row[3] = list.get(i).getNomDonneur();
            row[4] = list.get(i).getNomGroupe();
            row[5] = list.get(i).getAdresse();
            row[6] = list.get(i).getDateNaiss();
            row[7] = list.get(i).getLieuNaiss();
            row[8] = list.get(i).getTaille();
            row[9] = list.get(i).getPoids();
            row[10] = list.get(i).getGenre();
            row[11] = list.get(i).getNumTel();
            row[12] = list.get(i).getCin();
            
            model.addRow(row); 
        }
    }
    
    
    //Affichage Groupe A-
    
    public ArrayList<Donneur> getOnegatif(){
        ArrayList<Donneur> usersList = new ArrayList<Donneur>();
        Connection connection = getConnection();
        String query = "SELECT * FROM donneur d, groupesanguin g WHERE d.idGroupe = g.idGroupe AND nomGroupe = 'O-'";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Donneur donneur;
            while(rs.next()){
                
                donneur = new Donneur(rs.getString("idDonneur"), rs.getString("nomDonneur"), rs.getString("prenomDonneur"), rs.getString("adresse"),rs.getString("lieuNaiss"), rs.getString("genre"), rs.getString("login"), rs.getString("password"), rs.getString("dateNaiss"), rs.getString("cin"), rs.getString("numTel"), rs.getInt("taille"), rs.getInt("poids"), rs.getInt("idGroupe"), rs.getString("nomGroupe") );
                usersList.add(donneur);
                
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void afficherOnegatif(){
        ArrayList<Donneur> list = getOnegatif();
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        Object[] row = new Object[13];
 
                //Date subDate = Donneur.subtractDays(rs.getDate("dateStock"), 35 );
        for(int i = 0; i < list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getIdDonneur();
            row[2] = list.get(i).getPrenomDonneur();
            row[3] = list.get(i).getNomDonneur();
            row[4] = list.get(i).getNomGroupe();
            row[5] = list.get(i).getAdresse();
            row[6] = list.get(i).getDateNaiss();
            row[7] = list.get(i).getLieuNaiss();
            row[8] = list.get(i).getTaille();
            row[9] = list.get(i).getPoids();
            row[10] = list.get(i).getGenre();
            row[11] = list.get(i).getNumTel();
            row[12] = list.get(i).getCin();
            
            model.addRow(row); 
        }
    }
    
    //Affichage Groupe A-
    
    public ArrayList<Donneur> getABpositif(){
        ArrayList<Donneur> usersList = new ArrayList<Donneur>();
        Connection connection = getConnection();
        String query = "SELECT * FROM donneur d, groupesanguin g WHERE d.idGroupe = g.idGroupe AND nomGroupe = 'AB+'";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Donneur donneur;
            while(rs.next()){
                
                donneur = new Donneur(rs.getString("idDonneur"), rs.getString("nomDonneur"), rs.getString("prenomDonneur"), rs.getString("adresse"),rs.getString("lieuNaiss"), rs.getString("genre"), rs.getString("login"), rs.getString("password"), rs.getString("dateNaiss"), rs.getString("cin"), rs.getString("numTel"), rs.getInt("taille"), rs.getInt("poids"), rs.getInt("idGroupe"), rs.getString("nomGroupe") );
                usersList.add(donneur);
                
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void afficherABpositif(){
        ArrayList<Donneur> list = getABpositif();
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        Object[] row = new Object[13];
 
                //Date subDate = Donneur.subtractDays(rs.getDate("dateStock"), 35 );
        for(int i = 0; i < list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getIdDonneur();
            row[2] = list.get(i).getPrenomDonneur();
            row[3] = list.get(i).getNomDonneur();
            row[4] = list.get(i).getNomGroupe();
            row[5] = list.get(i).getAdresse();
            row[6] = list.get(i).getDateNaiss();
            row[7] = list.get(i).getLieuNaiss();
            row[8] = list.get(i).getTaille();
            row[9] = list.get(i).getPoids();
            row[10] = list.get(i).getGenre();
            row[11] = list.get(i).getNumTel();
            row[12] = list.get(i).getCin();
            
            model.addRow(row); 
        }
    }
    
    //Affichage Groupe A-
    
    public ArrayList<Donneur> getOpositif(){
        ArrayList<Donneur> usersList = new ArrayList<Donneur>();
        Connection connection = getConnection();
        String query = "SELECT * FROM donneur d, groupesanguin g WHERE d.idGroupe = g.idGroupe AND nomGroupe = 'O+'";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Donneur donneur;
            while(rs.next()){
                
                donneur = new Donneur(rs.getString("idDonneur"), rs.getString("nomDonneur"), rs.getString("prenomDonneur"), rs.getString("adresse"),rs.getString("lieuNaiss"), rs.getString("genre"), rs.getString("login"), rs.getString("password"), rs.getString("dateNaiss"), rs.getString("cin"), rs.getString("numTel"), rs.getInt("taille"), rs.getInt("poids"), rs.getInt("idGroupe"), rs.getString("nomGroupe") );
                usersList.add(donneur);
                
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void afficherOpositif(){
        ArrayList<Donneur> list = getOpositif();
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        Object[] row = new Object[13];
 
                //Date subDate = Donneur.subtractDays(rs.getDate("dateStock"), 35 );
        for(int i = 0; i < list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getIdDonneur();
            row[2] = list.get(i).getPrenomDonneur();
            row[3] = list.get(i).getNomDonneur();
            row[4] = list.get(i).getNomGroupe();
            row[5] = list.get(i).getAdresse();
            row[6] = list.get(i).getDateNaiss();
            row[7] = list.get(i).getLieuNaiss();
            row[8] = list.get(i).getTaille();
            row[9] = list.get(i).getPoids();
            row[10] = list.get(i).getGenre();
            row[11] = list.get(i).getNumTel();
            row[12] = list.get(i).getCin();
            
            model.addRow(row); 
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

        jButton1 = new javax.swing.JButton();
        AplusBtn = new javax.swing.JButton();
        AnegBtn = new javax.swing.JButton();
        BnegBtn = new javax.swing.JButton();
        BplusBtn = new javax.swing.JButton();
        ABplusBtn = new javax.swing.JButton();
        ABnegBtn = new javax.swing.JButton();
        OnegBtn = new javax.swing.JButton();
        OplusBtn = new javax.swing.JButton();
        vingtBtn = new javax.swing.JButton();
        quaranteBtn = new javax.swing.JButton();
        cinquanteBtn = new javax.swing.JButton();
        trenteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeDonneur = new javax.swing.JTable();
        quaranteBtn1 = new javax.swing.JButton();
        retourBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Acceuil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AplusBtn.setText("A+");
        AplusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplusBtnActionPerformed(evt);
            }
        });

        AnegBtn.setText("A-");
        AnegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnegBtnActionPerformed(evt);
            }
        });

        BnegBtn.setText("B-");
        BnegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnegBtnActionPerformed(evt);
            }
        });

        BplusBtn.setText("B+");
        BplusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BplusBtnActionPerformed(evt);
            }
        });

        ABplusBtn.setText("AB+");
        ABplusBtn.setPreferredSize(new java.awt.Dimension(43, 23));
        ABplusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABplusBtnActionPerformed(evt);
            }
        });

        ABnegBtn.setText("AB-");
        ABnegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABnegBtnActionPerformed(evt);
            }
        });

        OnegBtn.setText("O-");
        OnegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnegBtnActionPerformed(evt);
            }
        });

        OplusBtn.setText("O+");
        OplusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OplusBtnActionPerformed(evt);
            }
        });

        vingtBtn.setText("-20 ans");
        vingtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vingtBtnActionPerformed(evt);
            }
        });

        quaranteBtn.setText("-40 ans");
        quaranteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaranteBtnActionPerformed(evt);
            }
        });

        cinquanteBtn.setText("-50 ans");
        cinquanteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinquanteBtnActionPerformed(evt);
            }
        });

        trenteBtn.setText("-30 ans");
        trenteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trenteBtnActionPerformed(evt);
            }
        });

        listeDonneur.setAutoCreateRowSorter(true);
        listeDonneur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "N° donneur", "Prenom", "Nom", "Grp Sanguin", "Addresse", "DateNaiss", "LieuNaiss", "Taille", "Poids", "Sexe", "Telephone", "CIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listeDonneur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeDonneurMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeDonneur);
        if (listeDonneur.getColumnModel().getColumnCount() > 0) {
            listeDonneur.getColumnModel().getColumn(0).setResizable(false);
            listeDonneur.getColumnModel().getColumn(0).setPreferredWidth(30);
            listeDonneur.getColumnModel().getColumn(4).setResizable(false);
            listeDonneur.getColumnModel().getColumn(4).setPreferredWidth(60);
            listeDonneur.getColumnModel().getColumn(8).setResizable(false);
            listeDonneur.getColumnModel().getColumn(8).setPreferredWidth(50);
            listeDonneur.getColumnModel().getColumn(9).setResizable(false);
            listeDonneur.getColumnModel().getColumn(9).setPreferredWidth(50);
            listeDonneur.getColumnModel().getColumn(10).setResizable(false);
            listeDonneur.getColumnModel().getColumn(10).setPreferredWidth(40);
            listeDonneur.getColumnModel().getColumn(11).setResizable(false);
            listeDonneur.getColumnModel().getColumn(11).setPreferredWidth(100);
            listeDonneur.getColumnModel().getColumn(12).setResizable(false);
            listeDonneur.getColumnModel().getColumn(12).setPreferredWidth(100);
        }

        quaranteBtn1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        quaranteBtn1.setText("Envoyer Notifications");
        quaranteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaranteBtn1ActionPerformed(evt);
            }
        });

        retourBtn.setText("Retour");
        retourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(quaranteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vingtBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ABnegBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ABplusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AplusBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnegBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BplusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BnegBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OplusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OnegBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(trenteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cinquanteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(quaranteBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(retourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(retourBtn))
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BplusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AplusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AnegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BnegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OplusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ABplusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OnegBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ABnegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trenteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vingtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cinquanteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quaranteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quaranteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        sgbs.Welcome wel = new sgbs.Welcome();
        wel.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AplusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplusBtnActionPerformed
        // Pour nettoyer la table:
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        model.setRowCount(0);
        // Pour n'afficher que les donneurs selectionnés
        afficherAplus();

    }//GEN-LAST:event_AplusBtnActionPerformed

    private void AnegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnegBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        model.setRowCount(0);
        // Pour n'afficher que les donneurs selectionnés
        afficherAnegatif();
    }//GEN-LAST:event_AnegBtnActionPerformed

    private void BnegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnegBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        model.setRowCount(0);
        // Pour n'afficher que les donneurs selectionnés
        afficherBnegatif();
    }//GEN-LAST:event_BnegBtnActionPerformed

    private void BplusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BplusBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        model.setRowCount(0);
        // Pour n'afficher que les donneurs selectionnés
        afficherBpositif();

    }//GEN-LAST:event_BplusBtnActionPerformed

    private void ABplusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABplusBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        model.setRowCount(0);
        // Pour n'afficher que les donneurs selectionnés
        afficherABpositif();
    }//GEN-LAST:event_ABplusBtnActionPerformed

    private void ABnegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABnegBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        model.setRowCount(0);
        // Pour n'afficher que les donneurs selectionnés
        afficherABnegatif();
    }//GEN-LAST:event_ABnegBtnActionPerformed

    private void OnegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnegBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        model.setRowCount(0);
        // Pour n'afficher que les donneurs selectionnés
        afficherOnegatif();
    }//GEN-LAST:event_OnegBtnActionPerformed

    private void OplusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OplusBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)listeDonneur.getModel();
        model.setRowCount(0);
        // Pour n'afficher que les donneurs selectionnés
        afficherOpositif();
    }//GEN-LAST:event_OplusBtnActionPerformed

    private void vingtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vingtBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vingtBtnActionPerformed

    private void quaranteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaranteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quaranteBtnActionPerformed

    private void cinquanteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinquanteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinquanteBtnActionPerformed

    private void trenteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trenteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trenteBtnActionPerformed

    private void listeDonneurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeDonneurMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_listeDonneurMouseClicked

    private void quaranteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaranteBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quaranteBtn1ActionPerformed

    private void retourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourBtnActionPerformed
        // TODO add your handling code here
        dispose();
        MenuDonneur md = new MenuDonneur();
        md.setVisible(true);
    }//GEN-LAST:event_retourBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABnegBtn;
    private javax.swing.JButton ABplusBtn;
    private javax.swing.JButton AnegBtn;
    private javax.swing.JButton AplusBtn;
    private javax.swing.JButton BnegBtn;
    private javax.swing.JButton BplusBtn;
    private javax.swing.JButton OnegBtn;
    private javax.swing.JButton OplusBtn;
    private javax.swing.JButton cinquanteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listeDonneur;
    private javax.swing.JButton quaranteBtn;
    private javax.swing.JButton quaranteBtn1;
    private javax.swing.JButton retourBtn;
    private javax.swing.JButton trenteBtn;
    private javax.swing.JButton vingtBtn;
    // End of variables declaration//GEN-END:variables
}
