package EstructuraDatos;

public class Arbol {
    private Nodo raiz;
    private int niveles;
    private int cantidadVertices;

    public Arbol(){
        raiz = null;
    }

    /*public void insertar(int nivel, Nodo nodo){
        if(nivel == 0 && raiz == null){
            raiz = nodo;
        }else{
            Nodo temp = raiz;
            while(temp != null){
                if(temp.getIzquierdo() == null){
                    temp.setIzquierdo(nodo);
                }
                temp = temp.getIzquierdo();
            }
        }
        cantidadVertices++;
    }*/
    


    public void insertar(int nivel, Nodo nodo){
        Nodo temp = raiz;
        if(raiz == null){
            raiz = nodo;
            raiz.setNivel(nivel);
            raiz.setPadre(null);
        }else{
            while(temp != null){
                if(temp.getIzquierdo() == null){
                    nodo.setPadre(temp);
                    nodo.setNivel(nivel);
                    temp.setIzquierdo(nodo);
                    temp = temp.getIzquierdo();
                    System.out.println("Izquierdo, Dato = "+ temp.getDato());
                }else if(temp.getDerecho() == null){
                    nodo.setPadre(temp);
                    nodo.setNivel(nivel);
                    temp.setDerecho(nodo);
                    temp = temp.getDerecho();
                    System.out.println("Derecho, Dato = "+ temp.getDato());
                }
                temp = temp.getIzquierdo();
            }
        }
        cantidadVertices++;
    }

    public void imprimir(){
        

        Nodo temp = raiz;
        //RAMA IZQUIERDA
        System.out.println("RAMA IZQUIERDA");
        while(temp != null){
            System.out.println("Nivel = "+temp.getNivel());
            System.out.println("DATO = "+temp.getDato());
            temp = temp.getIzquierdo();
        }

        temp = raiz.getDerecho();
         //RAMA DERECHA
         System.out.println("RAMA DERECHA");
         while(temp != null){
            System.out.println("Nivel = "+temp.getNivel());
            System.out.println("DATO = "+temp.getDato());
            temp = temp.getDerecho();
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
