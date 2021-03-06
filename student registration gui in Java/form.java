/**
 * this is GUI work of course work 2
 * @Group N2
 * @author (Sushil Phuyal)
 * @College ID (NP01NT4S210044)
 * @Report File Name:  (20049252  Sushil Phuyal)
 **/


/**importing of required libraries of java**/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class form implements ActionListener {
    
    JFrame form; //frame for GUI
    
    /**textfield**/
    JTextField fname;
    JTextField lname;
    JTextField streetname1;
    JTextField streetname2;
    JTextField city;
    JTextField zip;
    
    
    /**button created**/
   
    JButton btok;
    JButton btcancel;
    JButton btlater;
    
    

    
       form(){
        form = new JFrame();
        form.setSize(900,660); //size of frame
        form.setTitle("Student Registration"); //frame title
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close on exit functionality
        form.setResizable(false); //disabled maximizing feature
        
        JLabel fname1 = new JLabel();
        fname1.setText("First Name: ");
        fname1.setBounds(300,20,500,50);
        fname1.setFont(font1);
        fname1.setForeground( Color.decode("#EEEEEE") );
        
        
        form.add(fname1);
        form.setVisible(true);   
    }
}
    
        
        
        
        
        
        
        
       
       
        
                
        btn8 = new JButton();
        btn8.setText("Register");
        btn8.setBounds(390,430,120,30);
        btn8.setFont(font3);
        btn8.addActionListener(this);
        pnlNonAcademic.add(btn8);
        
        JLabel label26 = new JLabel();
        label26.setText("Course ID");
        label26.setBounds(50,490,150,40);
        label26.setFont(font2);
        pnlNonAcademic.add(label26);
        
        field22= new JTextField();
        field22.setBounds(200,490,200,30);
        pnlNonAcademic.add(field22);
        
        btn9 = new JButton();
        btn9.setText("Clear");
        btn9.setBounds(240,560,120,30);
        btn9.setFont(font3);   
        btn9.addActionListener(this);
        pnlNonAcademic.add(btn9);
        
        btAcadmic0 = new JButton();
        btAcadmic0.setText("Remove");
        btAcadmic0.setBounds(620,490,120,30);
        btAcadmic0.setFont(font3);        
        btAcadmic0.addActionListener(this);
        pnlNonAcademic.add(btAcadmic0);
        
        btAcadmic1 = new JButton();
        btAcadmic1.setText("Display");
        btAcadmic1.setBounds(620,560,120,30);
        btAcadmic1.setFont(font3);      
        btAcadmic1.addActionListener(this);
        pnlNonAcademic.add(btAcadmic1);
        
        back2 = new JButton();
        back2.setText("Back");
        back2.setBounds(50,560,120,30);
        back2.setFont(font3);      
        back2.addActionListener(this);
        pnlNonAcademic.add(back2);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btAcadmic) {
            pnlmenu.setVisible(false);
            pnlAcadmeic.setVisible(true);
        }
        if(e.getSource() == back1) {
            pnlAcadmeic.setVisible(false);
            pnlmenu.setVisible(true);
        }
        if(e.getSource() == btNonAcadmic) {
            pnlmenu.setVisible(false);
            pnlNonAcademic.setVisible(true);
        }
        if(e.getSource() == back2) {
            pnlNonAcademic.setVisible(false);
            pnlmenu.setVisible(true);
        }
        if(e.getSource() == btn5) {
            field1.setText("");
            field2.setText(""); 
            field3.setText(""); 
            field3.setText(""); 
            field4.setText(""); 
            field5.setText(""); 
            field6.setText(""); 
            field7.setText(""); 
            field8.setText(""); 
            field9.setText(""); 
            field10.setText("");
            field11.setText(""); 
        }
        if(e.getSource() == btn9) {
            field12.setText("");
            field13.setText("");
            field14.setText("");
            field15.setText("");
            field16.setText("");
            field17.setText("");
            field18.setText("");
            field19.setText("");
            field20.setText("");
            field21.setText("");
            field22.setText("");
        }
        if(e.getSource() == btn3) {  //add button
            String ID = field1.getText();
            String Level = field3.getText();
            String Credit = field4.getText();
            String CourseName = field5.getText();
            int Assignment = 0;
            int Duration = 0;
            try {
                Duration = Integer.parseInt(field2.getText());
                Assignment = Integer.parseInt(field6.getText());
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(form,"Please enter an integer in assignment and duration field.");
                return;
            }
            if(ID.equals("")||Credit.equals("")||CourseName.equals("")||Level.equals("")) {
                JOptionPane.showMessageDialog(form,"Please fill all text fields.");
            }
            else {
            AcademicCourse ac = new AcademicCourse(ID,CourseName,Duration,Level,Credit,Assignment);
            list.add(ac);
            JOptionPane.showMessageDialog(form,"Course Added Successfully");
        } 
            }
        if (e.getSource() == btn4) { //register button
            String i = field7.getText();
            String ii = field8.getText();
            String iii = field9.getText();
            String iv = field10.getText();
            String v  = field11.getText();
            boolean abc = false;
            if(i.equals("")||ii.equals("")||iii.equals("")||iv.equals("")||(v.equals(""))) {
                JOptionPane.showMessageDialog(form, "Please fill all the fields.");
            }
            else {
                for(int j = 0; j < list.size(); j++) {
                    if(list.get(j).getCourseID().equals(i)) {
                        if(list.get(j) instanceof AcademicCourse) {
                            AcademicCourse ac = (AcademicCourse) list.get(j);
                            ac.registerCourse(ii,iii,iv,v);
                            JOptionPane.showMessageDialog(form,"Academic Course registered successfully.");
                            return;
                        }    
                    }
                    else {
                        abc = true;
                    }
                }
                if (abc  == true) {
                JOptionPane.showMessageDialog(form,"Course ID did not matched."); 
                }
            }
        }
        if(e.getSource() == btn6) { //display button
            for(int j = 0; j<list.size(); j++) {
                if(list.get(j) instanceof AcademicCourse) {
                    AcademicCourse ac = (AcademicCourse) list.get(j);
                    ac.display();
                }
            }
        }
        
        //Button functionality for NonAcademic
    
    if(e.getSource() == btn7) {  //add button
        String ID = field12.getText();
        String Prerequisite = field14.getText();
        String CourseName = field15.getText();
        int Duration = 0;
        try {
                Duration = Integer.parseInt(field13.getText());
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(form,"Please enter an integer.");
                return;
            }
            if(ID.equals("")||Prerequisite.equals("")||CourseName.equals("")) {
                JOptionPane.showMessageDialog(form,"Please fill all fields.");
            }
            else {
            NonAcademicCourse ac = new NonAcademicCourse(ID,CourseName,Duration,Prerequisite);
            list.add(ac);
            JOptionPane.showMessageDialog(form,"Course Added");
        }    
    }
    
    if (e.getSource() == btn8) { //register button
            String i = field16.getText();
            String ii = field17.getText();
            String iii = field18.getText();
            String iv = field19.getText();
            String v  = field20.getText();
            String vi = field21.getText();
            boolean abc = false;
            if(i.equals("")||ii.equals("")||iii.equals("")||iv.equals("")||v.equals("")||vi.equals("")) {
                JOptionPane.showMessageDialog(form, "Please fill all the fields.");
            }
            else {
                for(int j = 0; j < list.size(); j++) {
                    if(list.get(j).getCourseID().equals(i)) {
                        if(list.get(j) instanceof NonAcademicCourse) {
                            NonAcademicCourse ac = (NonAcademicCourse) list.get(j);
                            ac.registerCourse(ii,iii,iv,v,vi);
                            JOptionPane.showMessageDialog(form,"NonAcademic Course registered.");
                            return;
                        }    
                    }
                    else {
                        abc = true;
                    }
                }
                if (abc  == true) {
                JOptionPane.showMessageDialog(form,"Course ID not match."); 
                }
            }
        }
        
        if(e.getSource() == btAcadmic0) { //remove button
             String a = field22.getText();
             boolean abc = false;
             if(a.equals("")) {
                    JOptionPane.showMessageDialog(form,"Please enter Course ID.");     
                }
                else{
                    for(int j = 0; j <list.size(); j++) {
                        if(list.get(j).getCourseID().equals(a)){                       
                          if(list.get(j) instanceof NonAcademicCourse) {
                              NonAcademicCourse ac = (NonAcademicCourse) list.get(j);
                              ac.removeCourse();
                              JOptionPane.showMessageDialog(form,"Course Removed.");
                              return;
                            }
                        }else{
                            abc = true;
                        }
                    }
                    if(abc == true) {
                        JOptionPane.showMessageDialog(form,"Course ID didnot match.");
                    }
                }
        }
        if(e.getSource() == btAcadmic1) { //display button
           for(int j = 0; j<list.size(); j++) {
                if(list.get(j) instanceof NonAcademicCourse) {
                    NonAcademicCourse ac = (NonAcademicCourse) list.get(j);
                    ac.display();
                }
            } 
        }
}  
 public static void main(String[] args) {
        formCollege mickey = new formCollege();
        
    }
}
