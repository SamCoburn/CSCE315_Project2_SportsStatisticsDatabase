import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.util.*;
import java.io.*;

public class Phase4GUI extends javax.swing.JFrame {
    // Global Variables Declared for Phase 3
    private String drop1Global;
    private String drop2Global;
    private String parameterGlobal;
    private boolean fileOutputGlobal = false;

    // Global Variables Declared for Phase 4
    private String q1Team1;
    private String q1Team2;
    private String q2Player1;
    private String q2Player2;
    private String q3Team;
    private String q4Conference;
    private String q4Season;
    
    public Phase4GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        drop1 = new javax.swing.JComboBox<>();
        drop2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        textBox = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        outputFile = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Question1TeamOne = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Question1Team2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Question2PlayerOne = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Question2PlayerTwo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Question3Team = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Question4Conference = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Question4Season = new javax.swing.JTextField();
        Question1Button = new javax.swing.JButton();
        Question2Button = new javax.swing.JButton();
        Question3Button = new javax.swing.JButton();
        Question4Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setText("Search For:");

        jLabel2.setText("And:");

        drop1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Player", "Team"}));
        drop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drop1ActionPerformed(evt);
            }
        });

        drop2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"------"}));
        drop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drop2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Where:");

        textBox.setText("Type Here");
        textBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBoxActionPerformed(evt);
            }
        });

        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        outputFile.setText("Output Result as File");
        outputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputFileActionPerformed(evt);
            }
        });

        jLabel3.setText("Question 1:");

        jLabel5.setText("Question 2:");

        jLabel6.setText("Question 3:");

        jLabel7.setText("Question 4:");

        jLabel8.setText("Team 1:");

        Question1TeamOne.setText("Type Here\n");
        Question1TeamOne.setToolTipText("");
        Question1TeamOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question1TeamOneActionPerformed(evt);
            }
        });

        jLabel9.setText("Team 2:");

        Question1Team2.setText("Type Here");
        Question1Team2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question1Team2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Player 1:");

        Question2PlayerOne.setText("Type Here");
        Question2PlayerOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question2PlayerOneActionPerformed(evt);
            }
        });

        jLabel11.setText("Player 2:");

        Question2PlayerTwo.setText("Type Here");
        Question2PlayerTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question2PlayerTwoActionPerformed(evt);
            }
        });

        jLabel12.setText("Team: ");

        Question3Team.setText("Type Here");
        Question3Team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question3TeamActionPerformed(evt);
            }
        });

        jLabel13.setText("Conference:");

        Question4Conference.setText("Type Here");
        Question4Conference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question4ConferenceActionPerformed(evt);
            }
        });

        jLabel14.setText("Year:");

        Question4Season.setText("Type Here");
        Question4Season.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question4SeasonActionPerformed(evt);
            }
        });

        Question1Button.setText("Search");
        Question1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question1ButtonActionPerformed(evt);
            }
        });

        Question2Button.setText("Search");
        Question2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question2ButtonActionPerformed(evt);
            }
        });

        Question3Button.setText("Search");
        Question3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question3ButtonActionPerformed(evt);
            }
        });

        Question4Button.setText("Search");
        Question4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question4ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(outputFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(Question1TeamOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Question1Team2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Question1Button))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(drop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(drop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(Question4Conference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(Question4Season, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Question4Button))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(Question3Team, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Question3Button))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(Question2PlayerOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(Question2PlayerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Question2Button))))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(drop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(drop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputFile))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(Question1TeamOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Question1Team2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question1Button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(Question2PlayerOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Question2PlayerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question2Button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(Question3Team, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question3Button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(Question4Conference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Question4Season, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question4Button))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }
    
    private void search() {
        String select = "";
        String from = "";
        String where = "";
        String sql = "";

        if (drop1Global == "Player") {
            select = "DISTINCT player.\"First Name \", player.\"Last Name\"";
            from += "player";

            if (drop2Global == "Season") {
                from += ", team";
                where = "(player.\"Team Code\" = team.\"team code\") AND (";

                String userInput = parameterGlobal;

                // Check for & or |
                if (userInput.contains("&")) {
                    String[] splitOnOr = userInput.split(" & ");
                    for (int i = 0; i < splitOnOr.length; i++) {
                        if (i == splitOnOr.length - 1) {
                            where += "team.\"season\" = " + splitOnOr[i] + ")";
                        }
                        else {
                            if(drop1Global == "Player"){
                                if(drop2Global == "Season"){
                                    select += " FROM player, team WHERE (player.\"Team Code\" = team.\"team code\") AND (";
                                    select += " team.\"season\" = " + splitOnOr[i] + ") UNION SELECT DISTINCT ";
                                    select += "player.\"First Name \", player.\"Last Name\"";
                                }
                                else{
                                        select +=" FROM player WHERE (team.\"season\" = " + splitOnOr[i] + ") UNION";
                                        select +=" SELECT DISTINCT player.\"First Name \", player.\"Last Name\"";
                                }
                            }
                        }
                    }
                }
                else if (userInput.contains("|")) {
                    String[] splitOnOr = userInput.split(" \\| ");

                    for (int i = 0; i < splitOnOr.length; i++) {
                        if (i == splitOnOr.length - 1) {
                            where += "team.\"season\" = " + splitOnOr[i] + ")";
                        }
                        else {
                            where += "team.\"season\" = " + splitOnOr[i] + ") OR (";
                        }   
                    }
                }
                else {
                    where += "team.\"season\" = " + parameterGlobal + ")";
                }
            }
            else if (drop2Global == "Team") {
                from += ", team";
                where = "(player.\"Team Code\" = team.\"team code\") AND (";

                // Check for & or |

                String userInput = parameterGlobal;

                // Check for & or |
                if (userInput.contains("&")) {
                    String[] splitOnOr = userInput.split(" & ");
                    for (int i = 0; i < splitOnOr.length; i++) {
                        if (i == splitOnOr.length - 1) {
                            where += "team.\"name\" = \'" + splitOnOr[i] + "\')";
                        }
                        else {
                                select += " FROM player, team WHERE (player.\"Team Code\" = team.\"team code\") AND (";
                                select += " team.\"name\" = \'" + splitOnOr[i] + "\') UNION SELECT DISTINCT ";
                                select += "player.\"First Name \", player.\"Last Name\"";
                        }
                    }
                }
                else if (userInput.contains("|")) {
                    String[] splitOnOr = userInput.split(" \\| ");

                    for (int i = 0; i < splitOnOr.length; i++) {
                        if (i == splitOnOr.length - 1) {
                            where += "team.\"name\" = \'" + splitOnOr[i] + "\')";
                        }
                        else {
                            where += "team.\"name\" = \'" + splitOnOr[i] + "\') OR (";
                        }   
                    }
                }
                else {
                    where += "team.\"name\" = \'" + parameterGlobal + "\')";
                }
            }

            sql = "SELECT " + select + " FROM " + from + " WHERE " + where + ";";
            System.out.println(sql);
            String firstName = "";
            String lastName = "";
            String name = "";
            try{
                //create a statement object
                Statement stmt = conn.createStatement();
                //send statement to DBMS
                ResultSet result = stmt.executeQuery(sql);
                //OUTPUT
                JOptionPane.showMessageDialog(null,"Results from Query");
                //System.out.println("______________________________________");
                while (result.next()) {
                    firstName = result.getString("First Name ");
                    lastName = result.getString("Last Name");
                    name += firstName + " " + lastName + "\n";   
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error accessing Database.");
            }

            if(outputFile.isSelected())
            {
                fileOutputGlobal=true;
                try{
                    FileWriter fw = new FileWriter("output.txt");
                    fw.write(name);
                    fw.close();
                    fileOutputGlobal= false;
                }
                catch(Exception e)
                {
                    System.out.println("Error writing to output file");
                }
                    System.out.println("Success writing to output file");
                    JOptionPane.showMessageDialog(null, "Success writing to output file");
            }
            else{
                JOptionPane.showMessageDialog(null, name);
            }
        }
        else if (drop1Global == "Team") {
            select = "DISTINCT team.\"name\"";
            from += "team";

            if (drop2Global == "Season") {
                from += ", player";
                where = "(team.\"team code\" = player.\"Team Code\") AND (";

                String userInput = parameterGlobal;

                // Check for & or |
                if (userInput.contains("&")) {
                    String[] splitOnOr = userInput.split(" & ");
                    for (int i = 0; i < splitOnOr.length; i++) {
                        if (i == splitOnOr.length - 1) {
                        where += "team.\"season\" = " + splitOnOr[i] + ")";
                        }
                        else {
                            select += " FROM team, player WHERE (team.\"team code\" = player.\"Team Code\") AND (";
                            select += "team.\"season\" = " + splitOnOr[i] + ") UNION SELECT DISTINCT";
                            select += " team.\"name\"";
                        }
                    }
                }
                else if (userInput.contains("|")) {
                    String[] splitOnOr = userInput.split(" \\| ");

                    for (int i = 0; i < splitOnOr.length; i++) {
                        if (i == splitOnOr.length - 1) {
                            where += "team.\"season\" = " + splitOnOr[i] + ")";
                        }
                        else {
                            where += "team.\"season\" = " + splitOnOr[i] + ") OR (";
                        }   
                    }
                }
                else {
                    where += "team.\"season\" = " + parameterGlobal + ")";
                }
            }
            else if (drop2Global == "Player") {
                from += ", player";
                where = "(team.\"team code\" = player.\"Team Code\") AND (";

                String userInput = parameterGlobal;

                // Check for & or |
                // Should only be able to find people based on Full Name (for now)
                if (userInput.contains("&")) {
                    // For AND, Union two separate sql queries 
                    String[] splitOnAnd = userInput.split("& ");
                    String splitOnAndString  = "";
                    for(int i = 0; i < splitOnAnd.length; i++)
                    {
                        splitOnAndString += splitOnAnd[i];
                    }
                    String[] splitOnSpace = splitOnAndString.split(" ");
                    
                    for (int i = 0; i < splitOnSpace.length; i=i+2) {
                        if (i+2 == splitOnSpace.length) {
                            where += "player.\"First Name \" = \'" + splitOnSpace[i] + "\') AND (player.\"Last Name\" = \'"+ splitOnSpace[i+1] + "\')";
                        }
                        else {
                            select += " FROM team, player WHERE (team.\"team code\" = player.\"Team Code\") AND (";
                            select += "player.\"First Name \" = \'" + splitOnSpace[i] + "\') AND (";
                            select += "player.\"Last Name\" = \'" + splitOnSpace[i+1] + "\') UNION SELECT DISTINCT"; 
                            select += " team.\"name\"";
                        }
                    }
                }
                else if (userInput.contains("|")) {
                    // For OR, add another conditional in the WHERE block
                    String[] splitOnOr = userInput.split("\\|");
                    String splitOnOrString = "";

                    for (int i = 0; i < splitOnOr.length; i++) {
                        System.out.println(splitOnOr[i]);
                        splitOnOrString += splitOnOr[i];
                    }

                    String[] splitOnSpace = splitOnOrString.split("[ ]+"); 

                    for (int i = 0; i < splitOnSpace.length; i++) {
                        if (i == splitOnSpace.length - 1) {
                            where += "player.\"Last Name\" = \'" + splitOnSpace[i] + "\'))";
                        }
                        else if (i % 2 == 0) {
                            where += "(player.\"First Name \" = \'" + splitOnSpace[i] + "\') AND (";
                        }
                        else {
                            where += "player.\"Last Name\" = \'" + splitOnSpace[i] + "\')) OR (";
                        }   
                    }
                }
                else {
                    String space = " ";
                    String[] splitOnSpace = userInput.split(space); 
                    
                    String firstName = splitOnSpace[0];
                    String lastName = splitOnSpace[1];

                    where += "player.\"First Name \" = \'" + firstName + "\') AND (player.\"Last Name\" = \'" + lastName + "\')";
                }
            }

            // if !& then do this, else do a union of two queries
            sql = "SELECT " + select + " FROM " + from + " WHERE " + where + ";";
            System.out.println(sql);
            String teamName = "";
            try{
                //create a statement object
                Statement stmt = conn.createStatement();
                //send statement to DBMS
                ResultSet result = stmt.executeQuery(sql);
                //OUTPUT
                JOptionPane.showMessageDialog(null,"Results from Query");
                //System.out.println("______________________________________");
                while (result.next()) {
                    teamName += result.getString("name") + "\n";
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error accessing Database.");
            }

            // If output too large, automatically write to a file 

            if(outputFile.isSelected())
            {
                fileOutputGlobal=true;
                try{
                    FileWriter fw = new FileWriter("output.txt");
                    fw.write(teamName);
                    fw.close();
                    fileOutputGlobal= false;
                }
                catch(Exception e)
                {
                    System.out.println("Error writing to output file");
                }
                    System.out.println("Success writing to output file");
                    JOptionPane.showMessageDialog(null, "Success writing to output file");
            }
            else{
                    JOptionPane.showMessageDialog(null, teamName);
            }
        }
    }

    private String findChain(String team1, String team2,String str)
    {
        ArrayList<String> leftmiddleList = new ArrayList<String>();
        ArrayList<String> rightmiddleList = new ArrayList<String>(); 

        StringBuilder temp = new StringBuilder ();
        temp.append(str);
        if(!victoryChain(team1, team2, temp))
        {           
            for(int i = gamecodeList.size()-1;i>=0;i--)
            {
                boolean foundVictoryChain = false;
                if(team1List.get(i).equals(team1))
                {
                    if(leftmiddleList.indexOf(team2List.get(i)) == -1)
                    {
                        leftmiddleList.add(team2List.get(i));
                    }
                    foundVictoryChain = victoryChain(team2List.get(i),team2,temp);
                    if(foundVictoryChain)
                    {
                        foundTheConnection = true;
                        return team1 + " beat " + team2List.get(i) + " "+ seasonList.get(i) + ", "+temp.toString();                        
                    }
                }
                if(team2List.get(i).equals(team2))
                {
                    if(rightmiddleList.indexOf(team1List.get(i)) == -1)
                    {
                        rightmiddleList.add(team1List.get(i));
                    }
                }
            }

            for(int i = 0;i<leftmiddleList.size();i++)
            {
                for(int j = 0; i<rightmiddleList.size();i++)
                {
                    if(victoryChain(leftmiddleList.get(i), rightmiddleList.get(j), new StringBuilder()))
                    {
                        victoryChain(team1,leftmiddleList.get(i),temp);
                        victoryChain(leftmiddleList.get(i), rightmiddleList.get(j),temp);
                        victoryChain(rightmiddleList.get(j), team2,temp);
                        foundTheConnection = true;
                        return temp.toString();
                    }
                }
            }

            for(int i = 0;i<leftmiddleList.size();i++)
            {
                for(int j = 0; i<rightmiddleList.size();i++)
                {      
                    victoryChain(team1,leftmiddleList.get(i),temp);
                    temp.append(findChain(leftmiddleList.get(i),rightmiddleList.get(i),temp.toString()));
                    victoryChain(rightmiddleList.get(i),team2,temp);

                    if(foundTheConnection)
                    {
                        foundTheConnection = true;
                        return temp.toString();
                    }
                    else
                    {
                        temp = new StringBuilder();
                    }
                }
            }
            return "No Connection Exists";

        }
        else
        {
            foundTheConnection = true;
            return temp.toString();
        }
    }
    private boolean victoryChain(String team1, String team2, StringBuilder output)
    {
        int index = team1List.lastIndexOf(team1);
        boolean found = false;
        while(index != -1)
        {
            if(team2List.get(index).equals(team2))
            {
                output.append(team1 + " beat " + team2 + " " + seasonList.get(index)+ " ");
                found = true;
                break;
            }
            else
            {
                team1List.set(index,"nullvalue");
                index = team1List.lastIndexOf(team1);
            }            
        }

        index = team1List.lastIndexOf("nullvalue");
        while(index != -1)
        {
            team1List.set(index,team1);
            index = team1List.lastIndexOf("nullvalue");
        }

        if(found)
        {
            return true;          
        }
        return false;
    }
    private ArrayList<Long> gamecodeList = new ArrayList<Long>();
    private ArrayList<String> team1List = new ArrayList<String>();
    private ArrayList<String> team2List = new ArrayList<String>();
    private ArrayList<Integer> offptsList = new ArrayList<Integer>();
    private ArrayList<Integer> defptsList = new ArrayList<Integer>();       
    private ArrayList<String> seasonList = new ArrayList<String>();
    private boolean foundTheConnection = false;

    private void questionOne() 
    {
        System.out.println("Searching for connection: "+ q1Team1 + " vs " + q1Team2);
        //creating the arraylists
        if(gamecodeList.size()==0)
        {
            String querry = "WITH CTE (\"Game Code \", \"name\", \"conference code\", \"name dup\", \"conference code dup\", \"Offense Points\",\"Defense Points\", \"Season\", DuplicateCount) ";
            querry +="AS (SELECT \"Game Code \", \"name\", \"conference code\", \"name dup\", \"conference code dup\", \"Offense Points\",\"Defense Points\", \"Season\",";
            querry +="ROW_NUMBER() OVER(PARTITION BY \"Game Code \", \"name\", \"name dup\",\"Season\" ORDER BY \"Offense Points\" DESC,\"Defense Points\" DESC) AS DuplicateCount FROM gameinfo3) "; 
            querry +="SELECT * from CTE Where DuplicateCount = 1 ORDER BY \"Season\" ASC,\"Game Code \"ASC;";

            System.out.println(querry);
            String output = "";
            //parrellel arraylist

            try{
                //create a statement object
                Statement stmt = conn.createStatement();
                //send statement to DBMS
                ResultSet result = stmt.executeQuery(querry);
                //OUTPUT
                JOptionPane.showMessageDialog(null,"Results from Query");
                System.out.println("==========================================");
                String gamecode = "";
                String team1 = "";
                String team2 = "";
                String offpts = "";
                String defpts = "";
                String season = "";

                while (result.next()) 
                {    
                    gamecode = result.getString("Game Code ");
                    team1 = result.getString("name");
                    team2 = result.getString("name dup");
                    offpts = result.getString("Offense Points");
                    defpts = result.getString("Defense Points");
                    season = result.getString("Season");

                    if(Integer.parseInt(offpts)<Integer.parseInt(defpts))
                    {      
                        gamecodeList.add(Long.parseLong(gamecode));
                        team1List.add(team2);
                        team2List.add(team1);
                        offptsList.add(Integer.parseInt(defpts));
                        defptsList.add(Integer.parseInt(offpts));
                        seasonList.add(season);
                        output += String.format("%-30s %-25s %-25s %-5s %-5s %-4s\n",gamecode,team2,team1,defpts,offpts,season);
                    }
                    else
                    {                   
                        gamecodeList.add(Long.parseLong(gamecode));
                        team1List.add(team1);
                        team2List.add(team2);
                        offptsList.add(Integer.parseInt(offpts));
                        defptsList.add(Integer.parseInt(defpts));
                        seasonList.add(season);
                        output += String.format("%-30s %-25s %-25s %-5s %-5s %-4s\n",gamecode,team1,team2,offpts,defpts,season);
                    }
                }
                //System.out.println(output); //prints everything
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error accessing Database.");
            }            
            for(int i = gamecodeList.size()-1;i>0;i--)
            {
                //first checks if gamecode, season, teamnames are the same
                if( gamecodeList.get(i).equals(gamecodeList.get(i-1)) && seasonList.get(i).equals(seasonList.get(i-1)) && team1List.get(i).equals(team1List.get(i-1)) && team2List.get(i).equals(team2List.get(i-1)))
                {
                    //now checking for duplicates
                    if(offptsList.get(i) == offptsList.get(i-1) && defptsList.get(i) == defptsList.get(i-1))
                    {
                        gamecodeList.remove(i);
                        team1List.remove(i);
                        team2List.remove(i);
                        offptsList.remove(i);
                        defptsList.remove(i);
                        seasonList.remove(i);
                    }
                    else if(offptsList.get(i) >= offptsList.get(i-1) && defptsList.get(i) >= defptsList.get(i-1))
                    {
                        //delete i-1
                        gamecodeList.remove(i-1);
                        team1List.remove(i-1);
                        team2List.remove(i-1);
                        offptsList.remove(i-1);
                        defptsList.remove(i-1);
                        seasonList.remove(i-1);
                    }
                    else if(offptsList.get(i) <= offptsList.get(i-1) && defptsList.get(i) <= defptsList.get(i-1))
                    {
                        //delete i
                        gamecodeList.remove(i);
                        team1List.remove(i);
                        team2List.remove(i);
                        offptsList.remove(i);
                        defptsList.remove(i);
                        seasonList.remove(i);
                    }
                }
            }  
            //removes all the ties 
            for(int i = gamecodeList.size()-1;i>0;i--)
            {
                if(offptsList.get(i) == defptsList.get(i))
                {
                    gamecodeList.remove(i);
                    team1List.remove(i);
                    team2List.remove(i);
                    offptsList.remove(i);
                    defptsList.remove(i);
                    seasonList.remove(i);                   
                }
            }

            String writeToFile = "";
            for(int i =0;i<gamecodeList.size();i++)
            {
                writeToFile += gamecodeList.get(i) + "," + team1List.get(i) + "," + team2List.get(i) + "," + offptsList.get(i) + "," + defptsList.get(i) + "," + seasonList.get(i)+"\n";
            }            
            try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

                writer.write(writeToFile);
            } 
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        String output = "";
        //now checking the teams for connection
        if(team1List.indexOf(q1Team1) == -1 && team2List.indexOf(q1Team1) == -1)
        {
            output = "Team 1 name is invalid";
            System.out.println("Team 1 name is invalid");
        }
        else if(team1List.indexOf(q1Team2) == -1 && team2List.indexOf(q1Team2) == -1)
        {
            output = "Team 2 name is invalid";
            System.out.println("Team 2 name is invalid");
        }
        else 
        {
            //both teams are valid
            boolean found = false;

            //checks for direct connection
            for(int i = gamecodeList.size()-1;i>=0;i--)
            {
                if(team1List.get(i).equals(q1Team1) && team2List.get(i).equals(q1Team2))
                {
                    output = q1Team1+" beat "+q1Team2 + " " + seasonList.get(i);
                    System.out.println(q1Team1+" beat "+q1Team2 + " " + seasonList.get(i));
                    found = true;
                    break;
                }
            }
            if(!found)
            {            
                //checks for indirect connection
                output = findChain(q1Team1,q1Team2,"");
                System.out.println(output);            
            }
            //System.out.println(gamecodeList.size());
            
        }
        foundTheConnection = false;
        JOptionPane.showMessageDialog(null,output);


        

    }


    private void questionTwo() {

    }

    private void questionThree() {

    }

    private void questionFour() {

    }

    private void textBoxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String parameter = textBox.getText();
        parameterGlobal = parameter;
    }                                       

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        search();
    }                                            

    private void drop1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        javax.swing.JComboBox combo = (javax.swing.JComboBox) evt.getSource();
        String drop1 = (String) combo.getSelectedItem();

        drop2.removeAllItems();

        if (drop1 == "Player") {
            drop1Global = "Player";
            drop2.addItem("Season");
            drop2.addItem("Team");
        }
        else if (drop1 == "Team") {
            drop1Global = "Team";
            drop2.addItem("Season"); 
            drop2.addItem("Player");
        }
    }                                     

    private void drop2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        javax.swing.JComboBox combo = (javax.swing.JComboBox) evt.getSource();
        String drop2 = (String) combo.getSelectedItem();
        drop2Global = drop2;
    }                                     

    private void outputFileActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        fileOutputGlobal = outputFile.isSelected();
    }                                          

    private void Question1TeamOneActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        String team = Question1TeamOne.getText();
        q1Team1 = team;
    }                                                

    private void Question1Team2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        String team = Question1Team2.getText();
        q1Team2 = team;
    }                                              

    private void Question2PlayerOneActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        String player = Question2PlayerOne.getText();
        q2Player1 = player;
    }                                                  

    private void Question2PlayerTwoActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        String player = Question2PlayerTwo.getText();
        q2Player2 = player;
    }                                                  

    private void Question3TeamActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        String team = Question3Team.getText();
        q3Team = team;
    }                                             

    private void Question4ConferenceActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
        String conference = Question4Conference.getText();
        q4Conference = conference;
    }                                                   

    private void Question4SeasonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        String season = Question4Season.getText();
        q4Season = season;
    }                                               

    private void Question1ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        questionOne();
    }                                               

    private void Question2ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        questionTwo();
    }                                               

    private void Question3ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        questionThree();
    }                                               

    private void Question4ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        questionFour();
    }                                               

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
            java.util.logging.Logger.getLogger(Phase4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Phase4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Phase4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Phase4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Open connection with the database
        conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://csce-315-db.engr.tamu.edu/team19_907", "joeychou99", "727003256");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }//end try catch
        JOptionPane.showMessageDialog(null,"Opened database successfully");


        // Create the GUI instance
        Phase4GUI gui = new Phase4GUI();
        gui.setTitle("Sports Statistics Database");
        gui.setVisible(true);

        // Once the GUI is closed, disconnect from the database
        gui.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent window_event) {
                try {
                    conn.close();
                    JOptionPane.showMessageDialog(null,"Closed database successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Error closing database");
                }
                System.exit(0);
            }
        });
    }

    // Variables declaration - do not modify   
    private static Connection conn; // Added manually, not through Netbeans                   
    private javax.swing.JButton Question1Button;
    private javax.swing.JTextField Question1Team2;
    private javax.swing.JTextField Question1TeamOne;
    private javax.swing.JButton Question2Button;
    private javax.swing.JTextField Question2PlayerOne;
    private javax.swing.JTextField Question2PlayerTwo;
    private javax.swing.JButton Question3Button;
    private javax.swing.JTextField Question3Team;
    private javax.swing.JButton Question4Button;
    private javax.swing.JTextField Question4Conference;
    private javax.swing.JTextField Question4Season;
    private javax.swing.JComboBox<String> drop1;
    private javax.swing.JComboBox<String> drop2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox outputFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField textBox;
    // End of variables declaration                   
}