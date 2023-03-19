package com.example.example;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

import com.example.example.products.Milk;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;

public class MilkAddController {

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
    private ComboBox<String> pastBox;

    @FXML
    private ComboBox<String> processBox;
    @FXML
    private TextField timeField;

    @FXML
    private TextField weighField;

    private Milk currentMilk;




    public Milk getIngredient() {
        return this.currentMilk;
    }

    @FXML
    private void addClickButton() {
        this.currentMilk = new Milk(nameField.getText(), Integer.parseInt(weighField.getText()),Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()),Integer.parseInt(calciumField.getText()), Integer.parseInt(fatField.getText()), pastBox.getSelectionModel().getSelectedItem());
    }

    @FXML
    void initialize() {
        addButton.setDisable(false);
        processBox.getItems().addAll("Нагреть", "Взбивать", "Мешать", "Вскипятить");
        pastBox.getItems().addAll("Пастеризация", "Стерилизация", "Ультрапастеризация");
    }

}


