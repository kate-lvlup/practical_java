package jom.com.softserve.s1.task6;

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

    public static Plant tryCreatePlant(String type, String color, String name) {
        try {
            return new Plant(type, color, name);
        } catch (TypeException e) {
            try {
                return new Plant(Type.ORDINARY.toString(), color, name);
            } catch (ColorException | TypeException e1) {
                try {
                    return new Plant(Type.ORDINARY.toString(), Color.RED.toString(), name);
                } catch (ColorException ex) {
                    throw new RuntimeException(ex);
                } catch (TypeException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } catch (ColorException e) {
            try {
                return new Plant(type, Color.RED.toString(), name);
            } catch (TypeException | ColorException e1) {
                try {
                    return new Plant(Type.ORDINARY.toString(), Color.RED.toString(), name);
                } catch (ColorException ex) {
                    throw new RuntimeException(ex);
                } catch (TypeException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
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
