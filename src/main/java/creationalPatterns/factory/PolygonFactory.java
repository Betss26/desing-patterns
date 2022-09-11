package creationalPatterns.factory;

public class PolygonFactory {

    /**
     * Observe cómo el cliente puede confiar en
     * que esta fábrica nos proporcione un
     * polígono apropiado, sin tener que
     * inicializar el objeto directamente.
     * @param numberOfSides
     * @return
     */
    /**
     * WHEN TO USED THIS PATTERN
     * Cuando se espera que la implementación de una interfaz o una clase abstracta cambie con frecuencia
     * Cuando la implementación actual no puede acomodar cómodamente nuevos cambios
     * Cuando el proceso de inicialización es relativamente simple y el constructor solo requiere un puñado de parámetros
     *
     */
    public Polygon getPolygon (int numberOfSides){
        if(numberOfSides == 3) {
            return  new Triangle();
        }
        if(numberOfSides == 4) {
            return  new Square();
        }
        if(numberOfSides == 5) {
            return  new Pentagon();
        }
        if(numberOfSides == 7) {
            return  new Heptagon();
        }
        if(numberOfSides == 8) {
            return  new Octagon();
        }

        return null;
    }
}
