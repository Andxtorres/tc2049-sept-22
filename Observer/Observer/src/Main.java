import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Materia matematicas= new Materia("Matemáticas");
        Materia espaniol= new Materia("Espaniol");
        Materia ciencias= new Materia("Ciencias");
        Materia geografia= new Materia("Geografia");
        Materia historia= new Materia("Historia");


        Alumno a1= new Alumno("Juan");
        Alumno a2= new Alumno("Pedro");
        Alumno a3= new Alumno("Luis");

        a1.agregarMateria(matematicas);
        a1.agregarMateria(espaniol);

        a2.agregarMateria(ciencias);
        a2.agregarMateria(geografia);


        a3.agregarMateria(matematicas);
        a3.agregarMateria(historia);

        System.out.println("La materia "+matematicas.getNombre()+" "+matematicas.isActiva());
        System.out.println("---------");
        matematicas.setActiva(false);
        historia.setActiva(false);
        System.out.println("---------");




    }
}
