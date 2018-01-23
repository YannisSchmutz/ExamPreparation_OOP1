package gui_stuff;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class TwoButtons extends Application {

    private int value_a = 0;
    private int value_b = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{

        VBox vbox_a = new VBox();
        vbox_a.setAlignment(Pos.CENTER);
        vbox_a.setSpacing(5);
        Button button_a = new Button("A");
        button_a.setPrefWidth(50);
        Label label_a = new Label(String.format("A = %d", value_a));
        button_a.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                value_a++;
                label_a.setText(String.format("A = %d", value_a));
            }
        });
        vbox_a.getChildren().addAll(button_a, label_a);


        VBox vbox_b = new VBox();
        vbox_b.setAlignment(Pos.CENTER);
        vbox_b.setSpacing(5);
        Button button_b = new Button("B");
        button_b.setPrefWidth(50);
        Label label_b = new Label(String.format("B = %d", value_b));
        button_b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(String.format("Button event: %s", event));
                value_b++;
                label_b.setText(String.format("B = %d", value_b));
            }
        });
        vbox_b.getChildren().addAll(button_b, label_b);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(15);
        hBox.getChildren().addAll(vbox_a, vbox_b);

        //Group layout_group = new Group();
        //layout_group.getChildren().add(hBox);
        Scene scene = new Scene(hBox, 300, 300);
        primaryStage.setTitle("Two buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String args[]){
        launch(args);
    }
}
