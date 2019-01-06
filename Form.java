import java.util.*;
public class Form  {
static Scanner k =new Scanner (System.in);
 
public static int memberid;
public static String bookName;
public static String author;
public static int edition;





public static void demandBook(){
	Test test = new Test();
	System.out.println("Enter Your id : ");
	int a = k.nextInt();
memberid = a;
k.nextLine();

System.out.println("Enter the book name : ");
String b = k.nextLine();
bookName=b;

System.out.println("Enter the edition : ");
int c = k.nextInt();
edition=c;
k.nextLine();

System.out.println("Enter Author name : ");
String d = k.nextLine();
author=d;
 System.out.println(" "); 
 System.out.println("Your ID     :" + memberid);
 System.out.println("Your Book   :" +bookName);
 System.out.println("Edition     :" + edition);
 System.out.println("Author Name :" + author);
 System.out.println("Yor Demand has been noted , For Further information contact Librarian");
 System.out.println("Thank You");
 test.logOff();
}

public static void demand(){
	Form form = new Form();
	 System.out.println("ID           :" + memberid);
	 System.out.println("Book Name    :" +bookName);
	 System.out.println("Book Edition :" + edition);
	 System.out.println("Author Name  :" + author);


}









}




