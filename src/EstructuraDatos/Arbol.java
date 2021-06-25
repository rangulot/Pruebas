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
            raiz.setNivel(nivel);
            raiz.setPadre(null);
            cantidadVertices++;
            niveles++;
        }else{
            Nodo temp = raiz;
            while(temp != null){
                if(temp.getIzquierdo() == null){
                    nodo.setPadre(raiz);
                    nodo.setNivel(nivel);
                    raiz.setIzquierdo(nodo);
                    niveles++;
                }else{
                    nodo.setPadre(raiz);
                    nodo.setNivel(nivel);
                    raiz.setDerecho(nodo);
                    niveles++;
                }
                temp = temp.getIzquierdo();
            }
        }
    }

    public void imprimir(){
        Nodo temp = raiz;
        while(temp != null){
            System.out.println("Nivel"
                                +"\n"+temp.getNivel());
            temp = temp.getIzquierdo();
        }
    }

    public Nodo getRaiz(){
        return raiz;
    }

    public void setRaiz(Nodo nodo){
        this.raiz = nodo;
    }

}
