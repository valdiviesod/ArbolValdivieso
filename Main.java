public class Main {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        /*
        a.root = new Nodo(1);
        a.root.left = new Nodo(2);
        a.root.right = new Nodo(3);
        a.root.left.left = new Nodo(4);
        a.root.left.right = new Nodo(6);
        a.root.right.right = new Nodo(6);
        a.root.right.left = new Nodo(9);
        a.root.right.right.right = new Nodo(99);
        a.root.right.right.left = new Nodo(11);
         */
        a.add(0,"Hola");
        a.add(1,"Adios");
        a.add(2,"Chao");
        a.add(-1,"Ey");
        a.inOrder(a.root);
        System.out.println();
        System.out.println(a.getAltura());
        System.out.println(a.search(999));


    }
}
