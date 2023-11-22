package add_user;


import java.sql.ResultSet;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddUserController {
	
	@FXML
	private TextField UserName;
	
	
	
	@FXML
	private TextField LoginName;
	
	
	@FXML
	private TextField Password;
	
	
	@FXML
	private TextField ConfirmedPassword;
	
	
	@FXML
	private TextField UserRole;
	
	@FXML
	private Button save;
	
	
	@FXML 
	private Button cancel;
	
	
	@FXML
	private Label UserMessage;
	
	public void saveToDataBase(ActionEvent event) throws Exception{
		String query="insert into user(username,loginname,password,confirmedpassword,userrole)value('"+UserName.getText()+"','"+LoginName.getText()+"','"+ Password.getText()+"','"+ConfirmedPassword.getText()+"','"+UserRole.getText()+"')";
		DBUtils.executequery(query);
		UserMessage.setText("User Account Is Created");
		
	}
	
	public void goToUserManagement(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}
	
}
