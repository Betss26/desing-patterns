package creationalPatterns.prototypeDesingPattern;

/**
 * El patrón Prototype generalmente se usa cuando tenemos una
 * instancia de la clase (prototipo) y nos gustaría crear nuevos
 * objetos simplemente copiando el prototipo.
 * Usemos una analogía para comprender mejor este patrón.
 * En algunos juegos, queremos árboles o edificios en el fondo.
 * Podemos darnos cuenta de que no tenemos que crear nuevos árboles
 * o edificios y representarlos en la pantalla cada vez que el
 * personaje se mueve.
 * Entonces, primero creamos una instancia del árbol. Luego
 * podemos crear tantos árboles como queramos a partir de esta
 * instancia (prototipo) y actualizar sus posiciones.
 * También podremos optar por cambiar el color de los árboles
 * para un nuevo nivel en el juego.
 * El patrón Prototype es bastante similar. En lugar de crear
 * nuevos objetos, solo tenemos que clonar la instancia prototípica.
 *
 * En el diagrama, vemos que el cliente le dice al prototipo que
 * se clone a sí mismo y cree un objeto. Prototype es una interfaz
 * y declara un método para clonarse a sí mismo. ConcretePrototype1
 * y ConcretePrototype2 implementan la operación para clonarse a sí
 * mismos.
 */
public class PrototypeApplication {

    public static void main(String[] args) {

    }
}
