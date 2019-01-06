import java.util.*;
public class Test {
	static Scanner sm = new Scanner (System.in);
	public static String seminar ;
	public static String address;
	public static String detailsSeminar;
	public static String yourDetail;
	public static String Date;
	public static String Time;
	public static String me;
	public static String complain;
	public static int ID;
	public static void main(String[] args) {
		
		
        
        System.out.println("-------------------Welcome To Library Pro--------------------");
        main();
      
      
	}
	        
    public static void log1(){
    	Form form = new Form();
    	Scanner sq = new Scanner (System.in);
	System.out.println("Student login ID : ");
	int l = sq.nextInt();

	System.out.println("Student password: ");
    int s = sq.nextInt();
    if(l== 100 && s == 123){
    	ArrayList<Book> books=new ArrayList<Book>();

    	boolean exit = true;

    	while (exit == true) {
    	    
    	    books.add(new Book(8001, "    Principle of Management", "        Muhammad Abbas",true));
    	    books.add(new Book(8002, "    Marketing Management" , "           Khusboo Salim ",true));
    	    books.add(new Book(8003 , "    Object Oriented Programing" ,"     DR.Arij Mehmood",true));
    	    books.add(new Book(8004 , "    Principle of Accounting" ,"        Fahim Abbasi " ,true ));
    	    books.add(new Book(8005 , "    Microbiology" ,"                   DR.Sana Imran " ,true));
    	    books.add(new Book(8006 , "    Introduction To Computers" ,"      Kabir Alawat " ,true ));
    	    books.add(new Book(8007 , "    Introduction To Java" ,"           DR.Brown Alan " ,true));
    	    books.add(new Book(8008 , "    Networking" ,"                     Ali Qureshi "   ,true));
    	    books.add(new Book(8009 , "    DataBase Management" ,"            Adam Rayan "    ,true));
    	    books.add(new Book(8010 , "    A-Level Physics" ,"                Nicolon Pinsley",true));
    	    books.add(new Book(8011 , "    A-Level Chemistry" ,"              Alan Viv.D  "   ,true));
    	    books.add(new Book(8012 , "    A-Level Biology" ,"                Jacky Tyler "   ,true));
    	    books.add(new Book(8013 , "    Reccursion in Java" ,"             Damon Salvatore",true));
    	    books.add(new Book(8014 , "    Cyber Hacking" ,"                  Stefan Salvatore",true));
    	    books.add(new Book(8015 , "    Network And Security" ,"           Nick Klaus ",true));
    	    books.add(new Book(8016 , "    3D Game Development" ,"            Math Donavan ",true));
    	    books.add(new Book(8017 , "    Phycology" ,"                      DR.Bonnei Benett",true));
    	    books.add(new Book(8018 , "    Philosophy and Relegion" ,"        Margery Tyler ",true));
    	    books.add(new Book(8019 , "    Fifty Shades Of Grey" ,"           Sophie Tyler ",true));
    	    books.add(new Book(8020 , "    Fifty Shades of Darker" ,"         Elena D.Cruz ",true));
    	    exit = false;
 
    	System.out.println("Enter 1 to see all kinds of books");
    	System.out.println("Enter 2 to demand a book");
    	System.out.println("Enter 3 to add information for seminar");
     	System.out.println("Enter 4 to check Notice Board");
     	System.out.println("Enter 5 to file complain/suggestion");
     	int a = sq.nextInt();
    	
    		switch(a){
        	
        	case 1: Menu.getBookName(books);
        	break;
        	
        	case 2:form.demandBook();
        	break;
        	case 3: addInfo();
        		break;
        	case 4: additionalFinal();
        		break;
        	case 5: complainBox();
        		break;
        	
        	default: System.out.println("Inavalid");
    	
    		
    		}
    	}
    }
    }
    
    
    
public static void log2(){
	Form form = new Form();
	Scanner sq = new Scanner (System.in);
	System.out.println("Teacher login ID : ");
	int l = sq.nextInt();

	System.out.println("Teacher password: ");
    int s = sq.nextInt();
    if(l== 101 && s == 1234){
    	ArrayList<Book> books=new ArrayList<Book>();

    	boolean exit = true;

    	while (exit == true) {
    	    
    	    books.add(new Book(8001, "    Principle of Management", "        Muhammad Abbas",true));
    	    books.add(new Book(8002, "    Marketing Management" , "           Khusboo Salim ",true));
    	    books.add(new Book(8003 , "    Object Oriented Programing" ,"     DR.Arij Mehmood",true));
    	    books.add(new Book(8004 , "    Principle of Accounting" ,"        Fahim Abbasi " ,true ));
    	    books.add(new Book(8005 , "    Microbiology" ,"                   DR.Sana Imran " ,true));
    	    books.add(new Book(8006 , "    Introduction To Computers" ,"      Kabir Alawat " ,true ));
    	    books.add(new Book(8007 , "    Introduction To Java" ,"           DR.Brown Alan " ,true));
    	    books.add(new Book(8008 , "    Networking" ,"                     Ali Qureshi "   ,true));
    	    books.add(new Book(8009 , "    DataBase Management" ,"            Adam Rayan "    ,true));
    	    books.add(new Book(8010 , "    A-Level Physics" ,"                Nicolon Pinsley",true));
    	    books.add(new Book(8011 , "    A-Level Chemistry" ,"              Alan Viv.D  "   ,true));
    	    books.add(new Book(8012 , "    A-Level Biology" ,"                Jacky Tyler "   ,true));
    	    books.add(new Book(8013 , "    Reccursion in Java" ,"             Damon Salvatore",true));
    	    books.add(new Book(8014 , "    Cyber Hacking" ,"                  Stefan Salvatore",true));
    	    books.add(new Book(8015 , "    Network And Security" ,"           Nick Klaus ",true));
    	    books.add(new Book(8016 , "    3D Game Development" ,"            Math Donavan ",true));
    	    books.add(new Book(8017 , "    Phycology" ,"                      DR.Bonnei Benett",true));
    	    books.add(new Book(8018 , "    Philosophy and Relegion" ,"        Margery Tyler ",true));
    	    books.add(new Book(8019 , "    Fifty Shades Of Grey" ,"           Sophie Tyler ",true));
    	    books.add(new Book(8020 , "    Fifty Shades of Darker" ,"         Elena D.Cruz ",true));
    	    exit = false;
 
    	
    	}
    	System.out.println("Enter 1 to see all kinds of books");
    	System.out.println("Enter 2 to demand a book");
    	System.out.println("Enter 3 to add information for seminar");
     	System.out.println("Enter 4 to check Notice Board");
     	System.out.println("Enter 5 to file complain/suggestion");
     	int a = sq.nextInt();
    	
    		switch(a){
        	
        	case 1: Menu.getBookName(books);
        	break;
        	
        	case 2:form.demandBook();
        	break;
        	case 3: addInfo();
        		break;
        	case 4: additionalFinal();
        		break;
        	case 5: complainBox();
    		break;
        	
        	default: System.out.println("Inavalid");
    	
    		
    		}
    	}
    }
    
    
    

public static void log3(){
	Scanner sc = new Scanner (System.in);
	  Librarian lib = new Librarian();
	    Menu menu = new Menu();

	System.out.println("Librarian ID Please: ");
	 int librarian = sc.nextInt();

    System.out.println("Librarian Password: ");
    int password = sc.nextInt();
    
   	 
 if(librarian == lib.getLibrarianId() && password == lib.getPassword() ) 
    {
   	 
   	 System.out.println(" __________WELCOME SANI SHIRAZ___________ ");
     
    }
   	 else {
   	 System.out.println("User Name or Password Incorrect");
   	 System.out.println("You cannot proceed further,Please enter correct Password or ID");
   	 
   	 main();	
    	    

   	 }
 menu.mainMenu();

}

public static void main(){
	Scanner sc = new Scanner (System.in);  
	        System.out.println("Enter 1 for Student ");
			System.out.println("Enter 2 for Teacher ");
			System.out.println("Enter 3 for librarian ");
			
			int login = sc.nextInt();
			switch(login){
		
			
			case 1: log1();
				break;
			case 2: log2();
				break;
			case 3:  log3();
				break;
			
			default : System.out.println("Invalid");
			main();	
			break;
				
			}
			
			
   }


public static void logOff(){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter 0 for log off: ");	
	int logoff = sc.nextInt();
main();
}

public static void complainBox (){
System.out.println("--------Complain Box/Suggestion Box----------");
System.out.println("Your Complain/Suggestion: ");
String comp = sm.nextLine();
complain=comp;

System.out.println("Your ID                 :");
int iid = sm.nextInt();
ID=iid;


	
	System.out.println("Thank You");
logOff();
}

public static void complainBox2(){
	
	System.out.println("--------Complain Box/Suggestion Box----------");
	System.out.println("The student id is : "+ ID);
	System.out.println(complain);
}


public static void addInfo(){

	
	
	System.out.println("--------REQUEST LIBRARIAN---------");
	
	System.out.println("NOTE: You can only add information about the upcoming seminar nearby our institution.");
	System.out.println("Kind of seminar: ");
    String info = sm.nextLine();
   seminar = info;
	
   System.out.println("Complete address: (incomplete or invalid address result in the cancellation request.");
	String info1 = sm.nextLine();
	address = info1;
	
	System.out.println("Contact detail for seminar: ");
	String info2 = sm.nextLine();
	detailsSeminar = info2; 
	
	System.out.println("Your contact details");
	 String info3 = sm.nextLine();
	 yourDetail= info3;
	 
	 System.out.println("Date of Seminar:(Format dd-mm--yy)");
	 String info4 =sm.nextLine();
	 Date = info4;
	 
	 System.out.println("Time of Seminar: eg( 12 hr Clock, 4:00 Am/Pm)" );
	 String info5 = sm.nextLine();
	 Time = info5;
	 
	 System.out.println("Kind of seminar    : "+ seminar);
	 System.out.println("Address            : "+ address);
	 System.out.println("Seminar Date       : "+ Date);
	 System.out.println("Seminar Time       : "+ Time);
	 System.out.println("Contact for seminar: "+ detailsSeminar);
	 System.out.println("Your conatct number: "+ yourDetail);
	 logOff();
	
}

public static void saveInfo(){
	System.out.println("-----------Request about the seminar--------------");
	System.out.println("Type of Seminar  : "+ seminar);
	System.out.println("Place of Seminar : "+ address);
	System.out.println("Seminar Date     : "+ Date);
	System.out.println("Seminar Time     : "+ Time);
	System.out.println("Seminar Contact  : "+ detailsSeminar);
	System.out.println("Student Contact  : "+ yourDetail);
	
}
public static void additional(){


	System.out.println("Type of Seminar  : "+ seminar);
	System.out.println("Place of Seminar : "+ address);
	System.out.println("Seminar Date     : "+ Date);
	System.out.println("Seminar Time     : "+ Time);
	System.out.println("Seminar Contact  : "+ detailsSeminar);
	
	System.out.println("Additional Information:");
    String in = sm.nextLine();	
	 me = in;
}
public static void additionalFinal(){
	System.out.println("-------NOTICE BOARD----------");
	
	System.out.println("Type of Seminar         : "+ seminar);
	System.out.println("Place of Seminar        : "+ address);
	System.out.println("Seminar Date            : "+ Date);
	System.out.println("Seminar Time            : "+ Time);
	System.out.println("Seminar Contact         : "+ detailsSeminar);
	System.out.println("Additional Information  : "+ me);
	
	logOff();
}




}

	

		
	
	   
	
	
    

	
		
	
	
	
