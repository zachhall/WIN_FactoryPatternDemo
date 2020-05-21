public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equals("circle")) {
            return new Circle();
        } else if (shapeType.equals("rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}