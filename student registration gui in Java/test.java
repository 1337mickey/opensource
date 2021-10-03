import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class test {
    
    JFrame form; //frame for GUI
    JPanel pnlmain;
    
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
    
    

    
       test(){
        form = new JFrame();
        form.setSize(900,660); //size of frame
        form.setTitle("Student Registration"); //frame title
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close on exit functionality
        form.setResizable(false); //disabled maximizing feature
        form.add(pnlmain);
  
        
        JLabel fname1 = new JLabel();
        fname1.setText("First Name: ");
        fname1.setBounds(300,20,500,50);
        fname1.setForeground( Color.decode("#EEEEEE") );
        pnlmain.add(fname1);
        
        

    }
}