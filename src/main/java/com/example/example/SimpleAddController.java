package com.example.example;

import com.example.example.products.SimpleProduct;
import com.example.example.products.VegFruitProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SimpleAddController {

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
    private ComboBox<String> processBox;

    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;

    private SimpleProduct currentSimple;

    public SimpleProduct getIngredient() {
        return this.currentSimple;
    }

    @FXML
    private void addClickButton() {
        this.currentSimple = new SimpleProduct(nameField.getText(), Integer.parseInt(weighField.getText()),Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()));
    }

    @FXML
    void initialize() {
        addButton.setDisable(false);
        processBox.getItems().addAll("Добавить", "Нагреть", "Жарить", "Взбивать", "Мешать", "Резать", "Чистить");
    }

}


