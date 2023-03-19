package com.example.example;

import com.example.example.products.CerealsGrainsProduct;
import com.example.example.products.MeatProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CerealAddController {

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
    private ComboBox<String> typeBox;

    @FXML
    private TextField carbField;

    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;

    private CerealsGrainsProduct currentCereal;

    public CerealsGrainsProduct getIngredient() {
        return this.currentCereal;
    }

    @FXML
    private void addClickButton() {
        this.currentCereal = new CerealsGrainsProduct(nameField.getText(), Integer.parseInt(weighField.getText()),Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()),Integer.parseInt(carbField.getText()),  typeBox.getSelectionModel().getSelectedItem());
    }

    @FXML
    void initialize() {
        processBox.getItems().addAll("Варить", "Жарить", "Запекать", "Мешать");
        typeBox.getItems().addAll("Рис", "Гречка", "Булгур", "Кускус", "Палента");

    }

}


