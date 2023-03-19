package com.example.example;

import com.example.example.products.FishProduct;
import com.example.example.products.SFinishedProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SFinishedAddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;



    @FXML
    private TextField caloriesField;

    @FXML
    private TextField dataField;


    @FXML
    private TextField nameField;

    @FXML
    private TextField omegaField;

    @FXML
    private ComboBox<String> areaBox;
    @FXML
    private ComboBox<String> processBox;

    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;

    private SFinishedProduct currentSFinished;

    public SFinishedProduct getIngredient() {
        return this.currentSFinished;
    }

    @FXML
    private void addClickButton() {
        this.currentSFinished = new SFinishedProduct(nameField.getText(), Integer.parseInt(weighField.getText()),Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()), Integer.parseInt(omegaField.getText()),  areaBox.getSelectionModel().getSelectedItem(), Integer.parseInt(dataField.getText()));
    }

    @FXML
    void initialize() {
        processBox.getItems().addAll("Варить", "Жарить", "Запекать", "Взбивать", "Мешать", "Резать", "Чистить");
        areaBox.getItems().addAll("Река", "Озеро", "Море", "Океан");

    }

}


