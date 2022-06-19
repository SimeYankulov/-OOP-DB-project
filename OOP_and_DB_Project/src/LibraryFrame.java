import java.awt.Dimension;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class LibraryFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	//Tabs
	JTabbedPane tab = new JTabbedPane();
	
	//StudentsPanel and its content
	JPanel studentsPan = new JPanel();
	
				Connection conn=null;
				PreparedStatement state=null;
				ResultSet result=null;


				int idstu=-1;
				int idbor=-1;
				int idbook=-1;
				int idspr = -1;
				
				JPanel studentsPan1 = new JPanel();
				JPanel studentsPan2 = new JPanel();
				JPanel studentsPan3 = new JPanel();
				
				//Student Panel TOP
				JLabel studentID=new JLabel("Student ID :");
				JLabel name = new JLabel("Name :");
				JLabel surname = new JLabel("Surname :");
				JLabel birthdate = new JLabel("Birthdate : Format YYYY-MM-DD");
				JLabel gender = new JLabel("Gender :");
				JLabel grade = new JLabel("Class :");
				JLabel school = new JLabel("School :");
				
				String [] g = {"Male","Female","Other"};
				JComboBox<String> ComboGender=new JComboBox<String>(g);
				
				JTextField studentIDTF = new JTextField();
				JTextField nameTF = new JTextField();
				JTextField surnameTF = new JTextField();
				JTextField birthdateTF = new JTextField();
				JTextField gradeTF = new JTextField();
				JTextField schoolTF = new JTextField();
				//Student Panel Middle
				JButton stuaddBtn=new JButton("Add Student");
				JButton studelBtn=new JButton("Delete Student");
				JButton stueditBtn=new JButton("Edit Student");
			    JLabel searchL = new JLabel("Search students by student id :");
				JButton stusearchBtn = new JButton("Search");
				JTextField stusearchTF = new JTextField();
				JButton sturefreshBtn = new JButton("Refresh");

				//Student Panel Bottom
				JTable stuTable=new JTable();
				JScrollPane stuScroll=new JScrollPane(stuTable);
	
		//Borrows Panel and its content
		JPanel borrowsPan = new JPanel();
		
				JPanel borrowsPan1 = new JPanel();
				JPanel borrowsPan2 = new JPanel();
				JPanel borrowsPan3 = new JPanel();
				
				//Borrows TOP
				JLabel borrowStuID = new JLabel("Student ID :");
				JLabel borrowBook = new JLabel("Book title :");
				
				
				JLabel takenDate = new JLabel("Date borrowed : Format YYYY-MM-DD");
				JLabel returnedDate = new JLabel("Date returned : Format YYYY-MM-DD");
				JLabel searchBorrow =  new JLabel("Search Borrows By Date : Format YYYY-MM-DD     ");
				
				
				JComboBox<String> borrowBookC=new JComboBox<String>();
				JComboBox<String> borrowStudentC=new JComboBox<String>();

				JTextField takenDateTF = new JTextField();
				JTextField returnedDateTF = new JTextField();
				JTextField searchBorrowTF = new JTextField();
				
				//Borrows MID
				JButton borrowBtn = new JButton("Borrow Book");
				JButton editBorrowBtn = new JButton("Edit Borrow");
				JButton delBorrowBtn = new JButton("Delete Borrow");
				JButton searchBorrowBtn = new JButton("Search");
				JButton refreshBorrowBtn = new JButton("Refresh");
				//BorrowsBOT
				JTable borrowTable = new JTable();
				JScrollPane borrowScroll = new JScrollPane(borrowTable);
	 	
	 //Books Panel and its content
	 JPanel booksPan = new JPanel();
				JPanel booksPan1 = new JPanel();
				JPanel booksPan2 = new JPanel();
				JPanel booksPan3 = new JPanel();
				
				//Books Pan Top
				JLabel title = new JLabel("Title :");
				JLabel pages = new JLabel("Pages :");
				JLabel author = new JLabel("Author :");
				JLabel type = new JLabel("Type :");
				JLabel searchBook = new JLabel("Search books by number of pages :");
				
				JTextField titleTF = new JTextField();
				JTextField pagesTF = new JTextField();
				JTextField authorTF = new JTextField();
				JTextField typeTF = new JTextField();
				JTextField bookSearchTF= new JTextField();
				
				//Books PanMIddle
				JButton bookaddBtn=new JButton("Add Book");
				JButton bookdelBtn=new JButton("Delete Book");
				JButton bookeditBtn=new JButton("Edit Book");
				JButton bookrefreshBtn = new JButton("Refresh");
				JButton bookSearchBtn=new JButton("Search");
				
				
				//Books PanBot
				JTable booksTable=new JTable();
				JScrollPane booksScroll=new JScrollPane(booksTable);
	
				
				//Search PANEL
				JPanel searchPan = new JPanel();
					JPanel searchPan1 = new JPanel();
					JPanel searchPan2 = new JPanel();
					JPanel searchPan3 = new JPanel();
					
					JLabel searchReq1 = new JLabel("Student id : ");
					JLabel searchReq2 = new JLabel("Date borrowed : Format YYYY-MM-DD");
					
					JTextField searchReq1TF = new JTextField();
					JTextField searchReq2TF = new JTextField();
					
					JButton search  = new JButton("Search");
					
					JTable searchTable = new JTable();
					JScrollPane searchScroll = new JScrollPane(searchTable);
				
				
	public LibraryFrame() {
		
		this.setSize(600, 750);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setLayout(new FlowLayout());
		this.setTitle("Library");
		
		//StudentsPanel
		tab.add(studentsPan,"Students");
		studentsPan.setLayout(new GridLayout(3,1));
		//Students TOP
			studentsPan.add(studentsPan1);
			
			studentsPan1.setLayout(new GridLayout(7,2));
			
			studentsPan1.add(studentID);
			studentsPan1.add(studentIDTF);
			studentsPan1.add(name); studentsPan1.add(nameTF);
			studentsPan1.add(surname); studentsPan1.add(surnameTF);
			studentsPan1.add(birthdate); studentsPan1.add(birthdateTF);
			studentsPan1.add(gender); studentsPan1.add(ComboGender);
			studentsPan1.add(grade); studentsPan1.add(gradeTF);
			studentsPan1.add(school); studentsPan1.add(schoolTF);
			
		//Students Middle
			studentsPan.add(studentsPan2);

			studentsPan2.add(stuaddBtn);
			studentsPan2.add(stueditBtn);
			studentsPan2.add(studelBtn);
			studentsPan2.add(sturefreshBtn);
			studentsPan2.add(searchL);
			stusearchTF.setPreferredSize(new Dimension(300,30));
			studentsPan2.add(stusearchTF);
			studentsPan2.add(stusearchBtn);
		
			stuaddBtn.addActionListener(new AddStuDB());
			stueditBtn.addActionListener(new EditStuDB());
			studelBtn.addActionListener(new DelStuDB());
			stusearchBtn.addActionListener(new SearchStuDB());
			sturefreshBtn.addActionListener(new RefreshStudentAction());
			
			//Students Bottom
			studentsPan.add(studentsPan3);
			stuScroll.setPreferredSize(new Dimension(550, 200));
			studentsPan3.add(stuScroll);
			
		
		tab.add(borrowsPan,"Borrows");
			borrowsPan.setLayout(new GridLayout(3,1));
			//Borrow TOP
			borrowsPan.add(borrowsPan1);
				borrowsPan1.setLayout(new GridLayout(5,2));
			
				borrowsPan1.add(borrowStuID);borrowsPan1.add(borrowStudentC);
				borrowsPan1.add(borrowBook); borrowsPan1.add(borrowBookC);
				borrowsPan1.add(takenDate); borrowsPan1.add(takenDateTF);
				borrowsPan1.add(returnedDate); borrowsPan1.add(returnedDateTF);
				
				
			//Borrow MID
				borrowsPan.add(borrowsPan2);
				borrowsPan2.add(borrowBtn);
				borrowsPan2.add(editBorrowBtn);
				borrowsPan2.add(delBorrowBtn);
				borrowsPan2.add(refreshBorrowBtn);
				
				
				borrowsPan2.add(searchBorrow);
				searchBorrowTF.setPreferredSize(new Dimension(150,30));
				borrowsPan2.add(searchBorrowTF);
				borrowsPan2.add(searchBorrowBtn);
				
				borrowBtn.addActionListener(new AddBorrowDB());
				editBorrowBtn.addActionListener(new EditBorrowDB());
				delBorrowBtn.addActionListener(new DelBorrowDB());
				refreshBorrowBtn.addActionListener(new RefreshBorrowAction());
				searchBorrowBtn.addActionListener(new SearchBorrowDB());
				
			//Borrow BOT
				borrowsPan.add(borrowsPan3);
				borrowScroll.setPreferredSize(new Dimension(550, 200));
				borrowsPan3.add(borrowScroll);
				
		tab.add(booksPan,"Books");
		booksPan.setLayout(new GridLayout(3,1));
			//Books TOP
			booksPan.add(booksPan1);
			booksPan1.setLayout(new GridLayout(4,2));
				
		
				booksPan1.add(title);
			
				booksPan1.add(titleTF);
				booksPan1.add(pages); booksPan1.add(pagesTF);
				booksPan1.add(author); booksPan1.add(authorTF);
				booksPan1.add(type); booksPan1.add(typeTF);
				
		    //Books MID
				booksPan.add(booksPan2);
					booksPan2.add(bookaddBtn);
					booksPan2.add(bookeditBtn);
					booksPan2.add(bookdelBtn);
					booksPan2.add(bookrefreshBtn);
					booksPan2.add(searchBook);
					booksPan2.add(bookSearchTF);
					bookSearchTF.setPreferredSize(new Dimension(150,30));
					booksPan2.add(bookSearchBtn);	
					
					bookaddBtn.addActionListener(new AddBookDB());
					bookeditBtn.addActionListener(new EditBookDB());
					bookdelBtn.addActionListener(new DelBookDB());
					bookrefreshBtn.addActionListener(new RefreshBookAction());
					bookSearchBtn.addActionListener(new SearchBookAction());
					
			//Books BOT
				booksPan.add(booksPan3);
				booksScroll.setPreferredSize(new Dimension(550, 200));
				booksPan3.add(booksScroll);
			
			//Spr
			tab.add(searchPan,"Search");
				searchPan.add(searchPan1);
				searchPan.add(searchPan2);
				searchPan.add(searchPan3);
				
				searchPan1.setLayout(new GridLayout(2,2));
					searchPan1.add(searchReq1);
					searchPan1.add(searchReq1TF);
					searchPan1.add(searchReq2);
					searchPan1.add(searchReq2TF);
				
					searchPan2.add(search);
					search.addActionListener(new Search());
					searchScroll.setPreferredSize(new Dimension(550, 200));
					searchPan3.add(searchScroll);
					
					
		this.add(tab);
		this.setVisible(true);
		
		stuTable.addMouseListener(new StudentMouseAction());
		booksTable.addMouseListener(new BookMouseAction());
		borrowTable.addMouseListener(new BorrowMouseAction());
	
		this.refreshBookTable();
		this.refreshStuTable();
		this.refreshBorrowTable();
		
		RefreshCStu();
		RefreshCBook();

	}
	//STUDENT TAB
	public void clearStuForm() {
		studentIDTF.setText("");
		nameTF.setText("");
		surnameTF.setText("");
		birthdateTF.setText("");
		gradeTF.setText("");
		schoolTF.setText("");
	}
	public void refreshStuTable() {
		conn=DBConnection.getConnection();
		
		try {
		    state=conn.prepareStatement("select studentid , name, surname , birthdate,gender,grade,school from student");
			result=state.executeQuery();
			
			stuTable.setModel(new Model(result));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class RefreshStudentAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			refreshStuTable();	
		}
	}
	
	class AddStuDB implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			conn=DBConnection.getConnection();
			String sql="insert into student values(null,?,?,?,cast(? as date),?,?,?)";
			
			try {
				state=conn.prepareStatement(sql);
				
				state.setInt(1, Integer.parseInt(studentIDTF.getText()));
				state.setString(2, nameTF.getText());
				state.setString(3, surnameTF.getText());
				state.setString(4,birthdateTF.getText());
				state.setString(5, ComboGender.getSelectedItem().toString());
				state.setInt(6,Integer.parseInt(gradeTF.getText()));
				state.setString(7,schoolTF.getText());
				
				state.execute();
				refreshStuTable();
				
				clearStuForm();
				RefreshCStu();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
	class DelStuDB implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			conn=DBConnection.getConnection();
			String sql="delete from student where id=?";
			
			try {
				state=conn.prepareStatement(sql);
				state.setInt(1, idstu);
				state.execute();
				refreshStuTable();
				clearStuForm();
				RefreshCStu();
	
				idstu=-1;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
	}
	class EditStuDB implements ActionListener {
		public void actionPerformed (ActionEvent arg0) {
			conn=DBConnection.getConnection();
			if(idstu>0) {
				String sql="update student set studentid=?, name=?,surname=? ,birthdate=?, gender=?, grade=?, school=? where id=?";
			
				try {
					state=conn.prepareStatement(sql);
					
					state.setInt(1, Integer.parseInt(studentIDTF.getText()));
					state.setString(2, nameTF.getText());
					state.setString(3, surnameTF.getText());
					state.setString(4,birthdateTF.getText());
					state.setString(5, ComboGender.getSelectedItem().toString());
					state.setInt(6,Integer.parseInt(gradeTF.getText()));
					state.setString(7,schoolTF.getText());
					state.setInt(8, idstu);
					
					state.execute();
					
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refreshStuTable();	
				clearStuForm();
				RefreshCStu();
			}			
		}
	}
	class StudentMouseAction implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			int row=stuTable.getSelectedRow();
			studentIDTF.setText(stuTable.getValueAt(row, 0).toString());
			nameTF.setText(stuTable.getValueAt(row, 1).toString());
			surnameTF.setText(stuTable.getValueAt(row, 2).toString());
			birthdateTF.setText(stuTable.getValueAt(row, 3).toString());
			if(stuTable.getValueAt(row, 4).toString().equals("Male")) {
				ComboGender.setSelectedIndex(0);
			}
			else if(stuTable.getValueAt(row, 4).toString().equals("Female")) {
				ComboGender.setSelectedIndex(1);
			}else {
				ComboGender.setSelectedIndex(2);
			}
			gradeTF.setText(stuTable.getValueAt(row, 5).toString());
			schoolTF.setText(stuTable.getValueAt(row, 6).toString());
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class SearchStuDB implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			conn=DBConnection.getConnection();
			String sql="select studentid , name, surname , birthdate,gender,grade,school from student where studentid=?";
			
			try {
				state=conn.prepareStatement(sql);
				state.setInt(1, Integer.parseInt(stusearchTF.getText()));
				result=state.executeQuery();
				stuTable.setModel(new Model(result));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			stusearchTF.setText("");
		}
	}
	//STUDENT TAB
	
	//BORROW TAB
	
	public void RefreshCStu() {
		
		idstu=-1;

		borrowStudentC.removeAllItems();
		
		String sql="select id, studentid from student";
		conn=DBConnection.getConnection();
		String item="";
		
		try {
			state=conn.prepareStatement(sql);
			result=state.executeQuery();
			if(result.next()) {
				idstu=Integer.parseInt(result.getObject(1).toString());
				do {
					item=result.getObject(2).toString();
					borrowStudentC.addItem(item);
				}while(result.next());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void RefreshCBook() {
		
		idbook=-1;

		borrowBookC.removeAllItems();
		
		String sql="select id, title from book";
		conn=DBConnection.getConnection();
		String item="";
		
		try {
			state=conn.prepareStatement(sql);
			result=state.executeQuery();
			if(result.next()) {
				idbook=Integer.parseInt(result.getObject(1).toString());
				do {
					item=result.getObject(2).toString();
					borrowBookC.addItem(item);
				}while(result.next());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clearBorrowForm() {
		
		RefreshCStu();
		RefreshCBook();
		takenDateTF.setText("");
		returnedDateTF.setText("");
	

	}
	public void refreshBorrowTable() {
		conn=DBConnection.getConnection();
		
		try {
		    state=conn.prepareStatement("select * from borrow");//studentid,booktitle,dateb,dater
			result=state.executeQuery();
			
			borrowTable.setModel(new Model(result));
			
			borrowTable.getColumnModel().getColumn(0).setMinWidth(0);
			borrowTable.getColumnModel().getColumn(0).setMaxWidth(0);
			borrowTable.getColumnModel().getColumn(0).setWidth(0);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class RefreshBorrowAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			clearBorrowForm();
			refreshBorrowTable();
		}
	}
	
	class AddBorrowDB implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			conn=DBConnection.getConnection();
			String sql="insert into borrow values(null,?,?,cast(? as date),cast(? as date))";
			try {
				state=conn.prepareStatement(sql);
			
			
				state.setInt(1,Integer.parseInt(borrowStudentC.getSelectedItem().toString()));
				state.setString(2,borrowBookC.getSelectedItem().toString());
				state.setString(3,takenDateTF.getText());
				state.setString(4,returnedDateTF.getText());
				
				state.execute();
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			refreshBorrowTable();
			clearBorrowForm();
		}
		
	}
	class DelBorrowDB implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			conn=DBConnection.getConnection();
			String sql="delete from borrow where id=?";
			
			try {
				state=conn.prepareStatement(sql);
				
				state.setInt(1, idbor); 
				state.execute();
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			refreshBorrowTable();
			clearBorrowForm();

			idbor=-1;
		}
	}
	class EditBorrowDB implements ActionListener {
		public void actionPerformed (ActionEvent arg0) {
			conn=DBConnection.getConnection();
			if(idbor>0) {
				String sql="update borrow set studentid=?, booktitle=?,dateb=cast(? as date) ,dater=cast(? as date) where id=?";
			
				try {
					state=conn.prepareStatement(sql);
					
					
					state.setInt(1,Integer.parseInt(borrowStudentC.getSelectedItem().toString()));
					state.setString(2,borrowBookC.getSelectedItem().toString());
					state.setString(3,takenDateTF.getText());
					state.setString(4,returnedDateTF.getText());
				    state.setInt(5, idbor);
					state.execute();

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refreshBorrowTable();
				clearBorrowForm();
				idbor= -1;
			}			
		}
	}
	class BorrowMouseAction implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			int row=borrowTable.getSelectedRow();
			
			idbor =Integer.parseInt((borrowTable.getValueAt(row, 0).toString()));
			
			borrowStudentC.setSelectedItem(borrowTable.getValueAt(row, 1).toString());
			borrowBookC.setSelectedItem(borrowTable.getValueAt(row, 2).toString());
			takenDateTF.setText(borrowTable.getValueAt(row, 3).toString());
			returnedDateTF.setText(borrowTable.getValueAt(row, 4).toString());
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class SearchBorrowDB implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			conn=DBConnection.getConnection();
			String sql="select * from borrow where dateb = cast(? as date)";
			
			try {
				state=conn.prepareStatement(sql);
				state.setString(1,searchBorrowTF.getText());
				result=state.executeQuery();
				borrowTable.setModel(new Model(result));
				borrowTable.getColumnModel().getColumn(0).setMinWidth(0);
				borrowTable.getColumnModel().getColumn(0).setMaxWidth(0);
				borrowTable.getColumnModel().getColumn(0).setWidth(0);
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			searchBorrowTF.setText("");
		}
	}
	//BORROW TAB

	// BOOK TAB
	public void clearBookForm() {
		titleTF.setText("");
		pagesTF.setText("");
		authorTF.setText("");
		typeTF.setText("");
	}
	public void refreshBookTable() {
		conn=DBConnection.getConnection();
		
		try {
		    state=conn.prepareStatement("select title,pages,author,type from book");
			result=state.executeQuery();
			
			booksTable.setModel(new Model(result));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class RefreshBookAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			refreshBookTable();	
		}
	}
	
	class AddBookDB implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			conn=DBConnection.getConnection();
			String sql="insert into book values(null,?,?,?,?)"; 
			
			try {
				state=conn.prepareStatement(sql);
				state.setString(1, titleTF.getText());
				state.setInt(2, Integer.parseInt(pagesTF.getText()));
				state.setString(3, authorTF.getText()); 
				state.setString(4, typeTF.getText());
				
				state.execute();
				refreshBookTable();
				clearBookForm();
				RefreshCBook();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
	class DelBookDB implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			conn=DBConnection.getConnection();
			String sql="delete from book where id=?";
			
			try {
				state=conn.prepareStatement(sql);
				state.setInt(1, idbook);
				state.execute();
				refreshBookTable();
				clearBookForm();
				RefreshCBook();
		
				idbook=-1;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
		class EditBookDB implements ActionListener {
			public void actionPerformed (ActionEvent arg0) {
				conn=DBConnection.getConnection();
				if(idbook>0) {
					String sql="update book set title=?, pages=?, author=?, type=? where id=?";
				
					try {
						state=conn.prepareStatement(sql);
						
						state.setString(1, titleTF.getText());
						state.setInt(2, Integer.parseInt(pagesTF.getText()));
						state.setString(3, authorTF.getText());
						state.setString(4,typeTF.getText());
						state.setInt(5, idbook);
						state.execute();
						
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					refreshBookTable();	
					clearBookForm();
					RefreshCBook();
				}			
			}
		}
		
		class BookMouseAction implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent e) {
				int row=booksTable.getSelectedRow();
		
				titleTF.setText(booksTable.getValueAt(row, 0).toString());
				pagesTF.setText(booksTable.getValueAt(row, 1).toString());
				authorTF.setText(booksTable.getValueAt(row, 2).toString());
				typeTF.setText(booksTable.getValueAt(row, 3).toString());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
		class SearchBookAction implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				conn=DBConnection.getConnection();
				String sql="select * from book where pages=?";
				
				try {
					state=conn.prepareStatement(sql);
					state.setInt(1, Integer.parseInt(bookSearchTF.getText()));
					result=state.executeQuery();
					booksTable.setModel(new Model(result));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				bookSearchTF.setText("");
			}
		}
		//BOOK TAB
		
		//SEARCH TAB
		
		public void refreshSearchTable() {
			conn=DBConnection.getConnection();
			
			try {
			    state=conn.prepareStatement("select student.studentid,student.name, student.surname , student.birthdate, student.gender,student.grade,student.school,borrow.booktitle from Student,Borrow,Book ");
				result=state.executeQuery();
				
				booksTable.setModel(new Model(result));
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		class Search implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				conn=DBConnection.getConnection();
			
				String sql = "select student.studentid, borrow.booktitle , borrow.dateb from student,borrow where student.studentid=? and borrow.dateb=?";
				
				try {
					state=conn.prepareStatement(sql);
					state.setInt(1,Integer.parseInt(searchReq1TF.getText()));
					state.setString(2, searchReq2TF.getText());
					
					result=state.executeQuery();
					
					searchTable.setModel(new Model(result));
			
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
}
