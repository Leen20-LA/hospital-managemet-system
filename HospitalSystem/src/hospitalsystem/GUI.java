/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author USER
 */
import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.Background; 
import javafx.scene.layout.BackgroundFill; 
import javafx.scene.layout.GridPane; 
import javafx.scene.paint.Color; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 
import javafx.stage.Stage; 

public class GUI extends Application { 
    @Override 
    public void start(Stage primaryStage) { 
        GridPane gridPane = new GridPane(); 
        gridPane.setAlignment(Pos.CENTER); 
        gridPane.setHgap(10); 
        gridPane.setVgap(10); 
        gridPane.setPadding(new Insets(40)); 
        gridPane.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, null, null))); 
        Text title = new Text(" ***** Hospital System *****"); 
        title.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD, 18)); 
        title.setFill(Color.DARKBLUE); 
        gridPane.add(title, 0, 0, 2, 1); 
 
        Label illnessLabel = new Label("Illness:"); 
        TextField illnessField = new TextField(); 
 
        Label recordLabel = new Label("Record Number:"); 
        TextField recordField = new TextField(); 
 
        Label idLabel = new Label("ID:"); 
        TextField idField = new TextField(); 
 
        Label nameLabel = new Label("Full Name:"); 
        TextField nameField = new TextField(); 
 
        Label genderLabel = new Label("Gender (M/F):"); 
        TextField genderField = new TextField(); 
 
        gridPane.add(illnessLabel, 0, 1); 
        gridPane.add(illnessField, 1, 1); 
 
        gridPane.add(recordLabel, 0, 2); 
        gridPane.add(recordField, 1, 2); 
 
        gridPane.add(idLabel, 0, 3); 
        gridPane.add(idField, 1, 3); 
 
        gridPane.add(nameLabel, 0, 4); 
        gridPane.add(nameField, 1, 4); 
 
        gridPane.add(genderLabel, 0, 5); 
        gridPane.add(genderField, 1, 5); 
 
        Button addButton = new Button("Add Patient"); 
        addButton.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, null, null))); 
        addButton.setTextFill(Color.ALICEBLUE); 
        addButton.setFont(Font.font("FZYaoTi", FontWeight.BOLD, 15)); 
 
        gridPane.add(addButton, 0, 6); 
 
        addButton.setOnAction((ActionEvent event) -> { 
            try { 
                String illness = illnessField.getText(); 
                String record = recordField.getText(); 
                int id = Integer.parseInt(idField.getText()); 
                String fullName = nameField.getText(); 
                char gender = genderField.getText().charAt(0); 
 
             
                HospitalSystem.person.add(new patient(illness, record, id, fullName, gender)); 
 
                System.out.println("Patient added successfully"); 
            } catch (Exception e) { 
                System.out.println("Invalid input"); 
            } 
        }); 
 
        Scene scene = new Scene(gridPane, 420, 350); 
        primaryStage.setScene(scene); 
        primaryStage.setTitle("Patient Registration"); 
        primaryStage.setResizable(false); 
        primaryStage.show(); 
    }
    public static void main(String[] args) { 
        launch(args); 
    } 
} 