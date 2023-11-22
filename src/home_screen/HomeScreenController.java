package home_screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.Login_Screen;
import product_management.ProductManagementScreen;
import user_management.UserManagementScreen;

public class HomeScreenController {
	
	@FXML
	private Button usermanagement;
	
	
	@FXML
	private Button productmanagement;
	
	
	@FXML
	private Button back;
	
	
	public  void gotousermanagement(ActionEvent event) {
		UserManagementScreen.showUserManagement();
		
	}
	public  void gotoproductmanagement(ActionEvent event)
	{
		ProductManagementScreen.showPrductMangementScreen();
		
	}
	public  void backtohomescreen(ActionEvent event) {
		Login_Screen.showLoginScreen();
		
	}

	
}
