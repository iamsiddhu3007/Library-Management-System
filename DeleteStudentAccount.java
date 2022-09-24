
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JWindow;

public class DeleteStudentAccount {
	public static void main(String[] args) {
		deleteaccount();
	}
	
	
	public static void deleteaccount() {
	    JFrame f=new JFrame("Delete Student Account");
	    JLabel head=new JLabel("Select the name of the student whose account should be deleted:");
	    head.setBounds(10, 20, 400, 30);
	    Iterator<Student> itr1 = Libraryaccess.studentlist.iterator();
		Student s;
		int stcount=0;
		while (itr1.hasNext())
		{
			s = (Student)itr1.next();
			stcount+=1;
		}
		JRadioButton[] buttonsgrp=new JRadioButton[stcount];
		int hght=60;
		Iterator<Student> itr2 = Libraryaccess.studentlist.iterator();
		Student s1;
		int bi=0;
		while (itr2.hasNext())
		{
			
			s1 = (Student)itr2.next();
						buttonsgrp[bi]=new JRadioButton(s1.name);
						buttonsgrp[bi].setBounds(15, hght, 100, 20);
						hght=hght+30;
						f.add(buttonsgrp[bi]);
						bi=bi+1;			
				}
		JButton btnok1=new JButton("OK");
		btnok1.setBounds(140, 250, 70, 30);
		f.add(head);
		f.add(btnok1);
		f.setSize(420,350); 
	    f.setLayout(null); 
	    f.setVisible(true);
	    f.setLocationRelativeTo(null);
	    btnok1.addActionListener(new ActionListener() {
	        
			public void actionPerformed(ActionEvent e)
	        {
				Student s2;
				int bc=0;
	        	for(int i=0;i<buttonsgrp.length;i++) {
	            if(buttonsgrp[i].isSelected())
	            {
	            	bc=i;
	            }           			
	            }

	        	Libraryaccess.studentlist.remove(bc);
	        	JWindow w = new JWindow();
		        JLabel l = new JLabel("Account deleted successfully");
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
			        	 Librarianmenu.main(new String[]{});
			        }               
			    });
		        
	        }
	    }
		);
		
	    
		}
}
