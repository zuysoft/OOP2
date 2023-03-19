package com.example.example.products;

import com.example.example.ProductInterface;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Milk extends MilkProduct {
    private String pasteurization;

    public String getPasteurization() {
        return pasteurization;
    }

    public void setPasteurization(String pasteurization) {
        this.pasteurization = pasteurization;
    }

    public Milk(String name, int weight, int calories, String processType, int time, int calcium, int fatContent, String pasteurization) {
        super(name, weight, calories, processType, time, calcium, fatContent);
        this.pasteurization = pasteurization;
    }
    @Override
    public StringProperty getMoreProductInfo() {
        return new SimpleStringProperty(super.getMoreProductInfo().getValue()+ ", пастеризация: " + this.pasteurization);
    }
}
