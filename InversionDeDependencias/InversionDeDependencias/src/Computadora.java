import java.util.ArrayList;
import java.util.List;

public class Computadora {
    List<Componente> componenteList;

    public Computadora(Procesador p,MemoriaRam m) {
        componenteList = new ArrayList<>();
        componenteList.add(p);
        componenteList.add(m);
    }
}
