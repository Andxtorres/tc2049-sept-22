public class Main {

    public static void main(String[] args) {
        Singleton s= Singleton.getInstance();
        s.sayHello("Andres");
        System.out.println(s);
        Singleton s1= Singleton.getInstance();
        s1.sayHello("Diana");
        System.out.println(s1);
        Singleton s2= Singleton.getInstance();
        s2.sayHello("Belmont");
        System.out.println(s2);
        Singleton s3= Singleton.getInstance();
        s3.sayHello("Javier");
        System.out.println(s3);
        Singleton s4= Singleton.getInstance();
        s4.sayHello("Nadie");
        System.out.println(s4);
    }

}
