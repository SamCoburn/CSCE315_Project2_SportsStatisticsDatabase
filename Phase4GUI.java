import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.util.*;
import java.io.*;

/*
    TERMINAL COMMANDS TO COMPILE AND RUN:
    javac -cp .:postgresql-42.2.8.jar Phase4GUI.java
    java -cp .:postgresql-42.2.8.jar Phase4GUI
*/

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
            int lineCount = 0;
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
                    lineCount++;
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error accessing Database.");
            }

            if ((lineCount > 20) & !(outputFile.isSelected())) {
                try{
                    FileWriter fw = new FileWriter("output.txt");
                    fw.write(name);
                    fw.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error writing to output file");
                }
                    System.out.println("Query Output Too Large To Display");
                    System.out.println("Writing Query Output To File");
                    JOptionPane.showMessageDialog(null, "Query Output Too Large To Display \n Writing Query Output To File");
                    JOptionPane.showMessageDialog(null, "Success writing to output file");
            }
            else if(outputFile.isSelected())
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
            int lineCount = 0;
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
                    lineCount++;
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error accessing Database.");
            }

            // If output too large, automatically write to a file
            if ((lineCount > 20) & !(outputFile.isSelected())) {
                try{
                    FileWriter fw = new FileWriter("output.txt");
                    fw.write(teamName);
                    fw.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error writing to output file");
                }
                    System.out.println("Query Output Too Large To Display");
                    System.out.println("Writing Query Output To File");
                    JOptionPane.showMessageDialog(null, "Query Output Too Large To Display \n Writing Query Output To File");
                    JOptionPane.showMessageDialog(null, "Success writing to output file");
            }
            else if(outputFile.isSelected())
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

    private ArrayList<Long> q2gamecodeList = new ArrayList<Long>();
    private ArrayList<String> q2team1codeList = new ArrayList<String>();
    private ArrayList<String> q2team2codeList = new ArrayList<String>();
    private ArrayList<String> q2team1List = new ArrayList<String>();
    private ArrayList<String> q2team2List = new ArrayList<String>();
    private ArrayList<String> q2seasonList = new ArrayList<String>();
    
    private ArrayList<Long> q2playercodeList = new ArrayList<Long>();
    private ArrayList<String> q2playerfirstnameList = new ArrayList<String>();
    private ArrayList<String> q2playerlastnameList = new ArrayList<String>();
    private ArrayList<String> q2playerteamcodeList = new ArrayList<String>();
    private ArrayList<String> q2playerhometownList = new ArrayList<String>();
    private ArrayList<String> q2playerhomestateList = new ArrayList<String>();
    private ArrayList<String> q2playerseasonList = new ArrayList<String>();

    private ArrayList<String> q2teamcodeList = new ArrayList<String>();
    private ArrayList<String> q2teamnameList = new ArrayList<String>();
    
    private String findConnection(String p1firstName, String p1lastName, String p2firstName, String p2lastName)
    {
        String output = "";

        //finding a hometown match
        for(int i = q2playercodeList.size()-1;i>=0;i--)
        {
            if(q2playerfirstnameList.get(i).equals(p1firstName) && q2playerlastnameList.get(i).equals(p1lastName) && !q2playerhometownList.get(i).equals("Null"))
            {
                for(int j = q2playercodeList.size()-1;i>=0;i--)
                {
                    if(q2playerfirstnameList.get(i).equals(p2firstName) && q2playerlastnameList.get(i).equals(p2lastName) && !q2playerhomestateList.get(i).equals("Null") && q2playerhomestateList.get(i).equals(q2playerhomestateList.get(j)) && q2playerhometownList.get(i).equals(q2playerhometownList.get(j)))
                    {
                        output = p1firstName + " " + p1lastName +" and " + p2firstName + " " + p2lastName + " have the same HomeTown "+ q2playerhometownList.get(i) + " " + q2playerhomestateList.get(i) + "\n";
                        break;
                    }
                }
            }
            else if(q2playerfirstnameList.get(i).equals(p2firstName) && q2playerlastnameList.get(i).equals(p2lastName) && !q2playerhometownList.get(i).equals("Null"))
            {
                for(int j = q2playercodeList.size()-1;i>=0;i--)
                {
                    if(q2playerfirstnameList.get(i).equals(p1firstName) && q2playerlastnameList.get(i).equals(p1lastName) && !q2playerhomestateList.get(i).equals("Null") && q2playerhomestateList.get(i).equals(q2playerhomestateList.get(j)) && q2playerhometownList.get(i).equals(q2playerhometownList.get(j)))
                    {
                        output += p1firstName + " " + p1lastName +" and " + p2firstName + " " + p2lastName + " have the same HomeTown "+ q2playerhometownList.get(i) + " " + q2playerhomestateList.get(i) + "\n";
                        break;
                    }
                }
            }
        }

        //finding matching teams
        for(int i = q2playercodeList.size()-1;i>=0;i--)
        { 
            if(q2playerfirstnameList.get(i).equals(p1firstName) && q2playerlastnameList.get(i).equals(p1lastName))
            {
                for(int j = q2playercodeList.size()-1;i>=0;i--)
                {
                    if(q2playerfirstnameList.get(i).equals(p2firstName) && q2playerlastnameList.get(i).equals(p2lastName) && q2playerteamcodeList.get(i).equals(q2playerteamcodeList.get(j)))
                    {                                           
                        output += p1firstName + " " + p1lastName +" and " + p2firstName + " " + p2lastName + " played on the same team " + q2teamnameList.get(q2teamcodeList.indexOf(q2playerteamcodeList.get(i)))+"\n";
                        break;
                    }
                }
            }
            else if(q2playerfirstnameList.get(i).equals(p2firstName) && q2playerlastnameList.get(i).equals(p2lastName))
            {
                for(int j = q2playercodeList.size()-1;i>=0;i--)
                {
                    if(q2playerfirstnameList.get(i).equals(p1firstName) && q2playerlastnameList.get(i).equals(p1lastName) && q2playerteamcodeList.get(i).equals(q2playerteamcodeList.get(j)))
                    {               
                        output += p1firstName + " " + p1lastName +" and " + p2firstName + " " + p2lastName + " played on the same team " + q2teamnameList.get(q2teamcodeList.indexOf(q2playerteamcodeList.get(i)))+"\n";
                        break;
                    }
                }                
            }
        }

        System.out.println("FINDING DIRECT CONNECTION");
        //direct game played
        for(int i = q2playercodeList.size()-1;i>=0;i--)
        {
            if(q2playerfirstnameList.get(i).equals(p1firstName) && q2playerlastnameList.get(i).equals(p1lastName))
            {
                for(int j = q2playercodeList.size()-1;i>=0;i--)
                {
                    if(q2playerfirstnameList.get(i).equals(p2firstName) && q2playerlastnameList.get(i).equals(p2lastName) && !q2playerteamcodeList.get(i).equals(q2playerteamcodeList.get(j)) && q2playerseasonList.get(i).equals(q2playerseasonList.get(j)) && PlayedEachOther(q2playerteamcodeList.get(i),q2playerteamcodeList.get(j),q2playerseasonList.get(i))!=-1 )
                    {
                        output += p1firstName + " " + p1lastName +" and " + p2firstName + " " + p2lastName + " played against each other in "+ q2playerseasonList.get(i) + ", "+ q2teamnameList.get(q2teamcodeList.indexOf(q2playerteamcodeList.get(i))) +" vs "+ q2teamnameList.get(q2teamcodeList.indexOf(q2playerteamcodeList.get(j)))  + "\n";
                        break;
                    }

                }
            }
            else if(q2playerfirstnameList.get(i).equals(p2firstName) && q2playerlastnameList.get(i).equals(p2lastName))
            {
                for(int j = q2playercodeList.size()-1;i>=0;i--)
                {
                    if(q2playerfirstnameList.get(i).equals(p1firstName) && q2playerlastnameList.get(i).equals(p1lastName) && !q2playerteamcodeList.get(i).equals(q2playerteamcodeList.get(j)) && q2playerseasonList.get(i).equals(q2playerseasonList.get(j)) && PlayedEachOther(q2playerteamcodeList.get(i),q2playerteamcodeList.get(j),q2playerseasonList.get(i)) !=-1)
                    {
                        output += p1firstName + " " + p1lastName +" and " + p2firstName + " " + p2lastName + " played against each other in "+ q2playerseasonList.get(i) + ", "+ q2teamnameList.get(q2teamcodeList.indexOf(q2playerteamcodeList.get(i))) +" vs "+ q2teamnameList.get(q2teamcodeList.indexOf(q2playerteamcodeList.get(j)))  + "\n";
                        break;                       
                    }
                }                
            }
        }
        if(output == "")
        {
            return "No Connection Found";
        }
        else
        {
            return output;
        }
    }

    private int PlayedEachOther(String teamcode1,String teamcode2,String season)
    {
        if(q2team1codeList.indexOf(teamcode1) != -1 && q2team2codeList.indexOf(teamcode2) != -1 && q2team2codeList.indexOf(teamcode1) !=-1 && q2team2codeList.indexOf(teamcode1) != -1)
        {
            for(int i = q2gamecodeList.size()-1; i>=0;i--)
            {   
                if(q2seasonList.get(i).equals(season))
                {
                    if( (q2team1codeList.get(i).equals(teamcode1) && q2team2codeList.get(i).equals(teamcode2) ) || (q2team1codeList.get(i).equals(teamcode2) && q2team2codeList.get(i).equals(teamcode1)))
                    {
                        return i;
                    }
                }
            }           
        }
        return -1;
    }

    private void questionTwo()
    {
        q2playercodeList.clear();
        q2playerfirstnameList.clear();
        q2playerlastnameList.clear();
        q2playerteamcodeList.clear();
        q2playerhometownList.clear();
        q2playerhomestateList.clear();
        q2playerseasonList.clear();

        System.out.println("Searching for connection: "+ q2Player1 + " vs " + q2Player2);
        if(q2gamecodeList.size() == 0)
        {
            String querry = "WITH CTE (\"Game Code \", \"name\", \"name dup\", \"Offense Team Code\", \"Defense Team Code\", \"Season\", DuplicateCount)";
            querry +="AS (SELECT \"Game Code \", \"name\", \"name dup\", \"Offense Team Code\", \"Defense Team Code\", \"Season\",";
            querry +="ROW_NUMBER() OVER(PARTITION BY \"Game Code \", \"name\", \"name dup\",\"Season\" ORDER BY \"Offense Points\" DESC,\"Defense Points\" DESC) AS DuplicateCount ";
            querry +="FROM gameinfo3) SELECT * from CTE Where DuplicateCount = 1 ORDER BY \"Season\" ASC, \"Game Code \" ASC;";
        
            System.out.println(querry);
            //parrellel arraylist
        
            try{
                //create a statement object
                Statement stmt = conn.createStatement();
                //send statement to DBMS
                ResultSet result = stmt.executeQuery(querry);
                //OUTPUT
                JOptionPane.showMessageDialog(null,"Results from Query");
                System.out.println("==========================================");

                while (result.next())
                {
                    q2gamecodeList.add(Long.parseLong(result.getString("Game Code ")));
                    q2team1codeList.add(result.getString("Offense Team Code"));
                    q2team2codeList.add(result.getString("Defense Team Code"));
                    q2team1List.add(result.getString("name"));
                    q2team2List.add(result.getString("name dup"));
                    q2seasonList.add(result.getString("Season"));
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error accessing Database.");
            }
            for(int i = q2gamecodeList.size()-1;i>0;i--)
            {
                //first checks if gamecode same
                if( q2gamecodeList.get(i).equals(q2gamecodeList.get(i-1)) )
                {
                    //now checking for duplicates
                    q2gamecodeList.remove(i);
                    q2team1codeList.remove(i);
                    q2team2codeList.remove(i);
                    q2team1List.remove(i);
                    q2team2List.remove(i);
                    q2seasonList.remove(i);
                }
            }
            String writeToFile = "";
            for(int i =0;i<q2gamecodeList.size();i++)
            {
                writeToFile += q2gamecodeList.get(i) + "," + q2team1codeList.get(i) + "," + q2team2codeList.get(i) + "," + q2team1List.get(i) + "," + q2team2List.get(i) + "," + q2seasonList.get(i)+"\n";
            }
            try (PrintWriter writer = new PrintWriter(new File("test2.csv"))) {

                writer.write(writeToFile);
            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        if(q2teamcodeList.size() == 0)
        {
            String querry = "SELECT \"team code\", \"name\" FROM team;";
            System.out.println(querry);
            //parrellel arraylist
        
            try{
                //create a statement object
                Statement stmt = conn.createStatement();
                //send statement to DBMS
                ResultSet result = stmt.executeQuery(querry);
                //OUTPUT
                JOptionPane.showMessageDialog(null,"Results from Query");
                System.out.println("==========================================");

                while (result.next())
                {
                    q2teamcodeList.add(result.getString("team code"));
                    q2teamnameList.add(result.getString("name"));
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error accessing Database.");
            }
        }

        String p1firstName = q2Player1.substring(0,q2Player1.indexOf(" "));
        String p1lastName = q2Player1.substring(q2Player1.indexOf(" ")+1);
        String p2firstName = q2Player2.substring(0,q2Player2.indexOf(" "));
        String p2lastName = q2Player2.substring(q2Player2.indexOf(" ")+1);
        boolean validNames = false;
        String querry = "SELECT \"Player Code\", \"Team Code\",\"First Name \",\"Last Name\", \"Home Town\", \"Home State\",\"Season\" FROM player ";
        querry+="WHERE (\"First Name \" = \'"+ p1firstName + "\' AND \"Last Name\" = \'" + p1lastName + "\') OR (\"First Name \" = \'"+ p2firstName + "\' AND \"Last Name\" = \'" + p2lastName + "\')";
        querry+="ORDER BY \"Season\" ASC;";
        System.out.println(querry);
        String writeToFile = "";
        try{
            //create a statement object
            Statement stmt = conn.createStatement();
            //send statement to DBMS
            ResultSet result = stmt.executeQuery(querry);
            //OUTPUT
            JOptionPane.showMessageDialog(null,"Results from Query");
            System.out.println("========================================================");
            while (result.next())
            {
                q2playercodeList.add(Long.parseLong(result.getString("Player Code")));
                writeToFile += result.getString("Player Code") + ",";
                            
                q2playerteamcodeList.add(result.getString("Team Code"));
                writeToFile += result.getString("Team Code") + ",";                   
                
                if(q2teamcodeList.indexOf(Long.parseLong(result.getString("Team Code")))!=-1)
                {
                    writeToFile += q2teamnameList.get(q2teamcodeList.indexOf(Long.parseLong(result.getString("Team Code")))) + ",";
                }
                else 
                {
                    writeToFile += "No team info,";
                }
    
                q2playerfirstnameList.add(result.getString("First Name "));
                writeToFile += result.getString("First Name ") + ",";
                
                q2playerlastnameList.add(result.getString("Last Name"));
                writeToFile += result.getString("Last Name") + ",";

                q2playerseasonList.add(result.getString("Season"));
                writeToFile += result.getString("Season") + ",";
                
                if(result.getString("Home Town") == null)
                {
                    q2playerhometownList.add("Null");
                    writeToFile += "Null,";
                }
                else 
                {
                    q2playerhometownList.add(result.getString("Home Town"));
                    writeToFile += result.getString("Home Town") + ",";
                }
                if(result.getString("Home State")==null)
                {
                    q2playerhomestateList.add("Null");
                    writeToFile += "Null,";
                }
                else 
                {
                    q2playerhomestateList.add(result.getString("Home State"));
                    writeToFile += result.getString("Home State") + ",";
                }
                writeToFile +="\n";
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error accessing Database. x2");
        }
        try (PrintWriter writer = new PrintWriter(new File("test3.csv"))) 
        {
            writer.write(writeToFile);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Number of teams "+q2gamecodeList.size());
        System.out.println("Number of unique players "+q2playercodeList.size());
        //may not cover all cases 
        String output = "";
        if(q2playerfirstnameList.indexOf(p1firstName) != -1 && q2playerfirstnameList.indexOf(p2firstName) != -1 && q2playerlastnameList.indexOf(p2lastName) != -1 && q2playerlastnameList.indexOf(p1lastName) != -1)
        {
            validNames = true;
        }

        if(validNames)
        {
            System.out.println("Ouput:\n"+findConnection(p1firstName, p1lastName, p2firstName, p2lastName));
            output = findConnection(p1firstName, p1lastName, p2firstName, p2lastName);
        }
        else
        {
            System.out.println("Invalid player names");
            output = "Invalid player names";
        }
        JOptionPane.showMessageDialog(null,output);
    }

    private void questionThree() {
        String team = q3Team;

        // Write command to get team code from database
        String teamCodeCommand = "SELECT DISTINCT \"team code\" FROM team WHERE (\"name\" = \'" + team +"\');";
        String teamCode = "";
        try{
            //create a statement object
            Statement stmt = conn.createStatement();
            //send statement to DBMS
            ResultSet result = stmt.executeQuery(teamCodeCommand);
            //OUTPUT
            //System.out.println("______________________________________");
            while (result.next()) {
                teamCode = result.getString("team code");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error accessing Database.");
        }

        // Write command to get game codes from database
        String gameCodeCommand = "SELECT DISTINCT \"Game Code\" FROM game WHERE (\"Home Team Code\" = " + teamCode + ") OR (\"Visit Team Code\" = " + teamCode + ");";
        String gameCode = "";
        try{
            //create a statement object
            Statement stmt = conn.createStatement();
            //send statement to DBMS
            ResultSet result = stmt.executeQuery(gameCodeCommand);
            //System.out.println("______________________________________");
            while (result.next()) {
                gameCode += result.getString("game code") + " ";
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error accessing Database.");
        }
        String[] codes = gameCode.split(" "); // Create an array of game codes

        // Get all of the team codes (excluding the searched team) for each individual game code
        String opposingTeamsResult = "";
        for (int i = 0; i < codes.length; i++) {
            String opposingTeamCodeCommand = "SELECT DISTINCT \"Visit Team Code\", \"Home Team Code\" FROM game WHERE (\"Game Code\" = " + codes[i] + ");";
            try{
                //create a statement object
                Statement stmt = conn.createStatement();
                //send statement to DBMS
                ResultSet result = stmt.executeQuery(opposingTeamCodeCommand);
                //OUTPUT
                //System.out.println("______________________________________");
                while (result.next()) {
                    String visitTeamCode = result.getString("Visit Team Code");
                    String homeTeamCode = result.getString("Home Team Code");

                    if (!visitTeamCode.equals(teamCode)) {
                        opposingTeamsResult += visitTeamCode + " ";
                    }
                    if (!homeTeamCode.equals(teamCode)) {
                        opposingTeamsResult += homeTeamCode + " ";
                    }
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error accessing Database.");
            }
        }
        String[] opposingTeams = opposingTeamsResult.split(" ");

        // Find all the rushing yards for each team against the searched team
        String rushYardsResult = "";
        for (int i = 0; i < opposingTeams.length; i++) {
            String rushYardsCommand = "SELECT DISTINCT \"Rush Yard\" FROM \"Team Game Statistics\" WHERE (\"Game Code\" = " + codes[i] + ") AND (\"Team Code\" = " + opposingTeams[i] + ");";
            try{
                //create a statement object
                Statement stmt = conn.createStatement();
                //send statement to DBMS
                ResultSet result = stmt.executeQuery(rushYardsCommand);
                //OUTPUT
                //System.out.println("______________________________________");
                while (result.next()) {
                    rushYardsResult += result.getString("Rush Yard") + " ";
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error accessing Database.");
            }
        }
        String[] rushYards = rushYardsResult.split(" ");

        // Find the team with the max rush yards
        int maxIndex = 0;
        int maxRushYards = 0;
        for (int i = 0; i < rushYards.length; i++) {
            int currentYards = Integer.valueOf(rushYards[i]);
            if (currentYards > maxRushYards) {
                maxRushYards = currentYards;
                maxIndex = i;
            }
        }
        String maxTeam = opposingTeams[maxIndex];

        // Get the names of the teams involved in the final statement and the year the game was played
        String maxTeamNameCommand = "SELECT DISTINCT \"name\" FROM \"team\" WHERE (\"team code\" = " + maxTeam + ");";
        String searchTeamNameCommand = "SELECT DISTINCT \"name\" FROM \"team\" WHERE (\"team code\" = " + teamCode + ");";
        String maxSeasonCommand = "SELECT DISTINCT \"Season\" FROM \"game\" WHERE (\"Game Code\" = " + codes[maxIndex] + ");";
        String maxTeamName = "";
        String searchTeamName = "";
        String maxSeason = "";

        try{
            //create a statement object
            Statement stmt = conn.createStatement();
            //send statement to DBMS
            ResultSet result = stmt.executeQuery(maxTeamNameCommand);
            //OUTPUT
            //System.out.println("______________________________________");
            while (result.next()) {
                maxTeamName = result.getString("name");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error accessing Database.");
        }
        try{
            //create a statement object
            Statement stmt = conn.createStatement();
            //send statement to DBMS
            ResultSet result = stmt.executeQuery(searchTeamNameCommand);
            //OUTPUT
            //System.out.println("______________________________________");
            while (result.next()) {
                searchTeamName = result.getString("name");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error accessing Database.");
        }
        try{
            //create a statement object
            Statement stmt = conn.createStatement();
            //send statement to DBMS
            ResultSet result = stmt.executeQuery(maxSeasonCommand);
            //OUTPUT
            //System.out.println("______________________________________");
            while (result.next()) {
                maxSeason = result.getString("Season");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error accessing Database.");
        }

        // Display query results to the user of the application
        JOptionPane.showMessageDialog(null, maxTeamName + " had the most rushing yards against " + searchTeamName + " in " + maxSeason + " with " + maxRushYards + " yards.");
    }

    private void questionFour() {
    	//q4Conference and q4Season are global strings of the user inputs
    	
    	//get conference code of searched conference and season
    	String getcode = "SELECT code FROM public.conference WHERE season = " +q4Season+ " and name = \'" + q4Conference + "\';";
        String  code = "";
        try{
            //create a statement object
            Statement stmt = conn.createStatement();
            //send statement to DBMS
            ResultSet result = stmt.executeQuery(getcode);
            //OUTPUT
            while (result.next()) {
                code += result.getString("code");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error accessing conference codes.");
        }
        
        System.out.println("Calculating Home Team Advantage...");
    	
       
      //grab all teams from season and conference
    	String getHomeTeams = "SELECT DISTINCT game.\"Home Team Code\" FROM team JOIN game on team.\"team code\" = game.\"Home Team Code\" and team.season = game.\"Season\" where season = " +q4Season+ " and \"conference code\" = " +code+ " order by \"Home Team Code\";" ;
    	//System.out.println(getHomeTeams);
    	String  HomeTeamCodes = "";
    	String  numPlays = "";
    	String attendance = "";
    	String points = "";
    	String rushYards = "";
        try{
            //create a statement object
            Statement stmt = conn.createStatement();
            //send statement to DBMS
            ResultSet result = stmt.executeQuery(getHomeTeams);
            //OUTPUT
            //System.out.println("______________________________________");
            if(!result.next()) {
            	throw new Exception("Error");
            }
            while (result.next()) {
            	//System.out.println(result.getInt("Home Team Code"));
            	//find total number of plays for each team during home games
            	String getNumPlays = "select count(play.\"Play Number\") from play join game on play.\"Game Code \" = game.\"Game Code\" where game.\"Home Team Code\" = " +result.getString("Home Team Code")+ " and game.\"Season\" = " +q4Season+ ";";
            	//System.out.println(getNumPlays);
            	
                try{
                    //create a statement object
                    Statement stmt2 = conn.createStatement();
                    //send statement to DBMS
                    ResultSet result2 = stmt2.executeQuery(getNumPlays);
                    //OUTPUT
                    //System.out.println("______________________________________");
                    while (result2.next()) {
                    	//System.out.println(result.getInt("Home Team Code"));
                    	numPlays += result2.getString("count") + " ";
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Error accessing number of plays.");
                }
                
                //find total home game attendance
                String getAttendance = "select sum(\"game statistics\".\"Attendance\") from game join \"game statistics\" on game.\"Game Code\" = \"game statistics\".\"Game Code\" where game.\"Home Team Code\" = " +result.getString("Home Team Code")+ " and \"game statistics\".\"Season\" = " +q4Season+";";
                //System.out.println(getAttendance);
                try{
                    //create a statement object
                    Statement stmt3 = conn.createStatement();
                    //send statement to DBMS
                    ResultSet result3 = stmt3.executeQuery(getAttendance);
                    //OUTPUT
                    //System.out.println("______________________________________");
                    while (result3.next()) {
                    	//System.out.println(result.getInt("Home Team Code"));
                    	attendance += result3.getString("sum") + " ";
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Error accessing attendance.");
                }
                
                
                String getPoints = "select sum(\"Points\") from \"Team Game Statistics\" join game on \"Team Game Statistics\".\"Game Code\" = game.\"Game Code\" where game.\"Home Team Code\" = " +result.getString("Home Team Code")+ " and \"Team Game Statistics\".\"Team Code\" = " +result.getString("Home Team Code")+ " and game.\"Season\" = " +q4Season+";";
                try{
                    //create a statement object
                    Statement stmt4 = conn.createStatement();
                    //send statement to DBMS
                    ResultSet result4 = stmt4.executeQuery(getPoints);
                    //OUTPUT
                    //System.out.println("______________________________________");
                    while (result4.next()) {
                    	//System.out.println(result.getInt("Home Team Code"));
                    	points += result4.getString("sum") + " ";
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Error accessing points.");
                }
                
                
                String getRush = "select sum(\"Rush Yard\") from \"Team Game Statistics\" join game on \"Team Game Statistics\".\"Game Code\" = game.\"Game Code\" where game.\"Home Team Code\" = " +result.getString("Home Team Code")+ " and \"Team Game Statistics\".\"Team Code\" = " +result.getString("Home Team Code")+ " and game.\"Season\" = " +q4Season+";";
                try{
                    //create a statement object
                    Statement stmt5 = conn.createStatement();
                    //send statement to DBMS
                    ResultSet result5 = stmt5.executeQuery(getRush);
                    //OUTPUT
                    //System.out.println("______________________________________");
                    while (result5.next()) {
                    	//System.out.println(result.getInt("Home Team Code"));
                    	rushYards += result5.getString("sum") + " ";
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Error accessing rush yard data.");
                }
                
                HomeTeamCodes += result.getString("Home Team Code") + " ";
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"There is not enough data to compute the home team advantage for this conference. Choose another conference.");
        }
        String[] splitHome = HomeTeamCodes.split(" ");
        String[] splitPlays = numPlays.split(" ");
        int[] intPlays = new int[splitHome.length];
        String[] splitAttendance = attendance.split(" ");
        int[] intAttendance = new int[splitHome.length];
        String[] splitPoints = points.split(" ");
        int[] intPoints = new int[splitHome.length];
        String[] splitYards = rushYards.split(" ");
        int[] intYards = new int[splitHome.length];
        double[] advantages = new double[splitHome.length];

        for(int i = 0; i <splitHome.length; i++) {
        	String x = splitPlays[i];
        	intPlays[i] = Integer.parseInt(x);
        	
        	String y = splitAttendance[i];
        	intAttendance[i] = Integer.parseInt(y);
        	
        	String z = splitPoints[i];
        	intPoints[i] = Integer.parseInt(z);
        	
        	String a = splitYards[i];
        	intYards[i] = Integer.parseInt(a);
        }
        
        //calculating adv based on max plays
        double maxPlays = intPlays[0];
        for(int i = 1; i <splitHome.length; i++) {
        	if(maxPlays <intPlays[i])
        		maxPlays = intPlays[i];
        }
        for(int i = 0; i <splitHome.length; i++) {
        	if(maxPlays == intPlays[i])
        		advantages[i] = 20;
        	else
        		advantages[i] = (intPlays[i] / maxPlays)*20;
        }
        
        
        //calculating adv based on  max attendance
        double maxAtten = intAttendance[0];
        for(int i = 1; i <splitHome.length; i++) {
        	if(maxAtten <intAttendance[i])
        		maxAtten = intAttendance[i];
        }
        for(int i = 0; i <splitHome.length; i++) {
        	if(maxAtten == intAttendance[i])
        		advantages[i] += 30;
        	else
        		advantages[i] += (intAttendance[i] / maxAtten)*30;
        }
        
        //calculating adv based on  max points
        double maxPoints = intPoints[0];
        for(int i = 1; i <splitHome.length; i++) {
        	if(maxPoints <intPoints[i])
        		maxPoints = intPoints[i];
        }
        for(int i = 0; i <splitHome.length; i++) {
        	if(maxPoints == intPoints[i])
        		advantages[i] += 30;
        	else
        		advantages[i] += (intPoints[i] / maxPoints)*30;
        }
        
        //calculating adv based on  max rushed yards
        double maxYards = intYards[0];
        for(int i = 1; i <splitHome.length; i++) {
        	if(maxYards <intYards[i])
        		maxYards = intYards[i];
        }
        for(int i = 0; i <splitHome.length; i++) {
        	if(maxYards == intYards[i])
        		advantages[i] += 20;
        	else
        		advantages[i] += (intYards[i] / maxYards)*20;
        }
        
        
        //outputting team names and home field advantage scores in dialog box
        String output = "";
        String teamName = "select distinct Name from team where season = " +q4Season+ " and \"conference code\" = " +code+ ";";
        int i = 0;

        try{
            //create a statement object
            Statement stmtfinal = conn.createStatement();
            //send statement to DBMS
            ResultSet resultfinal = stmtfinal.executeQuery(teamName);
            while (resultfinal.next() && i <splitHome.length) {
            	output += resultfinal.getString("name") + " - " + advantages[i]+ "\n";
            	i++;
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error accessing team names.");
        }
        
        //final output
        JOptionPane.showMessageDialog(null,output);
     
    }

    private void textBoxActionPerformed(java.awt.event.ActionEvent evt) {
        String parameter = textBox.getText();
        parameterGlobal = parameter;
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        search();
    }

    private void drop1ActionPerformed(java.awt.event.ActionEvent evt) {
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
        javax.swing.JComboBox combo = (javax.swing.JComboBox) evt.getSource();
        String drop2 = (String) combo.getSelectedItem();
        drop2Global = drop2;
    }

    private void outputFileActionPerformed(java.awt.event.ActionEvent evt) {
        fileOutputGlobal = outputFile.isSelected();
    }

    private void Question1TeamOneActionPerformed(java.awt.event.ActionEvent evt) {
        String team = Question1TeamOne.getText();
        q1Team1 = team;
    }

    private void Question1Team2ActionPerformed(java.awt.event.ActionEvent evt) {
        String team = Question1Team2.getText();
        q1Team2 = team;
    }

    private void Question2PlayerOneActionPerformed(java.awt.event.ActionEvent evt) {
        String player = Question2PlayerOne.getText();
        q2Player1 = player;
    }

    private void Question2PlayerTwoActionPerformed(java.awt.event.ActionEvent evt) {
        String player = Question2PlayerTwo.getText();
        q2Player2 = player;
    }

    private void Question3TeamActionPerformed(java.awt.event.ActionEvent evt) {
        String team = Question3Team.getText();
        q3Team = team;
    }

    private void Question4ConferenceActionPerformed(java.awt.event.ActionEvent evt) {
        String conference = Question4Conference.getText();
        q4Conference = conference;
    }

    private void Question4SeasonActionPerformed(java.awt.event.ActionEvent evt) {
        String season = Question4Season.getText();
        q4Season = season;
    }

    private void Question1ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        questionOne();
    }

    private void Question2ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        questionTwo();
    }

    private void Question3ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        questionThree();
    }

    private void Question4ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        questionFour();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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