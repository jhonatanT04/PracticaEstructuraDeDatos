# Universidad Politécnica Salesiana
ESTRUCTURA DE DATOS

- Árboles Binarios

- Diccionarios

### SISTEMA DE GESTIÓN DE CONTACTOS

El proyecto consiste en desarrollar un programa para gestionar una lista de contactos telefónicos utilizando un árbol binario de búsqueda. Cada contacto tiene un nombre, un número de teléfono, una colección de correos y un diccionario que almacena las redes sociales del contacto. El programa debe permitir agregar, buscar y eliminar contactos de la lista, así como también agregar correos y redes sociales a contactos existentes. Se implementará el patrón Modelo-Vista-Controlador (MVC) para mantener una estructura organizada y modular.

### Documentación de las Clases:

#### 1. Contacto:

- Atributos:

  - nombre (String): Representa el nombre del contacto.
  - telefono (String): Representa el número de teléfono del contacto.
  - correos (List<String>): Representa una lista de correos electrónicos asociados al contacto.
  - redesSociales (Map<String, String>): Representa un diccionario que almacena las redes sociales del contacto, donde la clave es el nombre de la red social y el valor es la URL del perfil.
- Métodos:

  - agregarCorreo(String correo): Permite agregar un correo electrónico a la lista de correos del contacto.
  - agregarRedSocial(String redSocial, String url): Permite agregar una red social al diccionario de redes sociales del contacto.
  - getNombre(): Devuelve el nombre del contacto.
  - toString(): Devuelve una representación en forma de cadena del contacto.
#### 2. Nodo:

- Atributos:
  - contacto (Contacto): Representa el objeto de tipo Contacto almacenado en el nodo.
  - izquierdo (Nodo): Referencia al nodo hijo izquierdo.
  - derecho (Nodo): Referencia al nodo hijo derecho.
#### 3. ArbolContactos:

- Atributos:

  - raiz (Nodo): Representa la raíz del árbol binario de búsqueda.
- Métodos:

  - agregarContacto(Contacto contacto): Permite agregar un nuevo contacto al árbol, insertándolo en su posición ordenada según el nombre.
  - buscarContacto(String nombre): Realiza una búsqueda de un contacto en el árbol según su nombre y devuelve el objeto Contacto correspondiente si se encuentra, o null si no se encuentra.
inorderTraversal(): Realiza un recorrido en orden del árbol y devuelve una lista con los contactos en orden alfabético según su nombre.
  - Otros métodos auxiliares para el funcionamiento del árbol binario de búsqueda, como inserción ordenada y búsqueda recursiva.

### Documentación del Método inorder():

El método inorder() es un recorrido en orden que se realiza en el árbol binario de búsqueda. El recorrido en orden es un algoritmo de recorrido de árbol que visita los nodos del árbol en orden ascendente según su valor. Para el caso de la implementación de este método, se devuelven los contactos en orden alfabético según su nombre.

Para realizar el recorrido en orden, el algoritmo se basa en una estrategia recursiva. Inicia desde la raíz y visita los nodos en el siguiente orden:

1. Visitar el nodo hijo izquierdo.
2. Visitar el nodo actual (raíz).
3. Visitar el nodo hijo derecho.
   
De esta forma, el método va recorriendo todos los nodos del árbol en orden ascendente y los agrega a una lista. Al final del recorrido, se tiene una lista de contactos ordenados alfabéticamente según su nombre.

La implementación recursiva se realiza mediante un método auxiliar privado inorderTraversalRecursivo(Nodo nodoActual, List<Contacto> listaContactos). Este método se invoca inicialmente desde inorderTraversal() con el nodo raíz y una lista vacía. En cada llamada recursiva, el nodo actual se visita y se agrega a la lista de contactos. Luego, se realiza una llamada recursiva para el nodo hijo izquierdo y otra para el nodo hijo derecho. Esto se repite hasta que todos los nodos hayan sido visitados, y la lista final contiene los contactos en orden alfabético.

Al utilizar el recorrido en orden, se obtiene una lista de contactos ordenada, lo que facilita la presentación de los resultados de forma organizada al usuario.


  
