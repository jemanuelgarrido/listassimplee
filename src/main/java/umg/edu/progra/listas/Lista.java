package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Lista {

    private Nodo primero; // Nodo que apunta al primer elemento de la lista

    @Override
    public String toString() {
        return "=>" + primero; // Método para imprimir la lista como una cadena de texto
    }

    /**
     * Constructor para inicializar una lista
     */
    public Lista() {
        primero = null; // Inicializa la lista como vacía
    }

    /**
     * Devuelve el nodo inicial
     *
     * @return
     */
    public Nodo leerPrimero() {
        return primero; // Retorna el primer nodo de la lista
    }

    /**
     * Inserta valores a la lista al principio
     *
     * @param entrada
     */
    public void insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada); // Crea un nuevo nodo con el valor de entrada
        nuevo.enlace = primero; // El nuevo nodo apunta al antiguo primero
        primero = nuevo; // El nuevo nodo se convierte en el primero de la lista
    }

    // Método para mostrar los elementos de la lista en orden inverso
    public void mostrarEnOrdenInverso() {
        mostrarEnOrdenInverso(primero);
    }

    // Método recursivo para mostrar los elementos en orden inverso
    private void mostrarEnOrdenInverso(Nodo nodo) {
        if (nodo == null) {
            return; // Si el nodo es nulo, termina la recursión
        }
        mostrarEnOrdenInverso(nodo.enlace); // Llama recursivamente con el siguiente nodo
        System.out.print(nodo.dato + " "); // Imprime el dato del nodo actual
    }

    // Método para eliminar duplicados en la lista
    public void eliminarDuplicados() {
        Nodo actual = primero;
        while (actual != null && actual.enlace != null) {
            Nodo buscador = actual;
            while (buscador.enlace != null) {
                if (actual.dato == buscador.enlace.dato) {
                    buscador.enlace = buscador.enlace.enlace;
                } else {
                    buscador = buscador.enlace;
                }
            }
            actual = actual.enlace;
        }
    }

    // Método para obtener el tamaño de la lista
    public int obtenerTamaño() {
        int contador = 0; // Inicializa un contador a 0
        Nodo actual = primero; // Comienza con el primer nodo de la lista
        while (actual != null) { // Mientras no llegue al final de la lista
            contador++; // Incrementa el contador
            actual = actual.enlace; // Mueve al siguiente nodo
        }
        return contador; // Retorna el tamaño de la lista
    }

    /**
     * Inserta un elemento después de un nodo dado
     *
     * @param anterior
     * @param entrada
     */
    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada); // Crea un nuevo nodo con el valor de entrada
        nuevo.enlace = anterior.enlace; // El nuevo nodo apunta al siguiente del anterior
        anterior.enlace = nuevo; // El anterior ahora apunta al nuevo nodo
    }

    // Método para obtener el N-ésimo elemento desde el final de la lista
    public int obtenerNdesdeFinal(int n) {
        Nodo puntero1 = primero;
        Nodo puntero2 = primero;
        int contador = 0;

        // Avanzar puntero1 n posiciones adelante
        for (int i = 0; i < n; i++) {
            if (puntero1 == null) {
                return -1; // Si se sale de la lista, retorna -1
            }
            puntero1 = puntero1.enlace; // Avanza puntero1
        }

        // Avanzar ambos punteros hasta que puntero1 llegue al final
        while (puntero1 != null) {
            puntero1 = puntero1.enlace;
            puntero2 = puntero2.enlace;
        }

        return puntero2.dato; // Retorna el dato del puntero2
    }

    /**
     * Elimina el nodo con el elemento dado
     *
     * @param entrada
     */
    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        // Bucle de búsqueda
        while ((actual != null) && !(actual.dato == entrada)) {
            if (!(actual.dato == entrada)) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            // Se distingue entre que el nodo sea el cabecera
            // o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace; // Si es el primero, el siguiente se convierte en primero
            } else {
                anterior.enlace = actual.enlace; // Si no, se salta el nodo actual
            }
            actual = null; // Elimina el nodo actual
        }
    }

    /**
     * Busca un elemento en la lista
     *
     * @param destino
     * @return
     */
    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (indice.dato == destino) {
                return indice; // Retorna el nodo si encuentra el destino
            }
        }
        return null; // Retorna null si no encuentra el destino
    }

    /**
     * Recorre la lista y muestra cada dato
     */
    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " "); // Imprime el dato del nodo actual
            n = n.enlace; // Mueve al siguiente nodo
        }
    }
}

    
    /**
     * Tarea:
     * 1 - crear metodo para invertir lista enlazada 
     * 2 - crear metodo para obtener elemento de la posicion n desde el final de la lista
     * 3 - crear metodo para eliminar duplicados en una lista enlazada
     * 4 - crear metodo para obtener tamaño de lista enlazada
     */
    

