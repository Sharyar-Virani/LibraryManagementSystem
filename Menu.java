	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.Scanner;
	
	public class Menu{
     Form form = new Form();



	 Scanner sc = new Scanner (System.in);
	 Scanner s = new Scanner (System.in);
	 static ArrayList<Book> books=new ArrayList<Book>(); 
	 static ArrayList<Student> students=new ArrayList<Student>();
	 static ArrayList<Teacher> teachers=new ArrayList<Teacher>();
	 
	 static ArrayList<Integer> booksIssued = new ArrayList<Integer>();
	 
	public  void mainMenu(){
	
		System.out.println("Enter 1 to return books");
		System.out.println("Enter 2 to look all lists of books");
		System.out.println("Enter 3 to look all students data");	
		System.out.println("Enter 4 to look all teachers data");
		System.out.println("Enter 5 to issue books");
		System.out.println("Enter 6 to enter a new member");
		System.out.println("Enter 7 to check demand");
		System.out.println("Enter 8 to check issued books");
		System.out.println("Enter 9 to check request for seminar");
		System.out.println("Enter 10 to add info on notice board");
		System.out.println("Enter 11 to check complain");
		System.out.println("Enter 12 to log off");	
		int in = sc.nextInt();

		 
		boolean rr = true;

		while (rr == true){
			teachers.add(new Teacher(1001 , "            Prof.Aziz Suleman", "        RB-1" , "                  2006"));
			teachers.add(new Teacher(1002 , "            Prof.Israr Yaqoob", "        RB-1" , "                  2005"));
			teachers.add(new Teacher(1003 , "            Dr.Ali Huda", "              RB-1" , "                  2004"));
	        teachers.add(new Teacher(1004 , "            Prof.Naureen Sajan", "       RB-1" , "                  2008"));
			teachers.add(new Teacher(1005 , "            Dr.Azeem Aftab", "           RB-1" , "                  2009"));
			teachers.add(new Teacher(1006 , "            Prof.Javed Khan", "          RB-1" , "                  2008"));
			teachers.add(new Teacher(1007 , "            Prof.Ameer Sikh", "          RB-1" , "                  2005"));
			
			rr = false;
		}
		
		

		boolean exit = true;

		while (exit == true) {
		    
		    books.add(new Book(8001, "    Principle of Management", "        Muhammad Abbas",true));
		    books.add(new Book(8002, "    Marketing Management" , "           Khusboo Salim ",true));
		    books.add(new Book(8003 , "    Object Oriented Programing" ,"     DR.Arij Mehmood",true));
		    books.add(new Book(8004 , "    Principle of Accounting" ,"        Fahim Abbasi ",true  ));
		    books.add(new Book(8005 , "    Microbiology" ,"                   DR.Sana Imran ",true ));
		    books.add(new Book(8006 , "    Introduction To Computers" ,"      Kabir Alawat " ,true ));
		    books.add(new Book(8007 , "    Introduction To Java" ,"           DR.Brown Alan ",true ));
		    books.add(new Book(8008 , "    Networking" ,"                     Ali Qureshi "  ,true ));
		    books.add(new Book(8009 , "    DataBase Management" ,"            Adam Rayan "   ,true ));
		    books.add(new Book(8010 , "    A-Level Physics" ,"                Nicolon Pinsley",true));
		    books.add(new Book(8011 , "    A-Level Chemistry" ,"              Alan Viv.D  "  ,true ));
		    books.add(new Book(8012 , "    A-Level Biology" ,"                Jacky Tyler "  ,true ));
		    books.add(new Book(8013 , "    Reccursion in Java" ,"             Damon Salvatore",true));
		    books.add(new Book(8014 , "    Cyber Hacking" ,"                  Stefan Salvatore",true));
		    books.add(new Book(8015 , "    Network And Security" ,"           Nick Klaus ",true));
		    books.add(new Book(8016 , "    3D Game Development" ,"            Math Donavan ",true));
		    books.add(new Book(8017 , "    Phycology" ,"                      DR.Bonnei Benett   ",true));
		    books.add(new Book(8018 , "    Philosophy and Relegion" ,"        Margery Tyler ",true));
		    books.add(new Book(8019 , "    Fifty Shades Of Grey" ,"           Sophie Tyler ",true));
		    books.add(new Book(8020 , "    Fifty Shades of Darker" ,"         Elena D.Cruz ",true));
		    exit = false;
		   
		}

		 
		boolean open = true;

		while (open == true){
			students.add(new Student(4001 , "            Sani Khamisa", "          RB-1" , "                 2013",false));
			students.add(new Student(4002 , "            Karbir Khan", "           RB-1" , "                 2010",false));
			students.add(new Student(4003 , "            Sharyar Virani", "        RB-1" , "                 2012",false));
			students.add(new Student(4004 , "            Shazad Khan", "           RB-1" , "                 2014",false));
			students.add(new Student(4005 , "            Erum Sohail", "           RB-1" , "                 2016",false));
			students.add(new Student(4006 , "            Areeb Ismail", "          RB-1" , "                 2015",false));
			students.add(new Student(4007 , "            Suleman Huda", "          RB-1" , "                 2014",false));
			students.add(new Student(4008 , "            Sadia Nathani", "         RB-1" , "                 2013",false));
			students.add(new Student(4009 , "            Sadaf Andhani", "         RB-1" , "                 2012",false));
			students.add(new Student(4010 , "            Shazain Alwani", "        RB-1" , "                 2013",false));
			students.add(new Student(4011 , "            Anees Gowani", "          RB-1" , "                 2016",false));
			students.add(new Student(4012 , "            Shakir Ghori", "          RB-1" , "                 2013",false));
			students.add(new Student(4013 , "            Shaharyar Khan", "        RB-1" , "                 2011",false));
			students.add(new Student(4014 , "            Mukaram Rehman", "        RB-1" , "                 2016",false));
			students.add(new Student(4015 , "            Naveed Aslam", "          RB-1" , "                 2017",false));
			students.add(new Student(4016 , "            Rahul Kumar", "           RB-1" , "                 2013",false));
			students.add(new Student(4017 , "            Ameena Baig", "           RB-1" , "                 2015",false));
			students.add(new Student(4018 , "            Farida Mughal", "         RB-1" , "                 2012",false));
			students.add(new Student(4019 , "            Naureen Pukhraj", "       RB-1" , "                 2013",false));
			students.add(new Student(4020 , "            Zayma Suleman", "         RB-1" , "                 2015",false));
			students.add(new Student(4021 , "            Azima Dhanji", "          RB-1" , "                 2016",false));
			
			
			
			
			
			
			open = false;
		}
	  
		

			
			
			
			

			
	  
		
		switch(in){
		case 1: number1();
		break;
		
		case 2: getBookName(books);
	    break;
	  
		case 3:getStudentsData(students);
		break;
		
		case 4: getTeacherData(teachers);
		break;
		
		case 5: issue();
		break;
		
		case 6: newMember();
		break;
		
		case 7: checkDemand();
		break;
		
		case 8:getIssuedBooks();
		break;
		
		case 9 : takeInfo();
		break;
		
		case 10 : post();
		break;
		
		case 11: comp();
		break;
		
		case 12: logOff();
		break;
		default : System.out.println("Invalid");
	  
	  }
		
	    enterZero();
	    }



	public  void number1(){
		
		System.out.println("Enter the book id: ");
		int returnbook = s.nextInt();
		if(returnbook >=8000 && returnbook <=10000){
		
		    functioned();
		}
		else{
		    	System.out.println("Invalid");
		enterZero();    
		}
		 
		
	  }

public static void comp(){
	
	new Test().complainBox2();
	
}
	public void logOff(){
		
		new Test().logOff();
		
	}
	
	public  void functioned(){
	Scanner ab1 = new Scanner (System.in);


	System.out.println("FINE BOOK?");
	System.out.println("Enter 1 for Yes, Enter 2 for No");
	int fined = ab1.nextInt();
	if(fined == 1){
	fineCalculator1();
	}
	else if(fined == 2){
	System.out.println("Book return successfully.");
	System.out.println("THANK YOU");
	}
	}	


	public  void fineCalculator1(){
	int typeofcard , daysoverdue;
	double overduefine = 0;
	Scanner ab1 = new Scanner (System.in);

	System.out.println("Enter the number of days over due");
	  int overdays = ab1.nextInt();
	  
	  overduefine= 2*overdays;
	   
	   System.out.println("Number of days due: "+ overdays);
	   System.out.println("Your Estimated Fine is: " + overduefine);	
	System.out.println("Book return successfully");
	System.out.println("Thank You");
	enterZero();
	}

	public  void enterZero(){
		
		System.out.println("Enter 0 for main menu");
			int menu =s.nextInt();
	if(menu==0){
			
			mainMenu();        		
	} else System.out.println("Invalid");
	      
	enterZero();
	}


	/*public  void issue(){
		System.out.println("Enter the member ID: ");
		int iss = s.nextInt();
		 if(iss >= 4000 && iss <=6000 ){
			bookIssue(); 
		 }
		 else {
			 System.out.println("Invalid");
			 enterZero();
		 }
	}*/
	/*public  void bookIssue(){
		
		System.out.println("Enter the book ID");
		int sx =s.nextInt();
	if (sx >=8000 && sx <=10000){
		System.out.println("Book issue successfully");
		System.out.println("Your due date is");
		date();
		
	}

	}*/
	public void issue(){
		System.out.println("Enter the Student ID: ");
		int iss = s.nextInt();
		
		boolean check = false;
		
		for (int i = 0;i < students.size();i++) {
		 if(  students.get(i).getStuId() == iss){
			bookIssue(i);
			check = true;
		 break;
		 } 
		
		}
		
		if (check == false){
			System.out.println("Invlaid! Student doesnot exist");
			enterZero();
		}
		
		
	
			 
	} 
		public static void takeInfo(){
		
			 new Test().saveInfo();
			
		}
		public static void post(){
			
			
			new Test().additional();
		}
	
	public void bookIssue(int id){
		
		System.out.println("Enter the book ID");
		int sx =s.nextInt();
		s.nextLine();
		
		boolean check = false;
		
		for (int i = 0;i < books.size(); i++)
		{
		    if (books.get(i).getBookId() == sx) {
			
			check = true;
		    }
		}
		for (int i = 0;i < books.size(); i++)
		{
		  
		    
	if (check && books.get(getInBook(sx)).isAvailable() == true && students.get(id).isIssused() == false){
		System.out.println("Book issue successfully");
		System.out.println("Your due date is");
		date();
		
		books.get(getInBook(sx)).setAvailable(false);
		students.get(id).setIssused(true);
		//System.out.println(books.get(i).available);
	//	System.out.println(books.get(i).getBookId());
		break;
		
	}
	else if(books.get(getInBook(sx)).isAvailable() == false){
	 //   System.out.println("The Book is not availble.");
	   // System.out.println(books.get(i).getBookId());
	    //System.out.println(books.get(i).available);
	    //System.out.println(sx);
	    
	    break;
	}
	else if(students.get(id).isIssused() == true){
	    System.out.println("This member has already issued a book.");
	    break;}
	}

		
	}
	public void newMember() {
	    
	    int i= (students.size()-1);
	    int id = students.get(i).getStuId() + 1;
	    
	    System.out.println("Enter Student Name:  ");
	    String s = sc.next();
	    sc.nextLine();
	    System.out.println("Enter Type of Card:");
	    String t = sc.next();
	    sc.nextLine();
	    boolean n = true;    
	    
	    students.add(new Student(id,s,t,n));
	    
	}

	public static void checkDemand(){
	  new Form().demand();
		
	}

	public void date(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); 
		c.add(Calendar.DATE, 10); 
		String output = sdf.format(c.getTime());
		System.out.println(output);
		
	}






	  
	public static void getBookName(ArrayList<Book> books){
			    System.out.println("Book ID" + "        "+"Book Title "+ "        "+"        Author Name " );
			    for(int i= 0;i < books.size(); i++) {
			        
			        System.out.println(books.get(i).getBookId() +" "+books.get(i).getBookName()+" "+books.get(i).getBookAuthor()  );
			    
			    }
	}
	
	public void getIssuedBooks() {
	    for(int i = 0;i < books.size(); i++) {
		if(books.get(i).isAvailable() == false)
		{
		    booksIssued.add(i);
		}
		
		}
	    if (booksIssued.size() > 0) {
		System.out.println("There Total Number of Books currently are "+booksIssued.size()+"");
		int id;
		System.out.println("Here is the List: ");
		for(int i = 0;i < booksIssued.size(); i++) {
		
		    id =  booksIssued.get(i);
		
	System.out.println(books.get(id).getBookId() +" "+books.get(id).getBookName()+" "+books.get(id).getBookAuthor());
		
		
	    } 
	}
	    }
	 public static void getStudentsData(ArrayList<Student> students){  
			    	  System.out.println("Student ID" + "        "+"Student Name "+ "        "+"Type Of Card " + "        "+"Date of studentship" );
					    for(int i= 0;i < students.size(); i++) {
		System.out.println(students.get(i).getStuId() +" "+students.get(i).getStuName()+" "+students.get(i).getStuTypeOfCard()+ " "+ students.get(i).getStuDateOfMembership());
			   

			    
					    }		    
					   		    
	 }
	 
	 public static void getTeacherData(ArrayList<Teacher> teachers){  
		  System.out.println("Teacher ID" + "        "+"Teacher Name "+ "        "+"Type Of Card " + "        "+"Date of studentship" );
		    for(int i= 0;i < teachers.size(); i++) {
	System.out.println(teachers.get(i).getTeacId() +" "+teachers.get(i).getTeachName()+" "+teachers.get(i).getTeachTypeOfCard()+ " "+ teachers.get(i).getTeachDateOfMembership());

	}		    

	}
	
	 public int getInBook(int in) {
	     int id = 0;
	     for (int i = 0;i < books.size(); i++)
		{
		if (in == books.get(i).getBookId())
		{
		    id = i;
				
		}
		
	     
	   
	     
	 }
	    return id;
	 }
	 public int getInStu(int in) {
	     int id = 0;
	     for (int i = 0;i < students.size(); i++)
		{
		if (in == students.get(i).getStuId())
		{
		    id = i;
				
		}
		
	     
	   
	     
	 }
	    return id;
	 }
	 
	}

	

