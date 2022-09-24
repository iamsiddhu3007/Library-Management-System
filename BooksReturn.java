
import java.util.Date;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

public class BooksReturn extends JFrame {
	static BooksReturn frame;
	private JPanel contentPane;
	
	public static void main(String strings) {
		BooksReturn(strings);
		
	}
		
public static void BooksReturn(String strings) {
	 JFrame fr=new JFrame("Return Books");	
	
	JLabel lbl1 = new JLabel("Select the book you want to return:");
	lbl1.setFont(new Font("Tahoma", Font.ITALIC,15));
	int countbooks=0;
	lbl1.setBounds(5, 10, 400, 20);
	fr.add(lbl1);
	JLabel l1=new JLabel("Today's date     Day(dd):");  
    
    l1.setBounds(5, 50, 150, 20);
    fr.add(l1);
   
	 JTextField F_day = new JTextField(); 
	   F_day.setBounds(160, 50, 50, 20);
	fr.add(F_day);
	JLabel lbmon=new JLabel("Month(mm):");
	lbmon.setBounds(215, 50, 77, 20);
	fr.add(lbmon);
	JTextField F_mon = new JTextField(); 
	   F_mon.setBounds(290, 50, 50, 20);
	fr.add(F_mon);
	
	JLabel lbyr=new JLabel("Year(yyyy):");
	lbyr.setBounds(350, 50, 75, 20);
	fr.add(lbyr);
	JTextField F_yr = new JTextField(); 
	   F_yr.setBounds(430, 50, 50, 20);
	fr.add(F_yr);
	
	Iterator<Student> itr4 = Libraryaccess.studentlist.iterator();
	Student s1;
	while (itr4.hasNext())
	{
		
	    s1 = (Student)itr4.next();
		if(s1.userid.equals(strings)) {
			Iterator<StBook> itr3 = s1.stbookslist.iterator();
			while (itr3.hasNext())
			{
				StBook b = (StBook)itr3.next();
				
				countbooks++;
			}
			break;
		}
		
	}
	
	JButton btnok1=new JButton("OK");
	btnok1.setBounds(150, 280, 100, 30);
	fr.add(btnok1);
	JRadioButton[] buttonsgrp2=new JRadioButton[countbooks];
	int bi=0;
	
	Iterator<Student> itr1 = Libraryaccess.studentlist.iterator();
	Student s;
	
	while (itr1.hasNext())
	{
		
	    s = (Student)itr1.next();
		if(s.userid.equals(strings)) {
			int hght=80;
			Iterator<StBook> itr2 = s.stbookslist.iterator();
			while (itr2.hasNext())
			{
				
				StBook b = (StBook)itr2.next();
					buttonsgrp2[bi]=new JRadioButton(b.name+" by "+b.author);
					buttonsgrp2[bi].setBounds(15, hght, 400, 20);
					hght=hght+40;
					fr.add(buttonsgrp2[bi]);
					bi=bi+1;			
			}
			break;
		}
		
	}
	fr.setSize(500,400);
    fr.setLayout(null);
    fr.setVisible(true);
    fr.setLocationRelativeTo(null);
	
	
	btnok1.addActionListener(new ActionListener() {
       
		public void actionPerformed(ActionEvent e)
        {
        	int bc=0;
        	String retbookname="";
        	StBook book1;
        	for(int i=0;i<buttonsgrp2.length;i++) {
            if(buttonsgrp2[i].isSelected())
            {
            	Iterator<Student> itr5 = Libraryaccess.studentlist.iterator();
            	Student s2;
            	while (itr5.hasNext())
            	{
            		
            	    s2 = (Student)itr5.next();
            		if(s2.userid.equals(strings)) {
            			Iterator<StBook> itr6 = s2.stbookslist.iterator();
            			while (itr6.hasNext()&& bc<i)
            			{
            				book1 = (StBook)itr6.next();
            				retbookname=retbookname+book1.name;
            				bc=bc+1;
            			}
            			
            			s2.stbookslist.remove(bc);
            		}           		
            		
            	}	
            }
        	}
        	
        	
        	Iterator<Book> itr7 = Libraryaccess.bookslist.iterator();
        	Book b2;
        	while(itr7.hasNext())
        	{
        		Book b3=(Book)itr7.next();
        		if(b3.name.equals(retbookname))
        		{
        			b3.copies=b3.copies+1;
        			System.out.println(b3.name+b3.copies);
        		}
        	}
        		
    				LocalDate localDate1 = LocalDate.now();

    		
    		LocalDate localDate2 = LocalDate.of(Integer.parseInt(F_yr.getText()), Integer.parseInt(F_mon.getText()), Integer.parseInt(F_day.getText()));

    		
    		int daysdif = (int) ChronoUnit.DAYS.between(localDate1, localDate2);
        	
        	if(daysdif<=10) {
        		
        		 JWindow w = new JWindow();
     	        JLabel l = new JLabel("Book returned successfully");
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
     		        	 fr.dispose();
     		        	Student_menu.main(strings);
     		        }               
     		    }); 
        
        	}
        	
        	if (daysdif>10) {
        		fr.dispose();
        		JFrame f=new JFrame("Pay Penalty");
        		JLabel lb1=new JLabel("The due date for returning the book has crossed. Pay Rs. "+(daysdif-10)*2);
        		lb1.setBounds(10,20, 440,30);
        		JLabel cardnum=new JLabel("Card Number:");
        		cardnum.setBounds(30,70, 100,30);
        		  
        		    JLabel expdate=new JLabel("Expiry date:");  
        		    expdate.setBounds(30, 120, 100, 30);
        		    
        		 JLabel cvv= new JLabel("CVV:");  
     		    cvv.setBounds(30, 170, 100, 30);
     		    
     		   JLabel amt= new JLabel("Enter amount:");  
    		    amt.setBounds(30, 220, 110, 30);
        		    
        		    JTextField F_cardnum = new JTextField(); 
        		    F_cardnum.setBounds(120, 70, 200, 30);
        		    
        		    JTextField F_expdate = new JTextField(); 
        		    F_expdate.setBounds(120, 120, 200, 30);
        		    
        		    JTextField F_cvv = new JTextField(); 
        		    F_cvv.setBounds(120, 170, 200, 30);
        		    
        		    JTextField F_amount = new JTextField();
        		    F_amount.setBounds(125, 220, 200, 30);
        		    
        		    
        		    JButton btnpay=new JButton("Pay");
        		    btnpay.setBounds(180,275,100,25);
        		    
        		    f.add(F_cardnum);
        		    f.add(F_expdate); 
        		    f.add(F_cvv);
        		    f.add(F_amount);
        		    f.add(btnpay);
        		   f.add(lb1);
        		    f.add(cardnum);  
        		    f.add(expdate);
        		    f.add(cvv);
        		    f.add(amt);
        		  
        		    
        		    f.setSize(450,360); 
        		    f.setLayout(null);
        		    f.setVisible(true);
        		    f.setLocationRelativeTo(null);
        		    
        		    
        		    btnpay.addActionListener(new ActionListener() {  
        		         
        		        public void actionPerformed(ActionEvent e){ 
        		        
        		        JWindow w = new JWindow();
             	        JLabel l = new JLabel("Transaction successfull    ");
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
                		        Student_menu.main(strings);;
             		        }               
             		    }); 
        		       
        		    }               
        		    });
        		 
        		    
        		    
        		    
        		    
        		    
        		
        	}
        }
    });
	
	}
	
	
}