package gui_stuff;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * The ColorChanger Demo Event Handler implemented as inner class
 * 
 * @author lua1
 */
public class ColorChanger2 extends Application {

	private BorderPane root;
	private Button red, blue;

	@Override
	public void start(Stage primaryStage) throws Exception {

		red = new Button("Change to Red");
		red.setOnAction(new ChangeBackground("red"));
		blue = new Button("Change to Blue");
		blue.setOnAction(new ChangeBackground("blue"));

		final HBox box = new HBox(red,blue); 
		box.setAlignment(Pos.CENTER);
		box.setSpacing(5);
		box.setPadding(new Insets(10));
      		
		root = new BorderPane(); 
		root.setBottom(box);

		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.setTitle("JavaFX Event Demo");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	// Event Handler implemented as inner class
	private class ChangeBackground implements EventHandler<ActionEvent> {
		private final String color;

		public ChangeBackground(String color) {
			this.color = color;
		}

		@Override
		public void handle(ActionEvent event) {
			
			root.setStyle("-fx-background-color: " + this.color);
		}
	}
}