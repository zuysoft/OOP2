package com.example.example;

import com.example.example.products.MeatProduct;
import com.example.example.products.MinceProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MinceAddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;


    @FXML
    private TextField caloriesField;

    @FXML
    private ComboBox<String> processBox;

    @FXML
    private TextField nameField;

    @FXML
    private TextField proteinField;

    @FXML
    private ComboBox<String> typeBox;

    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;

    @FXML
    private TextField meatPercentField;

    private MinceProduct currentMince;

    public MinceProduct getIngredient() {
        return this.currentMince;
    }

    @FXML
    private void addClickButton() {
        this.currentMince = new MinceProduct(nameField.getText(), Integer.parseInt(weighField.getText()), Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(),Integer.parseInt(timeField.getText()), Integer.parseInt(proteinField.getText()), typeBox.getSelectionModel().getSelectedItem(), Integer.parseInt(meatPercentField.getText()));
    }

    @FXML
    void initialize() {
        processBox.getItems().addAll("Жарить", "Запекать", "Перемешать");
        typeBox.getItems().addAll("Курица", "Свинина", "Говядина", "Баранина", "Крольчатина", "Утка");

    }

}


