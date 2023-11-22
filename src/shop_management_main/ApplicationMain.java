package shop_management_main;

import java.io.IOException;

import common.StageFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import login.Login_Screen;

public class ApplicationMain extends Application {
	
	public static void main(String[]args) throws IOException{
		launch(args);
	}
	
	public void start(Stage stage) {
		StageFactory.stage=stage;
		Login_Screen.showLoginScreen();
		
	}
	

}
