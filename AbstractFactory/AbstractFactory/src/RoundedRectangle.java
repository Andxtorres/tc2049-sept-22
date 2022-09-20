public class RoundedRectangle extends Shape{

    public RoundedRectangle(String color) {
        this.nombre="rectángulo redondeado";
        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println("Estoy dibujando un rectángulo redondeado");
    }
}
