package creationalPatterns.builderDesingPattern;


/**
 * El patrón de diseño de constructor es otro patrón de creación diseñado para lidiar
 * con la construcción de objetos comparativamente complejos.
 * Cuando aumenta la complejidad de la creación de objetos, el patrón Builder puede separar
 * el proceso de creación de instancias mediante el uso de otro objeto (un constructor) para construir el objeto.
 * Este generador se puede usar para crear muchas otras representaciones similares usando un enfoque simple paso a paso.
 * El patrón de diseño de constructor original presentado por GoF se centra en la abstracción
 * y es muy bueno cuando se trata de objetos complejos, sin embargo, el diseño es un poco complicado.
 */
public class BuilderApplication {

    public static void main(String[] args) {

        BankAccount newBankAccount = new BankAccount
            .BankAccountBuilder("pepe", "123456789")
            .withEmail("pepe@gmail.com")
            .withNewsletter(true)
            .build();
    }

    /**
     * Cuándo usar el patrón de construcción
     * Cuando el proceso involucrado en la creación de un objeto es extremadamente complejo,
     * con muchos parámetros obligatorios y opcionales
     * Cuando un aumento en el número de parámetros de constructor conduce a una gran lista de constructores
     * Cuando el cliente espera diferentes representaciones para el objeto que se construye
     */
}
