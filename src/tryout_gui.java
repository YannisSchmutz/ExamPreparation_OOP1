

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;




public class tryout_gui extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane anchor_pane = new AnchorPane();

        Rectangle rect1 = new Rectangle(20, 200);
        rect1.setFill(Color.GREEN);
        Rectangle rect2 = new Rectangle(20, 200);
        rect2.setFill(Color.GREEN);
        Rectangle rect3 = new Rectangle(20, 200);
        rect3.setFill(Color.GREEN);

        anchor_pane.getChildren().add(rect1);
        AnchorPane.setBottomAnchor(rect1, 20.0);
        AnchorPane.setLeftAnchor(rect1, 20.0);

        anchor_pane.getChildren().add(rect2);
        AnchorPane.setBottomAnchor(rect2, 20.0);
        AnchorPane.setLeftAnchor(rect2, 50.0);

        anchor_pane.getChildren().add(rect3);
        AnchorPane.setBottomAnchor(rect3, 20.0);
        AnchorPane.setLeftAnchor(rect3, 80.0);


        HBox hbox = new HBox();
        Button button1 = new Button("Blub!");
        hbox.getChildren().add(button1);

        VBox vbox = new VBox();
        vbox.getChildren().add(anchor_pane);
        vbox.getChildren().add(hbox);


        Group layout_group = new Group();
        //layout_group.getChildren().addAll(anchor_pane, hbox);
        layout_group.getChildren().addAll(vbox);
        //Scene scene = new Scene(anchor_pane, 300, 300);
        //Scene scene = new Scene(hbox, 300, 300);
        Scene scene = new Scene(layout_group, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String args[]){
        launch(args);
    }
}
