package add_product;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddProductScreen {
	
	
      public static void showAddProductScreen() {
    	  Parent actorGroup;
		try {
			actorGroup = FXMLLoader.load(new URL("file:C|\\Users\\Rohit Ingole\\eclipse-workspace\\mega. java\\Shopping_Management_DB_Javafx\\src\\add_product\\AddProduct.fxml"));
			StageFactory.stage.setTitle("Add Product Page");
	    	  Scene scene=new Scene(actorGroup,600,40);
	    	  StageFactory.stage.setScene(scene);
	    	  StageFactory.stage.setFullScreen(true);
	  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
      }
}
