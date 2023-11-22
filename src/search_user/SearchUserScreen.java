package search_user;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import common.StageFactory;
public class SearchUserScreen {
	
	public static void showSearchUser() {
		
		
		try {
			Parent actorGroup=FXMLLoader.load(new URL("file:C|\\Users\\Rohit Ingole\\eclipse-workspace\\mega. java\\Shopping_Management_DB_Javafx\\src\\search_user\\SearchUser.fxml"));
			StageFactory.stage.setTitle("Search Page");
			Scene scene=new Scene(actorGroup,600,400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
