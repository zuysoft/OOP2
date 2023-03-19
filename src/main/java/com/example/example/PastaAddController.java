package com.example.example;

import com.example.example.products.CerealsGrainsProduct;
import com.example.example.products.Pasta;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PastaAddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private TextField wheatTypeField;
    @FXML
    private TextField caloriesField;



    @FXML
    private TextField nameField;

    @FXML
    private TextField proteinField;

    @FXML
    private ComboBox<String> processBox;
    @FXML
    private ComboBox<String> typeBox;
    @FXML
    private ComboBox<String> wheatBox;

    @FXML
    private TextField carbField;

    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;

    private Pasta currentPasta;

    public Pasta getIngredient() {
        return this.currentPasta;
    }

    @FXML
    private void addClickButton() {
        this.currentPasta = new Pasta(nameField.getText(), Integer.parseInt(weighField.getText()),Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()),Integer.parseInt(carbField.getText()),  typeBox.getSelectionModel().getSelectedItem(), wheatBox.getSelectionModel().getSelectedItem());
    }

    @FXML
    void initialize() {
        processBox.getItems().addAll("Варить", "Жарить", "Запекать", "Мешать", "Резать");
        typeBox.getItems().addAll("Паста");
        wheatBox.getItems().addAll("Твёрдый сорт", "Высший сорт", "Первый сорт");
    }

}


