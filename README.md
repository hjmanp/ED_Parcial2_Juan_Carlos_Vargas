%md
# Examen Parcial Estructuras de Datos

## Información del Estudiante
**Nombre:** Juan Carlos Vargas Hernández 
**Carné:** 202104264 
**Curso:** Estructuras de Datos 
**Catedrático:** Ing. Brandon Chitay 

## Descripción del Proyecto
Este proyecto consiste en la implementación de una **Lista Doblemente Enlazada Circular** en el lenguaje Java. 

Una lista doblemente enlazada circular es una estructura de datos en la que cada nodo contiene un dato, una referencia al nodo siguiente y una referencia al nodo anterior.A diferencia de una lista doblemente enlazada convencional, en la versión circular el último nodo apunta de regreso al primer nodo y el primer nodo apunta al último, formando un ciclo cerrado.

## Video Explicativo
(https://drive.google.com/file/d/1Jk5emACVrPycqNjxoQx-F5Xldg5XaXaJ/view?usp=sharing) 

## Instrucciones de Compilación y Ejecución
Para compilar y ejecutar este proyecto desde la terminal, asegúrese de estar en la carpeta raíz del proyecto y utilice los siguientes comandos

**Compilación:**

javac Nodo.java ListaDobleCircular.java Main.java 

**Resultados**

--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir

Seleccione una opción: 1
Ingrese el número a insertar al inicio: 7
Lista: 7 <-> (circular -> 7)

Seleccione una opción: 2
Ingrese el número a insertar al final: 9
Lista: 7 <-> 9 <-> (circular -> 7)

Seleccione una opción: 1
Ingrese el número a insertar al inicio: 2
Lista: 2 <-> 7 <-> 9 <-> (circular -> 2)

Seleccione una opción: 2
Ingrese el número a insertar al final: 4
Lista: 2 <-> 7 <-> 9 <-> 4 <-> (circular -> 2)

Seleccione una opción: 6
Lista: 2 <-> 7 <-> 9 <-> 4 <-> (circular -> 2)

Seleccione una opción: 3
Lista: 7 <-> 9 <-> 4 <-> (circular -> 7)

Seleccione una opción: 4
Lista: 7 <-> 9 <-> (circular -> 7)

Seleccione una opción: 5
Ingrese el número a buscar: 1
No encontrado

Seleccione una opción: 5
Ingrese el número a buscar: 7
Encontrado

Seleccione una opción: 7
Saliendo del programa...
