
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

public class Librarianaccountcreation {
	public static void main(String[] args) {
		create();
	}
	
	public static void create() {
	    JFrame f=new JFrame("Create Librarian account");
	    JLabel l1,l2,l3,l4;  
	    l1=new JLabel("Name:");  
	    l1.setBounds(30,40, 100,30); 
	     
	    l2=new JLabel("Phone number:");  
	    l2.setBounds(30, 90, 100, 30);
	    
	    l3=new JLabel("Set User id:");
	    l3.setBounds(30,140, 100,30);
	    
	    l4=new JLabel("Set Password:");  
	    l4.setBounds(30,190, 100,30);
	 
	    
	    JTextField F_name = new JTextField();
	    F_name.setBounds(130, 40, 200, 30);
	    
	    JTextField F_phno = new JTextField(); 
	    F_phno.setBounds(130, 90, 200, 30);
	    
	     
	    JTextField F_userid = new JTextField(); 
	    F_userid.setBounds(130, 140, 200, 30);
	         
	    JPasswordField F_pass=new JPasswordField(); 
	    F_pass.setBounds(130, 190, 200, 30);
	       
	    JButton btncreate=new JButton("Create");
	    btncreate.setBounds(130,280,100,25);
	    btncreate.addActionListener(new ActionListener() {  
	         
	        public void actionPerformed(ActionEvent e){ 
	        	Libraryaccess.Librarianname=Libraryaccess.Librarianname+ F_name.getText();
	        	Libraryaccess.Librarianphno=Libraryaccess.Librarianphno+ F_phno.getText();
	        	Libraryaccess.Librarianuserid=Libraryaccess.Librarianuserid+ F_userid.getText();
	        	Libraryaccess.Librarianpassword=Libraryaccess.Librarianpassword+ F_pass.getText();
	        
	       
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
	    f.add(F_userid);
	    f.add(F_pass); 
	    f.add(btncreate);
	   
	    f.add(l1);  
	    f.add(l2); 
	    f.add(l3);
	    f.add(l4);

	    f.setSize(400,400);  
	    f.setLayout(null);
	    f.setVisible(true);
	    f.setLocationRelativeTo(null);
	     
	}

}