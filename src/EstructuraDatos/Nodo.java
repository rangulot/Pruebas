package EstructuraDatos;

public class Nodo {
    private Object dato;
    private Nodo padre;
    private Nodo izquierdo;
    private Nodo derecho;
    private int nivel;

    public Nodo(Object dato){
        this.dato = dato;
        padre = null;
    }

    public Object getDato(){
        return this.dato;
    }

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Nodo getPadre(){
        return this.padre;
    }

    public void setPadre(Nodo nodo){
        this.padre = nodo;
    }

    public Nodo getIzquierdo(){
        return this.izquierdo;
    }

    public void setIzquierdo(Nodo nodo){
        this.izquierdo = nodo;
    }

    public Nodo getDerecho(){
        return this.derecho;
    }

    public void setDerecho(Nodo nodo){
        this.derecho = nodo;
    }

    public int getNivel(){
        return this.nivel;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }
}
