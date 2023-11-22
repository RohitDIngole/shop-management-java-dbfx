package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchUserController {
	
	@FXML
	private TextField Username;
	
	@FXML
	private TextField LoginName;
	
	@FXML
	private TextField UserName;
	
	@FXML
	private TextField Password;
	
	@FXML
	private TextField ConfirmedPassword;
	
	@FXML
	private TextField UserRole;
	
	
	
	@FXML
	private Button cancel;

	
	@FXML
	private Button Search;
	
	
	@FXML
	private Button Delete;
	
	@FXML
	private Label usermessage;
	
	
	
	
	public void searchToDataBase(ActionEvent event) {
		   boolean status=SearchUser(Username.getText());
		   
		   if(status) {
			   
			   usermessage.setText("User found Succesfully");
			   
		   }
		   else {
			   usermessage.setText("User not found");
		   }
		 
		
	     
		
	}
	
	public void deleteUser(ActionEvent event) {
		String query="delete * from user where username='"+Username.getText()+"'";
		System.out.print(query);
		DBUtils.executequery(query);
	}
	
	public void goToHomeScreen(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}
	
	public  boolean SearchUser(String Username) {
		
	String query="select * from user where username='"+Username+"'";
	ResultSet rs=DBUtils.executeQueryGetQuery(query);
	
	try {
		if(rs.next()) {
			UserName.setText(rs.getString("username"));
			LoginName.setText(rs.getString("loginname"));
			Password.setText(rs.getString("password"));
			ConfirmedPassword.setText(rs.getString("confirmedpassword"));
			UserRole.setText(rs.getString("userrole"));
			return true;
			
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;}


}
