package product_management;

import add_product.AddProductScreen;
import delete_user.DeleteUserScreen;
import edit_product.EditProductScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product.SerachProductScreen;

public class ProductMagementController {
	@FXML
	private Button addProduct;
	
	@FXML
	private Button editProduct;
	
	@FXML
	private Button searchUser;
	
	@FXML
	private Button deleteProduct;
	
	@FXML
	private Button quit;
	
	public void addingProduct(ActionEvent event) {
		AddProductScreen.showAddProductScreen();
	}

	public void editingProduct(ActionEvent event) {
		EditProductScreen.showEditProductScreen();
	}

	public void searchingProduct(ActionEvent event) {
		SerachProductScreen.showSearchProductScreen();
	}

	public void deleteingProduct(ActionEvent event) {
		DeleteUserScreen.shoeDeleteScreen();
	}
	
	public void goBackToHomeScreen(ActionEvent event) {
		HomeScreen.showHomeScreen();
		
	}
	

}
