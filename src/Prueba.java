import EstructuraDatos.Arbol;
import EstructuraDatos.Nodo;

public class Prueba {

    public static void main(String[] args){
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(3);
        Nodo nodo3 = new Nodo("X");
        Nodo nodo4 = new Nodo("Z");
        Nodo nodo5 = new Nodo("A");
        Nodo nodo6 = new Nodo("W");
        Arbol arbol = new Arbol();

        arbol.insertar(0, nodo1);
        arbol.insertar(1, nodo2);
        arbol.insertar(1, nodo3);
        arbol.insertar(2, nodo4);
        arbol.insertar(2, nodo5);
        arbol.insertar(3, nodo6);

        arbol.imprimir();
        //System.out.println("DATO = "+arbol.getRaiz().getIzquierdo().getIzquierdo().getDato());
        System.out.println("Cantidad de nodos "+arbol.getCantidadVertices());
    }
}