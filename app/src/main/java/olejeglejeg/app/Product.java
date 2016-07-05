package olejeglejeg.app;

import java.util.Random;

public class Product {
    private String name;
    private int price;
    private int id;

    public Product(String name) {
        this.name = name;
        Random random = new Random();
        price = random.nextInt(200);
        id = random.nextInt(10000);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
