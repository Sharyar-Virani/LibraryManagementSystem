package edu.pro.gui;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.Node;
import javafx.stage.Stage;






public class Directory extends Application {



	
	public void start(Stage stage) {
       stage.setTitle("Library Pro");
      BorderPane root = new BorderPane();
      MenuBar menubar = new MenuBar(); 
     
      Scene scene = new Scene(root,600,500);
      
  GridPane grid = new GridPane(); 
  
  root.setTop(menubar);
  
      root.setCenter(grid);
 
      grid.setPadding(new Insets(20,40, 50,40));
      
      grid.setStyle("-fx-background-color: ecd1ff;");
      

 		
 				
 				Text welcomeTxt2 = new Text(" PRO LIBRARY MENU ");
 		welcomeTxt2.setFont(Font.font("Serif", FontWeight.BOLD, 20));
 		grid.add(welcomeTxt2,1,0);
 				welcomeTxt2.setFill(Color.PURPLE);
 				
//MENU
      
     Menu filemenu = new Menu("File");
     MenuItem item1 = new MenuItem("New Project              Ctr+Shift+N  ");
     MenuItem item2 = new MenuItem("Open Project             Ctr+Shift+O  ");
     MenuItem item3 = new MenuItem("Exit");
     item3.setOnAction(e -> Platform.exit());
     
     Menu editmenu = new Menu("Edit");
     MenuItem item4 = new MenuItem("Copy                    Ctr+Shift+C ");
     MenuItem item5 = new MenuItem("Paste                    Ctr+Shift+V ");
     MenuItem item6 = new MenuItem("Cut                       Ctr+Shift+X "); 
     
     Menu sourcemenu = new Menu("Source");
     MenuItem item7 = new MenuItem("Shift right              Ctr+Shift+B ");
     MenuItem item8 = new MenuItem("Shift left                 Ctr+Shift+E ");
     MenuItem item9 = new MenuItem("Remove                 Ctr+Shift+S "); 
     
     Menu helpmenu = new Menu("Help");
     filemenu.getItems().addAll(item1 , item2 , new SeparatorMenuItem(), item3);
    editmenu.getItems().addAll(item4 , item5 , item6);
    sourcemenu.getItems().addAll(item7 , item8 , item9);
     menubar.getMenus().addAll(filemenu,editmenu,sourcemenu,helpmenu);
    
     
     Button button = new Button("ISSUE BOOK");
    		grid.add(button, 1, 4);   
    		
 	
    		
    		button.setOnAction(new EventHandler<ActionEvent>() {
    		    @Override public void handle(ActionEvent e) {

    		            	IssueBook issuebook = new IssueBook();
    		            	issuebook.start(stage);
    		            
    		        
    		    }
    		});
    		
    		
    		DropShadow shadow = new DropShadow();
    
    	button.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    	    new EventHandler<MouseEvent>() {
    	        @Override public void handle(MouseEvent e) {
    	            button.setEffect(shadow);
    	        }
    	});
    	
    	button.addEventHandler(MouseEvent.MOUSE_EXITED, 
    	    new EventHandler<MouseEvent>() {
    	        @Override public void handle(MouseEvent e) {
    	            button.setEffect(null);
    	        }
    	});
    		
    		
    		
    		
    		
    	 Button button1 = new Button("RETURN BOOK");
  	 grid.add(button1, 2, 4);   	

 		
    		
    		
    		button1.setOnAction(new EventHandler<ActionEvent>() {
    		    @Override public void handle(ActionEvent e) {
    		    	BookReturn bookreturn = new BookReturn();
 	            	bookreturn.start(stage);
 	            
    		    }
    		});
    		
    		
    		DropShadow shadow1 = new DropShadow();
    
    	button1.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    	    new EventHandler<MouseEvent>() {
    	        @Override public void handle(MouseEvent e) {
    	            button1.setEffect(shadow1);
    	        }
    	});
    	
    	button1.addEventHandler(MouseEvent.MOUSE_EXITED, 
    	    new EventHandler<MouseEvent>() {
    	        @Override public void handle(MouseEvent e) {
    	            button1.setEffect(null);
    	        }
    	});
 		
 		
 		
 		
 		 Button button2 = new Button("BOOKS LIST");
 		grid.add(button2, 1, 5);   	
 	   		
 	   	
 	   		
 	   		
 	   		
 	   		button2.setOnAction(new EventHandler<ActionEvent>() {
 	   		    @Override public void handle(ActionEvent e) {
 	   		    	BookList booklist = new BookList();
 		            	booklist.start(stage);
 	   		    }
 	   		});
 	   		
 	   		
 	   		DropShadow shadow2 = new DropShadow();
 	   
 	   	button2.addEventHandler(MouseEvent.MOUSE_ENTERED, 
 	   	    new EventHandler<MouseEvent>() {
 	   	        @Override public void handle(MouseEvent e) {
 	   	            button2.setEffect(shadow2);
 	   	        }
 	   	});
 	   	
 	   	button2.addEventHandler(MouseEvent.MOUSE_EXITED, 
 	   	    new EventHandler<MouseEvent>() {
 	   	        @Override public void handle(MouseEvent e) {
 	   	            button2.setEffect(null);
 	   	        }
 	   	});	
 	   		

 	   		
 	    	 Button button3 = new Button("STUDENTS LIST");
 	   grid.add(button3, 2, 5);
 		   		
 		   		
 		   		button3.setOnAction(new EventHandler<ActionEvent>() {
 		   		    @Override public void handle(ActionEvent e) {
 		   		 	StudentList studentlist = new StudentList();
 	            	studentlist.start(stage);
 		   		    }
 		   		});
 		   		
 		   		
 		   		DropShadow shadow3 = new DropShadow();
 		   
 		   	button3.addEventHandler(MouseEvent.MOUSE_ENTERED, 
 		   	    new EventHandler<MouseEvent>() {
 		   	        @Override public void handle(MouseEvent e) {
 		   	            button3.setEffect(shadow3);
 		   	        }
 		   	});
 		   	
 		   	button3.addEventHandler(MouseEvent.MOUSE_EXITED, 
 		   	    new EventHandler<MouseEvent>() {
 		   	        @Override public void handle(MouseEvent e) {
 		   	            button3.setEffect(null);
 		   	        }
 		   	});
 		   		
 		   	
 		   	
 		   	
				
		   		Button button9 = new Button("TEACHER LIST");
		 	grid.add(button9, 1,6);
	   		
		   	
		   		
		   		
		   		button9.setOnAction(new EventHandler<ActionEvent>() {
		   		    @Override public void handle(ActionEvent e) {
		   		 	TeacherList teacherlist = new TeacherList();
	            	teacherlist.start(stage);

		   		    }
		   		});
		   		
		   		
		   		DropShadow shadow9 = new DropShadow();
		   
		   	button9.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		   	    new EventHandler<MouseEvent>() {
		   	        @Override public void handle(MouseEvent e) {
		   	            button9.setEffect(shadow9);
		   	        }
		   	});
		   	
		   	button9.addEventHandler(MouseEvent.MOUSE_EXITED, 
		   	    new EventHandler<MouseEvent>() {
		   	        @Override public void handle(MouseEvent e) {
		   	            button9.setEffect(null);
		   	        }
		   	});
			
 		   	
 		   	
 				
 		   		Button button4 = new Button("ADD MEMBER");
 		 	grid.add(button4, 2,6);
 	   		
 		   	
 		   		
 		   		
 		   		button4.setOnAction(new EventHandler<ActionEvent>() {
 		   		    @Override public void handle(ActionEvent e) {
 		   		 	AddNewStudent addnewstudent = new AddNewStudent();
 	            	addnewstudent.start(stage);

 		   		    }
 		   		});
 		   		
 		   		
 		   		DropShadow shadow4 = new DropShadow();
 		   
 		   	button4.addEventHandler(MouseEvent.MOUSE_ENTERED, 
 		   	    new EventHandler<MouseEvent>() {
 		   	        @Override public void handle(MouseEvent e) {
 		   	            button4.setEffect(shadow4);
 		   	        }
 		   	});
 		   	
 		   	button4.addEventHandler(MouseEvent.MOUSE_EXITED, 
 		   	    new EventHandler<MouseEvent>() {
 		   	        @Override public void handle(MouseEvent e) {
 		   	            button4.setEffect(null);
 		   	        }
 		   	});
 			
 		   		
 		   		Button button5 = new Button("BOOK DEMAND");
 		  grid.add(button5, 1,7);
 		 
 		   		
 		   		button5.setOnAction(new EventHandler<ActionEvent>() {
 		   		    @Override public void handle(ActionEvent e) {
 		   		    	AddNewBook addnewbook = new AddNewBook();
 		            	addnewbook.start(stage);

 		   		    }
 		   		});
 		   		
 		   		
 		   		DropShadow shadow5 = new DropShadow();
 		   
 		   	button5.addEventHandler(MouseEvent.MOUSE_ENTERED, 
 		   	    new EventHandler<MouseEvent>() {
 		   	        @Override public void handle(MouseEvent e) {
 		   	            button5.setEffect(shadow5);
 		   	        }
 		   	});
 		   	
 		   	button5.addEventHandler(MouseEvent.MOUSE_EXITED, 
 		   	    new EventHandler<MouseEvent>() {
 		   	        @Override public void handle(MouseEvent e) {
 		   	            button5.setEffect(null);
 		   	        }
 		   	});
 		   		
 		   		
 		   		Button button6 = new Button("COMPLAIN FORM");
 		grid.add(button6, 1,8);	
    		
 	   		
 		   	//	button6.setStyle("-fx-font: 12 arial; -fx-base: #ecd1ff;");	
 		   		
 		   		
 		   		button6.setOnAction(new EventHandler<ActionEvent>() {
 		   		    @Override public void handle(ActionEvent e) {
 		   		    	Forms forms = new Forms();
 		            	forms.start(stage);

 		   		    }
 		   		});
 		   		
 		   		
 		   		DropShadow shadow6 = new DropShadow();
 		   
 		   	button6.addEventHandler(MouseEvent.MOUSE_ENTERED, 
 		   	    new EventHandler<MouseEvent>() {
 		   	        @Override public void handle(MouseEvent e) {
 		   	            button6.setEffect(shadow6);
 		   	        }
 		   	});
 		   	
 		   	button6.addEventHandler(MouseEvent.MOUSE_EXITED, 
 		   	    new EventHandler<MouseEvent>() {
 		   	        @Override public void handle(MouseEvent e) {
 		   	            button6.setEffect(null);
 		   	        }
 		   	});
 		   		
 		   		
 		   	
 		   	
 	   		
 	   		Button button7 = new Button("NOTICE BOARD");
 	  	grid.add(button7, 2,7);	
 		
    		
 	   
 	   		
 	   		
 	   		button7.setOnAction(new EventHandler<ActionEvent>() {
 	   		    @Override public void handle(ActionEvent e) {
 	   		    	NoticeBoard noticeboard= new NoticeBoard();
 	            	noticeboard.start(stage);

 	   		    }
 	   		});
 	   		
 	   		
 	   		DropShadow shadow7 = new DropShadow();
 	   
 	   	button7.addEventHandler(MouseEvent.MOUSE_ENTERED, 
 	   	    new EventHandler<MouseEvent>() {
 	   	        @Override public void handle(MouseEvent e) {
 	   	            button7.setEffect(shadow7);
 	   	        }
 	   	});
 	   	
 	   	button7.addEventHandler(MouseEvent.MOUSE_EXITED, 
 	   	    new EventHandler<MouseEvent>() {
 	   	        @Override public void handle(MouseEvent e) {
 	   	            button7.setEffect(null);
 	   	        }
 	   	});
 	   		
 		   	
 		   	
 		   	
 		   	
 		   	
 	   		
 	   		Button button8= new Button("LOG OUT");
 	 grid.add(button8, 2,8);	
 		
    		
 	   	button8.setStyle("-fx-font: 12 arial; -fx-base: #56033c;");	
 	   		
 	   		
 	   		button8.setOnAction(new EventHandler<ActionEvent>() {
 	   		    @Override public void handle(ActionEvent e) {
 	   		    	Login login = new Login();
 	            	login.start(stage);

 	   		    }
 	   		});
 	   		
 	   		
 	   		DropShadow shadow8 = new DropShadow();
 	   
 	   	button8.addEventHandler(MouseEvent.MOUSE_ENTERED, 
 	   	    new EventHandler<MouseEvent>() {
 	   	        @Override public void handle(MouseEvent e) {
 	   	            button8.setEffect(shadow8);
 	   	        }
 	   	});
 	   	
 	   	button8.addEventHandler(MouseEvent.MOUSE_EXITED, 
 	   	    new EventHandler<MouseEvent>() {
 	   	        @Override public void handle(MouseEvent e) {
 	   	            button8.setEffect(null);
 	   	        }
 	   	});
 	   	

  

	  	grid.setPrefWidth(150);

	    button.setMinWidth(grid.getPrefWidth());
	    button1.setMinWidth(grid.getPrefWidth());
	    button2.setMinWidth(grid.getPrefWidth());
	    button3.setMinWidth(grid.getPrefWidth());
	    button4.setMinWidth(grid.getPrefWidth());
	    button5.setMinWidth(grid.getPrefWidth());
	    button6.setMinWidth(grid.getPrefWidth());
	    button7.setMinWidth(grid.getPrefWidth());
	    button8.setMinWidth(grid.getPrefWidth());
	    button9.setMinWidth(grid.getPrefWidth());
grid.setAlignment(Pos.CENTER);	   	
grid.setHgap(15);
grid.setVgap(10);


stage.setScene(scene);      
stage.show();
   }



}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


