import EstructuraDatos.Arbol;
import EstructuraDatos.Nodo;

public class Prueba {

    public static void main(String[] args){
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(3);
        Arbol arbol = new Arbol();

        arbol.insertar(0, nodo1);
        arbol.insertar(1, nodo2);
    }
}