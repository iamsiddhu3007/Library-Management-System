
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

public class StudentLogin {
	public static void main(String[] args) {
		Studentlogin();
	}
	
	public static void Studentlogin() {
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
	        	
	        	Iterator<Student> itr2 = Libraryaccess.studentlist.iterator();
				while (itr2.hasNext())
				{
					Student s = (Student)itr2.next();
					
					if(s.userid.equals(F_userid.getText())) {
						if(s.password.equals(F_pass.getText()))
						{
							
							
							f.dispose();
							Student_menu.main(F_userid.getText());
						}
						else
			        	{
			        		UserMenu.main(new String[]{});
			        	}
					}			
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
