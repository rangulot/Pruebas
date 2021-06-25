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
            System.out.println("ENTRO RAIZ");
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
                System.out.println("NODO DATO = "+temp.getDato());
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
            if(temp.getIzquierdo() != null){
                temp = temp.getIzquierdo();
                System.out.println("IZQ");
            }else if(temp.getDerecho() != null) {
                temp = temp.getDerecho();
                System.out.println("DER");
            }else{
                temp = raiz;
            }
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
