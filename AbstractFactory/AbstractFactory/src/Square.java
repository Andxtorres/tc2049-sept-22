public class Square extends Shape{

    public Square(String color) {
        this.nombre="cuadrado";
        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println("Estoy dibujando un cuadrado");
    }
}
