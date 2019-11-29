package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;

public class Controller {
	
	@FXML
    private Pane pane;   


	@FXML
    public void setblur() {           
         pane.setEffect(new GaussianBlur(20));   

    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
	public void focus() {
		pane.setEffect(new GaussianBlur(0));
	}
	
}
