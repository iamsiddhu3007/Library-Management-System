
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class BooksBorrow extends JFrame {
	static BooksBorrow frame;
	private JPanel contentPane;
	
	public static void main(String strings) {
		new BooksBorrow(strings);
		
	}
	
	public BooksBorrow(String args2) {
		
	JFrame f=new JFrame("Borrow books");
	
	JLabel lbl1 = new JLabel("Borrow Books     ");
	lbl1.setFont(new Font("Tahoma", Font.BOLD, 18));
	lbl1.setForeground(Color.red);
	JLabel lbl2 = new JLabel("Select the subject of the book:");
	lbl2.setFont(new Font("Tahoma", Font.ITALIC,15));
	
	JRadioButton btnmaths=new JRadioButton("Maths");
	JRadioButton btnphysics=new JRadioButton("Physics");
	JRadioButton btncomputerscience=new JRadioButton("Computer Science");
	JRadioButton btnpsychology=new JRadioButton("Psychology");
	JRadioButton btnbusiness=new JRadioButton("Business");
	JRadioButton btnaviation=new JRadioButton("Aviation");
	JRadioButton btnvideography=new JRadioButton("Videography");
	JRadioButton btnphotography=new JRadioButton("Photography");
	JRadioButton btnmodelling=new JRadioButton("Modelling");
	JRadioButton btnnovels=new JRadioButton("Novels");
	JRadioButton btnmiscellaneous=new JRadioButton("Miscellaneous");
	JButton btnok1=new JButton("OK");
	
	lbl2.setBounds(40, 20, 500, 20);
	btnmaths.setBounds(40, 65, 300, 20);
	btnphysics.setBounds(40, 85, 300, 20);
	btncomputerscience.setBounds(40, 105, 300, 20);
	btnpsychology.setBounds(40, 125, 300, 20);
	btnbusiness.setBounds(40, 145, 300, 20);
	btnaviation.setBounds(40, 165, 300, 20);
	btnvideography.setBounds(40, 185, 300, 20);
	btnphotography.setBounds(40, 205, 300, 20);
	btnmodelling.setBounds(40, 225, 300, 20);
	btnnovels.setBounds(40, 245, 300, 20);
	btnmiscellaneous.setBounds(40, 265, 300, 20);
	btnok1.setBounds(50, 300, 100, 30);
	
	btnok1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
           
            if (btnmaths.isSelected()) {
            	SubjectFrame.main(args2,"Maths");
    			f.dispose();
            }

            else if (btnphysics.isSelected()) {
            	SubjectFrame.main(args2,"Physics");
    			f.dispose();
            }
            else if (btncomputerscience.isSelected()) {
            	SubjectFrame.main(args2,"Computer Science");
    			f.dispose();

            }
            
            else if (btnpsychology.isSelected()) {
            	SubjectFrame.main(args2,"Psychology");
    			f.dispose();

                
            }
            else if (btnbusiness.isSelected()) {
            	SubjectFrame.main(args2,"Business");
    			f.dispose();

                
            }
            else if (btnaviation.isSelected()) {
            	SubjectFrame.main(args2,"Aviation");
    			f.dispose();

                
            }
            else if (btnvideography.isSelected()) {
            	SubjectFrame.main(args2,"Videography");
    			f.dispose();

                
            }
            else if (btnphotography.isSelected()) {
            	SubjectFrame.main(args2,"Photography");
    			f.dispose();

                
            }
            else if (btnmodelling.isSelected()) {
            	SubjectFrame.main(args2,"Modelling");
    			f.dispose();

                
            }
            else if (btnnovels.isSelected()) {
            	SubjectFrame.main(args2,"Novels");
    			f.dispose();

                
            }
            else if (btnmiscellaneous.isSelected()) {
            	SubjectFrame.main(args2,"Miscellaneous");
    			f.dispose();

                
            }
        }
    });
	f.add(lbl2);
	f.add(btnmaths);
	f.add(btnphysics);
	f.add(btncomputerscience);
	f.add(btnpsychology);
	f.add(btnbusiness);
	f.add(btnaviation);
	f.add(btnvideography);
	f.add(btnphotography);
	f.add(btnmodelling);
	f.add(btnnovels);
	f.add(btnmiscellaneous);
	f.add(btnok1);
	
	
	f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setLocationRelativeTo(null);
	}
}
