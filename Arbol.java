public class Arbol {
    public Nodo root;
    int altura;

    public Arbol() {
        this.root = null;
    }

    public Arbol(int object) {
        this.root = new Nodo(object);
    }

    public void preOrder(Nodo node) {
        System.out.print(node.object);
        if (node.left != null) preOrder(node.left);
        if (node.right != null) preOrder(node.right);
    }

    public void inOrder(Nodo node) {
        if (node.left != null) preOrder(node.left);
        System.out.print(node.object);
        if (node.right != null) preOrder(node.right);
    }

    public void posOrder(Nodo node) {
        if (node.left != null) preOrder(node.left);
        if (node.right != null) preOrder(node.right);
        System.out.print(node.object);
    }

    //Tomado de: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=127&punto=&inicio=
    private void returnAltura(Nodo root, int nivel) {
        if (root != null) {
            returnAltura(root.left, nivel + 1);
            if (nivel > altura)
                altura = nivel;
            returnAltura(root.right, nivel + 1);
        }
    }

    public int getAltura() {
        altura = 0;
        returnAltura(root, 1);
        return altura;
    }

    //Usando preOrder
    private Nodo search(Nodo root, Object object) {
        Nodo node = null;
        if (object != null) {
            if (root != null) {
                if (root.object.toString().equals(object.toString())) {
                    node = root;
                } else {
                    node = search(root.left, object);
                    if (node == null) {
                        node = search(root.right, object);
                    }
                }
            } else {
                return null;
            }

        }
        return node;
    }

    public Nodo search(Object object) {
        return search(root, object);
    }

    public void add(int i, Object data) {
        Nodo nuevo = new Nodo(data, i);

        if (root == null) {
            root = nuevo;
        } else {
            Nodo aux = root;
            while (aux != null) {
                nuevo.padre = aux;
                if (nuevo.index >= aux.index) {
                    aux = aux.right;
                } else {
                    aux = aux.left;
                }
            }
            if (nuevo.index < nuevo.padre.index) {
                nuevo.padre.left = nuevo;
            } else {
                nuevo.padre.right = nuevo;
            }
        }
    }


}
