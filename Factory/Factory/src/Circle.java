public class Circle extends Shape{

    public Circle(String color){
        this.nombre="cículo";
        this.color=color;
    }
    @Override
    public void draw() {
        System.out.println("Estoy dibujando un círculo");
    }
}
