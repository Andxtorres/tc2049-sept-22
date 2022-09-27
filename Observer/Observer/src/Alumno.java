import java.util.ArrayList;
import java.util.List;

public class Alumno implements Suscriptor<Materia>{

    private String nombre;
    List<Materia> materias;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materias= new ArrayList<>();
    }

    public void agregarMateria(Materia materia){
        materias.add(materia);
        materia.agregarSuscriptor(this);
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void quitarMateria(Materia materia){
        materias.remove(materia);
    }

    @Override
    public void handle(Materia m) {
        System.out.println("Ocurrio un cambio con la materia: "+m.getNombre());
        materias.remove(m);
        System.out.println("Aqui ocurrio algo "+nombre);
    }
}
