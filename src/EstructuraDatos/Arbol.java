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
                    nodo.setPadre(raiz);
                    nodo.setNivel(nivel);
                    raiz.setIzquierdo(nodo);
                    
                    System.out.println("ENTRO IZQ");
                }else{
                    nodo.setPadre(raiz);
                    nodo.setNivel(nivel);
                    raiz.setDerecho(nodo);
                    System.out.println("ENTRO DER");
                }
                temp = temp.getIzquierdo();
            }
        }
        cantidadVertices++;
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

    public int getCantidadVertices(){
        return cantidadVertices;        
    }
}
