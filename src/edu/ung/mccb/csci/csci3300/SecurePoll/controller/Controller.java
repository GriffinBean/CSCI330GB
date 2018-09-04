package edu.ung.mccb.csci.csci3300.SecurePoll.controller;

import edu.ung.mccb.csci.csci3300.SecurePoll.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField email, username, password;

    public void TouchLogin(javafx.event.ActionEvent actionEvent)
    {
        Model model = new Model();
        String hashPassword = model.generatePasswordHash(password.getText());
        System.out.println(hashPassword);
    }
}