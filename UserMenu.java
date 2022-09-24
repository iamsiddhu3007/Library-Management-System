

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.util.ListIterator;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import javax.swing.JOptionPane;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserMenu extends JFrame{
	static UserMenu frame;
	private JPanel contentPane;
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UserMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public UserMenu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JLabel lbl1 = new JLabel("Library access         ");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl1.setForeground(Color.red);
	    JButton btnstudentcreate=new JButton("Create student account");
	    JButton btnlibcreate=new JButton("Create librarian account");
	    JButton btnstudentlogin=new JButton("Student login");
	    JButton btnliblogin=new JButton("Librarian login");
	     
	   btnstudentcreate.addActionListener(new ActionListener() {  //Perform action
	         
	        public void actionPerformed(ActionEvent e){ 
	        	frame.dispose();
	        	Studentaccountcreation.main(new String[]{});       
	    }               
	    });
	   
	   btnstudentlogin.addActionListener(new ActionListener() {  //Perform action
	         
	        public void actionPerformed(ActionEvent e){ 
	        	frame.dispose();
	        	StudentLogin.main(new String[]{});       
	    }               
	    });
	   
	   btnlibcreate.addActionListener(new ActionListener() {  //Perform action
	         
	        public void actionPerformed(ActionEvent e){ 
	        	frame.dispose();
	        	if(Libraryaccess.Librarianname.equals(""))
	        	{
	        		Librarianaccountcreation.main(new String[]{});
	        		
	        	}
	        	else {
	        		UserMenu.main(new String[]{});
	        	}
	        	     
	    }               
	    });
	   
	   btnliblogin.addActionListener(new ActionListener() {  //Perform action
	         
	        public void actionPerformed(ActionEvent e){ 
	        	frame.dispose();
	        	LibrarianLogin.main(new String[]{});       
	    }               
	    });
	   
	   
	   
	   
	   GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(81, Short.MAX_VALUE)
					.addComponent(lbl1)
					.addGap(132))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(132)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnstudentcreate, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnlibcreate, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnstudentlogin, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnliblogin, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							
							
							)
					.addContainerGap(101, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbl1)
	                .addGap(40)
					.addComponent(btnstudentcreate, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnlibcreate, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnstudentlogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnliblogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				
	)
		);
		contentPane.setLayout(gl_contentPane);
		
	   
	   
}
}
