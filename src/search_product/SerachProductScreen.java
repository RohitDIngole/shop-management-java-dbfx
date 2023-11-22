package search_product;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import common.StageFactory;

public class SerachProductScreen {
     public static void showSearchProductScreen() {
    	 Parent actorGroup;
		try {
			actorGroup = FXMLLoader.load(new URL("file:C|\\Users\\Rohit Ingole\\eclipse-workspace\\mega. java\\Shopping_Management_DB_Javafx\\src\\search_product\\SearchProduct.fxml"));
			StageFactory.stage.setTitle("Search Screen page");
	    	 Scene scene=new Scene(actorGroup,600,400);
	    	 StageFactory.stage.setScene(scene);
	    	 StageFactory.stage.setFullScreen(true);
	    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
     }
}
