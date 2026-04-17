public class ListaDobleCircular {
    Nodo head;

    public ListaDobleCircular() {
        this.head = null;
    }

    // 6.1 Insertar al Inicio
    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (head == null) {
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nuevoNodo;
            head = nuevoNodo;
        } else {
            Nodo ultimo = head.anterior;
            nuevoNodo.siguiente = head;
            nuevoNodo.anterior = ultimo;
            ultimo.siguiente = nuevoNodo;
            head.anterior = nuevoNodo;
            head = nuevoNodo; 
        }
    }

    // 6.2 Insertar al Final
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (head == null) {
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nuevoNodo;
            head = nuevoNodo;
        } else {
            Nodo ultimo = head.anterior;
            nuevoNodo.siguiente = head;
            nuevoNodo.anterior = ultimo;
            ultimo.siguiente = nuevoNodo;
            head.anterior = nuevoNodo;
        }
    }

    // 6.3 Eliminar al Inicio
    public void eliminarAlInicio() {
        if (head == null) {
            System.out.println("Error: Lista vacía");
            return;
        }
        if (head.siguiente == head) {
            head = null;
        } else {
            Nodo ultimo = head.anterior;
            head = head.siguiente;
            head.anterior = ultimo;
            ultimo.siguiente = head;
        }
    }

    // 6.4 Eliminar al Final
    public void eliminarAlFinal() {
        if (head == null) {
            System.out.println("Error: Lista vacía");
            return;
        }
        if (head.siguiente == head) {
            head = null;
        } else {
            Nodo ultimo = head.anterior;
            Nodo penultimo = ultimo.anterior;
            penultimo.siguiente = head;
            head.anterior = penultimo;
        }
    }

    // 6.5 Buscar un Elemento
    public void buscarElemento(int valorBuscado) {
        if (head == null) {
            System.out.println("No encontrado");
            return;
        }
        Nodo actual = head;
        do {
            if (actual.dato == valorBuscado) {
                System.out.println("Encontrado");
                return;
            }
            actual = actual.siguiente;
        } while (actual != head);
        
        System.out.println("No encontrado");
    }

    // 6.6 Recorrer e Imprimir la Lista (Código proporcionado en el examen)
    public void imprimir() {
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Nodo actual = head;
        System.out.print("Lista: ");
        do {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        } while (actual != head);
        System.out.println("(circular -> " + head.dato + ")");
    }
}