package creationalPatterns.singleton;

/**
 * El patrón de diseño Singleton tiene como objetivo controlar la inicialización
 *  de los objetos de una clase en particular al garantizar que solo exista una
 *  instancia del objeto en toda la máquina virtual de Java.
 * Una clase Singleton también proporciona un único punto de acceso global al objeto
 * para que cada llamada subsiguiente al punto de acceso devuelva solo ese objeto en particular.
 */
public class SingletonApplication {
    /**
     * Cuando usarlo
     * Para recursos que son costosos de crear (como objetos de conexión de base de datos)
     * Es una buena práctica mantener todos los registradores como Singletons, lo que aumenta el rendimiento.
     * Clases que proporcionan acceso a los ajustes de configuración de la aplicación
     * Clases que contienen recursos a los que se accede en modo compartido
     * @param args
     */
    public static void main(String[] args) {

        PopularSingleton popularSingleton1 = PopularSingleton.getInstance();

        System.out.println(popularSingleton1.getInfo()); //Initial class info

        PopularSingleton popularSingleton2 = PopularSingleton.getInstance();
        popularSingleton2.setInfo("New class info");

        System.out.println(popularSingleton2.getInfo()); //New class info
        System.out.println(popularSingleton1.getInfo()); //New class info

        //Enum Singleton
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getInfo()); //Initial enum info

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton1.getInfo()); // New enum info
        System.out.println(enumSingleton2.getInfo()); // New enum info
    }
}
