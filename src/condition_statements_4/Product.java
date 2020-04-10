package condition_statements_4;

import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private double price;
    private int quantity;

    public void setName(String Name) {
        this.name = Name;
    }

    public void setPrice(double Price) {
        this.price = Price;
    }

    public void setQuantity(int Quantity) {
        this.quantity = Quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    Product() {
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void print() {
        System.out.println("Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Product other = (Product) obj;
        if (price != other.price) return false;
        if (quantity != other.quantity) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        return true;
    }


}
