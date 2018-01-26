package gui_stuff;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * The ColorChanger Demo Event Handler with lambdas
 * 
 * @author lua1
 */
public class ColorChanger4 extends Application {

	private BorderPane root;
	private Button red, blue;

	@Override
	public void start(Stage primaryStage) throws Exception {

		this.red = new Button("Change to Red");
		this.red.addEventHandler(ActionEvent.ACTION, event ->
			root.setStyle("-fx-background-color: red"));

		this.blue = new Button("Change to Blue");
		this.blue.addEventHandler(ActionEvent.ACTION, event -> 
			root.setStyle("-fx-background-color: blue"));

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setPadding(new Insets(10));
		box.getChildren().addAll(red, blue);

		root = new BorderPane();
		root.setBottom(box);

		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.setTitle("JavaFX Event Demo");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}