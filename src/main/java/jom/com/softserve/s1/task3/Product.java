package jom.com.softserve.s1.task3;

public class Product {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("Laptop", 100.00);
        Product product3 = new Product("Phone", 200.00);
        System.out.println("Was created " + Product.count() + " new products!");
    }

    private String name;
    private double price;
    private static int countOfProduct = 0;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        countOfProduct++;
    }

    public Product(String name) {
        this.name = name;
        countOfProduct++;
    }

    public Product() {
        countOfProduct++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int count() {
        return countOfProduct;
    }

}