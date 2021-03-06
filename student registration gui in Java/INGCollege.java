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


public class INGCollege implements ActionListener {
    /**fonts created**/
    Font font1 = new Font("arial", Font.BOLD, 26);
    Font font2 = new Font("Arial", Font.PLAIN, 16);
    Font font3 = new Font("Arial", Font.PLAIN, 14);
    JFrame ING; //frame for GUI
    
    /**pannel creation**/
    JPanel pnlmenu;
    JPanel pnlAcadmeic;
    JPanel pnlNonAcademic;
    
    /**textfields**/
    ArrayList<Course> list = new ArrayList<Course>();
    
    JTextField field1;
    JTextField field2;
    JTextField field3;
    JTextField field4;
    JTextField field5;
    JTextField field6;
    JTextField field7;
    JTextField field8;
    JTextField field9;
    JTextField field10;
    JTextField field11;
    JTextField field12;
    JTextField field13;
    JTextField field14;
    JTextField field15;
    JTextField field16;
    JTextField field17;
    JTextField field18;
    JTextField field19;
    JTextField field20;
    JTextField field21;
    JTextField field22;
    
    /**button created**/
   
    JButton btexit;
    JButton btAcadmic;
    JButton btNonAcadmic;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6; 
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btAcadmic0;
    JButton btAcadmic1;
    JButton back1;
    JButton back2;
    

    
    INGCollege(){
        ING = new JFrame();
        ING.setSize(900,660); //size of frame
        ING.setTitle("IngCollege"); //frame title
        ING.setLayout(null);
        ING.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close on exit functionality
        ING.setResizable(false); //disabled maximizing feature
        
   
        pnlmenu = new JPanel(); //pannel creation for home page
        pnlmenu.setBounds(0,0,900,660);
        pnlmenu.setLayout(null);
        pnlmenu.setBackground( Color.decode("#00ADB5") );
        ING.add(pnlmenu);
        
        JLabel label1 = new JLabel();
        label1.setText("Course Registration");
        label1.setBounds(280,20,700,50);
        label1.setFont(font1);
        pnlmenu.add(label1);
        
        
        btAcadmic = new JButton();
        btAcadmic.setText("Academic Course");
        btAcadmic.setBounds(95,180,175,40);
        btAcadmic.setFont(font2);
        btAcadmic.setBackground(new Color(0x2dce98));
        btAcadmic.setBorder(BorderFactory.createBevelBorder(0));
        btAcadmic.addActionListener(this);
        pnlmenu.add(btAcadmic);
        
        btNonAcadmic = new JButton();
        btNonAcadmic.setText("Non-Academic Course");
        btNonAcadmic.setBounds(550,180,200,40);
        btNonAcadmic.setFont(font2);
        btNonAcadmic.setBackground(new Color(0x2dce98));
        btNonAcadmic.setBorder(BorderFactory.createBevelBorder(0));
        btNonAcadmic.addActionListener(this);
        pnlmenu.add(btNonAcadmic);
        
        btexit = new JButton();
        btexit.setText("Exit");
        btexit.setBounds(360,300,100,40);
        btexit.setFont(font2);
        btexit.setBackground(new Color(0x2dce98));
        btexit.setBorder(BorderFactory.createBevelBorder(0));
        btexit.addActionListener(e -> System.exit(0));
        pnlmenu.add(btexit);
        
        /**pannel for acadmeic course**/
        pnlAcadmeic = new JPanel();
        pnlAcadmeic.setBounds(0,0,900,660);
        pnlAcadmeic.setVisible(false);
        pnlAcadmeic.setLayout(null);
        pnlAcadmeic.setBackground( Color.decode("#00ADB5") );
        ING.add(pnlAcadmeic);
        
        Academic();
        
        /**pannel for non acadmeic course**/
        pnlNonAcademic = new JPanel();
        pnlNonAcademic.setBounds(0,0,900,660);
        pnlNonAcademic.setVisible(false);
        pnlNonAcademic.setLayout(null);
        pnlNonAcademic.setBackground( Color.decode("#00ADB5") );
        ING.add(pnlNonAcademic);
        
        NonAcademic();
        
        ING.setVisible(true);   
    }
    
    public void Academic() {
        JLabel label3 = new JLabel();
        label3.setText("Academic Course");
        label3.setBounds(300,20,500,50);
        label3.setFont(font1);
        label3.setForeground( Color.decode("#EEEEEE") );
        pnlAcadmeic.add(label3);
        
        JLabel label4 = new JLabel();
        label4.setText("Course ID");
        label4.setBounds(50,80,150,40);
        label4.setFont(font2);
        pnlAcadmeic.add(label4);
        
        field1 = new JTextField();
        field1.setBounds(200,80,200,30);
        pnlAcadmeic.add(field1);
        
        JLabel label5 = new JLabel();
        label5.setText("Duration");
        label5.setBounds(450,80,150,40);
        label5.setFont(font2);
        pnlAcadmeic.add(label5);
        
        field2 = new JTextField();
        field2.setBounds(620,80,200,30);
        pnlAcadmeic.add(field2);
        
        JLabel label6 = new JLabel();
        label6.setText("Level");
        label6.setBounds(50,130,150,40);
        label6.setFont(font2);
        pnlAcadmeic.add(label6);
        
        field3 = new JTextField();
        field3.setBounds(200,130,200,30);
        pnlAcadmeic.add(field3);
        
        JLabel label7 = new JLabel();
        label7.setText("Credit");
        label7.setBounds(450,130,150,40);
        label7.setFont(font2);
        pnlAcadmeic.add(label7);
        
        field4 = new JTextField();
        field4.setBounds(620,130,200,30);
        pnlAcadmeic.add(field4);
        
        
        JLabel label8 = new JLabel();
        label8.setText("Course Name");
        label8.setBounds(50,180,150,40);
        label8.setFont(font2);
        pnlAcadmeic.add(label8);
        
        field5 = new JTextField();
        field5.setBounds(200,180,200,30);
        pnlAcadmeic.add(field5);
        
        JLabel label9 = new JLabel();
        label9.setText("No of Assignment");
        label9.setBounds(450,180,190,40);
        label9.setFont(font2);
        pnlAcadmeic.add(label9);
        
        field6 = new JTextField();
        field6.setBounds(620,180,200,30);
        pnlAcadmeic.add(field6);
                
        btn3 = new JButton();
        btn3.setText("Add");
        btn3.setBounds(390,240,120,30);
        btn3.setFont(font2);
        btn3.setBorder(BorderFactory.createBevelBorder(0));
        btn3.addActionListener(this);
        pnlAcadmeic.add(btn3);
        
        JLabel label10 = new JLabel();
        label10.setText("Course ID");
        label10.setBounds(50,300,150,40);
        label10.setFont(font2);
        pnlAcadmeic.add(label10);
        
        field7= new JTextField();
        field7.setBounds(200,300,200,30);
        pnlAcadmeic.add(field7);
        
        JLabel label11 = new JLabel();
        label11.setText("Course Leader");
        label11.setBounds(450,300,150,40);
        label11.setFont(font2);
        pnlAcadmeic.add(label11);
        
        field8= new JTextField();
        field8.setBounds(620,300,200,30);
        pnlAcadmeic.add(field8);
        
        JLabel label12 = new JLabel();
        label12.setText("Lecturer Name");
        label12.setBounds(50,360,150,40);
        label12.setFont(font2);
        pnlAcadmeic.add(label12);
        
        field9= new JTextField();
        field9.setBounds(200,360,200,30);
        pnlAcadmeic.add(field9);
        
        JLabel label13 = new JLabel();
        label13.setText("Starting Date");
        label13.setBounds(450,360,150,40);
        label13.setFont(font2);
        pnlAcadmeic.add(label13);
        
        field10= new JTextField();
        field10.setBounds(620,360,200,30);
        pnlAcadmeic.add(field10);
        
        JLabel label14 = new JLabel();
        label14.setText("Completion Date");
        label14.setBounds(50,420,150,40);
        label14.setFont(font2);
        pnlAcadmeic.add(label14);
        
        field11= new JTextField();
        field11.setBounds(200,420,200,30);
        pnlAcadmeic.add(field11);
        
        btn4 = new JButton();
        btn4.setText("Register");
        btn4.setBounds(390,480,120,30);
        btn4.setFont(font3);
        btn4.setBorder(BorderFactory.createBevelBorder(0));
        btn4.addActionListener(this);
        pnlAcadmeic.add(btn4);
        
        btn5 = new JButton();
        btn5.setText("Clear");
        btn5.setBounds(220,560,120,30);
        btn5.setFont(font3);
        btn5.setBorder(BorderFactory.createBevelBorder(0));
        btn5.addActionListener(this);
        pnlAcadmeic.add(btn5);
        
        btn6 = new JButton();
        btn6.setText("Display");
        btn6.setBounds(600,560,120,30);
        btn6.setFont(font3);
        btn6.setBorder(BorderFactory.createBevelBorder(0));
        btn6.addActionListener(this);
        pnlAcadmeic.add(btn6);
        
        
        back1 = new JButton();
        back1.setText("Back");
        back1.setBounds(50,560,120,30);
        back1.setFont(font3);
        back1.setBorder(BorderFactory.createBevelBorder(0));
        back1.addActionListener(this);
        pnlAcadmeic.add(back1);
        
    } 
    public void NonAcademic() {
        JLabel label15 = new JLabel();
        label15.setText("NonAcademic Course");
        label15.setBounds(300,20,500,50);
        label15.setFont(font1);
        pnlNonAcademic.add(label15);
        
        JLabel label16 = new JLabel();
        label16.setText("Course ID");
        label16.setBounds(50,80,150,40);
        label16.setFont(font2);
        pnlNonAcademic.add(label16);
        
        field12 = new JTextField();
        field12.setBounds(200,80,200,30);
        pnlNonAcademic.add(field12);
        
        JLabel label17 = new JLabel();
        label17.setText("Duration");
        label17.setBounds(450,80,150,40);
        label17.setFont(font2);
        pnlNonAcademic.add(label17);
        
        field13 = new JTextField();
        field13.setBounds(620,80,200,30);
        pnlNonAcademic.add(field13);
        
        JLabel label18 = new JLabel();
        label18.setText("Prerequisite");
        label18.setBounds(50,130,150,40);
        label18.setFont(font2);
        pnlNonAcademic.add(label18);
        
        field14 = new JTextField();
        field14.setBounds(200,130,200,30);
        pnlNonAcademic.add(field14);
        
        JLabel label19 = new JLabel();
        label19.setText("Course Name");
        label19.setBounds(450,130,150,40);
        label19.setFont(font2);
        pnlNonAcademic.add(label19);
        
        field15 = new JTextField();
        field15.setBounds(620,130,200,30);
        pnlNonAcademic.add(field15);
        
        
        btn7 = new JButton();
        btn7.setText("Add");
        btn7.setBounds(390,190,120,30);
        btn7.setFont(font2);
        btn7.addActionListener(this);
        pnlNonAcademic.add(btn7);
        
        JLabel label20 = new JLabel();
        label20.setText("Course ID");
        label20.setBounds(50,250,150,40);
        label20.setFont(font2);
        pnlNonAcademic.add(label20);
        
        field16= new JTextField();
        field16.setBounds(200,250,200,30);
        pnlNonAcademic.add(field16);
        
        JLabel label21 = new JLabel();
        label21.setText("Course Leader");
        label21.setBounds(450,250,150,40);
        label21.setFont(font2);
        pnlNonAcademic.add(label21);
        
        field17= new JTextField();
        field17.setBounds(620,250,200,30);
        pnlNonAcademic.add(field17);
        
        JLabel label22 = new JLabel();
        label22.setText("Instructor Name");
        label22.setBounds(50,310,150,40);
        label22.setFont(font2);
        pnlNonAcademic.add(label22);
        
        field18= new JTextField();
        field18.setBounds(200,310,200,30);
        pnlNonAcademic.add(field18);
        
        JLabel label23 = new JLabel();
        label23.setText("Start Date");
        label23.setBounds(450,310,150,40);
        label23.setFont(font2);
        pnlNonAcademic.add(label23);
        
        field19= new JTextField();
        field19.setBounds(620,310,200,30);
        pnlNonAcademic.add(field19);
        
        JLabel label24 = new JLabel();
        label24.setText("Completion Date");
        label24.setBounds(50,370,150,40);
        label24.setFont(font2);
        pnlNonAcademic.add(label24);
        
        field20= new JTextField();
        field20.setBounds(205,370,200,30);
        pnlNonAcademic.add(field20);
        
        JLabel label25 = new JLabel();
        label25.setText("Exam Date");
        label25.setBounds(450,370,150,40);
        label25.setFont(font2);
        pnlNonAcademic.add(label25);
        
        field21= new JTextField();
        field21.setBounds(620,370,200,30);
        pnlNonAcademic.add(field21);
        
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
                JOptionPane.showMessageDialog(ING,"Please enter an integer in assignment and duration field.");
                return;
            }
            if(ID.equals("")||Credit.equals("")||CourseName.equals("")||Level.equals("")) {
                JOptionPane.showMessageDialog(ING,"Please fill all text fields.");
            }
            else {
            AcademicCourse ac = new AcademicCourse(ID,CourseName,Duration,Level,Credit,Assignment);
            list.add(ac);
            JOptionPane.showMessageDialog(ING,"Course Added Successfully");
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
                JOptionPane.showMessageDialog(ING, "Please fill all the fields.");
            }
            else {
                for(int j = 0; j < list.size(); j++) {
                    if(list.get(j).getCourseID().equals(i)) {
                        if(list.get(j) instanceof AcademicCourse) {
                            AcademicCourse ac = (AcademicCourse) list.get(j);
                            ac.registerCourse(ii,iii,iv,v);
                            JOptionPane.showMessageDialog(ING,"Academic Course registered successfully.");
                            return;
                        }    
                    }
                    else {
                        abc = true;
                    }
                }
                if (abc  == true) {
                JOptionPane.showMessageDialog(ING,"Course ID did not matched."); 
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
                JOptionPane.showMessageDialog(ING,"Please enter an integer.");
                return;
            }
            if(ID.equals("")||Prerequisite.equals("")||CourseName.equals("")) {
                JOptionPane.showMessageDialog(ING,"Please fill all fields.");
            }
            else {
            NonAcademicCourse ac = new NonAcademicCourse(ID,CourseName,Duration,Prerequisite);
            list.add(ac);
            JOptionPane.showMessageDialog(ING,"Course Added");
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
                JOptionPane.showMessageDialog(ING, "Please fill all the fields.");
            }
            else {
                for(int j = 0; j < list.size(); j++) {
                    if(list.get(j).getCourseID().equals(i)) {
                        if(list.get(j) instanceof NonAcademicCourse) {
                            NonAcademicCourse ac = (NonAcademicCourse) list.get(j);
                            ac.registerCourse(ii,iii,iv,v,vi);
                            JOptionPane.showMessageDialog(ING,"NonAcademic Course registered.");
                            return;
                        }    
                    }
                    else {
                        abc = true;
                    }
                }
                if (abc  == true) {
                JOptionPane.showMessageDialog(ING,"Course ID not match."); 
                }
            }
        }
        
        if(e.getSource() == btAcadmic0) { //remove button
             String a = field22.getText();
             boolean abc = false;
             if(a.equals("")) {
                    JOptionPane.showMessageDialog(ING,"Please enter Course ID.");     
                }
                else{
                    for(int j = 0; j <list.size(); j++) {
                        if(list.get(j).getCourseID().equals(a)){                       
                          if(list.get(j) instanceof NonAcademicCourse) {
                              NonAcademicCourse ac = (NonAcademicCourse) list.get(j);
                              ac.removeCourse();
                              JOptionPane.showMessageDialog(ING,"Course Removed.");
                              return;
                            }
                        }else{
                            abc = true;
                        }
                    }
                    if(abc == true) {
                        JOptionPane.showMessageDialog(ING,"Course ID didnot match.");
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
        INGCollege mickey = new INGCollege();
        
    }
}
