public class ShapeFactory implements AbstractShapeFactory{

    public Shape createShape(String tipo) throws Exception{
        if(tipo==null){
            return null;
        }
        if(tipo.equalsIgnoreCase("circulo-azul")){
            return new Circle("azul");
        }
        if(tipo.equalsIgnoreCase("circulo-verde")){
            return new Circle("verde");
        }
        if(tipo.equalsIgnoreCase("circulo-rojo")){
            return new Circle("rojo");
        }
        if(tipo.equalsIgnoreCase("cuadrado-azul")){
            return new Square("azul");
        }
        if(tipo.equalsIgnoreCase("cuadrado-verde")){
            return new Square("verde");
        }
        if(tipo.equalsIgnoreCase("cuadrado-rojo")){
            return new Square("rojo");
        }
        if(tipo.equalsIgnoreCase("rectangulo-azul")){
            return new Rectangle("azul");
        }
        if(tipo.equalsIgnoreCase("rectangulo-verde")){
            return new Rectangle("verde");
        }
        if(tipo.equalsIgnoreCase("rectangulo-rojo")){
            return new Rectangle("rojo");
        }

        throw new Exception();

    }
}
