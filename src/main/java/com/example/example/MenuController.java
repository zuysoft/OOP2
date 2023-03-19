package com.example.example;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Observable;
import java.util.ResourceBundle;

import com.example.example.products.BaseProduct;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private Button addDishes;

    @FXML
    private Button deleteDishes;

    @FXML
    private Button editDishes;

    @FXML
    private TableColumn<Dish, String> ingredColumn;

    @FXML
    private TableView<Dish> menuTable;

    @FXML
    private TableColumn<Dish, String> nameColumn;

    @FXML
    private TableColumn<Dish, String> timeColumn;

    private DishDataModel dishData;

    public void setDishData(DishDataModel curDishData) {
        this.dishData = curDishData;
        menuTable.setItems(dishData.getDishesList());
    }

    @FXML
    private void deleteClickButton() {
        if (menuTable.getSelectionModel().getSelectedItem() != null) {
            dishData.getDishesList().remove(menuTable.getSelectionModel().getSelectedItem());
        }
    }

    @FXML
    private void editClickButton() {
        if (menuTable.getSelectionModel().getSelectedItem() != null) {
            //editDishes.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("changeDish.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            ChangeDishController controller = loader.getController();
            controller.setCurrentDish(menuTable.getSelectionModel().getSelectedItem());
            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent windowEvent) {
                    menuTable.refresh();
                }
            });
            stage.showAndWait();
            menuTable.getSelectionModel().clearSelection();
        } else {
            dishData.getDishesList().add(new Dish(""));
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("changeDish.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            ChangeDishController controller = loader.getController();
            controller.setCurrentDish(dishData.getDishesList().get(dishData.getDishesList().size() - 1));
            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent windowEvent) {
                    menuTable.refresh();
                }
            });
            stage.showAndWait();
        }
    }

    @FXML
    void initialize(MouseEvent event) {
    }

    @FXML
    void initialize() {


        nameColumn.setCellValueFactory(
                new PropertyValueFactory("name")
        );

        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        timeColumn.setCellValueFactory(data -> data.getValue().getCookingTime());
        ingredColumn.setCellValueFactory(data -> data.getValue().getIngredientsToString());
        ingredColumn.setCellFactory(tc -> {
            TableCell<Dish, String> cell = new TableCell<>();
            Text text = new Text();
            text.wrappingWidthProperty().bind(ingredColumn.widthProperty());
            text.textProperty().bind(cell.itemProperty());
            cell.setGraphic(new ScrollPane(text));
            cell.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            return cell;
        });
        ingredColumn.setPrefWidth(519);

    }


}