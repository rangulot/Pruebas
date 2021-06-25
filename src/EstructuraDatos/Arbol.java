package EstructuraDatos;

public class Arbol {
    private Nodo raiz;
    private int niveles;
    private int cantidadVertices;

    public Arbol(){
        raiz = null;
    }

    public void insertar(int nivel, Nodo nodo){
        if(cantidadVertices == 0){
            raiz = nodo;
            raiz.setNivel(0);
            raiz.setPadre(null);
            cantidadVertices++;
            niveles++;
        }else if(raiz.getIzquierdo() == null){
            nodo.setPadre(raiz);
            raiz.setIzquierdo(nodo);
        }else{
            nodo.setPadre(raiz);
            raiz.setDerecho(nodo);
        }
    }

    public Nodo getRaiz(){
        return raiz;
    }

    public void setRaiz(Nodo nodo){
        this.raiz = nodo;
    }

    

    public int cuentaHijos(Nodo nodo){
        return 0;
    }
}
