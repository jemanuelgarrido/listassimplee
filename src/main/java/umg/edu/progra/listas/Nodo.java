package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Nodo {

    int dato; // Almacena el dato que el nodo contiene
    Nodo enlace; // Referencia al siguiente nodo en la lista
    // Constructor para crear un nodo con un dato dado y un enlace dado
    public Nodo(int x, Nodo n) {
        dato = x; // Asigna el valor dado al dato del nodo
        enlace = n; // Asigna el enlace dado al enlace del nodo
    }


    // Constructor para crear un nodo con un dato dado y sin enlace
    public Nodo(int x) {
        dato = x; // Asigna el valor dado al dato del nodo
        enlace = null; // Inicializa el enlace como nulo (no apunta a ningún nodo)
    }



    // Método para leer el dato almacenado en el nodo
    public int leerDato() {
        return dato; // Retorna el dato almacenado en el nodo
    }

    // Sobrescribe el método toString para representar el nodo como una cadena de texto
    @Override
    public String toString() {
        return dato + "=>" + enlace; // Retorna el dato del nodo seguido de la referencia al siguiente nodo
    }
}

//

