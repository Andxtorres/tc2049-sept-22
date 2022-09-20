import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractShapeFactory shapeFactory= ShapeFactoryProducer.getFactory(true);
        Shape c= shapeFactory.createShape("circulo-azul");
        Shape s= shapeFactory.createShape("cuadrado-azul");
        Shape r= shapeFactory.createShape("rectangulo-azul");
        List<Shape> shapeList= new ArrayList<>();
        shapeList.add(c);
        shapeList.add(s);
        shapeList.add(r);
        for (Shape shape:
             shapeList) {
            shape.draw();
        }
    }
}
