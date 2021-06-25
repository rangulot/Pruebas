import EstructuraDatos.Arbol;
import EstructuraDatos.Nodo;

public class Prueba {

    public static void main(String[] args){
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(3);
        Nodo nodo3 = new Nodo("X");
        Arbol arbol = new Arbol();

        arbol.insertar(0, nodo1);
        arbol.insertar(1, nodo2);
        arbol.insertar(1, nodo3);

        System.out.println(arbol.getRaiz().getDerecho().getDato());
    }
}