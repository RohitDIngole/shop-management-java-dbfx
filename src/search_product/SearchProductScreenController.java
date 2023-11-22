package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchProductScreenController {
	@FXML
	private TextField productToSerach;
	
	
	@FXML
	private TextField productName;
	
	
	@FXML
	private TextField productId;
	
	
	@FXML
	private TextField productCategory;
	
	
	@FXML
	private TextField productQuantity;
	
	
	@FXML
	private TextField productPrice;
	
	@FXML
	private Button Search;
	
	@FXML
	private Button Delete;
	
	
	@FXML
	private Button cancel;
	
	@FXML
	private Label productMessage;
	
	
	public void searchToDataBase(ActionEvent event) {
		boolean status=serachProduct(productToSerach.getText());
		if(status) {
			productMessage.setText("Product Found succesfullt");
		}
		else {
			productMessage.setText("Product not found sucessfully");
		}
	}
	
	
	public void deleteProduct(ActionEvent event) {
		String query="delete * from product where ProductName='"+productToSerach+"'";
		DBUtils.executequery(query);
	}
	
	public void goToHomeScreen(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}
     public boolean serachProduct(String productToSerach) {
    	 String query="select * from product where ProductName='"+productToSerach+"'";
    	 ResultSet rs=DBUtils.executeQueryGetQuery(query);
    	 try {
			if(rs.next()) {
				productName.setText(rs.getString("ProductName"));
				productId.setText(rs.getString("ProductID"));
				productCategory.setText(rs.getString("ProductCategory"));
				productQuantity.setText(rs.getString("ProductQuantity"));
				productPrice.setText(rs.getString("ProductPrice"));
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;}
}
