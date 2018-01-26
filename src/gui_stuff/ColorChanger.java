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
 * The ColorChanger Demo
 * Event Handler implemented in the main class
 *
 * @author lua1
 */
public class ColorChanger extends Application implements
        EventHandler<ActionEvent> {

    private BorderPane root;
    private Button red_button, blue_button;

    @Override
    public void start(Stage primaryStage) throws Exception {

        red_button = new Button("Change to Red");
        red_button.setOnAction(this);
        blue_button = new Button("Change to Blue");
        blue_button.setOnAction(this);

        final HBox box = new HBox(red_button, blue_button);
        box.setAlignment(Pos.CENTER);
        box.setSpacing(5);
        box.setPadding(new Insets(10));

        root = new BorderPane();
        root.setBottom(box);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("JavaFX Event Demo");
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == red_button) {
            root.setStyle("-fx-background-color: red");
        } else if (event.getSource() == this.blue_button) {
            root.setStyle("-fx-background-color: blue");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}