package jom.com.softserve.s1.task1;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Radius " + radius);
    }

    public void draw(String color) {
        System.out.println("Color " + color + " radius " + radius);
    }

    public void draw(float scale) {
        System.out.println("Scale " + scale + " radius " + radius * scale);
    }

    public void draw(String color, float scale) {
        System.out.println("Color " + color + " scale " + scale + " scaled radius " + radius * scale);
    }

}
