package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {

    @FXML
    private Button btn02;

    @FXML
    private Button btn03;

    @FXML
    private Button btn04;

    @FXML
    private Button btn05;

    @FXML
    private Button btnSubmit;

    @FXML
    void btn02OnAction(ActionEvent event) {
        System.out.println("button 02");
    }

    @FXML
    void btn03OnAction(ActionEvent event) {
        System.out.println("button 03");
    }

    @FXML
    void btn04OnAction(ActionEvent event) {
        System.out.println("button 04");
    }

    @FXML
    void btn05OnAction(ActionEvent event) {
        System.out.println("button 05");
    }

    @FXML
    void btnSubmitOnAction(ActionEvent event) {
        System.out.println("Button Submit");
    }

}
