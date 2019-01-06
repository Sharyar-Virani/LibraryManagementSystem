package edu.pro.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Sucessfully extends Application
{
	
	
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
				
	   
	   Text welcomeTxt = new Text("SUCESSFULLY SUBMIT");
	   		welcomeTxt.setFont(Font.font("Serif", FontWeight.BOLD, 24));
	   			grid.add(welcomeTxt, 1, 1);
	   				welcomeTxt.setFill(Color.BLACK);
	  
	
 		
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


