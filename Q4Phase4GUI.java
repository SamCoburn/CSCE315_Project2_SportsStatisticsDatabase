import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;

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

    private void questionOne() {

    }

    private void questionTwo() {

    }

    private void questionThree() {

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
            //JOptionPane.showMessageDialog(null,"Results from Query");
            //System.out.println("______________________________________");
            while (result.next()) {
                code += result.getString("code");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error accessing conference codes.");
        }
        
        System.out.println("Conference code: " + code);
    	
       
      //grab all teams from season and conference
    	String getHomeTeams = "SELECT DISTINCT game.\"Home Team Code\" FROM team JOIN game on team.\"team code\" = game.\"Home Team Code\" and team.season = game.\"Season\" where season = " +q4Season+ " and \"conference code\" = " +code+ " order by \"Home Team Code\";" ;
    	System.out.println(getHomeTeams);
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
            while (result.next()) {
            	//System.out.println(result.getInt("Home Team Code"));
            	
            	//find total number of plays for each team during home games
            	String getNumPlays = "select count(play.\"Play Number\") from play join game on play.\"Game Code \" = game.\"Game Code\" where game.\"Home Team Code\" = " +result.getString("Home Team Code")+ " and game.\"Season\" = " +q4Season+ ";";
            	System.out.println(getNumPlays);
            	
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
            JOptionPane.showMessageDialog(null,"Error accessing team codes. The data for that conference and season are not found.");
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
        
        
        //outputing team names and home field advantage scores in dialog box
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
//question 4 taking in text
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
            conn = DriverManager.getConnection("jdbc:postgresql://csce-315-db.engr.tamu.edu/team19_907", "sam_coburn32", "725009869");
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