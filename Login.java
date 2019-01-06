package edu.pro.gui;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



/**
 * 
 * @author SharyaryVirani
 *
 */


public class Login extends Application 


{
	

    @Override
    public void start(Stage primaryStage) {
    	
      	
    	primaryStage.setTitle("PRO LIBRARY");
   
        
   	 BorderPane root = new BorderPane();
        MenuBar menubar = new MenuBar(); 
       GridPane grid = new GridPane();
        Scene scene = new Scene(root,600,500);
        	
        root.setTop(menubar);
        
        root.setCenter(grid);
   
        grid.setPadding(new Insets(20,40, 50,40));
        
       // grid.setStyle("-fx-background-color: ecd1ff;");
        grid.setStyle("-fx-background-color: linear-gradient(#98a8bd 0%, ecd1ff 75%, ecd1ff 100%;");

  	grid.setAlignment(Pos.CENTER);
  		grid.setVgap(10);
  			grid.setHgap(10);
  				grid.setPadding( new Insets (10));

  
  		
  				
  				
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
			
  
   
   Text welcomeTxt = new Text("LIBRARIAN LOGIN");
   		welcomeTxt.setFont(Font.font("Serif", FontWeight.BOLD, 20));
   			grid.add(welcomeTxt, 0, 0);
   				welcomeTxt.setFill(Color.PURPLE);
   
   
   Label lblUser = new Label("User ID");
   		grid.add(lblUser, 0, 2);
   
   TextField txtUser = new TextField();
   	txtUser.setPromptText("User ID");
   		grid.add(txtUser, 1,2);
   
   
   Label lblPassword = new Label("Password");
   		grid.add(lblPassword, 0, 3);
   
   Label lbMessage = new Label();
   
   PasswordField pwBox = new PasswordField();
   	pwBox.setPromptText("Password");
   		grid.add(pwBox, 1,3);
      
   
   Button buttonlg = new Button("Login");
   		grid.add(buttonlg, 1, 4);   
   		buttonlg.setStyle("-fx-font: 12 arial; -fx-base: #56033c;");
   		
   		        buttonlg.setOnAction(new EventHandler<ActionEvent>() {
   		
   		            @Override
   		
   		            public void handle(ActionEvent event) {
   		            	Directory direct = new Directory();
   		            	direct.start(primaryStage);
   		            
   		
   		        }
   		
   		        });
   		        
   		 	DropShadow shadow = new DropShadow();
   		   
   		   	buttonlg.addEventHandler(MouseEvent.MOUSE_ENTERED, 
   		   	    new EventHandler<MouseEvent>() {
   		   	        @Override public void handle(MouseEvent e) {
   		   	            buttonlg.setEffect(shadow);
   		   	        }
   		   	});
   		   	
   		   	buttonlg.addEventHandler(MouseEvent.MOUSE_EXITED, 
   		   	    new EventHandler<MouseEvent>() {
   		   	        @Override public void handle(MouseEvent e) {
   		   	            buttonlg.setEffect(null);
   		   	        }
   		   	});
   		         
		
   		

   primaryStage.setScene(scene);
   		primaryStage.setResizable(false);
   			primaryStage.show();
   
   }


		
	}




