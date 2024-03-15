package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {
        Lista lista = new Lista();

        // Inserta varios valores al principio de la lista
        for (int i = 1; i <= 6; i++) {
            lista.insertarCabezaLista(i);
        }

        System.out.println("Lista original:");
        lista.visualizar();
        System.out.println();

        // Elimina valores duplicados
        System.out.println("Eliminación de valores duplicados:");
        lista.eliminarDuplicados();
        lista.visualizar();
        System.out.println();

        // Muestra la lista en orden inverso
        System.out.println("Lista invertida:");
        lista.mostrarEnOrdenInverso();
        System.out.println();

        // Obtiene el tamaño de la lista
        System.out.println("Tamaño de la lista: " + lista.obtenerTamaño());

        // Obtiene el elemento en la posición n desde el final de la lista
        int n = 2;
        System.out.println("Elemento en la posición " + n + " desde el final: " + lista.obtenerNdesdeFinal(n));

        // Imprime la lista completa
        System.out.println("Lista final: " + lista);
    }


}
