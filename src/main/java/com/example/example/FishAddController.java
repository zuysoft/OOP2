package com.example.example;

import com.example.example.products.FishProduct;
import com.example.example.products.MeatProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FishAddController {

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
    private TextField omegaField;

    @FXML
    private ComboBox<String> areaBox;

    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;

    private FishProduct currentFish;

    public FishProduct getIngredient() {
        return this.currentFish;
    }

    @FXML
    private void addClickButton() {
        this.currentFish = new FishProduct(nameField.getText(), Integer.parseInt(weighField.getText()),Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()), Integer.parseInt(omegaField.getText()),  areaBox.getSelectionModel().getSelectedItem());
    }

    @FXML
    void initialize() {
        processBox.getItems().addAll("Варить", "Жарить", "Запекать", "Измельчить", "Мешать", "Резать", "Чистить");
        areaBox.getItems().addAll("Река", "Озеро", "Море", "Океан");
    }

}


