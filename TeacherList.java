package edu.pro.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TeacherList  extends Application {
	
	

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
			
   
   Text welcomeTxt = new Text("TEACHER LIST");
   		welcomeTxt.setFont(Font.font("Serif", FontWeight.BOLD, 20));
   			grid.add(welcomeTxt, 0, 0);
   				welcomeTxt.setFill(Color.PURPLE);
   {

}
   
  ListView<String> list = new ListView<String>();
   ObservableList<String> items =FXCollections.observableArrayList (
	"ID		TEACHER NAME	C-TYPE /DOM",		   
	"________________________________________________",	   
	"1001		Prof.Aziz Suleman	      RB-1  	2006",	
	"1002		Prof.Israr Yaqoob	      RB-1  2005",
	"1003		Dr.Ali Huda	     	      RB-1  	2004",
	"1004		Prof.Naureen Sajan	      RB-1  	2008",
	"1005		Dr.Azeem Aftab	      RB-1  	2009",
	"1006		Prof.Javed Khan	      RB-1  	2008",  
	"1007		Prof.Ameer Sikh	      RB-1  	2005"
	
);
   
   
   list.setItems(items);
   list.setMaxWidth(500);
		
   grid.add(list, 0, 3);
		
   
   
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
