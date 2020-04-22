package PentagonAreaCalculator;

import java.util.Scanner;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        int sides;
        do {
            System.out.println("Input the number of sides (must be 5): ");
            sides = k.nextInt();
        } while (sides != 5);

        System.out.println("Input the size of the sides: ");
        int size = k.nextInt();

        System.out.println("The area of the pentagon is " + AreaCalculate.calculate(sides, size));

        System.exit(0);

    }
}
