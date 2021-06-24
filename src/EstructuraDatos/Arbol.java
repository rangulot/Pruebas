package EstructuraDatos;

public class Arbol {
    private Nodo raiz;

    public Arbol(){
        raiz = null;
    }

    public void insertar(Nodo nodo){
        if(raiz == null){
            nodo.setPadre(null);
            nodo.setNivel(0);
            nodo.setHijo(null);
            raiz = nodo;
        }else{
            Nodo temp = raiz;
            while(temp != null){
                System.out.println("ENTRO");
                temp = temp.getHijo();
            }

        }
    }
}
