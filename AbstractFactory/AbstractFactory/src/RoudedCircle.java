public class RoudedCircle extends Shape{

    public RoudedCircle(String color){
        this.nombre="cículo redondeado";
        this.color=color;
    }
    @Override
    public void draw() {
        System.out.println("Estoy dibujando un círculo redondeado");
    }
}
