
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewIssuedBooks {
	public static void main(String[] args) {
		view();
	}
	
	public static void view() {
	    JFrame f=new JFrame("View Issued books");
	    
	    
		Iterator<Student> itr1 = Libraryaccess.studentlist.iterator();
		Student s;
		int stbkcount=0;
		while (itr1.hasNext())
		{
		    s = (Student)itr1.next();
				Iterator<StBook> itr2 = s.stbookslist.iterator();
				while (itr2.hasNext())
				{
					StBook b = (StBook)itr2.next();
					stbkcount+=1;
				}
			}
		String data[][]=new String[stbkcount][4];
	    for(int i=0;i<stbkcount;i++)
	    {
	    	for(int j=0;j<4;j++)
	    	{
	    		data[i][j]="";
	    	}
	    }
	    
	   
	    String[] columnNames = {"Name of student", "Subject", "Name of the Book", "Author"};
	    int ir=0;
	    Iterator<Student> itr3 = Libraryaccess.studentlist.iterator();
		Student s1;
	    while (itr3.hasNext())
		{
		    s1 = (Student)itr3.next();
				Iterator<StBook> itr4 = s1.stbookslist.iterator();
				data[ir][0]=s1.name;
				while (itr4.hasNext())
				{
					StBook b = (StBook)itr4.next();
					int ic=1;
					data[ir][ic]+=b.subject;
					ic=2;
					data[ir][ic]+=b.name;
					ic=3;
					data[ir][ic]+=b.author;
					ir=ir+1;
				}
			}
	    
	    JTable jtbl = new JTable(data, columnNames);
		  
		    JButton btnok=new JButton("OK");
		    btnok.addActionListener(new ActionListener() {  //Perform action
		         
		        public void actionPerformed(ActionEvent e){ 
		        	
		        f.dispose();
		        Librarianmenu.main(new String[]{});   
		    }               
		    });
		    JScrollPane sp = new JScrollPane(jtbl);
		    JPanel p1=new JPanel(new BorderLayout());
		  
		    JPanel p2=new JPanel(new BorderLayout());
		   
		    p1.add(sp);
		    p2.add(btnok, BorderLayout.CENTER);
		    f.add(p1,BorderLayout.CENTER);
		    f.add(p2,BorderLayout.SOUTH);
	        f.setSize(800,600);   
		    f.setVisible(true);
			
		
	
	
	}    
	}

