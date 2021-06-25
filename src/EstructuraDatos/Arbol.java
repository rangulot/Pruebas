package EstructuraDatos;

public class Arbol {
    private Nodo raiz;
    private int niveles;
    private int cantidadVertices;

    public Arbol(){
        raiz = null;
    }

    public void insertar(int nivel, Nodo nodo){
        if(raiz == null){
            raiz = nodo;
            raiz.setNivel(nivel);
            raiz.setPadre(null);
        }else{
            Nodo temp = raiz;
            while(temp != null){
                if(temp.getIzquierdo() == null){
                    nodo.setPadre(temp);
                    nodo.setNivel(nivel);
                    temp.setIzquierdo(nodo);
                    temp = temp.getIzquierdo();
                }else{
                    nodo.setPadre(temp);
                    nodo.setNivel(nivel);
                    temp.setDerecho(nodo);
                    temp = temp.getDerecho();
                }
                temp = temp.getIzquierdo();
            }
        }
        cantidadVertices++;
    }

    public void imprimir(){
        Nodo temp = raiz;

        //RAMA IZQUIERDA
        while(temp != null){
            System.out.println("Nivel = "+temp.getNivel());
            System.out.println("DATO = "+temp.getDato());
            temp = temp.getIzquierdo();
        }
    }

    public Nodo getRaiz(){
        return raiz;
    }

    public void setRaiz(Nodo nodo){
        this.raiz = nodo;
    }

    public int getCantidadVertices(){
        return cantidadVertices;        
    }
}
