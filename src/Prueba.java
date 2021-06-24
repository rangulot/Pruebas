import EstructuraDatos.Arbol;
import EstructuraDatos.Nodo;

public class Prueba {

    public static void main(String[] args){
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        Arbol arbol = new Arbol();

        nodo1.setNivel(0);
        nodo2.setNivel(1);
        nodo3.setNivel(1);

        nodo1.setHijo(nodo2);
        nodo2.setPadre(nodo1);
        nodo3.setPadre(nodo1);

        arbol.insertar(nodo1);
        arbol.insertar(nodo2);
    }
}
