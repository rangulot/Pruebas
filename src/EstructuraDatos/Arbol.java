package EstructuraDatos;

public class Arbol {
    private Nodo raiz;
    private int cantidadVertices;

    public Arbol(){
        raiz = null;
    }

    public void insertar(Nodo nodo){
        if(nodo.getNivel() == 0){
            raiz = nodo;
            cantidadVertices++;
        }else{
            Nodo temp = raiz;

        }
    }
}
