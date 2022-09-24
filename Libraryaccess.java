
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Libraryaccess {			
	public static LinkedList<Book> bookslist = new LinkedList<Book>();
	public static LinkedList<Student> studentlist=new LinkedList<Student>();
	public static  String Librarianname="";
	public static String Librarianphno="";
	public static String Librarianuserid="";
	public static String Librarianpassword="";
	public static void main(String args[])
	{
		UserMenu.main(new String[]{});
		
	    bookslist.add(new Book("Maths","Discrete mathematics for computing",3,"Peter Grossman"));
		bookslist.add(new Book("Maths","Advanced Engineering Mathematics",4,"Erwin Kreyszig"));
		bookslist.add(new Book("Physics","Introduction to Electrodynamics",2,"David J Griffiths"));
		bookslist.add(new Book("Physics","Classical Electrodynamics",3,"J.D.Jackson"));
		bookslist.add(new Book("Computer Science","Java The complete reference",2,"Herbert Schildt"));
		bookslist.add(new Book("Computer Science","Introduction to java programming",1,"Y.Daniel Liang"));
		bookslist.add(new Book("Computer Science","Artificial Intelligence:A Modern Approach",2,"Russell"));
		bookslist.add(new Book("Psychology","The Power of Your Subconsious Mind",1,"Joseph Murphy"));
		bookslist.add(new Book("Psychology","The Psychology of Money",1,"Morgan Housel"));
		bookslist.add(new Book("Psychology","Games People Play: The Psychology of Human Relationships",1,"Eric Berne"));
		bookslist.add(new Book("Business","The Intelligent Investor",2,"Benjamin Graham"));
		bookslist.add(new Book("Business","Think and Grow Rich",3,"Napoleon Hill"));
		bookslist.add(new Book("Aviation","Airline Airport & Tourism management: Aviation Manual",2,"Dr. Sumeet Suseelan"));
		bookslist.add(new Book("Aviation","Pilot's Handbook of Aeronautical Knowledge",4,"Federal Aviation Administration"));
		bookslist.add(new Book("Videography","Filming for Pleasure and Profit",3,"Ches Livingstone"));
		bookslist.add(new Book("Photography","The Beginner's Photography Guide",2,"Chris Gatcum"));
		bookslist.add(new Book("Modelling","Professional Modelling",1,"Louise Cole"));
		bookslist.add(new Book("Modelling","Fashion Musings",1,"Meher Castelino"));
		bookslist.add(new Book("Modelling","Stragetic Fashion Management",2,"Ranjit Thind"));
		bookslist.add(new Book("Novels","1984",1,"George Orwell"));
		bookslist.add(new Book("Novels","Treasure Island",1,"Robert Louis Stevenson"));
		bookslist.add(new Book("Novels","Pride & Prejudice",1,"Jane Austen"));
		bookslist.add(new Book("Novels","Wuthering Heights",1,"Emily Brontë "));
		bookslist.add(new Book("Novels","The Dairy of A Young Girl",1,"Anne Frank"));
		bookslist.add(new Book("Miscellaneous","The Quick and Easy Way to Effective Speaking",1,"Dale Carnegie "));
		bookslist.add(new Book("Miscellaneous","Ted Talks",1,"Chris Anderson"));
		bookslist.add(new Book("Miscellaneous","The Library Book",1,"Susan Orlean"));
	}
	public static LinkedList<Book> GetList()
    {
        return bookslist;
    }

}

class Book{
	String subject;
	String name;
	int copies;
	String author;
	Book(String subject,String name, int copies, String author)
	{
		this.subject=subject;
		this.name=name;
		this.copies=copies;
		this.author=author;
	}
	
}

class StBook {
	LocalDate bdate;
	String subject;
	String name;
	String author;
	StBook(String subject, String name, String author, LocalDate bdate) {
		this.subject=subject;
		this.name=name;
		this.author=author;
		this.bdate=bdate;
	}	
}

class Student{
	String name;
	String phno;
	String Dept;
	String userid;
	String password;
	LinkedList<StBook> stbookslist=new LinkedList<StBook>();
	
	Student(String name, String phno, String Dept, String userid, String password)
	{
		this.name=name;
		this.phno=phno;
		this.Dept=Dept;
		this.userid=userid;
		this.password=password;
		
	}
}



