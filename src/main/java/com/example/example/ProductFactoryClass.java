package com.example.example;

public class ProductFactoryClass {
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
}

