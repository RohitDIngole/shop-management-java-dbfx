package user_management;

import add_user.AddUserScreen;
import delete_user.DeleteUserScreen;
import edit_user.EditUserScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_user.SearchUserScreen;

public class UserManagementScreenController {
	@FXML
	private  Button addUser;
	
	
	@FXML 
	private Button editUser;
	
	@FXML
	private Button searchUser;
	
	
	@FXML  
	private Button deleteUser;
	
	
	@FXML
	private Button quit;
	
	
	public void addingUser(ActionEvent event) {
		AddUserScreen.showAddUserScreen();
		
	}
    public void editingUser(ActionEvent event) {
    	EditUserScreen.showEditScreen();
    	
    }
    public void searchingUser(ActionEvent event) {
    	SearchUserScreen.showSearchUser();
    	
    }
    public void deletingUser(ActionEvent event) {
    	DeleteUserScreen.shoeDeleteScreen();
    	
    }
    public void goBackToHomeScreen(ActionEvent event) {
    	HomeScreen.showHomeScreen();
    }
}
