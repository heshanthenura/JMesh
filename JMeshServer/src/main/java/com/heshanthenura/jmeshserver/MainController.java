package com.heshanthenura.jmeshserver;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.*;

public class MainController implements Initializable {

    @FXML
    private Button powerBtn;
    @FXML
    private ImageView powerBtnImg;
    @FXML
    private TextArea textArea;
    @FXML
    private TextField portInput;

    Logger logger = Logger.getLogger("info");


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
