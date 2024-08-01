package jom.com.softserve.s1.task5;

public class Plant {
    private String name;
    private Color color;
    private Type type;
    public Plant(String type, String color, String name) throws ColorException, TypeException {
        this.name = name;
        this.color = parseColor(color);
        this.type = parseType(type);
    }
    public String getName() {
        return name;
    }
    public Color getColor() {
        return color;
    }
    public Type getType() {
        return type;
    }
    private Color parseColor(String color) throws ColorException {
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException(color);
        }
    }
    private Type parseType(String type) throws TypeException {
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException(type);
        }
    }
    @Override
    public String toString() {
        return String.format("{type: %s, color: %s, name: %s}",
                type.toString(),
                color.toString(),
                name);
    }
}
enum Color {
    WHITE, RED, BLUE
}
enum Type {
    RARE, ORDINARY
}
class ColorException extends Exception {
    public ColorException(String color) {
        super("Invalid value " + color + " for field color");
    }
}
class TypeException extends Exception {
    public TypeException(String type) {
        super("Invalid value " + type + " for field type");
    }
}