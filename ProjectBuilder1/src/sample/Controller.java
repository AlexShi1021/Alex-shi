package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {


    public Button buttonMethod;
    public TextField TextName;
    public double Total = 0;
    public Label TextDisplay;


//ArrayList numbers & operators


    public void Printname(ActionEvent actionEvent) {
        String name = TextName.getText();
        System.out.println(name);
    }
// adding to text
    public void Add(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "+");
        double num = Double.parseDouble(TextDisplay.getText());
        Total += num;
        TextDisplay.setText(Double.toString(Total));

    }

    //subtracting to text
    public void Subtract(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "-");
        double num = Double.parseDouble(TextDisplay.getText());
        Total -= num;
        TextDisplay.setText(Double.toString(Total));

    }

    //Multiplies the text
    public void Multiply(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "*");
        double num = Double.parseDouble(TextDisplay.getText());
        Total *= num;
        TextDisplay.setText(Double.toString(Total));
    }




    // all the number buttons
    public void AddOne(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "1");
    }

    public void AddTwo(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "2");
    }

    public void AddThree(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "3");
    }

    public void AddFour(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "4");
    }

    public void AddFive(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "5");
    }

    public void AddSix(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "6");
    }

    public void AddSeven(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "7");
    }

    public void AddEight(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "8");
    }

    public void AddNine(ActionEvent actionEvent) {
        TextDisplay.setText(TextDisplay.getText() + "9");
    }

//clears the text display
    public void Clear(ActionEvent actionEvent) {
        TextDisplay.setText("");
        Total = 0;
    }


    //equals the equation on the text
    public void Equal(ActionEvent actionEvent) {

        
    }
}


//make arraylist
//numbers.add(labelDisplay.geText());

//
