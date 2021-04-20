package sample;

import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class Controller {

    public TextField TextAdd;
    public TextField TextRemove;
    public ListView<Friends> Display = new ListView<>();
    public TextField TextLastname;
    public String Firstname;
    public Label LabFirst;
    public Label LabLast;


    public void Add(ActionEvent actionEvent) {
        String Firstname = TextAdd.getText();
        String Lastname = TextLastname.getText();
        Friends friend = new Friends(Firstname, Lastname);
        Display.getItems().add(friend);
    }

    public String toString(){
        return Firstname;
    }

    public void Remove(ActionEvent actionEvent) {
    }



    //text add
    public void AddsFriend(ActionEvent actionEvent) {

    }

    public void RemovesFriend(ActionEvent actionEvent) {
    }

    public void ShowAll(ActionEvent actionEvent) {
    }

    public void DisplayFriend(MouseEvent mouseEvent) {
        Friends friend = Display.getSelectionModel().getSelectedItem();
        LabFirst.setText(Friends.getFirstname);
        LabLast.setText(Friends.getLastname);
    }
}
