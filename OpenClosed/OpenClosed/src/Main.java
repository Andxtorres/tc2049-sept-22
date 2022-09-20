public class Main {
    public static void main(String[] args) {
        AreaCaculator ac= new AreaCaculator();
        Circulo c= new Circulo(3);
        Cuadrado c1= new Cuadrado(4);
        Rectangulo r1= new Rectangulo(2,3);

        System.out.println("El área del cuadrado es: "+ac.calcularArea(c1));
        System.out.println("El área del rectángulo es: "+ac.calcularArea(r1));
        System.out.println("El área del circulo es: "+ac.calcularArea(c));
    }
}
