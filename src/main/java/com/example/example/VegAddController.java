package com.example.example;

import com.example.example.products.Milk;
import com.example.example.products.VegFruitProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class VegAddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private TextField caloriesField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;
    @FXML
    private TextField fiberField;
    @FXML
    private ComboBox<String> processBox;

    private VegFruitProduct currentVeg;

    public VegFruitProduct getIngredient() {
        return this.currentVeg;
    }

    @FXML
    private void addClickButton() {
        this.currentVeg = new VegFruitProduct(nameField.getText(), Integer.parseInt(weighField.getText()),Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()), Integer.parseInt(fiberField.getText()));
    }

    @FXML
    void initialize() {
        addButton.setDisable(false);
        processBox.getItems().addAll("Варить", "Жарить", "Запекать", "Измельчить", "Мешать", "Резать", "Чистить");

    }

}


