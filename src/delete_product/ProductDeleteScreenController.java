package delete_product;

import java.sql.ResultSet;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProductDeleteScreenController {
	
	@FXML
	private TextField productName;
	
	@FXML
	private Button delete;
	
	@FXML
	private Button back;
	
	@FXML
	private Label UserMessage;
	
	
	public void deleteproduct(ActionEvent event) {
		String query="delete * from product where ProductName='"+productName+"'";
		ResultSet rs=DBUtils.executeQueryGetQuery(query);
		UserMessage.setText("User Has Been Deleted");
	}
	
	public void backToHomeScreen(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}
	

}
