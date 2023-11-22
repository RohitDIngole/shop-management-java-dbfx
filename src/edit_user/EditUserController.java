package edit_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EditUserController {
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
	private Button save;
	

	@FXML
	private Button cancel;
	
	@FXML
	private Button edit;
	

	@FXML
	private Label usermessage;
	
	
	public void editButton(ActionEvent event) throws SQLException {
		boolean status=editUser(Username.getText());
		
		if(status) {
			editUser(null);
		}
		
	}
	
	private boolean editUser(String userName) throws SQLException{
		
		String query="select * from user where username='"+Username.getText()+"'";
		ResultSet rs=DBUtils.executeQueryGetQuery(query);
		try {
			if(rs.next()) {
				UserName.setText(rs.getString("username"));
				LoginName.setText(rs.getString("loginname"));
				Password.setText(rs.getString("password"));
				ConfirmedPassword.setText(rs.getString("confirmedpassword"));
				UserRole.setText(rs.getString("userrole"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;}
	
	

	public void saveToDataBase(ActionEvent event) {
		String updateQuery="update user set "+" username='"+UserName.getText()+"', loginname='"+LoginName.getText()+"', password='"+Password.getText()+"', confirmedpassword='"+ConfirmedPassword.getText()+"', userrole='"+UserRole.getText()+"' where username='"+Username.getText()+"'";
		DBUtils.executequery(updateQuery);
		usermessage.setText("User Has Been Update");
		
	}
	
	
	public void goToHomeScreen(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}
	
	
	
	

}
