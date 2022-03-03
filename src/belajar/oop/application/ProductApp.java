package belajar.oop.application;

import belajar.oop.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product pd = new Product("Mac Book Pro", 30000000);
        System.out.println(pd.name);
        System.out.println(pd.price);
        System.out.println(pd);

        Product pd2 = new Product("Mac Book Pro", 30000000);

        System.out.println(pd.equals(pd2));

    }
}
