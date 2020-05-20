package day22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Test02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane btnCanvas = new Pane();
		Button btn = new Button("test");
		btn.setOnAction(e->{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("���");
			alert.setHeaderText("��ư �̺�Ʈ");
			alert.setContentText("��ư�� Ŭ���߽��ϴ�");
			alert.show();
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
