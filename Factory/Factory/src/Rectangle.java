public class Rectangle extends Shape{

    public Rectangle(String color) {
        this.nombre="rectángulo";
        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println("Estoy dibujando un rectángulo");
    }
}
