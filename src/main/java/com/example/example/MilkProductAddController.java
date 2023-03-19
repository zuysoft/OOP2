package com.example.example;

import com.example.example.products.Milk;
import com.example.example.products.MilkProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MilkProductAddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private TextField calciumField;

    @FXML
    private TextField caloriesField;

    @FXML
    private TextField fatField;

    @FXML
    private TextField nameField;


    @FXML
    private ComboBox<String> processBox;

    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;

    private MilkProduct currentMilkProduct;

    public MilkProduct getIngredient() {
        return this.currentMilkProduct;
    }

    @FXML
    private void addClickButton() {
        this.currentMilkProduct = new MilkProduct(nameField.getText(), Integer.parseInt(weighField.getText()),Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()),Integer.parseInt(calciumField.getText()), Integer.parseInt(fatField.getText()));
    }

    @FXML
    void initialize() {
        addButton.setDisable(false);
        processBox.getItems().addAll("Нагреть", "Жарить", "Запекать", "Взбивать", "Мешать", "Резать", "Вскипятить");
    }

}


