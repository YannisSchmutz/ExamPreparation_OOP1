package gui_stuff;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 * The JavaFX event demo
 * 
 * @author lua1
 */
public class EventDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Label
		final TextFlow l = new TextFlow(new Text("some text"));
		l.addEventHandler(InputEvent.ANY, new PrintIt());
		l.setTextAlignment(TextAlignment.CENTER);

		// Circle
		final Circle c1 = new Circle(50.0f, 50.0f, 100.0f, Color.DARKORANGE);
		c1.addEventHandler(InputEvent.ANY, new PrintItAndConsume());

		// Rectangle
		final Rectangle r1 = new Rectangle(100, 150, Color.LIGHTBLUE);
		r1.addEventHandler(InputEvent.ANY, new PrintIt());

		// Group
		final Group g = new Group(c1, r1);
		
		// Pane
		final BorderPane root = new BorderPane();
		root.addEventHandler(InputEvent.ANY, new PrintIt());
		
		root.setTop(l);
		root.setCenter(g);

		// Scene
		final Scene scene = new Scene(root, 300, 250);
		scene.addEventHandler(InputEvent.ANY, new PrintIt());

		// Stage
		primaryStage.setTitle("JavaFX Event Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.addEventHandler(InputEvent.ANY, new PrintIt());

	}

	public static void main(String[] args) {
		launch(args);
	}

	private class PrintIt implements EventHandler<InputEvent> {
		@Override
		public void handle(InputEvent e) {
			System.out.println("The event " + e + "was handled.");
		}
	}

	private class PrintItAndConsume implements EventHandler<InputEvent> {
		@Override
		public void handle(InputEvent e) {
			System.out.println("The event " + e + "was handled an consumed.");
			e.consume();
		}
	}

}
