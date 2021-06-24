package EstructuraDatos;

public class Nodo {
    private Object dato;
    private Nodo padre;
    private Nodo hijo;
    private Nodo izquierdo;
    private Nodo derecho;
    private int nivel;

    public Nodo(Object dato){
        this.dato = dato;
        padre = null;
        hijo = null;
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

    public Nodo getHijo(){
        return this.hijo;
    }

    public void setHijo(Nodo nodo){
        this.hijo = nodo;
    }

    public int getNivel(){
        return this.nivel;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }
}
