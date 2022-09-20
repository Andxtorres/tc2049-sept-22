public class Singleton {
    private static Singleton singleton;

    public static Singleton getInstance(){
        return singleton;
    }

    public static void sayHello(String name){
        System.out.println("Hello "+name);
    }
}
