package add_product;



import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProductScreenController {
	@FXML
	private TextField productName;
	
	@FXML
	private TextField productId;
	
	@FXML
	private TextField productCategory;
	
	@FXML
	private TextField productQuality;
	
	@FXML
	private TextField productPrice;
	
	@FXML
	private Button add;
	 @FXML
	 private Button cancel;
	 
	 
	 @FXML
	 private Label UserMessage;
	 
	 public void addToDataBase(ActionEvent event) throws Exception{
		 String query="insert into product(ProductName ,ProductID ,ProductCategory ,ProductQuantity ,ProductPrice) values('"+productName.getText()+"','"+productId.getText()+"','"+productCategory.getText()+"','"+productQuality.getText()+"','"+productPrice.getText()+"')";
		DBUtils.executequery(query);
		UserMessage.setText("Added Product Succesfully");
	 }
 public void goToHomeScreen(ActionEvent event) {
	 HomeScreen.showHomeScreen();
		 
	 }
	 
	

}
