# UNIVERSIDAD POLITECNICA SALESIANA
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




  
