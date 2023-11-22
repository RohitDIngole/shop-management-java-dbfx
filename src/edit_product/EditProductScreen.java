package edit_product;

import java.io.IOException;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditProductScreen {
	
	     public static void showEditProductScreen() {
	    	 Parent actorGroup;
			try {
				actorGroup = FXMLLoader.load(new URL("file:C|\\Users\\Rohit Ingole\\eclipse-workspace\\mega. java\\Shopping_Management_DB_Javafx\\src\\edit_product\\EditProduct.fxml"));
				StageFactory.stage.setTitle("Edit Screen page");
		    	 Scene scene=new Scene(actorGroup,600,400);
		    	 StageFactory.stage.setScene(scene);
		    	 StageFactory.stage.setFullScreen(true);
		    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 
	     }

}
