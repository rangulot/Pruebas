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
        }else{
            Nodo temp = raiz;
            while(temp != null){
                if(temp.getIzquierdo() == null){
                    nodo.setPadre(raiz);
                    raiz.setIzquierdo(nodo);
                }else{
                    nodo.setPadre(raiz);
                    raiz.setDerecho(nodo);
                }
                temp = temp.getIzquierdo();
            }
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
