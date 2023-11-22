package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController {
	
	@FXML
	private TextField LoginName;//textfield is a datatype
	
	@FXML
	private TextField Password;
	
	@FXML
	private Button LoginButton;
	
	
	public void login(ActionEvent event) {
		System.out.println(LoginName.getText());
		System.out.print(Password.getText());
		 boolean loginStatus=LoginScreenController.validateUserAndPassword(LoginName.getText(),Password.getText());
		 
		 if(loginStatus) {
			HomeScreen.showHomeScreen();
		 }
		 else {
			 System.out.println("Login uncessfully");
		 }
		
		
	}
	public static boolean validateUserAndPassword(String loginname,String password) {
		String query="select * from user where loginname='"+loginname+"'and password='"+password+"'";
		
		ResultSet rs=DBUtils.executeQueryGetQuery(query);
		
		try {
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	

}
