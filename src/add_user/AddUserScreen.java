package add_user;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddUserScreen {
public static void showAddUserScreen() {
		
		Parent actorGroup;
		try {
			actorGroup = FXMLLoader.load(new URL("file:C|\\Users\\Rohit Ingole\\eclipse-workspace\\mega. java\\Shopping_Management_DB_Javafx\\src\\add_user\\AddUser.fxml"));
			StageFactory.stage.setTitle("User Page");
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
