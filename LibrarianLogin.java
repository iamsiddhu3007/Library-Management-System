
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LibrarianLogin {
	public static void main(String[] args) {
		Librarianlogin();
	}
	
	public static void Librarianlogin() {
	    JFrame f=new JFrame("Log in to your account"); 
	    JLabel l1,l2;  
	    l1=new JLabel("User Id:");  
	    l1.setBounds(30,40, 100,30);  
	     
	    l2=new JLabel("Password:");  
	    l2.setBounds(30, 90, 100, 30);
	    
	 
	    
	    JTextField F_userid = new JTextField(); 
	    F_userid.setBounds(110, 40, 200, 30);
	    
	    JPasswordField F_pass = new JPasswordField(); 
	    F_pass.setBounds(110, 90, 200, 30);
	    
	    JButton btnlogin=new JButton("Login");
	    btnlogin.setBounds(130,170,100,25);
	    btnlogin.addActionListener(new ActionListener() {  
	         
	        public void actionPerformed(ActionEvent e){ 
	        	f.dispose();
	        	if(F_userid.getText().equals(Libraryaccess.Librarianuserid) 
	        			&& F_pass.getText().equals(Libraryaccess.Librarianpassword))
	        	{
	        		
	        		Librarianmenu.main(new String[]{});
	        	}
	        	else
	        	{
	        		UserMenu.main(new String[]{});
	        	}
	       
	    }               
	    });
	 
	    
	    f.add(F_userid);
	    f.add(F_pass); 
	    f.add(btnlogin); 
	   
	    f.add(l1);  
	    f.add(l2);
	    
	    f.setSize(400,300); 
	    f.setLayout(null); 
	    f.setVisible(true);
	    f.setLocationRelativeTo(null);
	     
	}

}
