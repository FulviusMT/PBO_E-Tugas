package org.example.tugaspbo_bangundatar;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Box;
import javafx.scene.PerspectiveCamera;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Segitiga Sama Kaki Warna Merah
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{
                200.0, 100.0,
                100.0, 300.0,
                300.0, 300.0 });
        triangle.setFill(Color.RED);

        double base = 200.0;
        double height = 200.0;
        double triangleArea = 0.5 * base * height;

        // Teks untuk Segitiga
        Text triangleText = new Text(100, 500, "Segitiga: Panjang Alas = " + base + ", Tinggi = " + height + ", Luas = " + triangleArea);
        triangleText.setFill(Color.BLACK);

        Text triangleText1 = new Text(100,320,"Segitiga");
        triangleText1.setFill(Color.RED);

        // Persegi Panjang Warna Hijau
        double rectWidth = 250.0;
        double rectHeight = 150.0;
        Rectangle rectangle = new Rectangle(400, 150, rectWidth, rectHeight);
        rectangle.setFill(Color.GREEN);

        double rectangleArea = rectWidth * rectHeight;

        // Teks untuk Persegi Panjang
        Text rectangleText = new Text(100, 520, "Persegi Panjang: Panjang = " + rectWidth + ", Lebar = " + rectHeight + ", Luas = " + rectangleArea);
        rectangleText.setFill(Color.BLACK);

        Text rectangleText1 = new Text(400,320,"Persegi Panjang");
        rectangleText1.setFill(Color.GREEN);

        // Kubus Warna Kuning
        double cubeSize = 100.0;
        Box cube = new Box(cubeSize, cubeSize, cubeSize);
        cube.setTranslateX(100);
        cube.setTranslateY(100);
        cube.setTranslateZ(-50);
        cube.setMaterial(new javafx.scene.paint.PhongMaterial(Color.YELLOW));

        double cubeSurfaceArea = 6 * Math.pow(cubeSize, 2);

        // Teks untuk Kubus
        Text cubeText = new Text(100, 540, "Kubus: Panjang Rusuk = " + cubeSize + ", Luas Permukaan = " + cubeSurfaceArea);
        cubeText.setFill(Color.BLACK);

        Text cubeText1 = new Text(100,100,"Kubus");
        cubeText1.setFill(Color.YELLOW);
        Group root = new Group();
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(cube);
        root.getChildren().add(triangleText);
        root.getChildren().add(rectangleText);
        root.getChildren().add(cubeText);

        Scene scene = new Scene(root, 800, 600);
        PerspectiveCamera camera = new PerspectiveCamera(false);
        scene.setCamera(camera);

        primaryStage.setTitle("Drawing Shapes with JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}