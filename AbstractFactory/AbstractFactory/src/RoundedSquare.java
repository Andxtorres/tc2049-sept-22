public class RoundedSquare extends Shape{

    public RoundedSquare(String color) {
        this.nombre="cuadrado redondeado";
        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println("Estoy dibujando un cuadrado redondeado");
    }
}
