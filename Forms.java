package edu.pro.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Forms extends Application {
	
	
	  @Override
	    public void start(Stage stage) {
	    	
	      	
	    	stage.setTitle("PRO LIBRARY");
	   
	        
	    	 BorderPane root = new BorderPane();
	         MenuBar menubar = new MenuBar(); 
	        GridPane grid = new GridPane();
	         Scene scene = new Scene(root,600,500);
	         	
	         root.setTop(menubar);
	         
	         root.setCenter(grid);
	    
	         grid.setPadding(new Insets(20,40, 50,40));
	         
	         grid.setStyle("-fx-background-color: ecd1ff;");

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
				
	   
	   Text welcomeTxt = new Text("COMPLAIN FORM");
	   		welcomeTxt.setFont(Font.font("Serif", FontWeight.BOLD, 20));
	   			grid.add(welcomeTxt, 0, 0);
	   				welcomeTxt.setFill(Color.PURPLE);
	  
		
		
	 	Label lblUser1 = new Label("Enter Member ID");
   		grid.add(lblUser1, 0, 1);
   		
   	  TextField txtUser1 = new TextField();
	   	   	txtUser1.setPromptText("Enter Member ID");
	   	   		grid.add(txtUser1, 0,2);			
	   				
   		final TextArea txtarea = new TextArea();
        txtarea.setPrefRowCount(10);
        txtarea.setPrefColumnCount(100);
        txtarea.setWrapText(true);
        txtarea.setPrefWidth(300);
        GridPane.setHalignment(txtarea, HPos.CENTER);
        grid.add(txtarea, 0, 4);

        String promptxt = "Enter Your Complain...";
        txtarea.setPromptText(promptxt);
   		
   		
		
		Button buttonsubmit= new Button("Submit");
		grid.add(buttonsubmit, 0, 7);   	
		
		buttonsubmit.setStyle("-fx-font: 12 arial; -fx-base: #56033c;");	
		
		
		buttonsubmit.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	Sucessfully sucessfully = new Sucessfully();
		     	sucessfully.start(stage);
		        
		    }
		});
			
		
		
		Button buttonbck= new Button("Back");
		grid.add(buttonbck, 1, 7);
		
		
		buttonbck.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	 Directory direct = new Directory();
		    	 direct.start(stage);
	        

		    }
		});
		

      		
      	
			  
		   stage.setScene(scene);
				stage.setResizable(false);
					stage.show();


}}



