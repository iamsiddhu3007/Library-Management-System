import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;

public class AddBook {
	public static void main(String[] args) {
		AddBook();
	}
	
	public static void AddBook() {
	    JFrame f=new JFrame("Add a book to the library");
	    JLabel l1,l2,l4,l5;  
	    l1=new JLabel("Subject:");  
	    l1.setBounds(30,40, 150,30); 
	     
	    l2=new JLabel("Name of the book:");  
	    l2.setBounds(30, 90, 150, 30);
	   
	    l4=new JLabel("Number of copies:");  
	    l4.setBounds(30,140, 150,30);
	    
	    l5=new JLabel("Name of the Author:");  
	    l5.setBounds(30,190, 150,30);
	    
	    String subj[]={"Maths","Physics","Computer Science","Psychology","Business","Aviation",
	    		"Videography","Photography","Modelling","Novels","Miscellaneous"};   
	    JComboBox sub=new JComboBox(subj);
	    sub.setBounds(160, 40, 200, 30);
	    
	    JTextField F_namebk = new JTextField(); 
	    F_namebk.setBounds(160, 90, 200, 30);
	    
	    JTextField F_nocopies = new JTextField(); 
	    F_nocopies.setBounds(160, 140, 200, 30);
	  
	    JTextField F_author=new JTextField(); 
	    F_author.setBounds(160, 190, 200, 30);
	       
	    JButton btnadd=new JButton("Add");
	    btnadd.setBounds(120,250,100,25);
	    btnadd.addActionListener(new ActionListener() {  
	         
	        public void actionPerformed(ActionEvent e){ 
	        	Libraryaccess.bookslist.add(new Book((String)(sub.getItemAt(sub.getSelectedIndex())),
	        			F_namebk.getText(),Integer.parseInt(F_nocopies.getText()),
	        			F_author.getText()));
	        
	        	JWindow w = new JWindow();
		        JLabel l = new JLabel("Book added successfully");
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
	    });
	 
	    f.add(sub);
	    f.add(F_namebk);
	    f.add(F_nocopies);
	    f.add(F_author);
	    f.add(btnadd);
	    
	   
	    f.add(l1);  
	    f.add(l2); 
	    f.add(l4);
	    f.add(l5);
	    
	    f.setSize(450,370); 
	    f.setLayout(null);
	    f.setVisible(true);
	    f.setLocationRelativeTo(null);
	     
	}

}
