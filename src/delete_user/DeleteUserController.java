package delete_user;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteUserController {
	
	@FXML
	private TextField UserName;
	
	
	@FXML
	private Button back;
	
	@FXML
	private Button delete;
	
	@FXML
	
	private Label Usermessage;
	
	public  void deleteTheUser(ActionEvent event) {
		String query="delete * from user where username='"+UserName+"'";
		DBUtils.executeQueryGetQuery(query);
		Usermessage.setText("User Has Been Deleted");
		
	}
	
	public  void backToHomeScreen(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}

}
