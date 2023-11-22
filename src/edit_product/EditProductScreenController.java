package edit_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EditProductScreenController {
	@FXML 
	private TextField productToEdit;
	
	@FXML
	private TextField ProductID;
	
	@FXML
	private TextField ProductName;
	
	@FXML
	private TextField ProductCategory;
	
	@FXML
	private TextField ProductQuantity;
	
	
	@FXML
	private TextField ProductPrice;
	
	@FXML
	private Button save;
	
	@FXML
	private Button edit;
	
	
	@FXML
	private Button cancel;
	
	
	@FXML
	private Label usermessage;
	
	
	public void editButton(ActionEvent event) throws SQLException{
		boolean editstatus=editProduct(productToEdit.getText());
		if(editstatus) {
			editProduct(null);
		}
	}
	
	
	private boolean editProduct(String product_name)  throws SQLException{
		String query="select * from product where ProductName='"+productToEdit.getText()+"'";
		ResultSet rs=DBUtils.executeQueryGetQuery(query);
		
		try {
			if(rs.next()) {
				ProductName.setText(rs.getString("ProductName"));
				ProductID.setText(rs.getString("ProductID"));
				ProductCategory.setText(rs.getString("ProductCategory"));
				ProductQuantity.setText(rs.getString("ProductQuantity"));
				ProductPrice.setText(rs.getString("ProductPrice"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		}
	
	
	
	public void saveBtton(ActionEvent event) {
		String updateQuery="update product set "+" ProductName='"+ProductName.getText()+"', ProductID='"+ProductID.getText()+"', ProductCategory='"+ProductCategory.getText()+"', ProductQuantity='"+ProductQuantity.getText()+"', ProductPrice='"+ProductPrice.getText()+"' where ProductName='"+productToEdit.getText()+"' ";
		DBUtils.executequery(updateQuery);
	}
	
	
	public  void goTohomescreen(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}
	
	
	
	 

}
