package controls;

import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;

public class Tab {
	
	private int currentTabIndex = 0;
	
	private HBox banner;
	
	private String[] tabs;
	private AnchorPane[] anchorPanes;
	
	public Tab(AnchorPane anchorPane, String[] tabs, AnchorPane[] anchorPanes) {
		this.tabs = tabs;
		this.anchorPanes = anchorPanes;
		
		
		banner = new HBox();
		banner.setSpacing(0);
		banner.setLayoutY(40);
		banner.setLayoutX(40);
		
		for(int i=0; i<tabs.length; i++) {
			
			Label tab = new Label(tabs[i]);
			tab.setPrefWidth(200);
			tab.setPrefHeight(57);
			tab.setStyle("-fx-alignment: center");
			tab.setTextFill(Paint.valueOf("#BDC3C7"));
			tab.setCursor(Cursor.HAND);
			
			final int index = i;
			tab.setOnMouseClicked(e -> {
				if(index != currentTabIndex) {
					deselectTab((Label) banner.getChildren().get(currentTabIndex), anchorPanes[currentTabIndex]);
					reselectTab(tab, anchorPanes[index]);
					currentTabIndex = index;
				}
			});
			
			banner.getChildren().add(tab);
			
		}
		
		reselectTab((Label) banner.getChildren().get(0), anchorPanes[0]);
		
		
		anchorPane.getChildren().add(banner);
		
	}
	
	private void reselectTab(Label label, AnchorPane anchorPane) {
		label.setTextFill(Paint.valueOf("#1ABC9C"));
		anchorPane.setVisible(true);
	}
	
	private void deselectTab(Label label, AnchorPane anchorPane) {
		label.setTextFill(Paint.valueOf("#BDC3C7"));
		anchorPane.setVisible(false);
	}
	
	
}
