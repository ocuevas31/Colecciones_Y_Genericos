import java.util.ArrayList;
import java.util.Collection;
 
public class Colecciones {
    public static void main(String arg[]) {
        Collection listaMarcasCoches = new ArrayList(); 
        
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");
        
        System.out.println("Número de elementos antes de eliminar del multiverso: " + listaMarcasCoches.size() ) ;
        
        System.out.println (listaMarcasCoches.toString() ) ;
        
        listaMarcasCoches.remove ("Seat");
        listaMarcasCoches.remove ("Mercedes");
        
        System.out.println("Número elementos después de eliminar Seat y Mercedes:" + listaMarcasCoches.size() ) ;
        System.out.println(listaMarcasCoches.toString () );
        }
}
