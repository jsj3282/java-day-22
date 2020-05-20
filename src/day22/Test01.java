package day22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Test01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane canvas = new Pane();
		Button btn = new Button("test");
		
		btn.setGraphic(new ImageView("/img/SmileReRe.png"));
	
		btn.setLayoutX(90);
		btn.setLayoutY(80);
		btn.setPrefWidth(120);
		btn.setPrefHeight(40);
		
		Button btn1 = new Button();
		ImageView img = new ImageView("/img/SmileReRe.png");
		img.setFitHeight(40);
		img.setFitWidth(40);
		btn1.setGraphic(img);
		btn1.setStyle("-fx-background-color:transparent; -fx-padding: 10 10 10 10;");
		btn1.setOnMousePressed(e->{//╩С, ©Л, го, аб
			btn1.setStyle("-fx-background-color:transparent; -fx-padding: 15 10 10 10;"); 
		});
		btn1.setOnMouseReleased(e->{
			btn1.setStyle("-fx-background-color: transparent; -fx-padding: 10 10 10 10;");
		});
		canvas.getChildren().addAll(btn, btn1);
		canvas.setPrefSize(400, 400);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
