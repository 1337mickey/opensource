import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;



public class farma  {
    
    JFrame form;
    /**button created**/
    JButton btok;
    JButton btcancel;
    JButton btlater;
    
    /** text fields**/
    JTextField fname;
    JTextField lname;
    JTextField streetname1;
    JTextField streetname2;
    JTextField city;
    JTextField zip;
    
    /**radio buttons**/
    JRadioButton male;    
    JRadioButton female;
    
    /** combo box**/
    JComboBox country;
    
    farma(){
        form = new JFrame();
        form.setSize(900,660); //size of frame
        form.setTitle("Registration form"); //frame title
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close on exit functionality
        form.setResizable(false); //disabled maximizing feature
        
        JLabel label3 = new JLabel();
        label3.setText("Academic Course");
        label3.setBounds(300,20,500,50);
        label3.setForeground( Color.decode("#EEEEEE") );

        
        
    }}