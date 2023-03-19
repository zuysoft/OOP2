package com.example.example;

import com.example.example.products.BaseProduct;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MinceProductFactory implements ProductInterface{
    @Override
    public BaseProduct add() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("minceAdd.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        MinceAddController controller = loader.getController();

       ////
        //stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
        // @Override
        // public void handle(WindowEvent windowEvent) {
        //     menuTable.refresh();
        //  }
        //});
        stage.showAndWait();
        return controller.getIngredient();
    }

    @Override
    public  void change(BaseProduct baseProduct) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("minceAdd.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        MinceAddController controller = loader.getController();

        ////
        //stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
        // @Override
        // public void handle(WindowEvent windowEvent) {
        //     menuTable.refresh();
        //  }
        //});
        stage.showAndWait();
       // return controller.getIngredient();

    }
}
