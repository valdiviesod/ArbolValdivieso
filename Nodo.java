public class Nodo {
    public Object object;
    public Nodo left;
    public Nodo right;
    public Nodo padre;
    public int index;

    public Nodo(Object object) {
        this.object = object;
        this.left = null;
        this.right = null;
        this.padre = null;
    }


    public Nodo(Object object, int i) {
        this.object = object;
        this.left = null;
        this.right = null;
        this.padre = null;
        this.index = i;
    }

    public Nodo(Object object, Nodo left, Nodo right, Nodo p, int i) {
        this.object = object;
        this.left = left;
        this.right = right;
        this.index = i;
        this.padre = p;
    }

}
