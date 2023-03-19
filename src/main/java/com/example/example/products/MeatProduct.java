package com.example.example.products;

import com.example.example.MeatAddController;
import com.example.example.products.BaseProduct;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.binding.Bindings;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;


public class MeatProduct extends BaseProduct  {
    private int protein;
    private String meatType;


    public int getProtein() {
        return protein;
    }
    public void setProtein(int protein) {
        this.protein = protein;
    }

    public String getMeatType() {
        return meatType;
    }
    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public MeatProduct(String name, int weight, int calories, String processType, int time, int protein, String meatType) {
        super(name, weight, calories, processType, time);
        this.protein = protein;
        this.meatType = meatType;
    }

    @Override
    public StringProperty getMoreProductInfo() {
         return new SimpleStringProperty(super.getMoreProductInfo().getValue()+ "Доп: " + this.getProtein()+ " г. белка, тип мяса: "+ this.getMeatType());
    }


}
