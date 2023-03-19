package com.example.example;

import com.example.example.products.BaseProduct;

public class ProductFactory {
    public ProductInterface getProduct(ProductTypes types){
        ProductInterface tmpProduct = null;
        switch (types){
            case MILK : return tmpProduct = new MilkProductFactory();
            case MEAT : return tmpProduct = new MeatProductFactory();
            case MINCE : return tmpProduct = new MinceProductFactory();
            case PART : return tmpProduct = new MeatPartFactory();
            case BY : return tmpProduct = new ByFactory();
            case FISH: return tmpProduct = new FishProductFactory();
            case SFINISHED: return tmpProduct = new SFinishedFactory();
            case MILKPRODUCTS: return tmpProduct = new MilkPProductFactory();
            case CEREALS: return tmpProduct = new CerealsProductFactory();
            case PASTA: return tmpProduct = new PastaProductFactory();
            case VEGFRUITS: return tmpProduct = new VegProductFactory();
            case SPICES: return tmpProduct = new SpicesFactory();
            case SIMPLE: return tmpProduct = new SimpleProductFactory();
        }
       return tmpProduct;

    }
    public  ProductInterface getProductEdit (String className){
        ProductInterface tmpProduct = null;
        switch (className){
            case "com.example.example.products.MeatProduct" : return tmpProduct = new MeatProductFactory();

        }

        return tmpProduct;
    }
}

