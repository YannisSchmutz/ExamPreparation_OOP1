package gui_stuff;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class CircleDrawer extends Application {

    private final int XSIZE = 500;
    private final int YSIZE = 500;

    private double XPOS = 0;
    private double YPOS = 0;
    private double R = 0;




    @Override
    public void start(Stage primaryStage){


        // **** Input area *********************************************************************************************
        VBox vbox_input = new VBox();
        vbox_input.setAlignment(Pos.CENTER);
        vbox_input.setSpacing(10);

        HBox hbox_x = new HBox();
        hbox_x.setAlignment(Pos.CENTER);
        Label label_x = new Label("X:");
        TextField textField_x =  new TextField();
        textField_x.setPrefWidth(70);
        hbox_x.getChildren().addAll(label_x, textField_x);

        HBox hbox_y = new HBox();
        hbox_y.setAlignment(Pos.CENTER);
        Label label_y = new Label("Y:");
        TextField textField_y = new TextField();
        textField_y.setPrefWidth(70);
        hbox_y.getChildren().addAll(label_y, textField_y);


        HBox hbox_r = new HBox();
        hbox_r.setAlignment(Pos.CENTER);
        Label label_r = new Label("R:");
        TextField textField_r = new TextField();
        textField_r.setPrefWidth(70);
        hbox_r.getChildren().addAll(label_r, textField_r);

        Button button_draw = new Button("Draw");
        button_draw.setPrefWidth(50);

        vbox_input.getChildren().addAll(hbox_x, hbox_y, hbox_r, button_draw);
        // *************************************************************************************************************


        // **** Canvas area ********************************************************************************************

        StackPane pane_canvas = new StackPane();
        final Canvas canvas = new Canvas(400, 400);
        GraphicsContext graphics_context = canvas.getGraphicsContext2D();

        graphics_context.setFill(Color.GREEN);
        //graphics_context.fillOval(canvas.getWidth()/2, canvas.getHeight()/2, 30, 30);
        pane_canvas.getChildren().add(canvas);
        // *************************************************************************************************************

        // **** Canvas & Input *****************************************************************************************
        final Separator vertical_separator = new Separator();
        vertical_separator.setOrientation(Orientation.VERTICAL);

        final Separator vertical_separator2 = new Separator();
        vertical_separator2.setOrientation(Orientation.VERTICAL);

        HBox hbox_main = new HBox();
        hbox_main.getChildren().addAll(vbox_input, vertical_separator, pane_canvas, vertical_separator2);
        // *************************************************************************************************************

        // ***** Message ***********************************************************************************************
        Label message = new Label();
        // *************************************************************************************************************


        // **** Showing part
        VBox vbox_main_final = new VBox();
        final Separator horizontal_separator = new Separator();
        horizontal_separator.setOrientation(Orientation.HORIZONTAL);
        vbox_main_final.getChildren().addAll(hbox_main, horizontal_separator, message);

        //Group group = new Group();
        Scene scene = new Scene(vbox_main_final, XSIZE, YSIZE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Circle Drawer");
        primaryStage.centerOnScreen();
        primaryStage.show();



        // Button handling
        button_draw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) throws NumberFormatException{
                int x_value=0, y_value=0, r_value = 0;
                message.setText("");
                try {
                    x_value = Integer.parseInt(textField_x.getText());
                    y_value = Integer.parseInt(textField_y.getText());
                    r_value = Integer.parseInt(textField_r.getText());

                }catch (NumberFormatException parseToIntExeption) {
                    System.out.println("Error while parsing text values to int: " + parseToIntExeption);
                    message.setText("Error while parsing text values to int: " + parseToIntExeption);
                    return;
                }

                if(x_value-r_value < 0 || y_value-r_value < 0){
                    System.out.println("Circle does not fit in canvas! 1");
                    message.setText("Circle does not fit in canvas! 1");
                    return;
                }
                if(x_value < 0 || y_value < 0 || r_value < 0){
                    System.out.println("Please enter positive numbers");
                    message.setText("Please enter positive numbers");
                }
                if (x_value+r_value > canvas.getWidth() || y_value+r_value > canvas.getHeight()){
                    System.out.println("Circle does not fit in canvas! 2");
                    message.setText("Circle does not fit in canvas! 2");
                    return;
                }


                graphics_context.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                graphics_context.fillOval(x_value-r_value, y_value-r_value, r_value*2, r_value*2);

            }
        });


        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Mouse clicked");
                System.out.println(event);
                XPOS = event.getX();
                YPOS = event.getY();
            }
        });
        canvas.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                System.out.println("Mouse released:");
                System.out.println(event);

                double x = event.getX();
                double y = event.getY();
                R = Math.sqrt( Math.pow((XPOS-x), 2) + Math.pow((YPOS-y), 2));

                System.out.println(R);

                graphics_context.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                graphics_context.fillOval(XPOS-R, YPOS-R, R*2, R*2);
            }
        });
    }


    static void main(String args[]){
        launch(args);
    }

}
