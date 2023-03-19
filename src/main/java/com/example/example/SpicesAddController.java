package com.example.example;

import com.example.example.products.SFinishedProduct;
import com.example.example.products.SpicesProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SpicesAddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private TextField caloriesField;
    @FXML
    private TextField countryField;

    @FXML
    private TextField nameField;

    @FXML
    private ComboBox<String> processBox;

    @FXML
    private ComboBox<String> sharpBox;

    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;

    private SpicesProduct currentSpice;

    public SpicesProduct getIngredient() {
        return this.currentSpice;
    }

    @FXML
    private void addClickButton() {
        this.currentSpice = new SpicesProduct(nameField.getText(), Integer.parseInt(weighField.getText()),Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()), sharpBox.getSelectionModel().getSelectedItem(),   countryField.getText());
    }

    @FXML
    void initialize() {
        processBox.getItems().addAll("Добавить", "Перемешать", "Чистить");
        sharpBox.getItems().addAll("Неострая", "Острая", "Очень острая");

    }

}


