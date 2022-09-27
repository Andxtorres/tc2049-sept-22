import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String nombre;
    private boolean activa;

    List<Suscriptor> alumnos;



    public Materia(String nombre) {
        this.nombre = nombre;
        this.activa=true;
        this.alumnos= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
        if(activa==false){
            for (Suscriptor s:
                 alumnos) {
                s.handle(this);
            }
        }
    }

    public void agregarSuscriptor(Suscriptor s){
        alumnos.add(s);
    }
}

