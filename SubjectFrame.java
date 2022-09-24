
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
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
import javax.swing.JWindow;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

public class SubjectFrame extends JFrame {
	static SubjectFrame frame;
	private JPanel contentPane;
	public static void main(String args1,String subj) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame =new SubjectFrame(args1,subj);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public SubjectFrame(String args1,String subj) {
		int countsub=0;
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(300, 100, 500, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	
	JLabel lbl1 = new JLabel("Select the book you want to borrow:");
	lbl1.setFont(new Font("Tahoma", Font.ITALIC,15));
	contentPane.add(lbl1);
	Iterator<Book> itr1 = Libraryaccess.bookslist.iterator();
	
	while (itr1.hasNext())
	{
		
		Book b = (Book)itr1.next();
		if(b.subject.equals(subj)) {
			countsub=countsub+1;
		} 
	}
	
	JRadioButton[] buttonsgrp2= new JRadioButton[countsub];
	int bi=0;
	JButton btnok1=new JButton("OK");
	btnok1.setBounds(180, 350, 100, 25);
	
	Iterator<Book> itr2 = Libraryaccess.bookslist.iterator();
	while (itr2.hasNext())
	{
		Book b = (Book)itr2.next();
		if(b.subject.equals(subj)&& b.copies!=0) {
			buttonsgrp2[bi]=new JRadioButton(b.name+" by "+b.author);
			contentPane.add(buttonsgrp2[bi]);
			bi=bi+1;
		}			
	}
	contentPane.add(btnok1);
	btnok1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        	Book b;
        	int j=0;
        	String selname="";
        	String selsubject="";
        	String selauthor="";
        	for(int i=0;i<buttonsgrp2.length;i++) {
            if(buttonsgrp2[i].isSelected())
            {
            	Iterator<Book> itr = Libraryaccess.bookslist.iterator();
            	while (itr.hasNext() && j<=i)
            	{
            		b=(Book)itr.next();
            		if(b.subject.equals(subj)){
            			if(j==i) {
                    		selname=selname+b.name;
                    		selsubject=selsubject+b.subject;
                    		selauthor=selauthor+b.author;
                    		break;
                    		}
            			j=j+1;
            		
            		}
            	}
            }
        	}
        	Iterator<Book> itr3 = Libraryaccess.bookslist.iterator();
        	Book bk1;
        	while (itr3.hasNext())
        	{
        		bk1=(Book)itr3.next();
        		if(bk1.name.equals(selname)){
        		bk1.copies=bk1.copies-1;
        		
        		}
        	}
        	
        	Iterator<Student> itr4 = Libraryaccess.studentlist.iterator();
        	while (itr4.hasNext())
        	{
        		Student s2=(Student)itr4.next();
        		if(s2.userid.equals(args1)) {
        		 s2.stbookslist.add(new StBook(selsubject,selname,selauthor,LocalDate.now()));
        		
        		}
        	}
        	
        	
        	JWindow w = new JWindow();
	        JLabel l = new JLabel("Book borrowed successfully");
	        JButton bok2 = new JButton("OK");
	        JPanel p = new JPanel();
	        p.add(l);
	        p.add(bok2);
	        w.add(p);
	        w.setSize(200, 80);
	        p.setBackground(Color.YELLOW);
	        w.setLocation(450, 250);
	        w.show();
	        
	        bok2.addActionListener(new ActionListener() {  
		         
		        public void actionPerformed(ActionEvent e){ 
		        	w.setVisible(false);
		        	 frame.dispose();
		        	 Student_menu.main(args1);
		        }               
		    });
        		
        }
    });

}
}
