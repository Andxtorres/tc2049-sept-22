public class RoundedShapeFactory implements AbstractShapeFactory{
    public Shape createShape(String tipo) throws Exception{
        if(tipo==null){
            return null;
        }
        if(tipo.equalsIgnoreCase("circulo-azul")){
            return new RoudedCircle("azul");
        }
        if(tipo.equalsIgnoreCase("circulo-verde")){
            return new RoudedCircle("verde");
        }
        if(tipo.equalsIgnoreCase("circulo-rojo")){
            return new RoudedCircle("rojo");
        }
        if(tipo.equalsIgnoreCase("cuadrado-azul")){
            return new RoundedSquare("azul");
        }
        if(tipo.equalsIgnoreCase("cuadrado-verde")){
            return new RoundedSquare("verde");
        }
        if(tipo.equalsIgnoreCase("cuadrado-rojo")){
            return new RoundedSquare("rojo");
        }
        if(tipo.equalsIgnoreCase("rectangulo-azul")){
            return new RoundedRectangle("azul");
        }
        if(tipo.equalsIgnoreCase("rectangulo-verde")){
            return new RoundedRectangle("verde");
        }
        if(tipo.equalsIgnoreCase("rectangulo-rojo")){
            return new RoundedRectangle("rojo");
        }

        throw new Exception();

    }
}
