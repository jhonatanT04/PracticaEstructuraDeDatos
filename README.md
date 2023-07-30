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

## Gestión del Árbol

### Documentación del Método inorder():

#### 1. Método insertar(Contacto contacto):

- Descripción: Este método se encarga de insertar un nuevo contacto en el árbol binario de búsqueda. Si la raíz del árbol es nula, crea un nuevo nodo con el contacto y lo asigna como raíz. Si la raíz no es nula, invoca al método insertarRecursivo() para insertar el contacto en la posición correcta del árbol.
  
#### 2. Método insertarRecursivo(Nodo nodo, Contacto contacto):

- Descripción: Este método es una función auxiliar para realizar la inserción recursiva del contacto en el árbol. Compara el nombre del contacto con el nodo actual, y según el resultado de la comparación, decide si debe insertarse en el subárbol izquierdo o derecho. Si el subárbol correspondiente es nulo, crea un nuevo nodo con el contacto y lo enlaza al nodo actual.
  
#### 3. Método buscarRecursivo(Nodo nodo, String nombre):

- Descripción: Este método es una función auxiliar para buscar un contacto en el árbol de forma recursiva. Compara el nombre del contacto con el nodo actual y si coincide, devuelve el nodo. Si el nombre es menor, continúa la búsqueda en el subárbol izquierdo; si es mayor, continúa en el subárbol derecho. Si no se encuentra el contacto, devuelve null.
  
#### 4. Método eliminarContacto(String nombre):

- Descripción: Este método se encarga de eliminar un contacto del árbol binario de búsqueda. Invoca al método eliminarContactoRec() para realizar la eliminación de forma recursiva, asegurando que se mantenga la propiedad del árbol binario de búsqueda.
  
#### 5. Método eliminarContactoRec(Nodo nodo, String nombre):

- Descripción: Este método es una función auxiliar para realizar la eliminación recursiva de un contacto en el árbol. Busca el nodo que contiene el contacto a eliminar, realiza ajustes en los enlaces de los nodos para mantener la estructura del árbol, y devuelve el nodo modificado.
  
#### 6. Método encontrarMinimo(Nodo nodo):

- Descripción: Este método se utiliza para encontrar el nodo con el valor mínimo en un subárbol, siguiendo los enlaces izquierdos del árbol hasta encontrar el nodo más a la izquierda del subárbol.
  
#### 7. Método obtenerAltura(Nodo nodo):

- Descripción: Este método calcula la altura de un subárbol (nodo) en el árbol binario de búsqueda utilizando un enfoque recursivo. La altura de un subárbol es la longitud del camino más largo desde el nodo raíz hasta una hoja. Se obtiene tomando la máxima altura entre el subárbol izquierdo y derecho y sumándole 1 (por el nodo actual).
  
#### 8. Método inordeRec(Nodo nodo):

- Descripción: Este método realiza un recorrido inorden (izquierda, raíz, derecha) del árbol binario de búsqueda de forma recursiva. Se utiliza para imprimir los nombres de los contactos en orden alfabético.
  
#### 9. Método recorridoPostOrden(Nodo nodo):

- Descripción: Este método realiza un recorrido postorden (izquierda, derecha, raíz) del árbol binario de búsqueda de forma recursiva. Se utiliza para imprimir los nombres de los contactos en un orden específico.
  
#### 10. Método recorridoNiveles():

- Descripción: Este método realiza un recorrido en anchura o nivel del árbol binario de búsqueda utilizando una cola (queue). Se utiliza para imprimir los nombres de los contactos en el orden en que se encuentran en cada nivel del árbol.
  
#### 11. Método preordenRecursivo(Nodo nodo):

- Descripción: Este método realiza un recorrido en preorden (raíz, izquierda, derecha) del árbol binario de búsqueda de forma recursiva. Se utiliza para imprimir los nombres de los contactos en un orden específico.
  
#### 12. Método buscarContacto(String nombre):

- Descripción: Este método busca un contacto en el árbol binario de búsqueda por su nombre utilizando el método buscarContactoRecursivo(). Devuelve el objeto Contacto correspondiente si se encuentra, o null si no se encuentra.
  
#### 13. Método buscarContactoRecursivo(String nombre, Nodo nodoActual):

- Descripción: Este método es una función auxiliar para realizar la búsqueda de un contacto en el árbol de forma recursiva. Compara el nombre del contacto con el nodo actual, y según el resultado de la comparación, decide si debe continuar la búsqueda en el subárbol izquierdo o derecho. Si encuentra el contacto, devuelve el objeto Contacto, si no, devuelve null.
  
#### 14. Método agregarRedSocial(String nombreContacto, String redSocial, String url):

- Descripción: Este método agrega una red social a un contacto existente en el árbol binario de búsqueda. Utiliza el método buscarContacto() para encontrar el contacto, y si lo encuentra, llama al método agregarRedSocial() del objeto Contacto para agregar la red social.
  
#### 15. Método agregarCorreo(String nombreContacto, String correo):

- Descripción: Este método agrega un correo electrónico a un contacto existente en el árbol binario de búsqueda. Utiliza el método buscarContacto() para encontrar el contacto, y si lo encuentra, llama al método agregarCorreo() del objeto Contacto para agregar el correo.
  
#### 16. Método printTreeNode(Nodo root, String prefix, boolean isLeft):

- Descripción: Este método es una función auxiliar para imprimir visualmente el árbol binario de búsqueda. Realiza un recorrido preorden del árbol, imprimiendo los nombres de los contactos con una estructura de árbol en la consola, mostrando la relación entre los nodos y subárboles. Es útil para visualizar la estructura del árbol durante el desarrollo y la depuración.


  
