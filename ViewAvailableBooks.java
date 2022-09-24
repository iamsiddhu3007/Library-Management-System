
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewAvailableBooks {
	public static void main(String[] args) {
		view();
}

	public static void view() {
	    JFrame f=new JFrame("View Available books");
	    Iterator<Book> itr2 = Libraryaccess.bookslist.iterator();
	    int bookcount=0;
		while (itr2.hasNext())
		{
			Book b = (Book)itr2.next();
			if(b.copies!=0)
				bookcount=bookcount+1;
		}
	    String data[][]=new String[bookcount][4];
	    for(int i=0;i<bookcount;i++)
	    {
	    	for(int j=0;j<4;j++)
	    	{
	    		data[i][j]="";
	    	}
	    }
	    
	    int ir=0;
	    String[] columnNames = { "Subject", "Name of the Book", "Copies", "Author" };
	    Iterator<Book> itr1 = Libraryaccess.bookslist.iterator();
		while (itr1.hasNext())
		{
			
			Book b = (Book)itr1.next();
			if(b.copies!=0) {
			int ic=0;
			data[ir][ic]+=b.subject;
			ic=1;
			data[ir][ic]+=b.name;
			ic=2;
			data[ir][ic]+=b.copies;
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