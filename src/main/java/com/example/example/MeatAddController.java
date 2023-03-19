package com.example.example;

import com.example.example.products.MeatProduct;
import com.example.example.products.Milk;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MeatAddController {

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


    private MeatProduct currentMeat;
    private BooleanProperty isFormCorrect = new SimpleBooleanProperty(true);

    public MeatProduct getIngredient() {
        return this.currentMeat;
    }

    public void setIngredient(MeatProduct newMeat) {
        this.currentMeat = newMeat;
        nameField.setText(currentMeat.getName());
        weighField.setText(currentMeat.getWeight() + "");
        caloriesField.setText(currentMeat.getCalories() + "");
        processBox.getSelectionModel().select(currentMeat.getProcessType());
        timeField.setText(currentMeat.getTime() + "");
        proteinField.setText(currentMeat.getProtein() + "");
        typeBox.getSelectionModel().select(currentMeat.getMeatType());
    }

    private void highlightError(TextField textField) {
        textField.setStyle("-fx-background-color: #FFCCCC;");
    }

   /* private boolean isFormCorrect() {
        if (nameField.getText().isEmpty()){
            highlightError(nameField);
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Внимание");
            alert.setHeaderText("Проверьте заполнение всех полей");
            alert.showAndWait();
            return false;
        }
        if (!weighField.getText().matches("[0-9]*")){
            highlightError(weighField);
            return false;
        }
        return true;
    }*/

    @FXML
    private void addClickButton() {
        //if (isFormCorrect()) {
        if (currentMeat != null) {
            this.currentMeat.setName(nameField.getText());
            this.currentMeat.setWeight(Integer.parseInt(weighField.getText()));
            this.currentMeat.setCalories(Integer.parseInt(caloriesField.getText()));
            this.currentMeat.setProcessType(processBox.getSelectionModel().getSelectedItem());
            this.currentMeat.setTime(Integer.parseInt(timeField.getText()));
            this.currentMeat.setProtein(Integer.parseInt(proteinField.getText()));
            this.currentMeat.setMeatType(typeBox.getSelectionModel().getSelectedItem());
        } else {
            this.currentMeat = new MeatProduct(nameField.getText(), Integer.parseInt(weighField.getText()), Integer.parseInt(caloriesField.getText()), processBox.getSelectionModel().getSelectedItem(), Integer.parseInt(timeField.getText()), Integer.parseInt(proteinField.getText()), typeBox.getSelectionModel().getSelectedItem());
        }
        Stage stage = (Stage) addButton.getScene().getWindow();
        stage.close();
        //}
    }

    public void validateComboBox(ComboBox<String> comBox) {
        comBox.valueProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == null) {
                comBox.setStyle("-fx-background-color: #FFCCCC;");
                this.isFormCorrect.set(true);
            } else {
                comBox.setStyle("-fx-background-color: white;");
                this.isFormCorrect.set(false);
            }
        });
    }

    public void validateName(TextField txtField) {
        txtField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()) {
                txtField.setStyle("-fx-background-color: #FFCCCC;");
                this.isFormCorrect.set(true);
            } else {
                txtField.setStyle("-fx-background-color: white;");
                this.isFormCorrect.set(false);
            }
        });

    }

    public void validateInt(TextField txtField) {
        txtField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*") || newValue.isEmpty()) {
                txtField.setStyle("-fx-background-color: #FFCCCC;");
                this.isFormCorrect.set(true);
            } else {
                txtField.setStyle("-fx-background-color: white;");
                this.isFormCorrect.set(false);
            }
        });

    }

    @FXML
    void initialize() {
        processBox.getItems().addAll("Варить", "Жарить", "Запекать", "Измельчить", "Мешать", "Резать", "Чистить");
        typeBox.getItems().addAll("Курица", "Свинина", "Говядина", "Баранина", "Крольчатина", "Утка");
        addButton.disableProperty().bind(isFormCorrect);
        validateName(nameField);
        validateInt(weighField);
        validateInt(caloriesField);
        validateInt(timeField);
        validateInt(proteinField);
        validateComboBox(processBox);
        validateComboBox(typeBox);
    }

}


