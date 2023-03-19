package com.example.example;

import com.example.example.products.MeatPartProduct;
import com.example.example.products.MinceProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MeatPartAddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private ComboBox<String> bodyBox;
    @FXML
    private ComboBox<String> processBox;
    @FXML
    private ComboBox<String> typeBox;

    @FXML
    private TextField caloriesField;



    @FXML
    private TextField nameField;

    @FXML
    private TextField proteinField;


    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;


    private MeatPartProduct currentMince;

    public MeatPartProduct getIngredient() {
        return this.currentMince;
    }

    @FXML
    private void addClickButton() {
        this.currentMince = new MeatPartProduct(nameField.getText(), Integer.parseInt(weighField.getText()), Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(),Integer.parseInt(timeField.getText()), Integer.parseInt(proteinField.getText()), typeBox.getSelectionModel().getSelectedItem(), bodyBox.getSelectionModel().getSelectedItem());
    }

    @FXML
    void initialize() {
        processBox.getItems().addAll("Варить", "Жарить", "Запекать", "Измельчить", "Мешать", "Резать", "Чистить");
        typeBox.getItems().addAll("Курица", "Свинина", "Говядина", "Баранина", "Крольчатина", "Утка");
        bodyBox.getItems().addAll("Грудка", "Голень", "Спинка", "Вырезка", "Стейк", "Медальон");
    }

}


