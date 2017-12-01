package controller;

import java.net.URL;
import java.util.ResourceBundle;

import controls.Tab;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class Controller implements Initializable {
	
	@FXML private AnchorPane anchorPane;
	@FXML private AnchorPane bannerAnchorPane;
	
	@FXML private AnchorPane accountsAnchorPane;
	@FXML private AnchorPane profileAnchorPane;
	@FXML private AnchorPane sendMoneyAnchorPane;
	@FXML private AnchorPane depositWithdrawAnchorPane;
	
	
	@FXML private Rectangle accountsSplitter;
	
	public void initialize(URL location, ResourceBundle resources) {
		
		new Tab(anchorPane, new String[] { "Accounts", "Profile", "Send Money", "Deposit / Withdraw" }, new AnchorPane[] { accountsAnchorPane, profileAnchorPane, sendMoneyAnchorPane, depositWithdrawAnchorPane });
		
		
		accountsSplitter.heightProperty().bind(accountsAnchorPane.heightProperty().subtract(80));
		
		
	}
	
}
