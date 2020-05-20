package day22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Test03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane btnCanvas = new Pane();
		Button btn = new Button("test");
		btn.setPrefWidth(120);
		btn.setPrefHeight(40);
		btn.setLayoutX(20);
		btn.setLayoutY(20);
		btn.setStyle("-fx-font:22 arial; -fx-base:#b6e7c9;");
		DropShadow shadow = new DropShadow();
		btn.addEventHandler(MouseEvent.MOUSE_ENTERED, e->{
			btn.setEffect(shadow);
		});
		btn.addEventHandler(MouseEvent.MOUSE_EXITED, e->{
			btn.setEffect(null);
		});
		
		btnCanvas.getChildren().add(btn);
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(btnCanvas, 160, 80));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
