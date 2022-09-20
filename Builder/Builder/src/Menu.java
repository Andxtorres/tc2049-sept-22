import java.util.ArrayList;
import java.util.List;

public class Menu {

    public List<Item> items= new ArrayList<>();

    public void imprimeMenu(){
        for (Item i:
             items) {
            System.out.println(i.getName()+" "+i.getPrice());
        }
    }

}
