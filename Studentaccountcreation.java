
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;

public class Studentaccountcreation {
	public static void main(String[] args) {
		login();
	}
	
	public static void login() {
	    JFrame f=new JFrame("Create Student account"); 
	    JLabel l1,l2,l3,l4,l5;  
	    l1=new JLabel("Name:");  
	    l1.setBounds(30,40, 100,30); 
	     
	    l2=new JLabel("Phone number:");  
	    l2.setBounds(30, 90, 100, 30);
	    
	    l3=new JLabel("Department:");
	    l3.setBounds(30,140, 100,30);
	    
	    l4=new JLabel("Set User id:");  
	    l4.setBounds(30,190, 100,30);
	    
	    l5=new JLabel("Set Password:");  
	    l5.setBounds(30,240, 100,30);
	    
	    JTextField F_name = new JTextField(); 
	    F_name.setBounds(130, 40, 200, 30);
	    
	    JTextField F_phno = new JTextField(); 
	    F_phno.setBounds(130, 90, 200, 30);
	    
	    JTextField F_dept = new JTextField(); 
	    F_dept.setBounds(130, 140, 200, 30);
	     
	    JTextField F_userid = new JTextField(); 
	    F_userid.setBounds(130, 190, 200, 30);
	         
	    JPasswordField F_pass=new JPasswordField(); 
	    F_pass.setBounds(130, 240, 200, 30);
	       
	    JButton btncreate=new JButton("Create");
	    btncreate.setBounds(150,300,100,25);
	    btncreate.addActionListener(new ActionListener() {  //Perform action
	         
	        public void actionPerformed(ActionEvent e){ 
	        Libraryaccess.studentlist.add(new Student(F_name.getText(),F_phno.getText(), F_dept.getText(),
	        		F_userid.getText(), F_pass.getText()));
	        
	        JWindow w = new JWindow();
	        JLabel l = new JLabel("Account creation successfull");
	        JButton bok2 = new JButton("OK");
	        JPanel p = new JPanel();
	        p.add(l);
	        p.add(bok2);
	        w.add(p);
	        w.setSize(200, 80);
	        p.setBackground(Color.YELLOW);
	        w.setLocation(550, 300);
	        w.show();
	        
	        bok2.addActionListener(new ActionListener() {  
		         
		        public void actionPerformed(ActionEvent e){ 
		        	w.setVisible(false);
		        	 f.dispose();
		        	UserMenu.main(new String[]{});
		        }               
		    }); 
	    }               
	    });
	 
	    f.add(F_name); 
	    f.add(F_phno); 
	    f.add(F_dept); 
	    f.add(F_userid);
	    f.add(F_pass); 
	    f.add(btncreate);
	   
	    f.add(l1);  
	    f.add(l2); 
	    f.add(l3);
	    f.add(l4);
	    f.add(l5);
	    
	    f.setSize(400,450);
	    f.setLayout(null);
	    f.setVisible(true);
	    f.setLocationRelativeTo(null);
	     
	}

}
